package internal

import internal.siteexplorer.backlinks.ExplorerBacklinksImpl
import internal.siteexplorer.backlinks.IExplorerBacklinks
import internal.siteexplorer.overview.ExplorerOverviewImpl
import internal.siteexplorer.overview.IExplorerOverview
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class Api(authToken: String) {
    private var _overview: IExplorerOverview
    private var _backlinks: IExplorerBacklinks

    val overviewApi: IExplorerOverview
        get() = _overview

    val backlinksApi: IExplorerBacklinks
        get() = _backlinks

    init {
        require(authToken.isNotEmpty()) { "authToken must not be empty" }

        val client = HttpClient(CIO) {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                })
            }
            defaultRequest {
                header(HttpHeaders.Authorization, "Bearer $authToken")
                header(HttpHeaders.ContentType, "application/json")
            }
        }
        _backlinks = ExplorerBacklinksImpl(client)
        _overview = ExplorerOverviewImpl(client)
    }
}
