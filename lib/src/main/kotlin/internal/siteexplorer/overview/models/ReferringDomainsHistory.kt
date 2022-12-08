package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReferringDomainsHistory(
    @SerialName("refdomains")
    val refdomains: List<Refdomain>
) {
    @Serializable
    data class Refdomain(
        @SerialName("date")
        val date: String,
        @SerialName("refdomains")
        val refdomains: Int
    )
}