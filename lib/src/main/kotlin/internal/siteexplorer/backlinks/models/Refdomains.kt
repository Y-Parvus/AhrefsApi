package internal.siteexplorer.backlinks.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Refdomains(
    @SerialName("refdomains")
    val refdomains: List<Refdomain?>?
) {
    @Serializable
    data class Refdomain(
        @SerialName("dofollow_linked_domains")
        val dofollowLinkedDomains: Int?,
        @SerialName("dofollow_links")
        val dofollowLinks: Int?,
        @SerialName("dofollow_refdomains")
        val dofollowRefdomains: Int?,
        @SerialName("domain")
        val domain: String?,
        @SerialName("domain_rating")
        val domainRating: Double?,
        @SerialName("first_seen")
        val firstSeen: String?,
        @SerialName("is_root_domain")
        val isRootDomain: Boolean?,
        @SerialName("last_seen")
        val lastSeen: String?,
        @SerialName("links_to_target")
        val linksToTarget: Int?,
        @SerialName("lost_links")
        val lostLinks: Int?,
        @SerialName("new_links")
        val newLinks: Int?,
        @SerialName("traffic_domain")
        val trafficDomain: Int?
    )
}