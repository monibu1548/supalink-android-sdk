package app.kyulabs.supalink;

/**
 * Supalink 정보를 나타내는 클래스.
 * Represents the information for a Supalink.
 */
public class Supalink {

    // The main link associated with the Universal Link.
    // 예: 사용자가 전달하려는 링크 (예: "https://supalink.cc")
    private String link;

    // The Android Package Name (APN) for the app.
    // 안드로이드 앱을 식별하는 패키지 이름
    private String apn;

    // The Android fallback URL (AFL).
    // 안드로이드에서 사용되는 대체 링크
    private String afl;

    // The Android minimum version (AMV).
    // 안드로이드 앱의 최소 버전
    // deprecated
    private String amv;

    // The iOS Bundle Identifier (IBI).
    // iOS 앱을 식별하는 번들 ID
    private String ibi;

    // The iOS fallback URL (IFL).
    // iOS에서 사용되는 대체 링크
    private String ifl;

    // The Universal Link (IUS) for the app.
    // 앱을 위한 유니버셜 링크 (앱 스킴)
    private String ius;

    // The iOS platform fallback URL (IPFL).
    // iOS에서 사용하는 대체 링크 (플랫폼 관련)
    private String ipfl;

    // The iOS Bundle Identifier for the platform (IPBI).
    // iOS 플랫폼에서의 번들 ID
    private String ipbi;

    // The iOS App Store ID (ISI).
    // iOS 앱의 App Store ID
    private String isi;

    // The iOS minimum version (IMV).
    // iOS 앱의 최소 버전
    // deprecated
    private String imv;

    // The expiration time for the link (EFT).
    // 링크의 만료 시간
    // deprecated
    private String eft;

    // The iOS fallback URL (OFL).
    // iOS에서 사용되는 대체 링크
    // deprecated
    private String ofl;

    // The SEO title associated with the link.
    // 링크와 관련된 SEO 제목, 소셜 미디어에서 링크가 공유될 때 일반적으로 표시됩니다.
    private String st;

    // The SEO description associated with the link.
    // 링크와 관련된 SEO 설명, 소셜 미디어에서 링크가 공유될 때 일반적으로 표시됩니다.
    private String sd;

    // The SEO image associated with the link.
    // 링크와 관련된 SEO 이미지, 소셜 미디어에서 링크가 공유될 때 일반적으로 표시됩니다.
    private String si;

    // UTM source for tracking marketing campaigns.
    // 마케팅 캠페인을 추적하기 위한 UTM 소스
    private String utm_source;

    // UTM medium for tracking marketing campaigns.
    // 마케팅 캠페인을 추적하기 위한 UTM 매체
    private String utm_medium;

    // UTM campaign for tracking marketing campaigns.
    // 마케팅 캠페인을 추적하기 위한 UTM 캠페인
    private String utm_campaign;

    // UTM term for tracking marketing campaigns.
    // 마케팅 캠페인을 추적하기 위한 UTM 키워드
    private String utm_term;

    // UTM content for tracking marketing campaigns.
    // 마케팅 캠페인을 추적하기 위한 UTM 콘텐츠
    private String utm_content;

    // The attribution token (AT) for tracking the source.
    // 링크의 출처를 추적하기 위한 속성 토큰
    private String at;

    // The content type (CT) for the link.
    // 링크의 콘텐츠 유형
    private String ct;

    // The medium type (MT) for the link.
    // 링크의 매체 유형
    private String mt;

    // The platform type (PT) for the link.
    // 링크의 플랫폼 유형
    private String pt;

    /**
     * Default constructor
     */
    public Supalink() {
    }

    /**
     * Constructor with all fields
     */
    public Supalink(String link, String apn, String afl, String amv, String ibi, String ifl, String ius, String ipfl,
                    String ipbi, String isi, String imv, String eft, String ofl, String st, String sd, String si,
                    String utm_source, String utm_medium, String utm_campaign, String utm_term, String utm_content,
                    String at, String ct, String mt, String pt) {
        this.link = link;
        this.apn = apn;
        this.afl = afl;
        this.amv = amv;
        this.ibi = ibi;
        this.ifl = ifl;
        this.ius = ius;
        this.ipfl = ipfl;
        this.ipbi = ipbi;
        this.isi = isi;
        this.imv = imv;
        this.eft = eft;
        this.ofl = ofl;
        this.st = st;
        this.sd = sd;
        this.si = si;
        this.utm_source = utm_source;
        this.utm_medium = utm_medium;
        this.utm_campaign = utm_campaign;
        this.utm_term = utm_term;
        this.utm_content = utm_content;
        this.at = at;
        this.ct = ct;
        this.mt = mt;
        this.pt = pt;
    }

    // Getters and Setters
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getAfl() {
        return afl;
    }

    public void setAfl(String afl) {
        this.afl = afl;
    }

    public String getAmv() {
        return amv;
    }

    public void setAmv(String amv) {
        this.amv = amv;
    }

    public String getIbi() {
        return ibi;
    }

    public void setIbi(String ibi) {
        this.ibi = ibi;
    }

    public String getIfl() {
        return ifl;
    }

    public void setIfl(String ifl) {
        this.ifl = ifl;
    }

    public String getIus() {
        return ius;
    }

    public void setIus(String ius) {
        this.ius = ius;
    }

    public String getIpfl() {
        return ipfl;
    }

    public void setIpfl(String ipfl) {
        this.ipfl = ipfl;
    }

    public String getIpbi() {
        return ipbi;
    }

    public void setIpbi(String ipbi) {
        this.ipbi = ipbi;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getImv() {
        return imv;
    }

    public void setImv(String imv) {
        this.imv = imv;
    }

    public String getEft() {
        return eft;
    }

    public void setEft(String eft) {
        this.eft = eft;
    }

    public String getOfl() {
        return ofl;
    }

    public void setOfl(String ofl) {
        this.ofl = ofl;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getUtm_source() {
        return utm_source;
    }

    public void setUtm_source(String utm_source) {
        this.utm_source = utm_source;
    }

    public String getUtm_medium() {
        return utm_medium;
    }

    public void setUtm_medium(String utm_medium) {
        this.utm_medium = utm_medium;
    }

    public String getUtm_campaign() {
        return utm_campaign;
    }

    public void setUtm_campaign(String utm_campaign) {
        this.utm_campaign = utm_campaign;
    }

    public String getUtm_term() {
        return utm_term;
    }

    public void setUtm_term(String utm_term) {
        this.utm_term = utm_term;
    }

    public String getUtm_content() {
        return utm_content;
    }

    public void setUtm_content(String utm_content) {
        this.utm_content = utm_content;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getMt() {
        return mt;
    }

    public void setMt(String mt) {
        this.mt = mt;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    @Override
    public String toString() {
        return "Supalink{" +
                "link='" + link + '\'' +
                ", apn='" + apn + '\'' +
                ", afl='" + afl + '\'' +
                ", amv='" + amv + '\'' +
                ", ibi='" + ibi + '\'' +
                ", ifl='" + ifl + '\'' +
                ", ius='" + ius + '\'' +
                ", ipfl='" + ipfl + '\'' +
                ", ipbi='" + ipbi + '\'' +
                ", isi='" + isi + '\'' +
                ", imv='" + imv + '\'' +
                ", eft='" + eft + '\'' +
                ", ofl='" + ofl + '\'' +
                ", st='" + st + '\'' +
                ", sd='" + sd + '\'' +
                ", si='" + si + '\'' +
                ", utm_source='" + utm_source + '\'' +
                ", utm_medium='" + utm_medium + '\'' +
                ", utm_campaign='" + utm_campaign + '\'' +
                ", utm_term='" + utm_term + '\'' +
                ", utm_content='" + utm_content + '\'' +
                ", at='" + at + '\'' +
                ", ct='" + ct + '\'' +
                ", mt='" + mt + '\'' +
                ", pt='" + pt + '\'' +
                '}';
    }
}
