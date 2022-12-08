package internal

import internal.dsl.Field
import internal.dsl.IFieldValue

abstract class BaseImpl {
    val baseUrl: String = "https://api.ahrefs.com/v3/"
    abstract val requestUrl: String

    fun buildRequest(endpoint: String, vararg params: Field): String {
        val paramsStr = params.joinToString("&") {
            "${it.name}=${if (it.value is IFieldValue) it.value.value else it.value}"
        }
        return "$requestUrl/$endpoint?$paramsStr"

    }
}