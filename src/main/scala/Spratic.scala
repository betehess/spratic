package spratic

import akka.actor.ActorSystem
import spray.routing.SimpleRoutingApp

object Main extends App with SimpleRoutingApp {
  implicit val system = ActorSystem("spratic")

  startServer(interface = "localhost", port = 9000) {
    path("hello") {
      get {
        complete {
          "<h1>Say hello to spray</h1>"
        }
      }
    }
  }

}
