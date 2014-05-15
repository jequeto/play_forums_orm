
package views.html.Messages

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Forum,Theme,List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forum: Forum, theme: Theme, messages: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
&gt;<a href=""""),_display_(Seq[Any](/*4.15*/routes/*4.21*/.Themes.index(forum.id))),format.raw/*4.44*/("""">"""),_display_(Seq[Any](/*4.47*/forum/*4.52*/.name)),format.raw/*4.57*/("""</a>&gt;"""),_display_(Seq[Any](/*4.66*/theme/*4.71*/.name)),format.raw/*4.76*/("""
""")))}/*5.2*/ {_display_(Seq[Any](format.raw/*5.4*/("""
	<h1>Forum: <b><a href=""""),_display_(Seq[Any](/*6.26*/routes/*6.32*/.Themes.index(forum.id))),format.raw/*6.55*/("""">"""),_display_(Seq[Any](/*6.58*/forum/*6.63*/.name)),format.raw/*6.68*/("""</a></b></h1>
	<h2>Theme: <b>"""),_display_(Seq[Any](/*7.17*/theme/*7.22*/.name)),format.raw/*7.27*/("""</b></h2>
	<h3>Messages</h3>
	
	"""),_display_(Seq[Any](/*10.3*/if(messages.isEmpty())/*10.25*/ {_display_(Seq[Any](format.raw/*10.27*/("""
	  <h1>Nothing to display</h1>
	""")))}/*12.4*/else/*12.9*/{_display_(Seq[Any](format.raw/*12.10*/("""
	  <h1>"""),_display_(Seq[Any](/*13.9*/messages/*13.17*/.size())),format.raw/*13.24*/(""" items!</h1>
	  <table border="1">
	  	<tr><th>Text</th><th>Creator</th><th>Creation Date</th>
	  	</tr>
	  	
		"""),_display_(Seq[Any](/*18.4*/for(message <- messages) yield /*18.28*/ {_display_(Seq[Any](format.raw/*18.30*/("""
			<tr>
			  	<td>"""),_display_(Seq[Any](/*20.12*/message/*20.19*/.text)),format.raw/*20.24*/("""</a>"</td>
				<td>"""),_display_(Seq[Any](/*21.10*/message/*21.17*/.user.name)),format.raw/*21.27*/("""</td>
				<td>"""),_display_(Seq[Any](/*22.10*/message/*22.17*/.creationDate)),format.raw/*22.30*/("""</td>
			</tr>
		""")))})),format.raw/*24.4*/("""
		</table>
	""")))})),format.raw/*26.3*/("""
""")))})))}
    }
    
    def render(forum:Forum,theme:Theme,messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(forum,theme,messages)
    
    def f:((Forum,Theme,List[Message]) => play.api.templates.HtmlFormat.Appendable) = (forum,theme,messages) => apply(forum,theme,messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 13 18:55:35 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Messages/index.scala.html
                    HASH: 62ee34d906ca4d5e880bb7357c8054de490ddb7c
                    MATRIX: 802->1|949->54|986->57|997->61|1035->63|1085->78|1099->84|1143->107|1181->110|1194->115|1220->120|1264->129|1277->134|1303->139|1322->141|1360->143|1421->169|1435->175|1479->198|1517->201|1530->206|1556->211|1621->241|1634->246|1660->251|1728->284|1759->306|1799->308|1851->343|1863->348|1902->349|1946->358|1963->366|1992->373|2140->486|2180->510|2220->512|2276->532|2292->539|2319->544|2375->564|2391->571|2423->581|2474->596|2490->603|2525->616|2574->634|2619->648
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|52->24|54->26
                    -- GENERATED --
                */
            