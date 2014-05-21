
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
&nbsp;-&gt;&nbsp;forum: """),_display_(Seq[Any](/*4.26*/forum/*4.31*/.name)),format.raw/*4.36*/("""</a>&nbsp;-&gt;&nbsp;themes
""")))}/*5.2*/ {_display_(Seq[Any](format.raw/*5.4*/("""
	<h2>Forum: """),_display_(Seq[Any](/*6.14*/forum/*6.19*/.name)),format.raw/*6.24*/("""</h2>
	<h3>Themes:</h3>
	<table class="table table-striped table-hover table-bordered">
  		<tr>
  			<th>Name</th>
  			<th>Creator</th>
  			<th>Creation Date</th>
  			<th>Messages count</th>
  			<th>Actions</th>
  		</tr>
	"""),_display_(Seq[Any](/*16.3*/if(forum.themes.isEmpty())/*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
		<tr>
        <td colspan="5">
        	<p>Nothing to display</p>
        </td>
        </tr>
	""")))}/*22.4*/else/*22.9*/{_display_(Seq[Any](format.raw/*22.10*/("""
		"""),_display_(Seq[Any](/*23.4*/for(theme <- forum.themes) yield /*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
			<tr>
			  	<td>"""),_display_(Seq[Any](/*25.12*/theme/*25.17*/.name)),format.raw/*25.22*/("""</a></td>
				<td>"""),_display_(Seq[Any](/*26.10*/theme/*26.15*/.creatorUser.name)),format.raw/*26.32*/("""</td>
				<td>"""),_display_(Seq[Any](/*27.10*/theme/*27.15*/.creationDate)),format.raw/*27.28*/("""</td>
				<td>"""),_display_(Seq[Any](/*28.10*/theme/*28.15*/.messages.size())),format.raw/*28.31*/("""</td>
				<td>
					<a class="btn btn-warning" href=""""),_display_(Seq[Any](/*30.40*/routes/*30.46*/.Themes.update(forum.id, theme.id))),format.raw/*30.80*/("""">Modificar</a>
					<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*31.39*/routes/*31.45*/.Themes.delete(forum.id, theme.id))),format.raw/*31.79*/("""">Borrar</a>
				</td>
			</tr>
		""")))})),format.raw/*34.4*/("""
	""")))})),format.raw/*35.3*/("""
		<tr>
		<td colspan="5">
	     	<p>Insert a new theme</p>
	     	"""),_display_(Seq[Any](/*39.9*/helper/*39.15*/.form(action=routes.Themes.insertValidate(forum.id)
	     			, 'class -> "form horizonal"
	     	)/*41.9*/ {_display_(Seq[Any](format.raw/*41.11*/("""
	     		<input type="hidden" id="id" name=" id" value=""/>
	     		<input type="hidden" id="forum_id" name="forum_id" value=""""),_display_(Seq[Any](/*43.68*/forum/*43.73*/.id)),format.raw/*43.76*/(""""/>
                <input type="hidden" id="forum_name" name="forum_name" value=""""),_display_(Seq[Any](/*44.80*/forum/*44.85*/.name)),format.raw/*44.90*/(""""/>
	            
	            """),_display_(Seq[Any](/*46.15*/helper/*46.21*/.inputText(formInsert("name")
	            		, '_label -> "New Theme Name: "
	            		, 'placeholder ->"Write a theme"
	            		, '_showConstraints -> false
	            		))),format.raw/*50.17*/("""
	            
	            <input type="submit" name="enviar" value="Insert" class="btn btn-success"/>
	            
	     	""")))})),format.raw/*54.9*/("""
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
                    DATE: Wed May 21 20:39:37 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Themes/index.scala.html
                    HASH: 1f9386f55b5f9556a5cd8764ec7ee2a7cfce002a
                    MATRIX: 823->1|996->80|1035->85|1046->89|1084->91|1146->118|1159->123|1185->128|1232->158|1270->160|1320->175|1333->180|1359->185|1633->424|1668->450|1708->452|1830->557|1842->562|1881->563|1921->568|1963->594|2003->596|2061->618|2075->623|2102->628|2158->648|2172->653|2211->670|2263->686|2277->691|2312->704|2364->720|2378->725|2416->741|2508->797|2523->803|2579->837|2670->892|2685->898|2741->932|2810->970|2845->974|2952->1046|2967->1052|3075->1152|3115->1154|3280->1283|3294->1288|3319->1291|3439->1375|3453->1380|3480->1385|3550->1419|3565->1425|3776->1614|3937->1744
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|34->6|34->6|34->6|44->16|44->16|44->16|50->22|50->22|50->22|51->23|51->23|51->23|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|58->30|58->30|58->30|59->31|59->31|59->31|62->34|63->35|67->39|67->39|69->41|69->41|71->43|71->43|71->43|72->44|72->44|72->44|74->46|74->46|78->50|82->54
                    -- GENERATED --
                */
            