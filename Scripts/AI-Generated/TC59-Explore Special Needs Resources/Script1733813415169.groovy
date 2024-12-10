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

"Step 3: Navigate to special-needs/resources"

TrueTestScripts.navigate("special-needs/resources")

"Step 4: Click on pre PreKAges -> Navigate to page 'shop-by-learning-environment/early-childhood/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/special-needs/resources?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_special_needs_resources/pre_PreKAges'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 4-Click on pre PreKAges - Navigate to page shop-by-learning-environmentearly-childhood.png')

"Step 5: Click on special SpecialNeeds -> Navigate to page 'shop-by-learning-model/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop-by-learning-environment/early-childhood/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop_by_learning_environment_early_childhood/special_SpecialNeeds'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 5-Click on special SpecialNeeds - Navigate to page shop-by-learning-model.png')

"Step 6: Click on link Page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop-by-learning-model/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop_by_learning_model/link_Page2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 6-Click on link Page2.png')

"Step 7: Click on gross GrossMotor -> Navigate to page 'special-needs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop-by-learning-model/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop_by_learning_model/gross_GrossMotor'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 7-Click on gross GrossMotor - Navigate to page special-needs.png')

"Step 8: Click on link pageNavigation (Page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/special-needs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_special_needs/link_pageNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 8-Click on link pageNavigation Page2.png')

"Step 9: Click on cando CanDoPeanut -> Navigate to page 'special-needs/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/special-needs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_special_needs/cando_CanDoPeanut'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 9-Click on cando CanDoPeanut - Navigate to page special-needs.png')

"Step 10: Click on span ShippingPolicyDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/special-needs/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_special_needs/span_ShippingPolicyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 10-Click on span ShippingPolicyDetails.png')

"Step 11: Click on div SidebarOverlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/special-needs/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_special_needs/div_SidebarOverlay'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 11-Click on div SidebarOverlay.png')

"Step 12: Click on button ShowMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/special-needs/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_special_needs/button_ShowMore'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 12-Click on button ShowMore.png')

"Step 13: Click on input Search2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/special-needs/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_special_needs/input_Search2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 13-Click on input Search2 - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC59-Explore Special Needs Resources_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}