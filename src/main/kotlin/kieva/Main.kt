package kieva

import io.vertx.core.Vertx
import io.vertx.kotlin.core.http.HttpServerOptions
import kieva.actors.HelloWorldActor
import kieva.http.createRouter


fun main(args : Array<String>) {
    var vertx = Vertx.vertx()
    var hw = HelloWorldActor()
    var httpOptions = HttpServerOptions()
    httpOptions.setPort(8080)
    var webserver = vertx.createHttpServer(httpOptions)
//    vertx.deployVerticle(hw)
    val router = createRouter(vertx)
    webserver.requestHandler({r -> router.accept(r)}).listen(8080)

//    vertx.close()
}