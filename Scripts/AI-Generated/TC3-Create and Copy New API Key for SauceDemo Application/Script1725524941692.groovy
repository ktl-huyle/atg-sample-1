import katalon.common.createApiKeyForSauceDemo
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to user/apikey"

TrueTestScripts.navigate("user/apikey")

"Step 2: Create a new API key for SauceDemo application"

createApiKeyForSauceDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object'))

WebUI.takeScreenshot()

"Step 4: Click on button showApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_showApiKey'))

WebUI.takeScreenshot()

"Step 5: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/input_object'))

WebUI.takeScreenshot()

"Step 6: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/input_object'))

WebUI.takeScreenshot()

"Step 7: Click on button copyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_copyToClipboard'))

WebUI.takeScreenshot()

"Step 8: Click on button nk"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_nk'))

WebUI.takeScreenshot()

"Step 9: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/link_signOut'))

WebUI.takeScreenshot()

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Create and Copy New API Key for SauceDemo Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}