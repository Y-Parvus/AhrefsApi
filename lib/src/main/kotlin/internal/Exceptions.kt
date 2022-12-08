package internal

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

class BadRequestException(message: Error) : Exception(message.error)
class UnauthorizedException(message: Error) : Exception(message.error)
class ForbiddenException(message: Error) : Exception(message.error)
class InternalErrorException(message: Error) : Exception(message.error)

@Serializable
data class Error(
    @SerialName("error")
    val error: String,
)