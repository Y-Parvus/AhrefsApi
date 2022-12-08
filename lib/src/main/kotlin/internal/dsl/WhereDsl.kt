@file:Suppress("unused")

package internal.dsl

import internal.Utils.toInt
import java.time.LocalDate
import java.time.LocalDateTime

class And(private val content: MutableList<String>) {
    operator fun String.unaryPlus() {
        content.add(this)
    }
}

class Or(private val content: MutableList<String>) {
    operator fun String.unaryPlus() {
        content.add(this)
    }
}

fun field(field: Field, block: (Any) -> String): String {
    return "{\"field\":\"${field.name}\",${block(field.value)}}"
}

fun field(field: BacklinkField, block: (Any) -> String): String {
    return "{\"field\":\"${field.name}\",${block(field.value)}}"
}

fun all(block: () -> String): String {
    return "{\"all\":${block()}}"
}

fun any(block: () -> String): String {
    return "{\"any\":${block()}}"
}

fun and(block: And.() -> Unit): String {
    val content = mutableListOf<String>()
    block(And(content))
    return "{\"and\":[${content.joinToString(",")}]}"
}

fun or(block: Or.() -> Unit): String {
    val content = mutableListOf<String>()
    block(Or(content))
    return "{\"or\":[${content.joinToString(",")}]}"
}

fun not(block: () -> String): String {
    return "{\"not\":${block()}}"
}

fun listIsCondition(block: () -> String): String {
    return "\"list_is\":${block()}"
}

fun isCondition(op: LogicOp, value: Any): String {
    val _value = when(value) {
        is LocalDate,
        is LocalDateTime,
        is String -> "\"$value\""
        is Int -> value
        is IFieldValue -> "\"${value.value}\""
        is Boolean -> value.toInt()
        else -> value
    }
    return "\"is\":[\"${op.value}\",$_value]"
}

fun inListCondition(op: LogicOp, value: Any): String {
    val _value = when(value) {
        is LocalDate,
        is LocalDateTime,
        is String -> "\"$value\""
        is Int -> value
        is IFieldValue -> "\"${value.value}\""
        else -> value
    }
    return "[\"${op.value}\",$_value]"
}


enum class LogicOp(val value: String) {
    EQ("eq"),
    NEQ("neq"),
    GT("gt"),
    GTE("gte"),
    LT("lt"),
    LTE("lte"),
    ISUBSTRING("isubstring"),
    SUBSTRING("substring"),
    PHASE_MATCH("phase_match"),
    IPHASE_MATCH("iphase_match"),
    PREFIX("prefix"),
    SUFFIX("suffix"),
    REGEX("regex"),
    EMPTY("empty"),
    IS_NULL("is_null"),
}