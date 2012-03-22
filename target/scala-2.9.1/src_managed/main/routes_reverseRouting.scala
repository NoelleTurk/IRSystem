// @SOURCE:/Users/cassandrajens/Projects/play-2.0/samples/java/computer-database/conf/routes
// @HASH:b13d6ab737e48f5834f10942f3f51c08698cedac
// @DATE:Wed Mar 21 16:40:54 CDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:20
def delete(id:Long) = {
   Call("POST", "/computers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:12
def create() = {
   Call("GET", "/computers/new")
}
                                                        
 
// @LINE:9
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "") = {
   Call("GET", "/computers" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:17
def update(id:Long) = {
   Call("POST", "/computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:13
def save() = {
   Call("POST", "/computers")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:16
def edit(id:Long) = {
   Call("GET", "/computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:23
class ReverseAssets {
    


 
// @LINE:23
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:20
def delete = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"/computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:12
def create = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"/computers/new"})
      }
   """
)
                                                        
 
// @LINE:9
def list = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"/computers" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[String]].to("name") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                                                        
 
// @LINE:17
def update = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:13
def save = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"/computers"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:16
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:23
class ReverseAssets {
    


 
// @LINE:23
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:20
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:12
def create() = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq())
)
                              
 
// @LINE:9
def list(p:Int, s:String, o:String, f:String) = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:17
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def save() = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:16
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:23
class ReverseAssets {
    


 
// @LINE:23
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                