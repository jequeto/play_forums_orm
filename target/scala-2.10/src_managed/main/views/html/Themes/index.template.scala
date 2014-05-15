
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Forum,List[Theme],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forum: Forum, themes: List[Theme]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
&gt;"""),_display_(Seq[Any](/*4.6*/forum/*4.11*/.name)),format.raw/*4.16*/("""
""")))}/*5.2*/ {_display_(Seq[Any](format.raw/*5.4*/("""
	<h2>Forum: """),_display_(Seq[Any](/*6.14*/forum/*6.19*/.name)),format.raw/*6.24*/("""</h2>
	<h3>Themes:</h3>
	<table class="table table-striped table-hover table-bordered">
  		<tr><th>Name</th><th>Creator</th><th>Creation Date</th><th>Action</th>
  	</tr>
	"""),_display_(Seq[Any](/*11.3*/if(forum.themes.isEmpty())/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""
		<tr>
        <td colspan="4">
        	<p>Nothing to display</p>
        </td>
        </tr>
	""")))}/*17.4*/else/*17.9*/{_display_(Seq[Any](format.raw/*17.10*/("""
		"""),_display_(Seq[Any](/*18.4*/for(theme <- forum.themes) yield /*18.30*/ {_display_(Seq[Any](format.raw/*18.32*/("""
			<tr>
			  	<td>"""),_display_(Seq[Any](/*20.12*/theme/*20.17*/.name)),format.raw/*20.22*/("""</a>"</td>
				<td>"""),_display_(Seq[Any](/*21.10*/theme/*21.15*/.user.name)),format.raw/*21.25*/("""</td>
				<td>"""),_display_(Seq[Any](/*22.10*/theme/*22.15*/.creationDate)),format.raw/*22.28*/("""</td>
				<td></td>
			</tr>
		""")))})),format.raw/*25.4*/("""
	""")))})),format.raw/*26.3*/("""
		<tr>
		<td colspan="5">
	     	<p>Insert a new theme</p>
	     	<form method="POST" action=""""),_display_(Seq[Any](/*30.37*/routes/*30.43*/.Themes.insertValidate())),format.raw/*30.67*/("""">
	     		<input type="hidden" name="forum_id" value=""""),_display_(Seq[Any](/*31.54*/forum/*31.59*/.id)),format.raw/*31.62*/(""""/>
                <input type="hidden" name="forum_name" value=""""),_display_(Seq[Any](/*32.64*/forum/*32.69*/.name)),format.raw/*32.74*/(""""/>
	            <label for="name">New Theme Name: </label>
	            <input type="text" id="name" name="name">
	            <label for="description">Description: </label>
	            <input type="text" id="description" name="description">
	            <input type="submit" name="enviar" value="Insert">
	            
	        </form>
	    </td>
    	</tr>
	</table>
""")))})))}
    }
    
    def render(forum:Forum,themes:List[Theme]): play.api.templates.HtmlFormat.Appendable = apply(forum,themes)
    
    def f:((Forum,List[Theme]) => play.api.templates.HtmlFormat.Appendable) = (forum,themes) => apply(forum,themes)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 15 12:50:28 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Themes/index.scala.html
                    HASH: 45a8e41af417b04b8c96473a8b501501cd9c416d
                    MATRIX: 792->1|921->36|958->39|969->43|1007->45|1047->51|1060->56|1086->61|1105->63|1143->65|1192->79|1205->84|1231->89|1440->263|1475->289|1515->291|1631->390|1643->395|1682->396|1721->400|1763->426|1803->428|1859->448|1873->453|1900->458|1956->478|1970->483|2002->493|2053->508|2067->513|2102->526|2165->558|2199->561|2331->657|2346->663|2392->687|2484->743|2498->748|2523->751|2626->818|2640->823|2667->828
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|53->25|54->26|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32
                    -- GENERATED --
                */
            