import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import truetest.common.createApiKeyForTesting
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to user/*"

TrueTestScripts.navigate("user/${GlobalVariable.user_id}")

"Step 2: Create a new API key for testing purposes"

createApiKeyForTesting.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_ActionButton'))

WebUI.takeScreenshot()

"Step 4: Click on button ShowApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_ShowApiKey'))

WebUI.takeScreenshot()

"Step 5: Click on input ApiKeyTextbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/input_ApiKeyTextbox'))

WebUI.takeScreenshot()

"Step 6: Click on input PasswordField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/input_PasswordField'))

WebUI.takeScreenshot()

"Step 7: Click on button CopyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_CopyToClipboard'))

WebUI.takeScreenshot()

"Step 8: Click on button UserProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_UserProfile'))

WebUI.takeScreenshot()

"Step 9: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_SignOut'))

WebUI.takeScreenshot()

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Create and Manage API Keys for Testing_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}