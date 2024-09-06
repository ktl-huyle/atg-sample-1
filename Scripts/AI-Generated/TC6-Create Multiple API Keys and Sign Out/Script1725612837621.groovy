import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.createNewApiKey
import internal.GlobalVariable


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to user/apikey"

TrueTestScripts.navigate("user/apikey")

"Step 2: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object2'))

WebUI.takeScreenshot()

"Step 3: Click on button showApiKey2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_showApiKey2'))

WebUI.takeScreenshot()

"Step 4: Click on button copyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_copyToClipboard'))

WebUI.takeScreenshot()

"Step 5: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object3'))

WebUI.takeScreenshot()

"Step 6: Create a new API key with specified name"

createNewApiKey.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on button showApiKey3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_showApiKey3'))

WebUI.takeScreenshot()

"Step 8: Click on button copyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_copyToClipboard'))

WebUI.takeScreenshot()

"Step 9: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object3'))

WebUI.takeScreenshot()

"Step 10: Click on button nk"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_nk'))

WebUI.takeScreenshot()

"Step 11: Click on link signOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/link_signOut'))

WebUI.takeScreenshot()

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Create Multiple API Keys and Sign Out_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}