package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PagesByTraffic(
    @SerialName("pages")
    val pages: Pages
) {
    @Serializable
    data class Pages(
        @SerialName("range0_pages")
        val range0Pages: Int,
        @SerialName("range100_pages")
        val range100Pages: Int,
        @SerialName("range100_traffic")
        val range100Traffic: Int,
        @SerialName("range10k_pages")
        val range10kPages: Int,
        @SerialName("range10k_plus_pages")
        val range10kPlusPages: Int,
        @SerialName("range10k_plus_traffic")
        val range10kPlusTraffic: Int,
        @SerialName("range10k_traffic")
        val range10kTraffic: Int,
        @SerialName("range1k_pages")
        val range1kPages: Int,
        @SerialName("range1k_traffic")
        val range1kTraffic: Int,
        @SerialName("range5k_pages")
        val range5kPages: Int,
        @SerialName("range5k_traffic")
        val range5kTraffic: Int
    )
}