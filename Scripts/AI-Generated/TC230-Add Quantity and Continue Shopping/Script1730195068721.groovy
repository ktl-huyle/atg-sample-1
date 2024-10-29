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

"Step 3: Navigate to /*"

TrueTestScripts.navigate("/${GlobalVariable.path_param_2}")

"Step 4: Click on input quantityField (Quantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/input_quantityField'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 4-Click on input quantityField Quantity.png')

"Step 5: Enter input value in input quantityField (Quantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_home/input_quantityField'), input_quantityField)

WebUI.takeScreenshot(reportLocation + '/TC230/Step 5-Enter input value in input quantityField Quantity.png')

"Step 6: Click on link AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 6-Click on link AddToCart.png')

"Step 7: Click on link ContinueShopping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ContinueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 7-Click on link ContinueShopping - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC230-Add Quantity and Continue Shopping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}