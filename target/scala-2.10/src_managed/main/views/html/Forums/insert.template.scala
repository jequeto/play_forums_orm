
package views.html.Forums

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
object insert extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[forms.ForumInsert],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forumForm: Form[forms.ForumInsert]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
&gt;forum's insert
""")))}/*7.2*/ {_display_(Seq[Any](format.raw/*7.4*/("""
	<h2>Insert a forum:</h2>
	"""),_display_(Seq[Any](/*9.3*/form(action=routes.Forums.insertValidate())/*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
		"""),_display_(Seq[Any](/*10.4*/helper/*10.10*/.inputText(forumForm("name")))),format.raw/*10.39*/("""
		"""),_display_(Seq[Any](/*11.4*/helper/*11.10*/.inputText(forumForm("description")))),format.raw/*11.46*/("""
		<input class="btn btn-success" type="submit" value="Insert" />
		<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*13.36*/routes/*13.42*/.Forums.index())),format.raw/*13.57*/("""">Cancelar</a>
	""")))})),format.raw/*14.3*/("""
""")))})))}
    }
    
    def render(forumForm:Form[forms.ForumInsert]): play.api.templates.HtmlFormat.Appendable = apply(forumForm)
    
    def f:((Form[forms.ForumInsert]) => play.api.templates.HtmlFormat.Appendable) = (forumForm) => apply(forumForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 14 21:33:17 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Forums/insert.scala.html
                    HASH: 220e61a132e4a5b41fb62e8d8006a1fa29daaf39
                    MATRIX: 799->1|946->37|976->59|1013->62|1024->66|1062->68|1102->91|1140->93|1205->124|1256->167|1295->169|1335->174|1350->180|1401->209|1441->214|1456->220|1514->256|1653->359|1668->365|1705->380|1754->398
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14
                    -- GENERATED --
                */
            