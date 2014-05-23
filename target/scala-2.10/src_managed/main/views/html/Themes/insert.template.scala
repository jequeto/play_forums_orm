
package views.html.Themes

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
object insert extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[forms.ThemeInsert],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[forms.ThemeInsert]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
&nbsp;-&gt;&nbsp;<a href=""""),_display_(Seq[Any](/*4.28*/routes/*4.34*/.Themes.index(Long.valueOf(form.field("forum_id").value())))),format.raw/*4.93*/("""">
					Forum: """),_display_(Seq[Any](/*5.14*/form/*5.18*/.field("forum_name").value())),format.raw/*5.46*/("""
				</a>&nbsp;-&gt;&nbsp;inserting a theme
""")))}/*7.2*/ {_display_(Seq[Any](format.raw/*7.4*/("""
	<h2>Forum: """),_display_(Seq[Any](/*8.14*/form/*8.18*/.field("forum_name").value())),format.raw/*8.46*/("""</h2>
	<h3>Inserting a new theme</h3>
	"""),_display_(Seq[Any](/*10.3*/helper/*10.9*/.form(
			action=routes.Themes.insertValidate(Long.valueOf(form.field("forum_id").value()))
			, 'class -> "form horizonal"
		)/*13.4*/ {_display_(Seq[Any](format.raw/*13.6*/("""
			
		<input type="hidden" id="id" name="id" value=""""),_display_(Seq[Any](/*15.50*/form/*15.54*/.field("id").value())),format.raw/*15.74*/(""""/>
		<input type="hidden" id="forum_id" name="forum_id" value=""""),_display_(Seq[Any](/*16.62*/form/*16.66*/.field("forum_id").value())),format.raw/*16.92*/(""""/>
		<input type="hidden" id="forum_name" name="forum_name" value=""""),_display_(Seq[Any](/*17.66*/form/*17.70*/.field("forum_name").value())),format.raw/*17.98*/(""""/>
		"""),_display_(Seq[Any](/*18.4*/helper/*18.10*/.inputText(form("name")
				,'size -> "50"
        		, '_label -> "New Theme Name:"
        		, 'placeholder ->"Write a theme"
        		, '_showConstraints -> true
        ))),format.raw/*23.10*/("""
		
		<input type="submit" value="Insert" class="btn btn-success"/>
        <a href=""""),_display_(Seq[Any](/*26.19*/routes/*26.25*/.Themes.index(Long.valueOf(form.field("forum_id").value())))),format.raw/*26.84*/("""" class="btn btn-primary">Cancel</a>
	""")))})),format.raw/*27.3*/("""
""")))})))}
    }
    
    def render(form:Form[forms.ThemeInsert]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[forms.ThemeInsert]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 22 23:38:24 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Themes/insert.scala.html
                    HASH: e8aa996d619478d112c6a220c64d6177b002949a
                    MATRIX: 799->1|924->32|963->37|974->41|1012->43|1076->72|1090->78|1170->137|1222->154|1234->158|1283->186|1347->233|1385->235|1435->250|1447->254|1496->282|1573->324|1587->330|1725->460|1764->462|1856->518|1869->522|1911->542|2013->608|2026->612|2074->638|2180->708|2193->712|2243->740|2286->748|2301->754|2502->933|2627->1022|2642->1028|2723->1087|2794->1127
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|36->8|36->8|36->8|38->10|38->10|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|51->23|54->26|54->26|54->26|55->27
                    -- GENERATED --
                */
            