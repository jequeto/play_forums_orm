// @SOURCE:G:/eclipse_workspace/play_forums_orm/conf/routes
// @HASH:98e4865a2cbfa977ad9006bdb5d14efabfe157cd
// @DATE:Wed May 21 20:34:45 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:38
// @LINE:35
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
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

// @LINE:38
class ReverseAssets {
    

// @LINE:38
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
                          

// @LINE:35
class ReversePermissions {
    

// @LINE:35
def crud(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/permissions/crud")
}
                                                
    
}
                          

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:22
class ReverseThemes {
    

// @LINE:27
def insertValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/insert")
}
                                                

// @LINE:26
def insert(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/insert")
}
                                                

// @LINE:30
def updateValidate(forumId:Long, themeId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/update/" + implicitly[PathBindable[Long]].unbind("themeId", themeId))
}
                                                

// @LINE:29
def update(forumId:Long, themeId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/update/" + implicitly[PathBindable[Long]].unbind("themeId", themeId))
}
                                                

// @LINE:22
def index(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes")
}
                                                

// @LINE:28
def delete(forumId:Long, themeId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/delete/" + implicitly[PathBindable[Long]].unbind("themeId", themeId))
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseForums {
    

// @LINE:18
def delete(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/delete/" + implicitly[PathBindable[Long]].unbind("forumId", forumId))
}
                                                

// @LINE:16
def update(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/update/" + implicitly[PathBindable[Long]].unbind("forumId", forumId))
}
                                                

// @LINE:17
def updateValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/update/" + implicitly[PathBindable[Long]].unbind("forumId", forumId))
}
                                                

// @LINE:19
def deleteValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/delete/" + implicitly[PathBindable[Long]].unbind("forumId", forumId))
}
                                                

// @LINE:15
def insertValidate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/insert")
}
                                                

// @LINE:14
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums")
}
                                                
    
}
                          

// @LINE:23
class ReverseMessages {
    

// @LINE:23
def index(forumId:Long, themeId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/" + implicitly[PathBindable[Long]].unbind("themeId", themeId))
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
                  


// @LINE:38
// @LINE:35
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
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

// @LINE:38
class ReverseAssets {
    

// @LINE:38
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
              

// @LINE:35
class ReversePermissions {
    

// @LINE:35
def crud : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Permissions.crud",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/permissions/crud"})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:22
class ReverseThemes {
    

// @LINE:27
def insertValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.insertValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/insert"})
      }
   """
)
                        

// @LINE:26
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.insert",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/insert"})
      }
   """
)
                        

// @LINE:30
def updateValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.updateValidate",
   """
      function(forumId,themeId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId)})
      }
   """
)
                        

// @LINE:29
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.update",
   """
      function(forumId,themeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId)})
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
                        

// @LINE:28
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.delete",
   """
      function(forumId,themeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId)})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseForums {
    

// @LINE:18
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.delete",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId)})
      }
   """
)
                        

// @LINE:16
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.update",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId)})
      }
   """
)
                        

// @LINE:17
def updateValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.updateValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId)})
      }
   """
)
                        

// @LINE:19
def deleteValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.deleteValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId)})
      }
   """
)
                        

// @LINE:15
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
              

// @LINE:23
class ReverseMessages {
    

// @LINE:23
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Messages.index",
   """
      function(forumId,themeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("themeId", themeId)})
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
        


// @LINE:38
// @LINE:35
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
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


// @LINE:38
class ReverseAssets {
    

// @LINE:38
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
                          

// @LINE:35
class ReversePermissions {
    

// @LINE:35
def crud(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Permissions.crud(), HandlerDef(this, "controllers.Permissions", "crud", Seq(), "GET", """""", _prefix + """forums_orm/permissions/crud""")
)
                      
    
}
                          

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:22
class ReverseThemes {
    

// @LINE:27
def insertValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.insertValidate(forumId), HandlerDef(this, "controllers.Themes", "insertValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert""")
)
                      

// @LINE:26
def insert(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.insert(forumId), HandlerDef(this, "controllers.Themes", "insert", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert""")
)
                      

// @LINE:30
def updateValidate(forumId:Long, themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.updateValidate(forumId, themeId), HandlerDef(this, "controllers.Themes", "updateValidate", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/update/$themeId<[^/]+>""")
)
                      

// @LINE:29
def update(forumId:Long, themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.update(forumId, themeId), HandlerDef(this, "controllers.Themes", "update", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/update/$themeId<[^/]+>""")
)
                      

// @LINE:22
def index(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.index(forumId), HandlerDef(this, "controllers.Themes", "index", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes""")
)
                      

// @LINE:28
def delete(forumId:Long, themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.delete(forumId, themeId), HandlerDef(this, "controllers.Themes", "delete", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/delete/$themeId<[^/]+>""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseForums {
    

// @LINE:18
def delete(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.delete(forumId), HandlerDef(this, "controllers.Forums", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/delete/$forumId<[^/]+>""")
)
                      

// @LINE:16
def update(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.update(forumId), HandlerDef(this, "controllers.Forums", "update", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/update/$forumId<[^/]+>""")
)
                      

// @LINE:17
def updateValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.updateValidate(forumId), HandlerDef(this, "controllers.Forums", "updateValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/update/$forumId<[^/]+>""")
)
                      

// @LINE:19
def deleteValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.deleteValidate(forumId), HandlerDef(this, "controllers.Forums", "deleteValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/delete/$forumId<[^/]+>""")
)
                      

// @LINE:15
def insertValidate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.insertValidate(), HandlerDef(this, "controllers.Forums", "insertValidate", Seq(), "POST", """""", _prefix + """forums_orm/forums/insert""")
)
                      

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.index(), HandlerDef(this, "controllers.Forums", "index", Seq(), "GET", """""", _prefix + """forums_orm/forums""")
)
                      
    
}
                          

// @LINE:23
class ReverseMessages {
    

// @LINE:23
def index(forumId:Long, themeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Messages.index(forumId, themeId), HandlerDef(this, "controllers.Messages", "index", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/$themeId<[^/]+>""")
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
        
    