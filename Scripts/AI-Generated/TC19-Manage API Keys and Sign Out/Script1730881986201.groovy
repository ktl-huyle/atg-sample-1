import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import truetest.common.createApiKeyForAccess
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to user/*"

TrueTestScripts.navigate("user/${GlobalVariable.user_id}")

"Step 2: Click on button apiKeyAction (ActionButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyAction', ['button_apiKeyAction_trNthChild': button_apiKeyAction_trNthChild]))

WebUI.takeScreenshot()

"Step 3: Click on button apiKeyAction (ShowApiKey2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyAction', ['button_apiKeyAction_trNthChild': button_apiKeyAction_trNthChild_1]))

WebUI.takeScreenshot()

"Step 4: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot()

"Step 5: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_Close'))

WebUI.takeScreenshot()

"Step 6: Create a new API key for application access"

createApiKeyForAccess.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on button apiKeyAction (ShowApiKey3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyAction', ['button_apiKeyAction_trNthChild': button_apiKeyAction_trNthChild_2]))

WebUI.takeScreenshot()

"Step 8: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot()

"Step 9: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_Close'))

WebUI.takeScreenshot()

"Step 10: Click on button UserProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_UserProfile'))

WebUI.takeScreenshot()

"Step 11: Click on link SignOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_SignOut'))

WebUI.takeScreenshot()

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Manage API Keys and Sign Out_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}