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

"Step 3: Navigate to /shop-our-products"

TrueTestScripts.navigate("/shop-our-products")

"Step 4: Click on div departmentsButton -> Navigate to page '/AjaxLogonForm'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop-our-products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop_our_products/div_departmentsButton'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 4-Click on div departmentsButton - Navigate to page AjaxLogonForm.png')

"Step 5: Click on input password2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxLogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxLogonForm/input_password2'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 5-Click on input password2.png')

"Step 6: Click on link SignIn2 -> Navigate to page 'webapp/wcs/stores/servlet/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxLogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxLogonForm/link_SignIn2'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 6-Click on link SignIn2 - Navigate to page webappwcsstoresservlet.png')

"Step 7: Click on div departmentsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_webapp_wcs_stores_servlet/div_departmentsButton'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 7-Click on div departmentsButton.png')

"Step 8: Click on div departmentsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_webapp_wcs_stores_servlet/div_departmentsButton'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 8-Click on div departmentsButton.png')

"Step 9: Click on div departmentsButton2 -> Navigate to page '/shop-our-products'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_webapp_wcs_stores_servlet/div_departmentsButton'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 9-Click on div departmentsButton2 - Navigate to page shop-our-products.png')

"Step 10: Click on link shoppingCartCount -> Navigate to page '/AjaxOrderItemDisplayView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop-our-products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop_our_products/link_shoppingCartCount'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 10-Click on link shoppingCartCount - Navigate to page AjaxOrderItemDisplayView.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC248-Access Shopping Cart from Product Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}