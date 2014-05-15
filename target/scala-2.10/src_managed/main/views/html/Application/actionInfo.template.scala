
package views.html.Application

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object actionInfo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(application: String)(controller: String)(method: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
<h1>actionInfo</h1>
<p>Application: """),_display_(Seq[Any](/*3.18*/application)),format.raw/*3.29*/("""</p>
<p>Controller: """),_display_(Seq[Any](/*4.17*/controller)),format.raw/*4.27*/("""</p>
<p>Method: """),_display_(Seq[Any](/*5.13*/method)),format.raw/*5.19*/("""</p>
"""))}
    }
    
    def render(application:String,controller:String,method:String): play.api.templates.HtmlFormat.Appendable = apply(application)(controller)(method)
    
    def f:((String) => (String) => (String) => play.api.templates.HtmlFormat.Appendable) = (application) => (controller) => (method) => apply(application)(controller)(method)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 13 18:55:35 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Application/actionInfo.scala.html
                    HASH: 0e278f3eedf314144d0efab2659dbf6c19b962a6
                    MATRIX: 805->1|956->58|1031->98|1063->109|1120->131|1151->141|1204->159|1231->165
                    LINES: 26->1|29->1|31->3|31->3|32->4|32->4|33->5|33->5
                    -- GENERATED --
                */
            