@file:Suppress("unused", "SpellCheckingInspection")

package internal.dsl

import java.time.LocalDate
import java.time.LocalDateTime

sealed class Field(val value: Any) {
    abstract val name: String

    class Protocol(value: ProtocolValue) : Field(value) {
        override val name = "protocol"
    }

    class Mode(value: ModeValue) : Field(value) {
        override val name = "mode"
    }

    class Country(value: CountryValue) : Field(value) {
        override val name = "country"
    }

    class VolumeMode(value: VolumeModeValue) : Field(value) {
        override val name = "volume_mode"
    }

    class HistoryGrouping(value: HistoryGroupingValue) : Field(value) {
        override val name = "history_grouping"
    }

    class Limit(value: Int) : Field(value) {
        override val name = "limit"
    }

    class Offset(value: Int) : Field(value) {
        override val name = "offset"
    }

    class Target(value: String) : Field(value) {
        override val name = "target"
    }

    class OrderBy(value: String) : Field(value) {
        override val name = "order_by"
    }

    class Timeout(value: Int) : Field(value) {
        override val name = "timeout"
    }

    class Date(value: LocalDate) : Field(value) {
        override val name = "date"
    }

    class DateFrom(value: LocalDate) : Field(value) {
        override val name = "date_from"
    }

    class DateTo(value: LocalDate) : Field(value) {
        override val name = "date_to"
    }

    class Aggregation(value: AggregationValue) : Field(value) {
        override val name = "aggregation"
    }

    class History(value: HistoryValue) : Field(value) {
        override val name = "history"
    }

    class Select(value: String) : Field(value) {
        override val name = "select"
    }

    class Where(value: String) : Field(value) {
        override val name = "where"
    }
}

//This used for Select and Where queries
sealed class BacklinkField(val value: Any) {
    abstract val name: String

    class AhrefsRankSource(value: Int) : BacklinkField(value) {
        override val name = "ahrefs_rank_source"
    }

    class AhrefsRankTarget(value: Int) : BacklinkField(value) {
        override val name = "ahrefs_rank_target"
    }

    class Alt(value: String) : BacklinkField(value) {
        override val name = "alt"
    }

    class Anchor(value: String) : BacklinkField(value) {
        override val name = "anchor"
    }

    class BrokenRedirectNewTarget(value: String) : BacklinkField(value) {
        override val name = "broken_redirect_new_target"
    }

    class BrokenRedirectReason(value: BrokenRedirectReasonValue) : BacklinkField(value) {
        override val name = "broken_redirect_reason"
    }

    class BrokenRedirectSource(value: String) : BacklinkField(value) {
        override val name = "broken_redirect_source"
    }

    class ClassC(value: Int) : BacklinkField(value) {
        override val name = "class_c"
    }

    class DiscoveredStatus(value: DiscoveredStatusValue) : BacklinkField(value) {
        override val name = "discovered_status"
    }

    class DomainRatingSource(value: Double) : BacklinkField(value) {
        override val name = "domain_rating_source"
    }

    class DomainRatingTarget(value: Double) : BacklinkField(value) {
        override val name = "domain_rating_target"
    }

    class DropReason(value: DropReasonValue) : BacklinkField(value) {
        override val name = "drop_reason"
    }

    class Encoding(value: String) : BacklinkField(value) {
        override val name = "encoding"
    }

    class FirstSeen(value: LocalDate) : BacklinkField(value) {
        override val name = "first_seen"
    }

    class FirstSeenLink(value: LocalDate) : BacklinkField(value) {
        override val name = "first_seen_link"
    }

    class HttpCode(value: Int) : BacklinkField(value) {
        override val name = "http_code"
    }

    class HttpCrawl(value: Boolean) : BacklinkField(value) {
        override val name = "http_crawl"
    }

    class IsAlternate(value: Boolean) : BacklinkField(value) {
        override val name = "is_alternate"
    }

    class IsCanonical(value: Boolean) : BacklinkField(value) {
        override val name = "is_canonical"
    }

    class IsContent(value: Boolean) : BacklinkField(value) {
        override val name = "is_content"
    }

    class IsDofollow(value: Boolean) : BacklinkField(value) {
        override val name = "is_dofollow"
    }

    class IsForm(value: Boolean) : BacklinkField(value) {
        override val name = "is_form"
    }

    class IsFrame(value: Boolean) : BacklinkField(value) {
        override val name = "is_frame"
    }

    class IsImage(value: Boolean) : BacklinkField(value) {
        override val name = "is_image"
    }

    class IsLost(value: Boolean) : BacklinkField(value) {
        override val name = "is_lost"
    }

    class IsNew(value: Boolean) : BacklinkField(value) {
        override val name = "is_new"
    }

    class IsNofollow(value: Boolean) : BacklinkField(value) {
        override val name = "is_nofollow"
    }

    class IsRedirect(value: Boolean) : BacklinkField(value) {
        override val name = "is_redirect"
    }

    class IsRedirectLost(value: Boolean) : BacklinkField(value) {
        override val name = "is_redirect_lost"
    }

    class IsRootSource(value: Boolean) : BacklinkField(value) {
        override val name = "is_root_source"
    }

    class IsRootTarget(value: Boolean) : BacklinkField(value) {
        override val name = "is_root_target"
    }

    class IsRSS(value: Boolean) : BacklinkField(value) {
        override val name = "is_rss"
    }

    class IsSponsored(value: Boolean) : BacklinkField(value) {
        override val name = "is_sponsored"
    }

    class IsText(value: Boolean) : BacklinkField(value) {
        override val name = "is_text"
    }

    class IsUgc(value: Boolean) : BacklinkField(value) {
        override val name = "is_ugc"
    }

    class JsCrawl(value: Boolean) : BacklinkField(value) {
        override val name = "js_crawl"
    }

    class Languages(value: String) : BacklinkField(value) {
        override val name = "languages"
    }

    class LastSeen(value: LocalDate) : BacklinkField(value) {
        override val name = "last_seen"
    }

    class LastVisited(value: LocalDate) : BacklinkField(value) {
        override val name = "last_visited"
    }

    class LinkGroupCount(value: Int) : BacklinkField(value) {
        override val name = "link_group_count"
    }

    class LinkType(value: LinkTypeValue) : BacklinkField(value) {
        override val name = "link_type"
    }

    class LinkedDomainsSourceDomain(value: Int) : BacklinkField(value) {
        override val name = "linked_domains_source_domain"
    }

    class LinkedDomainsSourcePage(value: Int) : BacklinkField(value) {
        override val name = "linked_domains_source_page"
    }

    class LinksExternal(value: Int) : BacklinkField(value) {
        override val name: String = "links_external"
    }

    class LinksInternal(value: Int) : BacklinkField(value) {
        override val name: String = "links_internal"
    }

    class LostReason(value: LostReasonValue) : BacklinkField(value) {
        override val name: String = "lost_reason"
    }

    class NameSource(value: String) : BacklinkField(value) {
        override val name: String = "name_source"
    }

    class NameTarget(value: String) : BacklinkField(value) {
        override val name: String = "name_target"
    }

    class NoIndex(value: Boolean) : BacklinkField(value) {
        override val name: String = "noindex"
    }

    class PageSize(value: Int) : BacklinkField(value) {
        override val name: String = "page_size"
    }

    class PortSource(value: Int) : BacklinkField(value) {
        override val name: String = "port_source"
    }

    class PortTarget(value: Int) : BacklinkField(value) {
        override val name: String = "port_target"
    }

    class Positions(value: Int) : BacklinkField(value) {
        override val name: String = "positions"
    }

    class PoweredBy(value: String) : BacklinkField(value) {
        override val name: String = "powered_by"
    }

    class RedirectCode(value: Int) : BacklinkField(value) {
        override val name: String = "redirect_code"
    }

    class RedirectKind(value: Int) : BacklinkField(value) {
        override val name: String = "redirect_kind"
    }

    class RefdomainsSource(value: Int) : BacklinkField(value) {
        override val name: String = "refdomains_source"
    }

    class RefdomainsSourceDomain(value: Int) : BacklinkField(value) {
        override val name: String = "refdomains_source_domain"
    }

    class RefdomainsTargetDomain(value: Int) : BacklinkField(value) {
        override val name: String = "refdomains_target_domain"
    }

    class RootNameSource(value: String) : BacklinkField(value) {
        override val name: String = "root_name_source"
    }

    class RootNameTarget(value: String) : BacklinkField(value) {
        override val name: String = "root_name_target"
    }

    class SnippetLeft(value: String) : BacklinkField(value) {
        override val name: String = "snippet_left"
    }

    class SnippetRight(value: String) : BacklinkField(value) {
        override val name: String = "snippet_right"
    }

    class Title(value: String) : BacklinkField(value) {
        override val name: String = "title"
    }

    class TldClassSource(value: TldClassValue) : BacklinkField(value) {
        override val name: String = "tld_class_source"
    }

    class TldClassTarget(value: TldClassValue) : BacklinkField(value) {
        override val name: String = "tld_class_target"
    }

    class Traffic(value: Int) : BacklinkField(value) {
        override val name: String = "traffic"
    }

    class TrafficDomain(value: Int) : BacklinkField(value) {
        override val name: String = "traffic_domain"
    }

    class UrlFrom(value: String) : BacklinkField(value) {
        override val name: String = "url_from"
    }

    class UrlFromPlain(value: String) : BacklinkField(value) {
        override val name: String = "url_from_plain"
    }

    class UrlRatingSource(value: Double) : BacklinkField(value) {
        override val name: String = "url_rating_source"
    }

    class UrlRedirect(value: String) : BacklinkField(value) {
        override val name: String = "url_redirect"
    }

    class UrlTo(value: String) : BacklinkField(value) {
        override val name: String = "url_to"
    }

    class UrlToPlain(value: String) : BacklinkField(value) {
        override val name: String = "url_to_plain"
    }
}

//This used for Select and Where queries
sealed class RefDomainField(val value: Any) {
    abstract val name: String

    class DofollowLinkedDomains(value: Int) : RefDomainField(value) {
        override val name: String = "dofollow_linked_domains"
    }

    class DofollowLinks(value: Int) : RefDomainField(value) {
        override val name: String = "dofollow_links"
    }

    class DofollowRefDomains(value: Int) : RefDomainField(value) {
        override val name: String = "dofollow_refdomains"
    }

    class Domain(value: String) : RefDomainField(value) {
        override val name: String = "domain"
    }

    class DomainRating(value: Double) : RefDomainField(value) {
        override val name: String = "domain_rating"
    }
    
    class FirstSeen(value: LocalDateTime) : RefDomainField(value) {
        override val name: String = "first_seen"
    }

    class IsRootDomain(value: Boolean) : RefDomainField(value) {
        override val name: String = "is_root_domain"
    }

    class LastSeen(value: LocalDateTime) : RefDomainField(value) {
        override val name: String = "last_seen"
    }

    class LinksToTarget(value: Int) : RefDomainField(value) {
        override val name: String = "links_to_target"
    }

    class LostLinks(value: Int) : RefDomainField(value) {
        override val name: String = "lost_links"
    }

    class NewLinks(value: Int) : RefDomainField(value) {
        override val name: String = "new_links"
    }

    class TrafficDomain(value: Int) : RefDomainField(value) {
        override val name: String = "traffic_domain"
    }
}

//TODO:OrganicSearchFields