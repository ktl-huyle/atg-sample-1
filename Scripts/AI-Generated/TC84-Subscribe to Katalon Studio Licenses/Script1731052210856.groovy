import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import internal.GlobalVariable


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to user/*"

TrueTestScripts.navigate("user/${GlobalVariable.user_id}")

"Step 2: Click on link katalonStudioLicenses"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_katalonStudioLicenses'))

WebUI.takeScreenshot()

"Step 3: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/td_object'))

WebUI.takeScreenshot()

"Step 4: Click on span katalonStudioEnterpriseNodeLocked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/span_katalonStudioEnterpriseNodeLocked'))

WebUI.takeScreenshot()

"Step 5: Click on td object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/td_object2'))

WebUI.takeScreenshot()

"Step 6: Click on link subscribe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_subscribe'))

WebUI.takeScreenshot()

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC84-Subscribe to Katalon Studio Licenses_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}