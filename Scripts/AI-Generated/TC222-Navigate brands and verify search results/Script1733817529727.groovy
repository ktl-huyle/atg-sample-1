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

"Step 3: Navigate to /*"

TrueTestScripts.navigate("/${GlobalVariable.path_param_2}")

"Step 4: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC222/Step 4-Click on button Close.png')

"Step 5: Click on link recordBooks (DecorativePaperItem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_recordBooks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_recordBooks', ['link_recordBooks_internalRoleOptionName': link_recordBooks_internalRoleOptionName]))

WebUI.takeScreenshot(reportLocation + '/TC222/Step 5-Click on link recordBooks DecorativePaperItem.png')

"Step 6: Click on image productImages (ZoomImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productImages_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productImages_1', ['image_productImages_nthChild': image_productImages_nthChild, 'image_productImages_divNthChild': image_productImages_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC222/Step 6-Click on image productImages ZoomImage.png')

"Step 7: Click on link CloseModal2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_CloseModal2'))

WebUI.takeScreenshot(reportLocation + '/TC222/Step 7-Click on link CloseModal2.png')

"Step 8: Click on link brands (BlackInk) -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brands', ['link_brands_internalRoleLinkName': link_brands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC222/Step 8-Click on link brands BlackInk - Navigate to page SearchDisplay.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC222-Navigate brands and verify search results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}