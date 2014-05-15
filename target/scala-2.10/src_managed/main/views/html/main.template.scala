
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(breadcrumbs: Html)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>DAW2-Foros</title>
        
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap-theme.min.css"))),format.raw/*10.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/main.css"))),format.raw/*11.94*/("""">
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
        
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*16.71*/("""" type="text/javascript"></script>
        
        
    </head>
    <body onload="onload();">
	    
    	<header class="page-header">
	        <div id="breadcrumbs" class="col-md-12">
	        	<a href=""""),_display_(Seq[Any](/*24.21*/routes/*24.27*/.Forums.index())),format.raw/*24.42*/("""">
		    		<img src=""""),_display_(Seq[Any](/*25.20*/routes/*25.26*/.Assets.at("images/logo.jpg"))),format.raw/*25.55*/("""" height="25px" alt="Logo" class="miniLogo" />
		    		<span class="glyphicon glyphicon-home"></span>
		    		Home
		    	</a>
		    	"""),_display_(Seq[Any](/*29.9*/breadcrumbs)),format.raw/*29.20*/("""
				<div id="breadcrumbs_right" class="col-md-4">    			    			
					"""),_display_(Seq[Any](/*31.7*/if(session().get("userEmail") != null)/*31.45*/ {_display_(Seq[Any](format.raw/*31.47*/("""
				        """),_display_(Seq[Any](/*32.14*/session()/*32.23*/.get("userEmail"))),format.raw/*32.40*/(""" - 
						<a href='"""),_display_(Seq[Any](/*33.17*/routes/*33.23*/.Users.logout())),format.raw/*33.38*/("""'>Sing out</a>
					""")))}/*34.8*/else/*34.13*/{_display_(Seq[Any](format.raw/*34.14*/("""
						Guess - 
				        """),_display_(Seq[Any](/*36.14*/if(request().uri() != "/Forums/login")/*36.52*/ {_display_(Seq[Any](format.raw/*36.54*/("""
							<a href='"""),_display_(Seq[Any](/*37.18*/routes/*37.24*/.Users.login())),format.raw/*37.38*/("""'>Sing in</a>
						""")))})),format.raw/*38.8*/("""
					""")))})),format.raw/*39.7*/("""
				</div>
			</div>
		    <div id="header_left" class="col-md-4">
				<img src=""""),_display_(Seq[Any](/*43.16*/routes/*43.22*/.Assets.at("images/logo.jpg"))),format.raw/*43.51*/("""" height="150px" alt="Logo" />
			</div>
    		<div id="header_center" class="col-md-8">
    			<h1>DAW2 - Forums</h1>
    		</div>		
    		<div style="clear: both"></div>
    	</header>
        
        <div class="content">
        	"""),_display_(Seq[Any](/*52.11*/content)),format.raw/*52.18*/("""
        </div>
        
        <footer class="section">
        	<p class="text-muted">(C) jequeto, last update April 29, 2014</p>
        </footer>
        
        <div class="section" id="globals">
<pre>
<h4>Some information of the header of the received HTTP packet.</h4>
request().getClass(): """),_display_(Seq[Any](/*62.24*/request/*62.31*/.getClass())),format.raw/*62.42*/("""
request().username(): """),_display_(Seq[Any](/*63.24*/request/*63.31*/.username())),format.raw/*63.42*/("""
request().acceptedTypes(): """),_display_(Seq[Any](/*64.29*/request()/*64.38*/.acceptedTypes())),format.raw/*64.54*/("""
request().acceptLanguages(): """),_display_(Seq[Any](/*65.31*/request()/*65.40*/.acceptLanguages())),format.raw/*65.58*/("""
request().cookies(): """),_display_(Seq[Any](/*66.23*/request()/*66.32*/.cookies())),format.raw/*66.42*/(""" 
request().headers(): """),_display_(Seq[Any](/*67.23*/request()/*67.32*/.headers())),format.raw/*67.42*/("""
request().host(): """),_display_(Seq[Any](/*68.20*/request()/*68.29*/.host())),format.raw/*68.36*/("""
request().method(): """),_display_(Seq[Any](/*69.22*/request()/*69.31*/.method())),format.raw/*69.40*/("""
request().path(): """),_display_(Seq[Any](/*70.20*/request()/*70.29*/.path())),format.raw/*70.36*/("""
request().queryString(): """),_display_(Seq[Any](/*71.27*/request()/*71.36*/.queryString())),format.raw/*71.50*/("""
request().remoteAddress(): """),_display_(Seq[Any](/*72.29*/request()/*72.38*/.remoteAddress())),format.raw/*72.54*/("""
request().uri(): """),_display_(Seq[Any](/*73.19*/request()/*73.28*/.uri())),format.raw/*73.34*/("""
request().version(): """),_display_(Seq[Any](/*74.23*/request()/*74.32*/.version())),format.raw/*74.42*/("""
</pre>
        </div>
        
        <script type="text/javascript">
        	function onload() """),format.raw/*79.28*/("""{"""),format.raw/*79.29*/("""
        		"""),_display_(Seq[Any](/*80.12*/if(flash.contains("alert"))/*80.39*/ {_display_(Seq[Any](format.raw/*80.41*/("""
        			alert(""""),_display_(Seq[Any](/*81.20*/(flash.get("alert")))),format.raw/*81.40*/("""");
        		""")))})),format.raw/*82.12*/("""
        	"""),format.raw/*83.10*/("""}"""),format.raw/*83.11*/("""
        </script>
        
    </body>
</html>
"""))}
    }
    
    def render(breadcrumbs:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(breadcrumbs)(content)
    
    def f:((Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (breadcrumbs) => (content) => apply(breadcrumbs)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 15 12:50:28 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/main.scala.html
                    HASH: fb84df0014d824a392cd698495e91d3824295068
                    MATRIX: 776->1|904->35|1072->168|1086->174|1151->217|1243->273|1258->279|1330->328|1422->384|1437->390|1493->424|1599->494|1614->500|1668->532|1738->566|1753->572|1820->617|1913->674|1928->680|1992->722|2233->927|2248->933|2285->948|2343->970|2358->976|2409->1005|2579->1140|2612->1151|2718->1222|2765->1260|2805->1262|2855->1276|2873->1285|2912->1302|2968->1322|2983->1328|3020->1343|3059->1365|3072->1370|3111->1371|3176->1400|3223->1438|3263->1440|3317->1458|3332->1464|3368->1478|3420->1499|3458->1506|3577->1589|3592->1595|3643->1624|3915->1860|3944->1867|4281->2168|4297->2175|4330->2186|4390->2210|4406->2217|4439->2228|4504->2257|4522->2266|4560->2282|4627->2313|4645->2322|4685->2340|4744->2363|4762->2372|4794->2382|4854->2406|4872->2415|4904->2425|4960->2445|4978->2454|5007->2461|5065->2483|5083->2492|5114->2501|5170->2521|5188->2530|5217->2537|5280->2564|5298->2573|5334->2587|5399->2616|5417->2625|5455->2641|5510->2660|5528->2669|5556->2675|5615->2698|5633->2707|5665->2717|5792->2816|5821->2817|5869->2829|5905->2856|5945->2858|6001->2878|6043->2898|6090->2913|6128->2923|6157->2924
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|52->24|52->24|52->24|53->25|53->25|53->25|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|67->39|71->43|71->43|71->43|80->52|80->52|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|107->79|107->79|108->80|108->80|108->80|109->81|109->81|110->82|111->83|111->83
                    -- GENERATED --
                */
            