
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Theme,List[Message],Form[forms.Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(theme: Theme, messages: List[Message], formInsert: Form[forms.Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.74*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
&nbsp;-&gt;&nbsp;forum:
<a href=""""),_display_(Seq[Any](/*5.11*/routes/*5.17*/.Themes.index(theme.forum.id))),format.raw/*5.46*/("""">
	"""),_display_(Seq[Any](/*6.3*/theme/*6.8*/.forum.name)),format.raw/*6.19*/("""
</a>
&nbsp;-&gt;&nbsp;theme: """),_display_(Seq[Any](/*8.26*/theme/*8.31*/.name)),format.raw/*8.36*/("""
&nbsp;-&gt;&nbsp;messages
""")))}/*10.2*/ {_display_(Seq[Any](format.raw/*10.4*/("""
	<h2>Forum: <b><a href=""""),_display_(Seq[Any](/*11.26*/routes/*11.32*/.Themes.index(theme.forum.id))),format.raw/*11.61*/("""">"""),_display_(Seq[Any](/*11.64*/theme/*11.69*/.forum.name)),format.raw/*11.80*/("""</a></b></h2>
	<h3>Theme: <b>"""),_display_(Seq[Any](/*12.17*/theme/*12.22*/.name)),format.raw/*12.27*/("""</b></h3>
	<h4>Messages: """),_display_(Seq[Any](/*13.17*/messages/*13.25*/.size())),format.raw/*13.32*/("""</h4>
	
	<table class="table table-striped table-hover table-bordered">
  		<tr>
  			<th>Text</th>
  			<th>Creator</th>
  			<th>Creation Date</th>
  			<th>Actions</th>
  		</tr>
	"""),_display_(Seq[Any](/*22.3*/for(message <- messages) yield /*22.27*/ {_display_(Seq[Any](format.raw/*22.29*/("""
		<tr>
		  	<td>"""),_display_(Seq[Any](/*24.11*/message/*24.18*/.text)),format.raw/*24.23*/("""</a></td>
			<td>"""),_display_(Seq[Any](/*25.9*/message/*25.16*/.creatorUser.name)),format.raw/*25.33*/("""</td>
			<td>"""),_display_(Seq[Any](/*26.9*/message/*26.16*/.creationDate)),format.raw/*26.29*/("""</td>
			<td>
				<a class="btn btn-warning" href=""""),_display_(Seq[Any](/*28.39*/routes/*28.45*/.Messages.update(message.id))),format.raw/*28.73*/("""">Update</a>
				<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*29.38*/routes/*29.44*/.Messages.delete(message.id))),format.raw/*29.72*/("""">Delete</a>
			</td>
		</tr>
	""")))})),format.raw/*32.3*/("""

		<tr>
			<td colspan="4">
		     	<p>Insert a new message</p>
		     	"""),_display_(Seq[Any](/*37.10*/helper/*37.16*/.form(action=routes.Messages.insertValidate(theme.id)
		     			, 'class -> "form horizonal"
		     	)/*39.10*/ {_display_(Seq[Any](format.raw/*39.12*/("""
		     		<input type="hidden" id="id" name=" id" value=""/>
		     		<input type="hidden" id="theme_id" name="theme_id" value=""""),_display_(Seq[Any](/*41.69*/theme/*41.74*/.id)),format.raw/*41.77*/(""""/>
		            
		            """),_display_(Seq[Any](/*43.16*/helper/*43.22*/.textarea(formInsert("text")
		            		,'cols -> "50"
							,'rows -> "5"
		            		, '_label -> "New message: "
		            		, 'placeholder ->"Write a text"
		            		, '_showConstraints -> true
		            ))),format.raw/*49.16*/("""
		            
		            <input type="submit" value="Insert" class="btn btn-success"/>
		            
		     	""")))})),format.raw/*53.10*/("""
		    </td>
    	</tr>
	</table>
""")))})))}
    }
    
    def render(theme:Theme,messages:List[Message],formInsert:Form[forms.Message]): play.api.templates.HtmlFormat.Appendable = apply(theme,messages,formInsert)
    
    def f:((Theme,List[Message],Form[forms.Message]) => play.api.templates.HtmlFormat.Appendable) = (theme,messages,formInsert) => apply(theme,messages,formInsert)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 25 19:26:23 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/Messages/index.scala.html
                    HASH: 243f1cb17b64d71e61434b1eb5da6bebd8bf7823
                    MATRIX: 816->1|982->73|1019->76|1030->80|1068->82|1138->117|1152->123|1202->152|1241->157|1253->162|1285->173|1351->204|1364->209|1390->214|1436->242|1475->244|1537->270|1552->276|1603->305|1642->308|1656->313|1689->324|1755->354|1769->359|1796->364|1858->390|1875->398|1904->405|2123->589|2163->613|2203->615|2257->633|2273->640|2300->645|2353->663|2369->670|2408->687|2457->701|2473->708|2508->721|2596->773|2611->779|2661->807|2747->857|2762->863|2812->891|2875->923|2985->997|3000->1003|3111->1105|3151->1107|3316->1236|3330->1241|3355->1244|3425->1278|3440->1284|3695->1517|3843->1633
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|60->32|65->37|65->37|67->39|67->39|69->41|69->41|69->41|71->43|71->43|77->49|81->53
                    -- GENERATED --
                */
            