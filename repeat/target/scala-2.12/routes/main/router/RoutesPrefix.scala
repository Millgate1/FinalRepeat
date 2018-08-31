
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/X00139473_BenOFlaherty_REPEATCA/repeat/conf/routes
// @DATE:Fri Aug 31 01:37:29 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
