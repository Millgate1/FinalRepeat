
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/X00139473_BenOFlaherty_REPEATCA/repeat/conf/routes
// @DATE:Fri Aug 31 01:37:29 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addClientSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addClientSubmit")
    }
  
    // @LINE:14
    def deleteClient(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delClient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutUs")
    }
  
    // @LINE:15
    def updateClient(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateClient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:9
    def addClient(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addClient")
    }
  
    // @LINE:12
    def clientDetails(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clientDetails/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:18
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
