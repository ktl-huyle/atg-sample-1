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

"Step 3: Navigate to /SearchDisplay"

TrueTestScripts.navigate("/SearchDisplay")

"Step 4: Click on link ShoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/link_ShoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC252/Step 4-Click on link ShoppingCart.png')

"Step 5: Click on link GoToCart2 -> Navigate to page '/AjaxOrderItemDisplayView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC252/Step 5-Click on link GoToCart2 - Navigate to page AjaxOrderItemDisplayView.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC252-Access Shopping Cart from Search Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}