
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.Forum],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forums: List[models.Forum]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
""")))}/*6.2*/ {_display_(Seq[Any](format.raw/*6.4*/("""

	<h2>Forum's List</h2>
	<table class="table table-striped table-hover table-bordered">
	  	<tr>
            <th>Name</th>
            <th>Description</th>
            <th>Creator</th>
            <th>Creation Date</th>
            <th>Themes count</th>
            <th>Actions</th>
	  	</tr>
	  	
	"""),_display_(Seq[Any](/*19.3*/if(forums.isEmpty())/*19.23*/ {_display_(Seq[Any](format.raw/*19.25*/("""
		<tr>
            <td colspan="6">
	  			<p>Nothing to display</p>
	  		</td>
	  	</tr>
	""")))}/*25.4*/else/*25.9*/{_display_(Seq[Any](format.raw/*25.10*/("""
	  <h3>"""),_display_(Seq[Any](/*26.9*/forums/*26.15*/.size())),format.raw/*26.22*/(""" forums!</h3>
	 
	  	
		"""),_display_(Seq[Any](/*29.4*/for(f <- forums) yield /*29.20*/ {_display_(Seq[Any](format.raw/*29.22*/("""
			<tr>
				<td><a href=""""),_display_(Seq[Any](/*31.19*/routes/*31.25*/.Themes.index(f.id))),format.raw/*31.44*/("""">"""),_display_(Seq[Any](/*31.47*/f/*31.48*/.name)),format.raw/*31.53*/("""</a></td>
				<td>"""),_display_(Seq[Any](/*32.10*/f/*32.11*/.description)),format.raw/*32.23*/("""</td>
				<td>"""),_display_(Seq[Any](/*33.10*/f/*33.11*/.creatorUser.name)),format.raw/*33.28*/("""</td>
				<td>"""),_display_(Seq[Any](/*34.10*/f/*34.11*/.creationDate)),format.raw/*34.24*/("""</td>
				<td>"""),_display_(Seq[Any](/*35.10*/f/*35.11*/.themes.size())),format.raw/*35.25*/("""</td>
				<td>
					<a class="btn btn-warning" href=""""),_display_(Seq[Any](/*37.40*/routes/*37.46*/.Forums.update(f.id))),format.raw/*37.66*/("""">Modificar</a>
					<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*38.39*/routes/*38.45*/.Forums.delete(f.id))),format.raw/*38.65*/("""">Borrar</a>
				</td>
			</tr>
		""")))})),format.raw/*41.4*/(""" 
        
	""")))})),format.raw/*43.3*/("""
		<tr>
        	<td colspan="6">
             	<p>Insert a new forum</p>
             	<form method="POST" action=""""),_display_(Seq[Any](/*47.44*/routes/*47.50*/.Forums.insertValidate())),format.raw/*47.74*/("""">
                    <label for="name">New Forum Name: </label>
                    <input type="text" id="name" name="name">
                    <label for="name">Description: </label>
                    <input type="text" id="description" name="description">
                    <input type="submit" class="btn btn-success" name="enviar" value="Insertar">
                    
                </form>
            </td>
    	</tr>
	</table>	
""")))})))}
    }
    
    def render(forums:List[models.Forum]): play.api.templates.HtmlFormat.Appendable = apply(forums)
    
    def f:((List[models.Forum]) => play.api.templates.HtmlFormat.Appendable) = (forums) => apply(forums)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 20 10:32:40 CEST 2014
                    SOURCE: E:/eclipse_workspace/play_forums_orm/app/views/Forums/index.scala.html
                    HASH: 18581b8cdfddd78cca6504bdecbc236d987ace83
                    MATRIX: 793->1|932->29|962->51|999->54|1010->58|1048->60|1068->63|1106->65|1455->379|1484->399|1524->401|1640->500|1652->505|1691->506|1736->516|1751->522|1780->529|1843->557|1875->573|1915->575|1980->604|1995->610|2036->629|2075->632|2085->633|2112->638|2168->658|2178->659|2212->671|2264->687|2274->688|2313->705|2365->721|2375->722|2410->735|2462->751|2472->752|2508->766|2600->822|2615->828|2657->848|2748->903|2763->909|2805->929|2874->967|2920->982|3077->1103|3092->1109|3138->1133
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|47->19|47->19|47->19|53->25|53->25|53->25|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37|66->38|66->38|66->38|69->41|71->43|75->47|75->47|75->47
                    -- GENERATED --
                */
            