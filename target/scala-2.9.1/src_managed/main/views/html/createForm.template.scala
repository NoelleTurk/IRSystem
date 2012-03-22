
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
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Computer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(computerForm: Form[Computer]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Add a computer</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq(format.raw/*11.39*/("""
        
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
            <input type="submit" value="Create this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*31.23*/routes/*31.29*/.Application.list())),format.raw/*31.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*34.6*/("""
    
""")))})))}
    }
    
    def render(computerForm:Form[Computer]) = apply(computerForm)
    
    def f:((Form[Computer]) => play.api.templates.Html) = (computerForm) => apply(computerForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 21 16:40:55 CDT 2012
                    SOURCE: /Users/cassandrajens/Projects/play-2.0/samples/java/computer-database/app/views/createForm.scala.html
                    HASH: 6169a16df7f117e1c8cbb4843f4ce6ec88628dbe
                    MATRIX: 768->1|883->52|915->76|994->31|1022->50|1050->130|1083->134|1094->138|1127->140|1201->184|1241->215|1276->217|1358->268|1439->327|1484->341|1573->408|1618->422|1711->493|1757->508|2008->737|2222->920|2237->926|2278->945|2364->1000
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|44->15|44->15|45->16|45->16|46->17|46->17|48->19|53->24|60->31|60->31|60->31|63->34
                    -- GENERATED --
                */
            