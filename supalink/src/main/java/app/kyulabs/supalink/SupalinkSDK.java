package app.kyulabs.supalink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SupalinkSDK {

    public interface CompletionHandler {
        void onComplete(Supalink supalink);
    }

    public static void handleAsestLinks(Context context, Intent intent, CompletionHandler completionHandler) {
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            Supalink supalink = urlToSupalink(data);
            if (supalink != null) {
                if (supalink.getAfl() != null) {
                    Uri uri = Uri.parse(supalink.getAfl());
                    if (canOpenUrl(context, uri)) {
                        openUrl(context, uri);
                    }
                }
                completionHandler.onComplete(supalink);
            } else {
                completionHandler.onComplete(null);
            }
        } else {
            completionHandler.onComplete(null);
        }
    }

    private static Supalink urlToSupalink(Uri url) {
        Map<String, String> linkValues = new HashMap<>();

        Set<String> queryParameterNames = url.getQueryParameterNames();
        for (String key : queryParameterNames) {
            String value = url.getQueryParameter(key);
            if (value != null) {
                linkValues.put(key, value);
            }
        }

        if (linkValues.isEmpty()) {
            return null;
        }

        return new Supalink(
                linkValues.get("link"),
                linkValues.get("apn"),
                linkValues.get("afl"),
                linkValues.get("amv"),
                linkValues.get("ibi"),
                linkValues.get("ifl"),
                linkValues.get("ius"),
                linkValues.get("ipfl"),
                linkValues.get("ipbi"),
                linkValues.get("isi"),
                linkValues.get("imv"),
                linkValues.get("eft"),
                linkValues.get("ofl"),
                linkValues.get("st"),
                linkValues.get("sd"),
                linkValues.get("si"),
                linkValues.get("utm_source"),
                linkValues.get("utm_medium"),
                linkValues.get("utm_campaign"),
                linkValues.get("utm_term"),
                linkValues.get("utm_content"),
                linkValues.get("at"),
                linkValues.get("ct"),
                linkValues.get("mt"),
                linkValues.get("pt")
        );
    }

    private static boolean canOpenUrl(Context context, Uri url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, url);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private static void openUrl(Context context, Uri url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, url);

        // Context가 Activity일 경우만 startActivity 호출
        if (context instanceof Activity) {
            context.startActivity(intent);
        } else {
            // ApplicationContext라면 적절한 처리를 추가할 수 있습니다.
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}