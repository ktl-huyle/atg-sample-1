import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.buyItemAndProceedToCheckout
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

"Step 2: Click on link Samsung -> Navigate to page 'product categories#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Samsung'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link Samsung - Navigate to page product categories.png')

"Step 3: Click on link mobileProduct (SamsungGalaxyZFold4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_categories/link_mobileProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_categories/link_mobileProduct', ['link_mobileProduct_class': link_mobileProduct_class, 'link_mobileProduct_internalRoleLinkName': link_mobileProduct_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link mobileProduct SamsungGalaxyZFold4.png')

"Step 4: Select an item and proceed to the checkout process."

buyItemAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on input FirstName.png')

"Step 6: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Enter input value in input FirstName.png')

"Step 7: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on input LastName.png')

"Step 8: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Enter input value in input LastName.png')

"Step 9: Click on div AddressField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/div_AddressField'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on div AddressField.png')

"Step 10: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on input Address.png')

"Step 11: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Enter input value in input Address.png')

"Step 12: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on input ZipCode.png')

"Step 13: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Enter input value in input ZipCode.png')

"Step 14: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on input City.png')

"Step 15: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipping_address_checkout/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Enter input value in input City.png')

"Step 16: Click on button ContinueToPayment -> Navigate to page 'payment checkout#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipping_address_checkout/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on button ContinueToPayment - Navigate to page payment checkoutcheckoutpayment.png')

"Step 17: Click on button CompleteOrder -> Navigate to page 'thank you#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on button CompleteOrder - Navigate to page thank youthank-you.png')

"Step 18: Click on link KCellphoneShop -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_KCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on link KCellphoneShop - Navigate to page .png')

"Step 19: Click on main MainContent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/main_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Click on main MainContent - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Checkout Process for Samsung Mobile with Address Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}