
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
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Computer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, computerForm: Form[Computer]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Edit computer</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq(format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq(/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq(/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq(/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""
            
            """),_display_(Seq(/*19.14*/select(
                computerForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*24.14*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*30.23*/routes/*30.29*/.Application.list())),format.raw/*30.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*33.6*/("""
    
    """),_display_(Seq(/*35.6*/form(routes.Application.delete(id), 'class -> "topRight")/*35.63*/ {_display_(Seq(format.raw/*35.65*/("""
        <input type="submit" value="Delete this computer" class="btn danger">
    """)))})),format.raw/*37.6*/("""
    
""")))})),format.raw/*39.2*/("""
"""))}
    }
    
    def render(id:Long,computerForm:Form[Computer]) = apply(id,computerForm)
    
    def f:((Long,Form[Computer]) => play.api.templates.Html) = (id,computerForm) => apply(id,computerForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 21 16:40:55 CDT 2012
                    SOURCE: /Users/cassandrajens/Projects/play-2.0/samples/java/computer-database/app/views/editForm.scala.html
                    HASH: 5de231189f456ec9a95d442450306433bd90a50c
                    MATRIX: 771->1|896->62|928->86|1007->41|1035->60|1063->140|1096->144|1107->148|1140->150|1213->193|1257->228|1292->230|1374->281|1455->340|1500->354|1589->421|1634->435|1727->506|1785->533|2036->762|2243->938|2258->944|2299->963|2385->1018|2426->1029|2492->1086|2527->1088|2642->1172|2680->1179
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|44->15|44->15|45->16|45->16|46->17|46->17|48->19|53->24|59->30|59->30|59->30|62->33|64->35|64->35|64->35|66->37|68->39
                    -- GENERATED --
                */
            