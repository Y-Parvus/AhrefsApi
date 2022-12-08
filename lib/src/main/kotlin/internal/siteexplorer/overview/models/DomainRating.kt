package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DomainRating(
    @SerialName("domain_rating")
    val domainRating: DomainRating
) {
    @Serializable
    data class DomainRating(
        @SerialName("ahrefs_rank")
        val ahrefsRank: Int?,
        @SerialName("domain_rating")
        val domainRating: Double
    )
}