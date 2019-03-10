package kieva.actors

import io.vertx.core.AbstractVerticle

class HelloWorldActor : AbstractVerticle() {
    override fun start() {
        System.out.println("hello world")
    }

}