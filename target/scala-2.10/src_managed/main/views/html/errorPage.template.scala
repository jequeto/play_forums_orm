
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
object errorPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Throwable,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(t: Throwable):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""



"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
&gt;errorPage
""")))}/*7.2*/ {_display_(Seq[Any](format.raw/*7.4*/("""
	<h2>Error page</h2>
	<p>"""),_display_(Seq[Any](/*9.6*/t/*9.7*/.getMessage())),format.raw/*9.20*/("""</p>
	<div>
		"""),_display_(Seq[Any](/*11.4*/t/*11.5*/.printStackTrace())),format.raw/*11.23*/("""
	</div>
""")))})))}
    }
    
    def render(t:Throwable): play.api.templates.HtmlFormat.Appendable = apply(t)
    
    def f:((Throwable) => play.api.templates.HtmlFormat.Appendable) = (t) => apply(t)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 20 10:32:40 CEST 2014
                    SOURCE: E:/eclipse_workspace/play_forums_orm/app/views/errorPage.scala.html
                    HASH: 7494ebe56964bd9a449598f9afafedfb858b268b
                    MATRIX: 781->1|889->15|932->24|943->28|981->30|1016->48|1054->50|1117->79|1125->80|1159->93|1211->110|1220->111|1260->129
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11
                    -- GENERATED --
                */
            