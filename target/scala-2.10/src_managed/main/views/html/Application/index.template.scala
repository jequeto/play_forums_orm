
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
""")))}/*4.2*/ {_display_(Seq[Any](format.raw/*4.4*/("""
    """),_display_(Seq[Any](/*5.6*/play20/*5.12*/.welcome(message, style = "Java"))),format.raw/*5.45*/("""
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 13 18:55:35 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Application/index.scala.html
                    HASH: ce64061613f75440f16ba5c9bf9b11af7c732d0d
                    MATRIX: 786->1|897->18|934->21|945->25|983->27|1002->29|1040->31|1080->37|1094->43|1148->76|1180->78
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|34->6
                    -- GENERATED --
                */
            