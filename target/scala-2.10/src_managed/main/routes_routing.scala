// @SOURCE:G:/eclipse_workspace/play_forums_orm/conf/routes
// @HASH:9fde14f411d9a1c542d65fb5f1069a1bed49c115
// @DATE:Tue May 20 00:35:41 CEST 2014


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
private[this] lazy val controllers_Forums_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm"))))
        

// @LINE:11
private[this] lazy val controllers_Users_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/login"))))
        

// @LINE:12
private[this] lazy val controllers_Users_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/login"))))
        

// @LINE:13
private[this] lazy val controllers_Users_logout5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/logout"))))
        

// @LINE:14
private[this] lazy val controllers_Users_unAuthorized6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/unauthorized"))))
        

// @LINE:17
private[this] lazy val controllers_Forums_insertValidate7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/insert"))))
        

// @LINE:19
private[this] lazy val controllers_Forums_update8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/update/"),DynamicPart("forumId", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_Forums_updateValidate9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/update/"),DynamicPart("forumId", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_Forums_delete10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/delete/"),DynamicPart("forumId", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_Themes_index11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/"),DynamicPart("forumId", """[^/]+""",true),StaticPart("/themes"))))
        

// @LINE:26
private[this] lazy val controllers_Messages_index12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/"),DynamicPart("forumId", """[^/]+""",true),StaticPart("/themes/"),DynamicPart("themeId", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Themes_insert13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/"),DynamicPart("forumId", """[^/]+""",true),StaticPart("/themes/insert"))))
        

// @LINE:30
private[this] lazy val controllers_Themes_insertValidate14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forums_orm/forums/"),DynamicPart("forumId", """[^/]+""",true),StaticPart("/themes/insert"))))
        

// @LINE:35
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """actionInfo""","""controllers.Application.actionInfo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm""","""controllers.Forums.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/login""","""controllers.Users.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/login""","""controllers.Users.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/logout""","""controllers.Users.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/unauthorized""","""controllers.Users.unAuthorized()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/insert""","""controllers.Forums.insertValidate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/update/$forumId<[^/]+>""","""controllers.Forums.update(forumId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/update/$forumId<[^/]+>""","""controllers.Forums.updateValidate(forumId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/delete/$forumId<[^/]+>""","""controllers.Forums.delete(forumId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/$forumId<[^/]+>/themes""","""controllers.Themes.index(forumId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/$forumId<[^/]+>/themes/$themeId<[^/]+>""","""controllers.Messages.index(forumId:Long, themeId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/$forumId<[^/]+>/themes/insert""","""controllers.Themes.insert(forumId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forums_orm/forums/$forumId<[^/]+>/themes/insert""","""controllers.Themes.insertValidate(forumId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        invokeHandler(controllers.Forums.index(), HandlerDef(this, "controllers.Forums", "index", Nil,"GET", """""", Routes.prefix + """forums_orm"""))
   }
}
        

// @LINE:11
case controllers_Users_login3(params) => {
   call { 
        invokeHandler(controllers.Users.login(), HandlerDef(this, "controllers.Users", "login", Nil,"GET", """""", Routes.prefix + """forums_orm/login"""))
   }
}
        

// @LINE:12
case controllers_Users_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Users.authenticate(), HandlerDef(this, "controllers.Users", "authenticate", Nil,"POST", """""", Routes.prefix + """forums_orm/login"""))
   }
}
        

// @LINE:13
case controllers_Users_logout5(params) => {
   call { 
        invokeHandler(controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Nil,"GET", """""", Routes.prefix + """forums_orm/logout"""))
   }
}
        

// @LINE:14
case controllers_Users_unAuthorized6(params) => {
   call { 
        invokeHandler(controllers.Users.unAuthorized(), HandlerDef(this, "controllers.Users", "unAuthorized", Nil,"GET", """""", Routes.prefix + """forums_orm/unauthorized"""))
   }
}
        

// @LINE:17
case controllers_Forums_insertValidate7(params) => {
   call { 
        invokeHandler(controllers.Forums.insertValidate(), HandlerDef(this, "controllers.Forums", "insertValidate", Nil,"POST", """""", Routes.prefix + """forums_orm/forums/insert"""))
   }
}
        

// @LINE:19
case controllers_Forums_update8(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Forums.update(forumId), HandlerDef(this, "controllers.Forums", "update", Seq(classOf[Long]),"GET", """""", Routes.prefix + """forums_orm/forums/update/$forumId<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_Forums_updateValidate9(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Forums.updateValidate(forumId), HandlerDef(this, "controllers.Forums", "updateValidate", Seq(classOf[Long]),"POST", """""", Routes.prefix + """forums_orm/forums/update/$forumId<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Forums_delete10(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Forums.delete(forumId), HandlerDef(this, "controllers.Forums", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """forums_orm/forums/delete/$forumId<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Themes_index11(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Themes.index(forumId), HandlerDef(this, "controllers.Themes", "index", Seq(classOf[Long]),"GET", """""", Routes.prefix + """forums_orm/forums/$forumId<[^/]+>/themes"""))
   }
}
        

// @LINE:26
case controllers_Messages_index12(params) => {
   call(params.fromPath[Long]("forumId", None), params.fromPath[Long]("themeId", None)) { (forumId, themeId) =>
        invokeHandler(controllers.Messages.index(forumId, themeId), HandlerDef(this, "controllers.Messages", "index", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """forums_orm/forums/$forumId<[^/]+>/themes/$themeId<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Themes_insert13(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Themes.insert(forumId), HandlerDef(this, "controllers.Themes", "insert", Seq(classOf[Long]),"GET", """""", Routes.prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert"""))
   }
}
        

// @LINE:30
case controllers_Themes_insertValidate14(params) => {
   call(params.fromPath[Long]("forumId", None)) { (forumId) =>
        invokeHandler(controllers.Themes.insertValidate(forumId), HandlerDef(this, "controllers.Themes", "insertValidate", Seq(classOf[Long]),"POST", """""", Routes.prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert"""))
   }
}
        

// @LINE:35
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     