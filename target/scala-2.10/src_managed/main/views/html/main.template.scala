
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
</html>"""))}
    }
    
    def render(breadcrumbs:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(breadcrumbs)(content)
    
    def f:((Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (breadcrumbs) => (content) => apply(breadcrumbs)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 20 17:45:04 CEST 2014
                    SOURCE: G:/eclipse_workspace/play_forums_orm/app/views/main.scala.html
                    HASH: 40ee5985222cab34632bb8f8b817f329d553f343
                    MATRIX: 776->1|904->35|1080->176|1094->182|1159->225|1252->282|1267->288|1339->337|1432->394|1447->400|1503->434|1611->506|1626->512|1680->544|1752->580|1767->586|1834->631|1928->689|1943->695|2007->737|2256->950|2271->956|2308->971|2367->994|2382->1000|2433->1029|2607->1168|2640->1179|2748->1252|2795->1290|2835->1292|2886->1307|2904->1316|2943->1333|3000->1354|3015->1360|3052->1375|3092->1398|3105->1403|3144->1404|3211->1435|3258->1473|3298->1475|3353->1494|3368->1500|3404->1514|3457->1536|3496->1544|3619->1631|3634->1637|3685->1666|3966->1911|3995->1918|4342->2229|4358->2236|4391->2247|4452->2272|4468->2279|4501->2290|4567->2320|4585->2329|4623->2345|4691->2377|4709->2386|4749->2404|4809->2428|4827->2437|4859->2447|4920->2472|4938->2481|4970->2491|5027->2512|5045->2521|5074->2528|5133->2551|5151->2560|5182->2569|5239->2590|5257->2599|5286->2606|5350->2634|5368->2643|5404->2657|5470->2687|5488->2696|5526->2712|5582->2732|5600->2741|5628->2747|5688->2771|5706->2780|5738->2790|5870->2894|5899->2895|5948->2908|5984->2935|6024->2937|6081->2958|6123->2978|6171->2994|6210->3005|6239->3006
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|52->24|52->24|52->24|53->25|53->25|53->25|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|67->39|71->43|71->43|71->43|80->52|80->52|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|107->79|107->79|108->80|108->80|108->80|109->81|109->81|110->82|111->83|111->83
                    -- GENERATED --
                */
            