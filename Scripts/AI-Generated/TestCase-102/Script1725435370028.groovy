import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to user/settings"

TrueTestScripts.navigate("user/settings")

"Step 2: Click on link katalonStudioLicenses -> Navigate to page 'user/license'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_katalonStudioLicenses'))

WebUI.takeScreenshot()

"Step 3: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/td_object'))

WebUI.takeScreenshot()

"Step 4: Click on span katalonStudioEnterpriseNodeLocked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/span_katalonStudioEnterpriseNodeLocked'))

WebUI.takeScreenshot()

"Step 5: Click on td object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/td_object2'))

WebUI.takeScreenshot()

"Step 6: Click on link subscribe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/link_subscribe'))

WebUI.takeScreenshot()

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-102_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}