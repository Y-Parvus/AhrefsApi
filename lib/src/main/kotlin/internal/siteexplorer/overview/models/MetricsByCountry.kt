package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetricsByCountry(
    @SerialName("metrics")
    val metrics: List<Metric>
) {
    @Serializable
    data class Metric(
        @SerialName("country")
        val country: String,
        @SerialName("org_cost")
        val orgCost: Double?,
        @SerialName("org_keywords")
        val orgKeywords: Int,
        @SerialName("org_keywords_1_3")
        val orgKeywords13: Int,
        @SerialName("org_traffic")
        val orgTraffic: Int,
        @SerialName("paid_cost")
        val paidCost: Double?,
        @SerialName("paid_keywords")
        val paidKeywords: Int,
        @SerialName("paid_pages")
        val paidPages: Int,
        @SerialName("paid_traffic")
        val paidTraffic: Int
    )
}