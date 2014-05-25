
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Forum,List[Theme],Form[_root_.forms.ThemeInsert],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forum: Forum, themes: List[Theme], formInsert: Form[_root_.forms.ThemeInsert]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.81*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
&nbsp;-&gt;&nbsp;forum: 
<a href=""""),_display_(Seq[Any](/*5.11*/routes/*5.17*/.Themes.index(forum.id))),format.raw/*5.40*/("""">
	"""),_display_(Seq[Any](/*6.3*/forum/*6.8*/.name)),format.raw/*6.13*/("""
</a>
&nbsp;-&gt;&nbsp;themes
""")))}/*9.2*/ {_display_(Seq[Any](format.raw/*9.4*/("""
	<h2>Forum: """),_display_(Seq[Any](/*10.14*/forum/*10.19*/.name)),format.raw/*10.24*/("""</h2>
	<h3>Themes:</h3>
	<table class="table table-striped table-hover table-bordered">
  		<tr>
  			<th>Name</th>
  			<th>Creator</th>
  			<th>Creation Date</th>
  			<th>Messages count</th>
  			<th>Actions</th>
  		</tr>
	"""),_display_(Seq[Any](/*20.3*/if(forum.themes.isEmpty())/*20.29*/ {_display_(Seq[Any](format.raw/*20.31*/("""
		<tr>
        <td colspan="5">
        	<p>Nothing to display</p>
        </td>
        </tr>
	""")))}/*26.4*/else/*26.9*/{_display_(Seq[Any](format.raw/*26.10*/("""
		"""),_display_(Seq[Any](/*27.4*/for(theme <- themes) yield /*27.24*/ {_display_(Seq[Any](format.raw/*27.26*/("""
			<tr>
			  	<td><a href=""""),_display_(Seq[Any](/*29.21*/routes/*29.27*/.Messages.index(theme.id))),format.raw/*29.52*/("""" title="Click here to see the messages">"""),_display_(Seq[Any](/*29.94*/theme/*29.99*/.name)),format.raw/*29.104*/("""</a></td>
				<td>"""),_display_(Seq[Any](/*30.10*/theme/*30.15*/.creatorUser.name)),format.raw/*30.32*/("""</td>
				<td>"""),_display_(Seq[Any](/*31.10*/theme/*31.15*/.creationDate)),format.raw/*31.28*/("""</td>
				<td><a href=""""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Messages.index(theme.id))),format.raw/*32.50*/("""" title="Click here to see the messages">"""),_display_(Seq[Any](/*32.92*/theme/*32.97*/.messages.size())),format.raw/*32.113*/("""</a></td>
				<td>
					<a class="btn btn-warning" href=""""),_display_(Seq[Any](/*34.40*/routes/*34.46*/.Themes.update(theme.id))),format.raw/*34.70*/("""">Modificar</a>
					<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*35.39*/routes/*35.45*/.Themes.delete(theme.id))),format.raw/*35.69*/("""">Borrar</a>
				</td>
			</tr>
		""")))})),format.raw/*38.4*/("""
	""")))})),format.raw/*39.3*/("""
		<tr>
		<td colspan="5">
	     	<p>Insert a new theme</p>
	     	"""),_display_(Seq[Any](/*43.9*/helper/*43.15*/.form(action=routes.Themes.insertValidate(forum.id)
	     			, 'class -> "form horizonal"
	     	)/*45.9*/ {_display_(Seq[Any](format.raw/*45.11*/("""
	     		<input type="hidden" id="id" name=" id" value=""/>
	     		<input type="hidden" id="forum_id" name="forum_id" value=""""),_display_(Seq[Any](/*47.68*/forum/*47.73*/.id)),format.raw/*47.76*/(""""/>
                <input type="hidden" id="forum_name" name="forum_name" value=""""),_display_(Seq[Any](/*48.80*/forum/*48.85*/.name)),format.raw/*48.90*/(""""/>
	            
	            """),_display_(Seq[Any](/*50.15*/helper/*50.21*/.inputText(formInsert("name")
	            		, '_label -> "New Theme Name: "
	            		, 'placeholder ->"Write a theme"
	            		, '_showConstraints -> false
	            		))),format.raw/*54.17*/("""
	            
	            <input type="submit" value="Insert" class="btn btn-success"/>
	            
	     	""")))})),format.raw/*58.9*/("""
	    </td>
    	</tr>
	</table>
""")))})))}
    }
    
    def render(forum:Forum,themes:List[Theme],formInsert:Form[_root_.forms.ThemeInsert]): play.api.templates.HtmlFormat.Appendable = apply(forum,themes,formInsert)
    
    def f:((Forum,List[Theme],Form[_root_.forms.ThemeInsert]) => play.api.templates.HtmlFormat.Appendable) = (forum,themes,formInsert) => apply(forum,themes,formInsert)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 25 19:25:10 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Themes/index.scala.html
                    HASH: 4e79a6f3a80da84d2b4a1c055043063209dd6d90
                    MATRIX: 823->1|996->80|1035->85|1046->89|1084->91|1157->129|1171->135|1215->158|1255->164|1267->169|1293->174|1344->208|1382->210|1433->225|1447->230|1474->235|1748->474|1783->500|1823->502|1945->607|1957->612|1996->613|2036->618|2072->638|2112->640|2179->671|2194->677|2241->702|2319->744|2333->749|2361->754|2417->774|2431->779|2470->796|2522->812|2536->817|2571->830|2632->855|2647->861|2694->886|2772->928|2786->933|2825->949|2921->1009|2936->1015|2982->1039|3073->1094|3088->1100|3134->1124|3203->1162|3238->1166|3345->1238|3360->1244|3468->1344|3508->1346|3673->1475|3687->1480|3712->1483|3832->1567|3846->1572|3873->1577|3943->1611|3958->1617|4169->1806|4316->1922
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|37->9|37->9|38->10|38->10|38->10|48->20|48->20|48->20|54->26|54->26|54->26|55->27|55->27|55->27|57->29|57->29|57->29|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|60->32|62->34|62->34|62->34|63->35|63->35|63->35|66->38|67->39|71->43|71->43|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|78->50|78->50|82->54|86->58
                    -- GENERATED --
                */
            