import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on buttonAddToCartSauceLabsBackpack"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory_html/button_add_to_cart_sauce_labs_backpack_1'))

WebUI.takeScreenshot()

"Step 4: Click on buttonAddToCartSauceLabsBoltTShirt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory_html/button_object_4'))

WebUI.takeScreenshot()

"Step 5: Click on linkObject -> Navigate to page '/cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory_html/hyperlink_object_1'))

WebUI.takeScreenshot()

"Step 6: Click on buttonCheckout -> Navigate to page '/checkout-step-one.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_cart_html/button_object'))

WebUI.takeScreenshot()

"Step 7: Click on inputFirstname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/inputFirstname'))

WebUI.takeScreenshot()

"Step 8: Enter input value in inputFirstname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/inputFirstname'), inputFirstname)

WebUI.takeScreenshot()

"Step 9: Enter input value in inputLastname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/inputLastname'), inputLastname)

WebUI.takeScreenshot()

"Step 10: Enter input value in inputPostalcode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/inputPostalcode'), inputPostalcode)

WebUI.takeScreenshot()

"Step 11: Click on inputContinue -> Navigate to page '/checkout-step-two.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/inputContinue'))

WebUI.takeScreenshot()

"Step 12: Click on buttonFinish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/buttonFinish'))

WebUI.takeScreenshot()

"Step 13: Click on buttonBackToProducts -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/buttonBackToProducts'))

WebUI.takeScreenshot()

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-001_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}