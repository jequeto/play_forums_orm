// @SOURCE:G:/eclipse_workspace/play_forums_orm/conf/routes
// @HASH:cf259a3a9e6056ec868dd295f4e2e7c7c7ddf7cc
// @DATE:Tue May 13 21:04:02 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_actionInfo1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("actionInfo"))))
        

// @LINE:9
private[this] lazy val controllers_Forums_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums"))))
        

// @LINE:11
private[this] lazy val controllers_Users_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/login"))))
        

// @LINE:12
private[this] lazy val controllers_Users_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/login"))))
        

// @LINE:13
private[this] lazy val controllers_Users_logout5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/logout"))))
        

// @LINE:14
private[this] lazy val controllers_Users_unAuthorized6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/Users/unauthorized"))))
        

// @LINE:17
private[this] lazy val controllers_Forums_insertValidate7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/insert"))))
        

// @LINE:19
private[this] lazy val controllers_Forums_update8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/update/"),DynamicPart("forumId", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_Forums_delete9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/delete/"),DynamicPart("forumId", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Themes_index10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/"),DynamicPart("forumId", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_Messages_index11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/"),DynamicPart("forumId", """[^/]+""",true),StaticPart("/"),DynamicPart("themeId", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Themes_insert12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/"),DynamicPart("forumId", """[^/]+""",true),StaticPart("/Themes/insert"))))
        

// @LINE:29
private[this] lazy val controllers_Themes_insertValidate13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Forums/Themes/insert"))))
        

// @LINE:34
private[this] lazy val controllers_Assets_at14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """actionInfo""","""controllers.Application.actionInfo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums""","""controllers.Forums.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/login""","""controllers.Users.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/login""","""controllers.Users.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/logout""","""controllers.Users.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/Users/unauthorized""","""controllers.Users.unAuthorized()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/insert""","""controllers.Forums.insertValidate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/update/$forumId<[^/]+>""","""controllers.Forums.update(forumId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/delete/$forumId<[^/]+>""","""controllers.Forums.delete(forumId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/$forumId<[^/]+>""","""controllers.Themes.index(forumId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/$forumId<[^/]+>/$themeId<[^/]+>""","""controllers.Messages.index(forumId:Long, themeId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/$forumId<[^/]+>/Themes/insert""","""controllers.Themes.insert(forumId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Forums/Themes/insert""","""controllers.Themes.insertValidate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_actionInfo1(params) => {
   call { 
        invokeHandler(controllers.Application.actionInfo(), HandlerDef(this, "controllers.Application", "actionInfo", Nil,"GET", """""", Routes.prefix + """actionInfo"""))
   }
}
        

// @LINE:9
case controllers_Forums_index2(params) => {
   call { 
        invokeHandler(controllers.Forums.index(), HandlerDef(this, "controllers.Forums", "index", Nil,"GET", """""", Routes.prefix + """Forums"""))
   }
}
        

// @LINE:11
case controllers_Users_login3(params) => {
   call { 
        invokeHandler(controllers.Users.login(), HandlerDef(this, "controllers.Users", "login", Nil,"GET", """""", Routes.prefix + """Forums/login"""))
   }
}
        

// @LINE:12
case controllers_Users_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Users.authenticate(), HandlerDef(this, "controllers.Users", "authenticate", Nil,"POST", """""", Routes.prefix + """Forums/login"""))
   }
}
        

// @LINE:13
case controllers_Users_logout5(params) => {
   call { 
        invokeHandler(controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Nil,"GET", """""", Routes.prefix + """Forums/logout"""))
   }
}
        

// @LINE:14
case controllers_Users_unAuthorized6(params) => {
   call { 
        invokeHandler(controllers.Users.unAuthorized(), HandlerDef(this, "controllers.Users", "unAuthorized", Nil,"GET", """""", Routes.prefix + """Forums/Users/unauthorized"""))
   }
}
        

// @LINE:17
case controllers_Forums_insertValidate7(params) => {
   call { 
        invokeHandler(controllers.Forums.insertValidate(), HandlerDef(this, "controllers.Forums", "insertValidate", Nil,"POST", """""", Routes.prefix + """Forums/insert"""))
   }
}
        

// @LINE:19
case controllers_Forums_update8(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Forums.update(forumId), HandlerDef(this, "controllers.Forums", "update", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Forums/update/$forumId<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_Forums_delete9(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Forums.delete(forumId), HandlerDef(this, "controllers.Forums", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Forums/delete/$forumId<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Themes_index10(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Themes.index(forumId), HandlerDef(this, "controllers.Themes", "index", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Forums/$forumId<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Messages_index11(params) => {
   call(params.fromPath[Long]("forumId", None), params.fromPath[Long]("themeId", None)) { (forumId, themeId) =>
        invokeHandler(controllers.Messages.index(forumId, themeId), HandlerDef(this, "controllers.Messages", "index", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """Forums/$forumId<[^/]+>/$themeId<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Themes_insert12(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Themes.insert(forumId), HandlerDef(this, "controllers.Themes", "insert", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Forums/$forumId<[^/]+>/Themes/insert"""))
   }
}
        

// @LINE:29
case controllers_Themes_insertValidate13(params) => {
   call { 
        invokeHandler(controllers.Themes.insertValidate(), HandlerDef(this, "controllers.Themes", "insertValidate", Nil,"POST", """""", Routes.prefix + """Forums/Themes/insert"""))
   }
}
        

// @LINE:34
case controllers_Assets_at14(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     