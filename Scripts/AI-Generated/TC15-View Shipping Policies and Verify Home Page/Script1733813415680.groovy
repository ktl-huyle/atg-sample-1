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

"Step 4: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on button Close.png')

"Step 5: Click on span ShippingPolicyDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_ShippingPolicyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on span ShippingPolicyDetails.png')

"Step 6: Click on list ShippingPolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_ShippingPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on list ShippingPolicy.png')

"Step 7: Click on item shippingPolicies (ShippingPolicy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies', ['item_shippingPolicies_internalText': item_shippingPolicies_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on item shippingPolicies ShippingPolicy.png')

"Step 8: Click on list ShippingPolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_ShippingPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on list ShippingPolicy.png')

"Step 9: Click on item shippingPolicies (ShippingPolicy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies', ['item_shippingPolicies_internalText': item_shippingPolicies_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on item shippingPolicies ShippingPolicy2.png')

"Step 10: Click on item shippingPolicies (ShippingPolicy3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies', ['item_shippingPolicies_internalText': item_shippingPolicies_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on item shippingPolicies ShippingPolicy3.png')

"Step 11: Click on item shippingPolicies (ShippingPolicy3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/item_shippingPolicies', ['item_shippingPolicies_internalText': item_shippingPolicies_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Click on item shippingPolicies ShippingPolicy3.png')

"Step 12: Click on div CloseButton (CloseButton16) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/div_CloseButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_CloseButton', ['div_CloseButton_class': div_CloseButton_class, 'div_CloseButton_internalText': div_CloseButton_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on div CloseButton CloseButton16 - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-View Shipping Policies and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}