package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetricsHistory(
    @SerialName("metrics")
    val metrics: List<Metric>
) {
    @Serializable
    data class Metric(
        @SerialName("date")
        val date: String,
        @SerialName("org_cost")
        val orgCost: Double,
        @SerialName("org_traffic")
        val orgTraffic: Int,
        @SerialName("paid_cost")
        val paidCost: Double,
        @SerialName("paid_traffic")
        val paidTraffic: Int
    )
}