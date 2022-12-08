import internal.Api

class AhrefsApi {
    companion object {
        fun create(authToken: String): Api {
            return Api(authToken)
        }
    }
}