
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
	     	<form method="POST" action=""""),_display_(Seq[Any](/*30.37*/routes/*30.43*/.Themes.insertValidate(forum.id))),format.raw/*30.75*/("""">
	     		<input type="hidden" id="forum_id" name="forum_id" value=""""),_display_(Seq[Any](/*31.68*/forum/*31.73*/.id)),format.raw/*31.76*/(""""/>
                <input type="hidden" id="forum_name" name="forum_name" value=""""),_display_(Seq[Any](/*32.80*/forum/*32.85*/.name)),format.raw/*32.90*/(""""/>
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
                    DATE: Tue May 20 17:45:04 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Themes/index.scala.html
                    HASH: af254cf605e3644d3615a1cf18ae988908cfa777
                    MATRIX: 792->1|921->36|960->41|971->45|1009->47|1050->54|1063->59|1089->64|1109->67|1147->69|1197->84|1210->89|1236->94|1450->273|1485->299|1525->301|1647->406|1659->411|1698->412|1738->417|1780->443|1820->445|1878->467|1892->472|1919->477|1976->498|1990->503|2022->513|2074->529|2088->534|2123->547|2189->582|2224->586|2360->686|2375->692|2429->724|2536->795|2550->800|2575->803|2695->887|2709->892|2736->897
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|34->6|34->6|34->6|39->11|39->11|39->11|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|53->25|54->26|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32
                    -- GENERATED --
                */
            