package internal.siteexplorer.overview.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UrlRating(
    @SerialName("url_ratings")
    val urlRatings: List<UrlRating>
) {
    @Serializable
    data class UrlRating(
        @SerialName("date")
        val date: String,
        @SerialName("url_rating")
        val urlRating: Double
    )
}