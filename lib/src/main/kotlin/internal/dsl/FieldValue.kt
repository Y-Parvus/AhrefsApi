@file:Suppress("unused")

package internal.dsl

interface IFieldValue {
    val value: Any
}

enum class ProtocolValue(override val value: String) : IFieldValue {
    Both("both"),
    Http("http"),
    Https("https")
}

enum class ModeValue(override val value: String) : IFieldValue {
    Exact("exact"),
    Prefix("prefix"),
    Domain("domain"),
    Subdomains("subdomains")
}

enum class CountryValue(override val value: String) : IFieldValue {
    AD("ad"), AE("ae"), AF("af"), AG("ag"), AI("ai"), AL("al"),
    AM("am"), AO("ao"), AR("ar"), AS("as"), AT("at"), AU("au"),
    AW("aw"), AZ("az"), BA("ba"), BB("bb"), BD("bd"), BE("be"),
    BF("bf"), BG("bg"), BH("bh"), BI("bi"), BJ("bj"), BN("bn"),
    BO("bo"), BR("br"), BS("bs"), BT("bt"), BW("bw"), BY("by"),
    BZ("bz"), CA("ca"), CD("cd"), CF("cf"), CG("cg"), CH("ch"),
    CI("ci"), CK("ck"), CL("cl"), CM("cm"), CN("cn"), CO("co"),
    CR("cr"), CU("cu"), CV("cv"), CY("cy"), CZ("cz"), DE("de"),
    DJ("dj"), DK("dk"), DM("dm"), DO("do"), DZ("dz"), EC("ec"),
    EE("ee"), EG("eg"), ES("es"), ET("et"), FI("fi"), FJ("fj"),
    FM("fm"), FO("fo"), FR("fr"), GA("ga"), GB("gb"), GD("gd"),
    GE("ge"), GF("gf"), GG("gg"), GH("gh"), GI("gi"), GL("gl"),
    GM("gm"), GN("gn"), GP("gp"), GQ("gq"), GR("gr"), GT("gt"),
    GU("gu"), GY("gy"), HK("hk"), HN("hn"), HR("hr"), HT("ht"),
    HU("hu"), ID("id"), IE("ie"), IL("il"), IM("im"), IN("in"),
    IQ("iq"), IS("is"), IT("it"), JE("je"), JM("jm"), JO("jo"),
    JP("jp"), KE("ke"), KG("kg"), KH("kh"), KI("ki"), KN("kn"),
    KR("kr"), KW("kw"), KY("ky"), KZ("kz"), LA("la"), LB("lb"),
    LC("lc"), LI("li"), LK("lk"), LS("ls"), LT("lt"), LU("lu"),
    LV("lv"), LY("ly"), MA("ma"), MC("mc"), MD("md"), ME("me"),
    MG("mg"), MK("mk"), ML("ml"), MM("mm"), MN("mn"), MQ("mq"),
    MR("mr"), MS("ms"), MT("mt"), MU("mu"), MV("mv"), MW("mw"),
    MX("mx"), MY("my"), MZ("mz"), NA("na"), NC("nc"), NE("ne"),
    NG("ng"), NI("ni"), NL("nl"), NO("no"), NP("np"), NR("nr"),
    NU("nu"), NZ("nz"), OM("om"), PA("pa"), PE("pe"), PF("pf"),
    PG("pg"), PH("ph"), PK("pk"), PL("pl"), PN("pn"), PR("pr"),
    PS("ps"), PT("pt"), PY("py"), QA("qa"), RE("re"), RO("ro"),
    RS("rs"), RU("ru"), RW("rw"), SA("sa"), SB("sb"), SC("sc"),
    SE("se"), SG("sg"), SH("sh"), SI("si"), SK("sk"), SL("sl"),
    SM("sm"), SN("sn"), SO("so"), SR("sr"), ST("st"), SV("sv"),
    TD("td"), TG("tg"), TH("th"), TJ("tj"), TK("tk"), TL("tl"),
    TM("tm"), TN("tn"), TO("to"), TT("tt"), TW("tw"), TZ("tz"),
    UA("ua"), UG("ug"), US("us"), UY("uy"), UZ("uz"), VC("vc"),
    VE("ve"), VG("vg"), VI("vi"), VN("vn"), VU("vu"), WS("ws"),
    YE("ye"), YT("yt"), ZA("za"), ZM("zm"), ZW("zw")
}

enum class VolumeModeValue(override val value: String) : IFieldValue {
    Monthly("monthly"),
    Average("average")
}

enum class HistoryGroupingValue(override val value: String) : IFieldValue {
    Daily("daily"),
    Weekly("weekly"),
    Monthly("monthly")
}

enum class AggregationValue(override val value: String) : IFieldValue {
    SimilarLinks("similar_links"),
    OnePerDomain("1_per_domain"),
    All("all")
}

enum class HistoryValue(override val value: String) : IFieldValue {
    AllTime("all_time"),
    Live("live")
    //TODO: add "since" field, or think about another way to implement it because of syntax - since:2019-01-01
}

enum class BrokenRedirectReasonValue(override val value: String) : IFieldValue {
    DroppedManual("droppedmanual"),
    DroppedTooOld("droppedtooold"),
    Dropped("dropped"),
    CodeChanged("codechanged"),
    NxDomain("nxdomain"),
    RobotsDisallowed("robotsdisallowed"),
    CurlError("curlerror"),
    InvalidTarget("invalidtarget"),
    NoMoreCanonical("nomorecanonical"),
    IsNowParked("isnowparked"),
    TargetChanged("targetchanged"),
    Null("null")
}

enum class DiscoveredStatusValue(override val value: String): IFieldValue {
    PageFound("pagefound"),
    LinkFound("linkfound"),
    LinkRestored("linkrestored"),
    Null("null")
}

enum class DropReasonValue(override val value: String): IFieldValue {
    Manual("manual"),
    NoRatingUnused("noratingunused"),
    NoTop("notop"),
    TooOld("tooold"),
    OldUnavailable("oldunavailable"),
    Rescursive("rescursive"),
    Duplicate("duplicate"),
    NxDomain("nxdomain"),
    Malformed("malformed"),
    BlockedPort("blockedport"),
    Disallowed("disallowed"),
    Unlinked("unlinked"),
    Null("null")
}

enum class LinkTypeValue(override val value: String): IFieldValue {
    Redirect("redirect"),
    Frame("frame"),
    Text("text"),
    Form("form"),
    Canonical("canonical"),
    Alternate("alternate"),
    Rss("rss"),
    Image("image")
}

enum class LostReasonValue(override val value: String) : IFieldValue {
    RemovedFromHtml("removedfomhtml"),
    NotCanonical("notcanonical"),
    NoIndex("noidex"),
    PageRedirected("pageredirected"),
    PageError("pageerror"),
    LostRedirect("lostredirect"),
    NotFound("notfound"),
    Null("null")
}

enum class TldClassValue(override val value: String) : IFieldValue {
    Gov("gov"),
    Edu("edu"),
    Normal("normal")
}