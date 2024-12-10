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

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on link CeramicsSculpture -> Navigate to page 'art-supplies-craft-supplies/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_CeramicsSculpture'))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 4-Click on link CeramicsSculpture - Navigate to page art-supplies-craft-supplies.png')

"Step 5: Click on link artSupplies (Glazes) -> Navigate to page 'art-supplies-craft-supplies/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/art-supplies-craft-supplies/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_art_supplies_craft_supplies/link_artSupplies"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_art_supplies_craft_supplies/link_artSupplies', ['link_artSupplies_nthChild': link_artSupplies_nthChild, 'link_artSupplies_internalRoleLinkName': link_artSupplies_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 5-Click on link artSupplies Glazes - Navigate to page art-supplies-craft-supplies.png')

"Step 6: Click on select ItemsPerPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/art-supplies-craft-supplies/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_art_supplies_craft_supplies/select_ItemsPerPage'))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 6-Click on select ItemsPerPage.png')

"Step 7: Click on div SaxCrystal -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/art-supplies-craft-supplies/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_art_supplies_craft_supplies/div_SaxCrystal'))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 7-Click on div SaxCrystal - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC70-Explore Art Supplies and Verify Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}