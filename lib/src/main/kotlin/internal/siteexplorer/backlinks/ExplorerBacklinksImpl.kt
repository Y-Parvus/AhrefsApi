package internal.siteexplorer.backlinks

import internal.BaseImpl
import internal.Utils
import internal.dsl.Field
import internal.siteexplorer.backlinks.models.Backlinks
import internal.siteexplorer.backlinks.models.Refdomains
import io.ktor.client.*
import io.ktor.client.request.*

class ExplorerBacklinksImpl(private val client: HttpClient): IExplorerBacklinks, BaseImpl() {
    override val requestUrl: String = baseUrl + "site-explorer"

    override suspend fun backlink(
        target: Field.Target,
        select: Field.Select,
        where: Field.Where,
        aggregation: Field.Aggregation,
        history: Field.History,
        limit: Field.Limit,
        mode: Field.Mode,
        offset: Field.Offset,
        orderBy: Field.OrderBy,
        protocol: Field.Protocol,
        timeout: Field.Timeout
    ): Backlinks {
        val requestString = buildRequest("all-backlinks",
            target, select, aggregation, history, limit, mode, offset, orderBy, protocol, timeout, where
        )
        val response = Utils.callWithResults<Backlinks> {
            client.get(requestString)
        }
        return response
    }

    override suspend fun refdomains(
        target: Field.Target,
        select: Field.Select,
        where: Field.Where,
        history: Field.History,
        limit: Field.Limit,
        mode: Field.Mode,
        offset: Field.Offset,
        orderBy: Field.OrderBy,
        protocol: Field.Protocol,
        timeout: Field.Timeout
    ): Refdomains {
        val requestString = buildRequest("refdomains",
            target, select, history, limit, mode, offset, orderBy, protocol, timeout, where
        )
        val response = Utils.callWithResults<Refdomains> {
            client.get(requestString)
        }
        return response
    }
}