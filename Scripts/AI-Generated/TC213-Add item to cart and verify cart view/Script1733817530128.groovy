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

"Step 4: Click on input quantityLabel (QuantityLabel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/input_quantityLabel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/input_quantityLabel', ['input_quantityLabel_inputName': input_quantityLabel_inputName]))

WebUI.takeScreenshot(reportLocation + '/TC213/Step 4-Click on input quantityLabel QuantityLabel.png')

"Step 5: Click on link AddToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AddToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC213/Step 5-Click on link AddToCart2.png')

"Step 6: Click on link GoToCart4 -> Navigate to page '/AjaxOrderItemDisplayView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GoToCart4'))

WebUI.takeScreenshot(reportLocation + '/TC213/Step 6-Click on link GoToCart4 - Navigate to page AjaxOrderItemDisplayView.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC213-Add item to cart and verify cart view_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}