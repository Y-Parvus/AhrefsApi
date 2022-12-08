package internal.siteexplorer.backlinks.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Backlinks(
    @SerialName("backlinks")
    val backlinks: List<Backlink?>?
) {
    @Serializable
    data class Backlink(
        @SerialName("ahrefs_rank_source")
        val ahrefsRankSource: Int?,
        @SerialName("ahrefs_rank_target")
        val ahrefsRankTarget: Int?,
        @SerialName("alt")
        val alt: String?,
        @SerialName("anchor")
        val anchor: String?,
        @SerialName("broken_redirect_new_target")
        val brokenRedirectNewTarget: String?,
        @SerialName("broken_redirect_reason")
        val brokenRedirectReason: String?,
        @SerialName("broken_redirect_source")
        val brokenRedirectSource: String?,
        @SerialName("class_c")
        val classC: Int?,
        @SerialName("discovered_status")
        val discoveredStatus: String?,
        @SerialName("domain_rating_source")
        val domainRatingSource: Double?,
        @SerialName("domain_rating_target")
        val domainRatingTarget: Double?,
        @SerialName("drop_reason")
        val dropReason: String?,
        @SerialName("encoding")
        val encoding: String?,
        @SerialName("first_seen")
        val firstSeen: String?,
        @SerialName("first_seen_link")
        val firstSeenLink: String?,
        @SerialName("http_code")
        val httpCode: Int?,
        @SerialName("http_crawl")
        val httpCrawl: Boolean?,
        @SerialName("is_alternate")
        val isAlternate: Boolean?,
        @SerialName("is_canonical")
        val isCanonical: Boolean?,
        @SerialName("is_content")
        val isContent: Boolean?,
        @SerialName("is_dofollow")
        val isDofollow: Boolean?,
        @SerialName("is_form")
        val isForm: Boolean?,
        @SerialName("is_frame")
        val isFrame: Boolean?,
        @SerialName("is_image")
        val isImage: Boolean?,
        @SerialName("is_lost")
        val isLost: Boolean?,
        @SerialName("is_new")
        val isNew: Boolean?,
        @SerialName("is_nofollow")
        val isNofollow: Boolean?,
        @SerialName("is_redirect")
        val isRedirect: Boolean?,
        @SerialName("is_redirect_lost")
        val isRedirectLost: Boolean?,
        @SerialName("is_root_source")
        val isRootSource: Boolean?,
        @SerialName("is_root_target")
        val isRootTarget: Boolean?,
        @SerialName("is_rss")
        val isRss: Boolean?,
        @SerialName("is_sponsored")
        val isSponsored: Boolean?,
        @SerialName("is_text")
        val isText: Boolean?,
        @SerialName("is_ugc")
        val isUgc: Boolean?,
        @SerialName("js_crawl")
        val jsCrawl: Boolean?,
        @SerialName("languages")
        val languages: List<String?>?,
        @SerialName("last_seen")
        val lastSeen: String?,
        @SerialName("last_visited")
        val lastVisited: String?,
        @SerialName("link_group_count")
        val linkGroupCount: Int?,
        @SerialName("link_type")
        val linkType: String?,
        @SerialName("linked_domains_source_domain")
        val linkedDomainsSourceDomain: Int?,
        @SerialName("linked_domains_source_page")
        val linkedDomainsSourcePage: Int?,
        @SerialName("linked_domains_target_domain")
        val linkedDomainsTargetDomain: Int?,
        @SerialName("links_external")
        val linksExternal: Int?,
        @SerialName("links_internal")
        val linksInternal: Int?,
        @SerialName("lost_reason")
        val lostReason: String?,
        @SerialName("name_source")
        val nameSource: String?,
        @SerialName("name_target")
        val nameTarget: String?,
        @SerialName("noindex")
        val noindex: Boolean?,
        @SerialName("page_size")
        val pageSize: Int?,
        @SerialName("port_source")
        val portSource: Int?,
        @SerialName("port_target")
        val portTarget: Int?,
        @SerialName("positions")
        val positions: Int?,
        @SerialName("powered_by")
        val poweredBy: List<String?>?,
        @SerialName("redirect_code")
        val redirectCode: Int?,
        @SerialName("redirect_kind")
        val redirectKind: List<Int?>?,
        @SerialName("refdomains_source")
        val refdomainsSource: Int?,
        @SerialName("refdomains_source_domain")
        val refdomainsSourceDomain: Int?,
        @SerialName("refdomains_target_domain")
        val refdomainsTargetDomain: Int?,
        @SerialName("root_name_source")
        val rootNameSource: String?,
        @SerialName("root_name_target")
        val rootNameTarget: String?,
        @SerialName("snippet_left")
        val snippetLeft: String?,
        @SerialName("snippet_right")
        val snippetRight: String?,
        @SerialName("title")
        val title: String?,
        @SerialName("tld_class_source")
        val tldClassSource: String?,
        @SerialName("tld_class_target")
        val tldClassTarget: String?,
        @SerialName("traffic")
        val traffic: Int?,
        @SerialName("traffic_domain")
        val trafficDomain: Int?,
        @SerialName("url_from")
        val urlFrom: String?,
        @SerialName("url_from_plain")
        val urlFromPlain: String?,
        @SerialName("url_rating_source")
        val urlRatingSource: Double?,
        @SerialName("url_redirect")
        val urlRedirect: List<String?>?,
        @SerialName("url_to")
        val urlTo: String?,
        @SerialName("url_to_plain")
        val urlToPlain: String?
    )
}