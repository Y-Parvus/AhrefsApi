package internal.siteexplorer.overview

import internal.*
import internal.dsl.Field
import internal.siteexplorer.overview.models.*
import io.ktor.client.*
import io.ktor.client.request.*

class ExplorerOverviewImpl(private val client: HttpClient) : BaseImpl(), IExplorerOverview {
    override val requestUrl = baseUrl + "site-explorer"

    override suspend fun domainRating(date: Field.Date, target: Field.Target, protocol: Field.Protocol): DomainRating {
        val requestString = buildRequest(
            "domain-rating",
            date, target, protocol
        )
        val response = Utils.callWithResults<DomainRating> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun backlinksStats(
        date: Field.Date,
        target: Field.Target,
        protocol: Field.Protocol,
        mode: Field.Mode
    ): BacklinksStats {
        val requestString = buildRequest(
            "backlinks-stats",
            date, target, protocol, mode
        )
        val response = Utils.callWithResults<BacklinksStats> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun metrics(
        date: Field.Date,
        target: Field.Target,
        countryCode: Field.Country,
        volumeMode: Field.VolumeMode,
        protocol: Field.Protocol,
        mode: Field.Mode
    ): Metrics {
        val requestString = buildRequest(
            "metrics",
            date, target, countryCode, volumeMode, protocol, mode
        )
        val response = Utils.callWithResults<Metrics> {
            client.get(requestString)
        }
        return response
    }

    override suspend fun referringDomainsHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        historyGrouping: Field.HistoryGrouping,
        protocol: Field.Protocol,
        mode: Field.Mode
    ): ReferringDomainsHistory {
        val requestString = buildRequest(
            "refdomains-history",
            target, dateFrom, dateTo, historyGrouping, protocol, mode
        )
        val response = Utils.callWithResults<ReferringDomainsHistory> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun urlRating(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        historyGrouping: Field.HistoryGrouping
    ): UrlRating {
        val requestString = buildRequest(
            "url-rating-history",
            target, dateFrom, dateTo, historyGrouping
        )
        val response = Utils.callWithResults<UrlRating> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun metricsHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        countryCode: Field.Country,
        protocol: Field.Protocol,
        mode: Field.Mode,
        volumeMode: Field.VolumeMode,
        historyGrouping: Field.HistoryGrouping
    ): MetricsHistory {
        val requestString = buildRequest(
            "metrics-history",
            target, dateFrom, dateTo, countryCode, protocol, mode, volumeMode, historyGrouping
        )
        val response = Utils.callWithResults<MetricsHistory> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun pagesHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        countryCode: Field.Country,
        protocol: Field.Protocol,
        mode: Field.Mode,
        historyGrouping: Field.HistoryGrouping
    ): PagesHistory {
        val requestString = buildRequest(
            "pages-history",
            target, dateFrom, dateTo, countryCode, protocol, mode, historyGrouping
        )
        val response = Utils.callWithResults<PagesHistory> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun keywordsHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        countryCode: Field.Country,
        protocol: Field.Protocol,
        mode: Field.Mode,
        historyGrouping: Field.HistoryGrouping
    ): KeywordsHistory {
        val requestString = buildRequest(
            "keywords-history",
            target, dateFrom, dateTo, countryCode, protocol, mode, historyGrouping
        )
        val response = Utils.callWithResults<KeywordsHistory> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun metricsByCountry(
        target: Field.Target,
        date: Field.Date,
        limit: Field.Limit,
        volumeMode: Field.VolumeMode,
        protocol: Field.Protocol,
        mode: Field.Mode
    ): MetricsByCountry {
        val requestString = buildRequest(
            "metrics-by-country",
            target, date, limit, volumeMode, protocol, mode
        )
        val response = Utils.callWithResults<MetricsByCountry> {
            client.get(requestString)
        }

        return response
    }

    override suspend fun pagesByTraffic(
        target: Field.Target,
        countryCode: Field.Country,
        volumeMode: Field.VolumeMode,
        protocol: Field.Protocol,
        mode: Field.Mode
    ): PagesByTraffic {
        val requestString = buildRequest(
            "pages-by-traffic",
            target, countryCode, volumeMode, protocol, mode
        )
        val response = Utils.callWithResults<PagesByTraffic> {
            client.get(requestString)
        }
        return response
    }
}