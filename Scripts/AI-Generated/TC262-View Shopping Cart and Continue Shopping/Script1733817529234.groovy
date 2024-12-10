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

"Step 3: Navigate to /AjaxOrderItemDisplayView"

TrueTestScripts.navigate("/AjaxOrderItemDisplayView")

"Step 4: Click on link ShoppingCartCount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/link_ShoppingCartCount'))

WebUI.takeScreenshot(reportLocation + '/TC262/Step 4-Click on link ShoppingCartCount.png')

"Step 5: Click on link ShoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/link_ShoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC262/Step 5-Click on link ShoppingCart.png')

"Step 6: Click on link ContinueShopping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/link_ContinueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC262/Step 6-Click on link ContinueShopping - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC262-View Shopping Cart and Continue Shopping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}