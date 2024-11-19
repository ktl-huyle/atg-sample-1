import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.completeShippingAndPaymentInformation
import truetest.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Click on link SignIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SignIn'))

WebUI.takeScreenshot()

"Step 3: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_signin/input_Email'), input_Email)

WebUI.takeScreenshot()

"Step 4: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_signin/input_Password'), input_Password)

WebUI.takeScreenshot()

"Step 5: Click on button SignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_SignIn'))

WebUI.takeScreenshot()

"Step 6: Click on link Shop -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_Shop'))

WebUI.takeScreenshot()

"Step 7: Hover over div IndoorPlantDetails2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_IndoorPlantDetails2'))

WebUI.takeScreenshot()

"Step 8: Click on button AddToBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_AddToBasket'))

WebUI.takeScreenshot()

"Step 9: Click on span ShoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_ShoppingCart'))

WebUI.takeScreenshot()

"Step 10: Click on button quantityControl (Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/button_quantityControl', ['button_quantityControl_class': button_quantityControl_class, 'button_quantityControl_internalRoleButtonName': button_quantityControl_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 11: Click on image productImage (PlantImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/image_productImage'))

WebUI.takeScreenshot()

"Step 12: Click on div productDetails (ProductDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/div_productDetails'))

WebUI.takeScreenshot()

"Step 13: Click on span quantityAdjustment (Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment', ['span_quantityAdjustment_class': span_quantityAdjustment_class, 'span_quantityAdjustment_internalRoleButtonName': span_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 14: Click on span quantityAdjustment (Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment', ['span_quantityAdjustment_class': span_quantityAdjustment_class_1, 'span_quantityAdjustment_internalRoleButtonName': span_quantityAdjustment_internalRoleButtonName_1]))

WebUI.takeScreenshot()

"Step 15: Click on span quantityAdjustment (Minus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment', ['span_quantityAdjustment_class': span_quantityAdjustment_class_2, 'span_quantityAdjustment_internalRoleButtonName': span_quantityAdjustment_internalRoleButtonName_2]))

WebUI.takeScreenshot()

"Step 16: Click on span quantityAdjustment (Minus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment', ['span_quantityAdjustment_class': span_quantityAdjustment_class_3, 'span_quantityAdjustment_internalRoleButtonName': span_quantityAdjustment_internalRoleButtonName_3]))

WebUI.takeScreenshot()

"Step 17: Click on span quantityAdjustment (Minus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shop/span_quantityAdjustment', ['span_quantityAdjustment_class': span_quantityAdjustment_class_4, 'span_quantityAdjustment_internalRoleButtonName': span_quantityAdjustment_internalRoleButtonName_4]))

WebUI.takeScreenshot()

"Step 18: Click on button CheckOut2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_CheckOut2'))

WebUI.takeScreenshot()

"Step 19: Complete shipping and payment information for order"

completeShippingAndPaymentInformation.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Adjust Quantity of Indoor Plant and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}