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

"Step 4: Click on button AcceptAll4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_AcceptAll4'))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 4-Click on button AcceptAll4.png')

"Step 5: Click on image productImages (ProductImage1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productImages', ['image_productImages_nthChild': image_productImages_nthChild, 'image_productImages_class': image_productImages_class, 'image_productImages_internalRoleImgName': image_productImages_internalRoleImgName]))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 5-Click on image productImages ProductImage1.png')

"Step 6: Click on image productImages (ProductImage12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productImages', ['image_productImages_nthChild': image_productImages_nthChild_1, 'image_productImages_class': image_productImages_class_1, 'image_productImages_internalRoleImgName': image_productImages_internalRoleImgName_1]))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 6-Click on image productImages ProductImage12.png')

"Step 7: Click on span ShippingPolicyDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_ShippingPolicyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 7-Click on span ShippingPolicyDetails.png')

"Step 8: Click on div SidebarOverlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_SidebarOverlay'))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 8-Click on div SidebarOverlay.png')

"Step 9: Click on link brands (ClickToZoom2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brands', ['link_brands_internalRoleLinkName': link_brands_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC240/Step 9-Click on link brands ClickToZoom2 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC240-Manage product images and verify home page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}