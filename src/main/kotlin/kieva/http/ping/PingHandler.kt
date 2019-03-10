package kieva.http.ping

import io.vertx.core.Handler
import io.vertx.ext.web.RoutingContext

class PingHandler: Handler<RoutingContext> {
    override fun handle(event: RoutingContext?) {
        var response = event!!.response()
        response.end("hello world")
    }
}