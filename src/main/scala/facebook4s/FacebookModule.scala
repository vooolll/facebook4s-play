package facebook4s

import client.FacebookClient
import play.api.inject.Module

class FacebookModule extends Module {

  val facebook4sClient= FacebookClient()

}
