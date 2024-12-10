import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/*"

TrueTestScripts.navigate("paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/${GlobalVariable.paper_and_paper_supplies_construction_paper_id}")

"Step 4: Click on header PageHeading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_paper_and_paper_supplies_paper_and_paper_supplies_construction/header_PageHeading'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 4-Click on header PageHeading.png')

"Step 5: Click on div shopAllSupplies (ShopAllChildcraft)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_paper_and_paper_supplies_paper_and_paper_supplies_construction/div_shopAllSupplies"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_paper_and_paper_supplies_paper_and_paper_supplies_construction/div_shopAllSupplies', ['div_shopAllSupplies_internalHasText': div_shopAllSupplies_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 5-Click on div shopAllSupplies ShopAllChildcraft.png')

"Step 6: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_paper_and_paper_supplies_paper_and_paper_supplies_construction/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 6-Click on input Search.png')

"Step 7: Enter input value in input Search2 -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_paper_and_paper_supplies_paper_and_paper_supplies_construction/input_Search2'), input_Search2)

WebUI.takeScreenshot(reportLocation + '/TC45/Step 7-Enter input value in input Search2 - Navigate to page SearchDisplay.png')

"Step 8: Click on link Paper (productItem3) -> Navigate to page 'paper-and-paper-supplies/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_SearchDisplay/link_Paper"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_SearchDisplay/link_Paper', ['link_Paper_nthChild': link_Paper_nthChild, 'link_Paper_internalRoleLinkName': link_Paper_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 8-Click on link Paper productItem3 - Navigate to page paper-and-paper-supplies.png')

"Step 9: Click on childcraft ConstructionPaper -> Navigate to page 'paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/paper-and-paper-supplies/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_paper_and_paper_supplies/childcraft_ConstructionPaper'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 9-Click on childcraft ConstructionPaper - Navigate to page paper-and-paper-suppliespaper-and-paper-supplies-construction-paper.png')

"Step 10: Click on div ItemSKU -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/paper-and-paper-supplies/paper-and-paper-supplies-construction-paper/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_paper_and_paper_supplies_paper_and_paper_supplies_construction/div_ItemSKU'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 10-Click on div ItemSKU - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC45-Search and View Construction Paper Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}