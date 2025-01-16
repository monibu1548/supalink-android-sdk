package app.kyulabs.supalink
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat.startActivity

/**
 * Supalink SDK 클래스
 */
object SupalinkSDK {
    // 수정된 타입
    fun handleAsestLinks(context: Context, intent: Intent?, completionHandler: (Supalink?) -> Unit) {
        intent?.data?.let {
            urlToSupalink(it)?.let { supalink ->
                if (supalink.afl != null) {
                    val uri = Uri.parse(supalink.afl)
                    if (canOpenUrl(context, uri)) {
                        openUrl(context, uri)
                    }
                }

                completionHandler(supalink)
            }
        } ?: completionHandler(null)
    }

    private fun urlToSupalink(url: Uri): Supalink? {
        val linkValues: MutableMap<String, String> = mutableMapOf()

        url.queryParameterNames.forEach { key ->
            url.getQueryParameter(key)?.let {
                linkValues[key] = it
            }
        }

        return if (linkValues.isEmpty()) null else Supalink(
            link = linkValues["link"],
            apn = linkValues["apn"],
            afl = linkValues["afl"],
            amv = linkValues["amv"],
            ibi = linkValues["ibi"],
            ifl = linkValues["ifl"],
            ius = linkValues["ius"],
            ipfl = linkValues["ipfl"],
            ipbi = linkValues["ipbi"],
            isi = linkValues["isi"],
            imv = linkValues["imv"],
            eft = linkValues["eft"],
            ofl = linkValues["ofl"],
            st = linkValues["st"],
            sd = linkValues["sd"],
            si = linkValues["si"],
            utm_source = linkValues["utm_source"],
            utm_medium = linkValues["utm_medium"],
            utm_campaign = linkValues["utm_campaign"],
            utm_term = linkValues["utm_term"],
            utm_content = linkValues["utm_content"],
            at = linkValues["at"],
            ct = linkValues["ct"],
            mt = linkValues["mt"],
            pt = linkValues["pt"]
        )
    }

    private fun canOpenUrl(context: Context, url: Uri): Boolean {
        val intent = Intent(Intent.ACTION_VIEW, url)
        return intent.resolveActivity(context.packageManager) != null
    }

    private fun openUrl(context: Context, url: Uri) {
        val intent = Intent(Intent.ACTION_VIEW, url)

        // Context가 Activity일 경우만 startActivity 호출
        if (context is Activity) {
            context.startActivity(intent)
        } else {
            // ApplicationContext라면 적절한 처리를 추가할 수 있습니다.
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }
}
