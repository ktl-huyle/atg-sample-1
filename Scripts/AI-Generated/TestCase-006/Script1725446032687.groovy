import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import katalon.common.actionSequence_1


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to user/apikey"

TrueTestScripts.navigate("user/apikey")

"Step 2: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object3'))

WebUI.takeScreenshot()

"Step 3: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object4'))

WebUI.takeScreenshot()

"Step 4: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object2'))

WebUI.takeScreenshot()

"Step 5: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object5'))

WebUI.takeScreenshot()

"Step 6: Call function actionSequence 1"

actionSequence_1.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object6'))

WebUI.takeScreenshot()

"Step 8: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object2'))

WebUI.takeScreenshot()

"Step 9: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_object5'))

WebUI.takeScreenshot()

"Step 10: Click on button nidhiKachhadiya"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_nidhiKachhadiya'))

WebUI.takeScreenshot()

"Step 11: Click on link logout -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/link_logout'))

WebUI.takeScreenshot()

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-006_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}