// @SOURCE:G:/eclipse_workspace/play_forums_orm/conf/routes
// @HASH:f568daa5e89b78fdd2b33616cee28fd527e5ef2b
// @DATE:Thu May 22 23:41:35 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:43
// @LINE:40
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:43
class ReverseAssets {
    

// @LINE:43
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseUsers {
    

// @LINE:12
def unAuthorized(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/unauthorized")
}
                                                

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/logout")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/login")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/login")
}
                                                
    
}
                          

// @LINE:40
class ReversePermissions {
    

// @LINE:40
def crud(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/permissions/crud")
}
                                                
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseThemes {
    

// @LINE:27
def delete(themeId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/themes/" + implicitly[PathBindable[Long]].unbind("themeId", themeId) + "/delete")
}
                                                

// @LINE:24
def insertValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/insert")
}
                                                

// @LINE:23
def insert(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/insert")
}
                                                

// @LINE:25
def update(themeId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/themes/" + implicitly[PathBindable[Long]].unbind("themeId", themeId) + "/update")
}
                                                

// @LINE:22
def index(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes")
}
                                                

// @LINE:26
def updateValidate(themeId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/themes/" + implicitly[PathBindable[Long]].unbind("themeId", themeId) + "/update")
}
                                                

// @LINE:28
def deleteValidate(themeId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/themes/" + implicitly[PathBindable[Long]].unbind("themeId", themeId) + "/delete")
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseForums {
    

// @LINE:19
def delete(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/delete")
}
                                                

// @LINE:17
def update(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/update")
}
                                                

// @LINE:15
def insert(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/insert")
}
                                                

// @LINE:18
def updateValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/update")
}
                                                

// @LINE:20
def deleteValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/delete")
}
                                                

// @LINE:16
def insertValidate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/insert")
}
                                                

// @LINE:14
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums")
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def actionInfo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "actionInfo")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:43
// @LINE:40
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:43
class ReverseAssets {
    

// @LINE:43
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseUsers {
    

// @LINE:12
def unAuthorized : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.unAuthorized",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/unauthorized"})
      }
   """
)
                        

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/logout"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/login"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/login"})
      }
   """
)
                        
    
}
              

// @LINE:40
class ReversePermissions {
    

// @LINE:40
def crud : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Permissions.crud",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/permissions/crud"})
      }
   """
)
                        
    
}
              

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseThemes {
    

// @LINE:27
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.delete",
   """
      function(themeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/themes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId) + "/delete"})
      }
   """
)
                        

// @LINE:24
def insertValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.insertValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/insert"})
      }
   """
)
                        

// @LINE:23
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.insert",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/insert"})
      }
   """
)
                        

// @LINE:25
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.update",
   """
      function(themeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/themes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId) + "/update"})
      }
   """
)
                        

// @LINE:22
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.index",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes"})
      }
   """
)
                        

// @LINE:26
def updateValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.updateValidate",
   """
      function(themeId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/themes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId) + "/update"})
      }
   """
)
                        

// @LINE:28
def deleteValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.deleteValidate",
   """
      function(themeId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/themes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId) + "/delete"})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseForums {
    

// @LINE:19
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.delete",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/delete"})
      }
   """
)
                        

// @LINE:17
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.update",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/update"})
      }
   """
)
                        

// @LINE:15
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.insert",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/insert"})
      }
   """
)
                        

// @LINE:18
def updateValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.updateValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/update"})
      }
   """
)
                        

// @LINE:20
def deleteValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.deleteValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/delete"})
      }
   """
)
                        

// @LINE:16
def insertValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.insertValidate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/insert"})
      }
   """
)
                        

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums"})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def actionInfo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.actionInfo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actionInfo"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:43
// @LINE:40
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:43
class ReverseAssets {
    

// @LINE:43
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseUsers {
    

// @LINE:12
def unAuthorized(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.unAuthorized(), HandlerDef(this, "controllers.Users", "unAuthorized", Seq(), "GET", """""", _prefix + """forums_orm/unauthorized""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Seq(), "GET", """""", _prefix + """forums_orm/logout""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.authenticate(), HandlerDef(this, "controllers.Users", "authenticate", Seq(), "POST", """""", _prefix + """forums_orm/login""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.login(), HandlerDef(this, "controllers.Users", "login", Seq(), "GET", """""", _prefix + """forums_orm/login""")
)
                      
    
}
                          

// @LINE:40
class ReversePermissions {
    

// @LINE:40
def crud(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Permissions.crud(), HandlerDef(this, "controllers.Permissions", "crud", Seq(), "GET", """""", _prefix + """forums_orm/permissions/crud""")
)
                      
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseThemes {
    

// @LINE:27
def delete(themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.delete(themeId), HandlerDef(this, "controllers.Themes", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/themes/$themeId<[^/]+>/delete""")
)
                      

// @LINE:24
def insertValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.insertValidate(forumId), HandlerDef(this, "controllers.Themes", "insertValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert""")
)
                      

// @LINE:23
def insert(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.insert(forumId), HandlerDef(this, "controllers.Themes", "insert", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert""")
)
                      

// @LINE:25
def update(themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.update(themeId), HandlerDef(this, "controllers.Themes", "update", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/themes/$themeId<[^/]+>/update""")
)
                      

// @LINE:22
def index(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.index(forumId), HandlerDef(this, "controllers.Themes", "index", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes""")
)
                      

// @LINE:26
def updateValidate(themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.updateValidate(themeId), HandlerDef(this, "controllers.Themes", "updateValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/themes/$themeId<[^/]+>/update""")
)
                      

// @LINE:28
def deleteValidate(themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.deleteValidate(themeId), HandlerDef(this, "controllers.Themes", "deleteValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/themes/$themeId<[^/]+>/delete""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseForums {
    

// @LINE:19
def delete(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.delete(forumId), HandlerDef(this, "controllers.Forums", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/delete""")
)
                      

// @LINE:17
def update(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.update(forumId), HandlerDef(this, "controllers.Forums", "update", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/update""")
)
                      

// @LINE:15
def insert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.insert(), HandlerDef(this, "controllers.Forums", "insert", Seq(), "GET", """""", _prefix + """forums_orm/forums/insert""")
)
                      

// @LINE:18
def updateValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.updateValidate(forumId), HandlerDef(this, "controllers.Forums", "updateValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/update""")
)
                      

// @LINE:20
def deleteValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.deleteValidate(forumId), HandlerDef(this, "controllers.Forums", "deleteValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/delete""")
)
                      

// @LINE:16
def insertValidate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.insertValidate(), HandlerDef(this, "controllers.Forums", "insertValidate", Seq(), "POST", """""", _prefix + """forums_orm/forums/insert""")
)
                      

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.index(), HandlerDef(this, "controllers.Forums", "index", Seq(), "GET", """""", _prefix + """forums_orm/forums""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def actionInfo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.actionInfo(), HandlerDef(this, "controllers.Application", "actionInfo", Seq(), "GET", """""", _prefix + """actionInfo""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    