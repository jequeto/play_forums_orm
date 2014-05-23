
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[forms.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[forms.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
&gt;login
""")))}/*5.2*/ {_display_(Seq[Any](format.raw/*5.4*/("""
    <h2>Sing In Form</h2>
	"""),_display_(Seq[Any](/*7.3*/helper/*7.9*/.form(routes.Users.authenticate(), 'role -> "form"	)/*7.61*/ {_display_(Seq[Any](format.raw/*7.63*/("""
		<p>
			<label for="email">Email: </label>
			<input type="email" id="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*10.76*/form("email")/*10.89*/.value)),format.raw/*10.95*/("""">
		</p>
		<p>
			<label for="password">Password: </label>
			<input type="password" id="password" name="password" placeholder="Password">
		</p>
		<span class="text-danger">"""),_display_(Seq[Any](/*16.30*/if(form.hasErrors())/*16.50*/{_display_(Seq[Any](_display_(Seq[Any](/*16.52*/form/*16.56*/.globalError().message()))))})),format.raw/*16.81*/("""</span>
		<p>
			<button class="btn btn-success" type="submit">Login</button>
		</p>
	""")))})),format.raw/*20.3*/("""
""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(form:Form[forms.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[forms.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 22 17:49:14 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Users/login.scala.html
                    HASH: 098ead16038440b5b62bc7c640df5c938561d0e9
                    MATRIX: 791->1|910->26|949->31|960->35|998->37|1029->51|1067->53|1132->84|1145->90|1205->142|1244->144|1403->267|1425->280|1453->286|1671->468|1700->488|1748->490|1761->494|1812->519|1934->610|1968->613
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|48->20|49->21
                    -- GENERATED --
                */
            