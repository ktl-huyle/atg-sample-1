import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Click on input SearchTerm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchTerm'))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 4-Click on input SearchTerm.png')

"Step 5: Click on input SearchTerm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchTerm'))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 5-Click on input SearchTerm.png')

"Step 6: Enter input value in input SearchTerm -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_SearchTerm'), input_SearchTerm)

WebUI.takeScreenshot(reportLocation + '/TC240/Step 6-Enter input value in input SearchTerm - Navigate to page SearchDisplay.png')

"Step 7: Click on link productItems (LIONPolyEnvelopes)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_SearchDisplay/link_productItems_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_SearchDisplay/link_productItems_1', ['link_productItems_internalAttrTitle': link_productItems_internalAttrTitle]))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 7-Click on link productItems LIONPolyEnvelopes.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC240-Search and View Product Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}