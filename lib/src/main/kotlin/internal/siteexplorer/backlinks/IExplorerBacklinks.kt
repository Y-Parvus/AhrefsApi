package internal.siteexplorer.backlinks

import internal.dsl.*
import internal.siteexplorer.backlinks.models.Backlinks
import internal.siteexplorer.backlinks.models.Refdomains

interface IExplorerBacklinks {
    suspend fun backlink(
        target: Field.Target,
        select: Field.Select,
        where: Field.Where,
        aggregation: Field.Aggregation = Field.Aggregation(AggregationValue.SimilarLinks),
        history: Field.History = Field.History(HistoryValue.AllTime),
        limit: Field.Limit = Field.Limit(100),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains),
        offset: Field.Offset = Field.Offset(0),
        orderBy: Field.OrderBy = Field.OrderBy("last_seen"),
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        timeout: Field.Timeout = Field.Timeout(10)
    ): Backlinks

    suspend fun refdomains(
        target: Field.Target,
        select: Field.Select,
        where: Field.Where,
        history: Field.History = Field.History(HistoryValue.AllTime),
        limit: Field.Limit = Field.Limit(100),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains),
        offset: Field.Offset = Field.Offset(0),
        orderBy: Field.OrderBy = Field.OrderBy("last_seen"),
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        timeout: Field.Timeout = Field.Timeout(10)
    ): Refdomains
}