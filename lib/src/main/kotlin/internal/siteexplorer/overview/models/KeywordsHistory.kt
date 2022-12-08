package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KeywordsHistory(
    @SerialName("keywords")
    val keywords: List<Keyword>
) {
    @Serializable
    data class Keyword(
        @SerialName("date")
        val date: String,
        @SerialName("top11_plus")
        val top11Plus: Int,
        @SerialName("top3")
        val top3: Int,
        @SerialName("top4_10")
        val top410: Int
    )
}