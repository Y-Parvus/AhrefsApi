package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BacklinksStats(
    @SerialName("metrics")
    val metrics: Metrics
) {
    @Serializable
    data class Metrics(
        @SerialName("all_time")
        val allTime: Int,
        @SerialName("all_time_refdomains")
        val allTimeRefdomains: Int,
        @SerialName("live")
        val live: Int,
        @SerialName("live_refdomains")
        val liveRefdomains: Int
    )
}