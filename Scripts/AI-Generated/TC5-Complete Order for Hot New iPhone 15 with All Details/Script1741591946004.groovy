import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.initiateOrderAndProceedToCheckout
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link HotNewiPhone15 -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_HotNewiPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link HotNewiPhone15 - Navigate to page productproduct.png')

"Step 3: Click on label 128GB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_128GB'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on label 128GB.png')

"Step 4: Click on label Black"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_Black'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on label Black.png')

"Step 5: Start order process by entering email and proceed to shipping."

initiateOrderAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on input FirstName.png')

"Step 7: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Enter input value in input FirstName.png')

"Step 8: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on input LastName.png')

"Step 9: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Enter input value in input LastName.png')

"Step 10: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on input Address.png')

"Step 11: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Enter input value in input Address.png')

"Step 12: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on input ZipCode.png')

"Step 13: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Enter input value in input ZipCode.png')

"Step 14: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on input City.png')

"Step 15: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Enter input value in input City.png')

"Step 16: Click on button ContinueToPayment -> Navigate to page 'payment checkout#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on button ContinueToPayment - Navigate to page payment checkoutcheckoutpayment.png')

"Step 17: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Complete Order for Hot New iPhone 15 with All Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}