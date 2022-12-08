package internal

import io.ktor.client.call.*
import io.ktor.client.statement.*
import io.ktor.http.*

object Utils {
    suspend inline fun <reified T> callWithResults(call: () -> HttpResponse): T {
        val response = call()
        return when (response.status) {
            HttpStatusCode.OK -> response.body()
            HttpStatusCode.BadRequest -> throw BadRequestException(response.body())
            HttpStatusCode.Unauthorized -> throw UnauthorizedException(response.body())
            HttpStatusCode.Forbidden -> throw ForbiddenException(response.body())
            HttpStatusCode.InternalServerError -> throw InternalErrorException(response.body())
            else -> throw Exception("Error: ${response.status.value} ${response.status.description}")
        }
    }

    fun Boolean.toInt() = if (this) 1 else 0
}