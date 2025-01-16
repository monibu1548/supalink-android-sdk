package app.kyulabs.supalink

/**
 * Supalink 정보를 나타내는 데이터 클래스.
 * Represents the information for a Supalink.
 */
data class Supalink(
    /// The main link associated with the Universal Link.
    /// 예: 사용자가 전달하려는 링크 (예: "https://supalink.cc")
    val link: String? = null,

    /// The Android Package Name (APN) for the app.
    /// 안드로이드 앱을 식별하는 패키지 이름
    val apn: String? = null,

    /// The Android fallback URL (AFL).
    /// 안드로이드에서 사용되는 대체 링크
    val afl: String? = null,

    /// The Android minimum version (AMV).
    /// 안드로이드 앱의 최소 버전
    /// deprecated
    val amv: String? = null,

    /// The iOS Bundle Identifier (IBI).
    /// iOS 앱을 식별하는 번들 ID
    val ibi: String? = null,

    /// The iOS fallback URL (IFL).
    /// iOS에서 사용되는 대체 링크
    val ifl: String? = null,

    /// The Universal Link (IUS) for the app.
    /// 앱을 위한 유니버셜 링크 (앱 스킴)
    val ius: String? = null,

    /// The iOS platform fallback URL (IPFL).
    /// iOS에서 사용하는 대체 링크 (플랫폼 관련)
    val ipfl: String? = null,

    /// The iOS Bundle Identifier for the platform (IPBI).
    /// iOS 플랫폼에서의 번들 ID
    val ipbi: String? = null,

    /// The iOS App Store ID (ISI).
    /// iOS 앱의 App Store ID
    val isi: String? = null,

    /// The iOS minimum version (IMV).
    /// iOS 앱의 최소 버전
    /// deprecated
    val imv: String? = null,

    /// The expiration time for the link (EFT).
    /// 링크의 만료 시간
    /// deprecated
    val eft: String? = null,

    /// The iOS fallback URL (OFL).
    /// iOS에서 사용되는 대체 링크
    /// deprecated
    val ofl: String? = null,

    /// The SEO title associated with the link, typically displayed when the link is shared on social media.
    /// 링크와 관련된 SEO 제목, 소셜 미디어에서 링크가 공유될 때 일반적으로 표시됩니다.
    val st: String? = null,

    /// The SEO description associated with the link, typically displayed when the link is shared on social media.
    /// 링크와 관련된 SEO 설명, 소셜 미디어에서 링크가 공유될 때 일반적으로 표시됩니다.
    val sd: String? = null,

    /// The SEO image associated with the link, typically displayed when the link is shared on social media.
    /// 링크와 관련된 SEO 이미지, 소셜 미디어에서 링크가 공유될 때 일반적으로 표시됩니다.
    val si: String? = null,

    /// UTM source for tracking marketing campaigns.
    /// 마케팅 캠페인을 추적하기 위한 UTM 소스
    val utm_source: String? = null,

    /// UTM medium for tracking marketing campaigns.
    /// 마케팅 캠페인을 추적하기 위한 UTM 매체
    val utm_medium: String? = null,

    /// UTM campaign for tracking marketing campaigns.
    /// 마케팅 캠페인을 추적하기 위한 UTM 캠페인
    val utm_campaign: String? = null,

    /// UTM term for tracking marketing campaigns.
    /// 마케팅 캠페인을 추적하기 위한 UTM 키워드
    val utm_term: String? = null,

    /// UTM content for tracking marketing campaigns.
    /// 마케팅 캠페인을 추적하기 위한 UTM 콘텐츠
    val utm_content: String? = null,

    /// The attribution token (AT) for tracking the source.
    /// 링크의 출처를 추적하기 위한 속성 토큰
    val at: String? = null,

    /// The content type (CT) for the link.
    /// 링크의 콘텐츠 유형
    val ct: String? = null,

    /// The medium type (MT) for the link.
    /// 링크의 매체 유형
    val mt: String? = null,

    /// The platform type (PT) for the link.
    /// 링크의 플랫폼 유형
    val pt: String? = null
)