import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.addSauceLabsProductsAndProceedToCheckout
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div loginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/div_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on div loginCredentials.png')

"Step 3: Click on div loginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/div_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Click on div loginCredentials.png')

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Add Sauce Labs products to cart and proceed to checkout"

addSauceLabsProductsAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on button finish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on button finish - Navigate to page checkout-completehtml.png')

"Step 7: Click on button backHome -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_backHome'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Click on button backHome - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Login and Checkout with Credentials for Sauce Demo Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}