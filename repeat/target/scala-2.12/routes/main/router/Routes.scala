
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/X00139473_BenOFlaherty_REPEATCA/repeat/conf/routes
// @DATE:Fri Aug 31 01:37:29 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:18
  LoginController_2: controllers.LoginController,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:18
    LoginController_2: controllers.LoginController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addClient""", """controllers.HomeController.addClient"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addClientSubmit""", """controllers.HomeController.addClientSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientDetails/""" + "$" + """id<[^/]+>""", """controllers.HomeController.clientDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delClient/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteClient(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateClient/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateClient(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutUs")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_0.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """aboutUs""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_addClient2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addClient")))
  )
  private[this] lazy val controllers_HomeController_addClient2_invoker = createInvoker(
    HomeController_0.addClient,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addClient",
      Nil,
      "GET",
      this.prefix + """addClient""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_addClientSubmit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addClientSubmit")))
  )
  private[this] lazy val controllers_HomeController_addClientSubmit3_invoker = createInvoker(
    HomeController_0.addClientSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addClientSubmit",
      Nil,
      "POST",
      this.prefix + """addClientSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_clientDetails4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_clientDetails4_invoker = createInvoker(
    HomeController_0.clientDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "clientDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """clientDetails/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_deleteClient5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delClient/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteClient5_invoker = createInvoker(
    HomeController_0.deleteClient(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteClient",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delClient/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_updateClient6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateClient/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateClient6_invoker = createInvoker(
    HomeController_0.updateClient(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateClient",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateClient/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_login7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login7_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_loginSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit8_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout9_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_about1_route(params@_) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_0.about)
      }
  
    // @LINE:9
    case controllers_HomeController_addClient2_route(params@_) =>
      call { 
        controllers_HomeController_addClient2_invoker.call(HomeController_0.addClient)
      }
  
    // @LINE:11
    case controllers_HomeController_addClientSubmit3_route(params@_) =>
      call { 
        controllers_HomeController_addClientSubmit3_invoker.call(HomeController_0.addClientSubmit)
      }
  
    // @LINE:12
    case controllers_HomeController_clientDetails4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_clientDetails4_invoker.call(HomeController_0.clientDetails(id))
      }
  
    // @LINE:14
    case controllers_HomeController_deleteClient5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteClient5_invoker.call(HomeController_0.deleteClient(id))
      }
  
    // @LINE:15
    case controllers_HomeController_updateClient6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateClient6_invoker.call(HomeController_0.updateClient(id))
      }
  
    // @LINE:18
    case controllers_LoginController_login7_route(params@_) =>
      call { 
        controllers_LoginController_login7_invoker.call(LoginController_2.login)
      }
  
    // @LINE:19
    case controllers_LoginController_loginSubmit8_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit8_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:20
    case controllers_LoginController_logout9_route(params@_) =>
      call { 
        controllers_LoginController_logout9_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:23
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
