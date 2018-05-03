package facebook4s

import client.FacebookClient
import play.api.inject.Module
import play.api.{Environment, Configuration}

class FacebookModule extends Module {

  def bindings(environment: Environment, configuration: Configuration) = {
    val facebook4sClient = FacebookClient()

    Seq(bind[FacebookClient].toInstance(facebook4sClient))
  }

}
