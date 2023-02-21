package com.codepath.articlesearch
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("results")
    val response: List<Article>?
)


@Keep
@Serializable
data class Article(
    @SerialName("overview")
    val abstract: String?,
    @SerialName("release_date")
    val byline: String?,
    @SerialName("title")
    val headline: String?,
    @SerialName("poster_path")
    val poster_path: String?,
    @SerialName("original_language")
    val original_language: String?,
    @SerialName("vote_average")
    val vote_average: String?,


) : java.io.Serializable {
    val posterUrl = "https://image.tmdb.org/t/p/w500/${poster_path}"

    //val mediaImageUrl = "https://www.nytimes.com/${multimedia?.firstOrNull { it.url != null }?.url ?: ""}"
}
/*
@Keep
@Serializable
data class HeadLine(
    @SerialName("main")
    val main: String
) : java.io.Serializable

@Keep
@Serializable
data class Byline(
    @SerialName("original")
    val original: String? = null
) : java.io.Serializable

@Keep
@Serializable
data class MultiMedia(
    @SerialName("url")
    val url: String?
) : java.io.Serializable

 */