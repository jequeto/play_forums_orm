
package views.html

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
object notFoundPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(text: String = ""):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""



"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
<span>&gt;errorPage</span>
""")))}/*7.2*/ {_display_(Seq[Any](format.raw/*7.4*/("""
	<h2>No found Page: """),_display_(Seq[Any](/*8.22*/text)),format.raw/*8.26*/("""</h2>
	
	<p>Please, use the menu's optinos</p>
""")))})))}
    }
    
    def render(text:String): play.api.templates.HtmlFormat.Appendable = apply(text)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (text) => apply(text)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 21 20:56:04 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/notFoundPage.scala.html
                    HASH: 646ed456eb57d83c93e00f674eec26499bb2c260
                    MATRIX: 781->1|894->20|937->29|948->33|986->35|1034->66|1072->68|1130->91|1155->95
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|36->8|36->8
                    -- GENERATED --
                */
            