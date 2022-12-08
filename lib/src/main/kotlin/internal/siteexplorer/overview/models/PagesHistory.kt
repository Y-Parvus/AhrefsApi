package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PagesHistory(
    @SerialName("pages")
    val pages: List<Page>
) {
    @Serializable
    data class Page(
        @SerialName("date")
        val date: String,
        @SerialName("pages")
        val pages: Int
    )
}