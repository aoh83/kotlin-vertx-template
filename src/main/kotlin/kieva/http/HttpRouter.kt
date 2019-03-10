package kieva.http

import io.vertx.core.Vertx
import io.vertx.ext.web.Router
import kieva.http.ping.PingHandler

fun createRouter(vertx: Vertx): Router {
    val router = Router.router(vertx)
    router.route("/ping").handler(PingHandler())
    return router
}