package internal.siteexplorer.overview

import internal.dsl.*
import internal.siteexplorer.overview.models.*

interface IExplorerOverview {
    suspend fun domainRating(date: Field.Date, target: Field.Target, protocol: Field.Protocol =
        Field.Protocol(ProtocolValue.Both)): DomainRating

    suspend fun backlinksStats(
        date: Field.Date,
        target: Field.Target,
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains)
    ): BacklinksStats

    suspend fun metrics(
        date: Field.Date,
        target: Field.Target,
        countryCode: Field.Country,
        volumeMode: Field.VolumeMode = Field.VolumeMode(VolumeModeValue.Average),
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains)
    ): Metrics

    suspend fun referringDomainsHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        historyGrouping: Field.HistoryGrouping = Field.HistoryGrouping(HistoryGroupingValue.Monthly),
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains)
    ): ReferringDomainsHistory

    suspend fun urlRating(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        historyGrouping: Field.HistoryGrouping = Field.HistoryGrouping(HistoryGroupingValue.Monthly),
    ): UrlRating

    suspend fun metricsHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        countryCode: Field.Country,
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains),
        volumeMode: Field.VolumeMode = Field.VolumeMode(VolumeModeValue.Monthly),
        historyGrouping: Field.HistoryGrouping = Field.HistoryGrouping(HistoryGroupingValue.Monthly)
    ): MetricsHistory

    suspend fun pagesHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        countryCode: Field.Country,
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains),
        historyGrouping: Field.HistoryGrouping = Field.HistoryGrouping(HistoryGroupingValue.Monthly)
    ): PagesHistory

    suspend fun keywordsHistory(
        target: Field.Target,
        dateFrom: Field.DateFrom,
        dateTo: Field.DateTo,
        countryCode: Field.Country,
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains),
        historyGrouping: Field.HistoryGrouping = Field.HistoryGrouping(HistoryGroupingValue.Monthly)
    ): KeywordsHistory

    suspend fun metricsByCountry(
        target: Field.Target,
        date: Field.Date,
        limit: Field.Limit,
        volumeMode: Field.VolumeMode = Field.VolumeMode(VolumeModeValue.Monthly),
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains)
    ): MetricsByCountry


    suspend fun pagesByTraffic(
        target: Field.Target,
        countryCode: Field.Country,
        volumeMode: Field.VolumeMode = Field.VolumeMode(VolumeModeValue.Monthly),
        protocol: Field.Protocol = Field.Protocol(ProtocolValue.Both),
        mode: Field.Mode = Field.Mode(ModeValue.Subdomains)
    ): PagesByTraffic
}