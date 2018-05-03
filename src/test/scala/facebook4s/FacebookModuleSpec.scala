package facebook4s

import client.FacebookClient
import play.api.inject.guice.GuiceApplicationBuilder

class FacebookModuleSpec extends App {
  val application = new GuiceApplicationBuilder().bindings(new FacebookModule).build()
  val myCode = application.injector.instanceOf(classOf[FacebookClient])
  assert(myCode.isInstanceOf[FacebookClient])
}
