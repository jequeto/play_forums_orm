
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
object insert extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[forms.Theme],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[forms.Theme]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""



"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
&gt;<a href=""""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.Themes.index(Long.valueOf(form.field("forum_id").value())))),format.raw/*6.80*/("""">"""),_display_(Seq[Any](/*6.83*/form/*6.87*/.field("forum_name").value())),format.raw/*6.115*/("""</a>
""")))}/*7.2*/ {_display_(Seq[Any](format.raw/*7.4*/("""
	"""),_display_(Seq[Any](/*8.3*/helper/*8.9*/.form(action=routes.Themes.insertValidate(), 'class -> "form")/*8.71*/ {_display_(Seq[Any](format.raw/*8.73*/("""
        """),_display_(Seq[Any](/*9.10*/helper/*9.16*/.input(form("id"))/*9.34*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*9.63*/("""
            <input type="hidden" name=""""),_display_(Seq[Any](/*10.41*/name)),format.raw/*10.45*/("""" id=""""),_display_(Seq[Any](/*10.52*/id)),format.raw/*10.54*/("""" """),_display_(Seq[Any](/*10.57*/toHtmlArgs(args))),format.raw/*10.73*/(""">
        """)))})),format.raw/*11.10*/("""
		"""),_display_(Seq[Any](/*12.4*/helper/*12.10*/.input(form("forum_id"))/*12.34*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*12.63*/("""
            <input type="hidden" name=""""),_display_(Seq[Any](/*13.41*/name)),format.raw/*13.45*/("""" id=""""),_display_(Seq[Any](/*13.52*/id)),format.raw/*13.54*/("""" """),_display_(Seq[Any](/*13.57*/toHtmlArgs(args))),format.raw/*13.73*/(""">
        """)))})),format.raw/*14.10*/("""
		"""),_display_(Seq[Any](/*15.4*/helper/*15.10*/.inputText(form("name")))),format.raw/*15.34*/("""
        <input type="submit" value="Submit"/>
	""")))})),format.raw/*17.3*/("""
""")))})))}
    }
    
    def render(form:Form[forms.Theme]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[forms.Theme]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 13 23:20:56 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Themes/insert.scala.html
                    HASH: cb177320f75c035fa9ff3b50e900dd1063b5d7bc
                    MATRIX: 793->1|912->26|955->35|966->39|1004->41|1055->57|1069->63|1149->122|1187->125|1199->129|1249->157|1273->164|1311->166|1349->170|1362->176|1432->238|1471->240|1517->251|1531->257|1557->275|1623->304|1701->346|1727->350|1770->357|1794->359|1833->362|1871->378|1915->390|1955->395|1970->401|2003->425|2070->454|2148->496|2174->500|2217->507|2241->509|2280->512|2318->528|2362->540|2402->545|2417->551|2463->575|2545->626
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|35->7|35->7|36->8|36->8|36->8|36->8|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|38->10|38->10|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|42->14|43->15|43->15|43->15|45->17
                    -- GENERATED --
                */
            