
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
                    DATE: Wed May 14 20:55:20 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Forums/index.scala.html
                    HASH: 69a79b92853557bb2ebee42a40f6b1933b42a0f7
                    MATRIX: 793->1|931->29|959->48|995->50|1006->54|1044->56|1063->58|1101->60|1437->361|1466->381|1506->383|1616->476|1628->481|1667->482|1711->491|1726->497|1755->504|1815->529|1847->545|1887->547|1950->574|1965->580|2006->599|2045->602|2055->603|2082->608|2137->627|2147->628|2181->640|2232->655|2242->656|2281->673|2332->688|2342->689|2377->702|2428->717|2438->718|2474->732|2564->786|2579->792|2621->812|2711->866|2726->872|2768->892|2834->927|2878->940|3031->1057|3046->1063|3092->1087
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|47->19|47->19|47->19|53->25|53->25|53->25|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37|66->38|66->38|66->38|69->41|71->43|75->47|75->47|75->47
                    -- GENERATED --
                */
            