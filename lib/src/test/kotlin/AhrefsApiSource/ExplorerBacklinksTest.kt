package AhrefsApiSource

import internal.Api
import internal.dsl.*
import internal.siteexplorer.backlinks.IExplorerBacklinks
import internal.siteexplorer.overview.IExplorerOverview
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.net.URLEncoder

class ExplorerBacklinksTest {
    lateinit var api: Api
    lateinit var explorerBacklinks: IExplorerBacklinks

    @BeforeEach
    fun setUp() {
        api = AhrefsApi.create("token")
        explorerBacklinks = api.backlinksApi
    }

    @Test
    fun testBacklinkWithRequiredParams() {
        val where = field(BacklinkField.IsDofollow(true)) {
            isCondition(LogicOp.EQ, it)
        }
        val encoded = URLEncoder.encode(where, "UTF-8")

        val response = runBlocking {
            explorerBacklinks.backlink(
                Field.Target("google.com"),
                Field.Select(BacklinkField.Alt("").name),
                Field.Where(encoded)
            )
        }

        println(response)
    }
}