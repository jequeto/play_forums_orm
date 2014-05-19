// @SOURCE:G:/eclipse_workspace/play_forums_orm/conf/routes
// @HASH:9fde14f411d9a1c542d65fb5f1069a1bed49c115
// @DATE:Tue May 20 00:35:41 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:35
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseUsers {
    

// @LINE:14
def unAuthorized(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/unauthorized")
}
                                                

// @LINE:13
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/logout")
}
                                                

// @LINE:12
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/login")
}
                                                

// @LINE:11
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/login")
}
                                                
    
}
                          

// @LINE:30
// @LINE:29
// @LINE:25
class ReverseThemes {
    

// @LINE:30
def insertValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/insert")
}
                                                

// @LINE:29
def insert(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes/insert")
}
                                                

// @LINE:25
def index(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/" + implicitly[PathBindable[Long]].unbind("forumId", forumId) + "/themes")
}
                                                
    
}
                          

// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:9
class ReverseForums {
    

// @LINE:22
def delete(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/delete/" + implicitly[PathBindable[Long]].unbind("forumId", forumId))
}
                                                

// @LINE:19
def update(forumId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm/forums/update/" + implicitly[PathBindable[Long]].unbind("forumId", forumId))
}
                                                

// @LINE:20
def updateValidate(forumId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/update/" + implicitly[PathBindable[Long]].unbind("forumId", forumId))
}
                                                

// @LINE:17
def insertValidate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forums_orm/forums/insert")
}
                                                

// @LINE:9
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forums_orm")
}
                                                
    
}
                          

// @LINE:26
class ReverseMessages {
    

// @LINE:26
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
                  


// @LINE:35
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseUsers {
    

// @LINE:14
def unAuthorized : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.unAuthorized",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/unauthorized"})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/logout"})
      }
   """
)
                        

// @LINE:12
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/login"})
      }
   """
)
                        

// @LINE:11
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/login"})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:29
// @LINE:25
class ReverseThemes {
    

// @LINE:30
def insertValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.insertValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/insert"})
      }
   """
)
                        

// @LINE:29
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.insert",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes/insert"})
      }
   """
)
                        

// @LINE:25
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Themes.index",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId) + "/themes"})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:9
class ReverseForums {
    

// @LINE:22
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.delete",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId)})
      }
   """
)
                        

// @LINE:19
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.update",
   """
      function(forumId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId)})
      }
   """
)
                        

// @LINE:20
def updateValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.updateValidate",
   """
      function(forumId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("forumId", forumId)})
      }
   """
)
                        

// @LINE:17
def insertValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.insertValidate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm/forums/insert"})
      }
   """
)
                        

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forums.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums_orm"})
      }
   """
)
                        
    
}
              

// @LINE:26
class ReverseMessages {
    

// @LINE:26
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
        


// @LINE:35
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseUsers {
    

// @LINE:14
def unAuthorized(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.unAuthorized(), HandlerDef(this, "controllers.Users", "unAuthorized", Seq(), "GET", """""", _prefix + """forums_orm/unauthorized""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Seq(), "GET", """""", _prefix + """forums_orm/logout""")
)
                      

// @LINE:12
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.authenticate(), HandlerDef(this, "controllers.Users", "authenticate", Seq(), "POST", """""", _prefix + """forums_orm/login""")
)
                      

// @LINE:11
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.login(), HandlerDef(this, "controllers.Users", "login", Seq(), "GET", """""", _prefix + """forums_orm/login""")
)
                      
    
}
                          

// @LINE:30
// @LINE:29
// @LINE:25
class ReverseThemes {
    

// @LINE:30
def insertValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.insertValidate(forumId), HandlerDef(this, "controllers.Themes", "insertValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert""")
)
                      

// @LINE:29
def insert(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.insert(forumId), HandlerDef(this, "controllers.Themes", "insert", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes/insert""")
)
                      

// @LINE:25
def index(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Themes.index(forumId), HandlerDef(this, "controllers.Themes", "index", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/$forumId<[^/]+>/themes""")
)
                      
    
}
                          

// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:9
class ReverseForums {
    

// @LINE:22
def delete(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.delete(forumId), HandlerDef(this, "controllers.Forums", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/delete/$forumId<[^/]+>""")
)
                      

// @LINE:19
def update(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.update(forumId), HandlerDef(this, "controllers.Forums", "update", Seq(classOf[Long]), "GET", """""", _prefix + """forums_orm/forums/update/$forumId<[^/]+>""")
)
                      

// @LINE:20
def updateValidate(forumId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.updateValidate(forumId), HandlerDef(this, "controllers.Forums", "updateValidate", Seq(classOf[Long]), "POST", """""", _prefix + """forums_orm/forums/update/$forumId<[^/]+>""")
)
                      

// @LINE:17
def insertValidate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.insertValidate(), HandlerDef(this, "controllers.Forums", "insertValidate", Seq(), "POST", """""", _prefix + """forums_orm/forums/insert""")
)
                      

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forums.index(), HandlerDef(this, "controllers.Forums", "index", Seq(), "GET", """""", _prefix + """forums_orm""")
)
                      
    
}
                          

// @LINE:26
class ReverseMessages {
    

// @LINE:26
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
        
    