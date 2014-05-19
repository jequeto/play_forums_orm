
package views.html.Users

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
object unAuthorized extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
&gt;unauthorizated
""")))}/*3.2*/ {_display_(Seq[Any](format.raw/*3.4*/("""
    <h2>You don't have enougt permissions.</h2>
""")))})),format.raw/*5.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 13 18:55:35 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Users/unAuthorized.scala.html
                    HASH: 0cfa754284ebf29e7433194dc485665f6340a0e1
                    MATRIX: 877->1|888->5|926->7|966->30|1004->32|1086->84
                    LINES: 29->1|29->1|29->1|31->3|31->3|33->5
                    -- GENERATED --
                */
            