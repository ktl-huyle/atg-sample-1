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

"Step 3: Navigate to user/*"

TrueTestScripts.navigate("user/${GlobalVariable.user_id}")

"Step 4: Click on button userAPIKey (UserObject2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_userAPIKey"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_userAPIKey', ['button_userAPIKey_trNthChild': button_userAPIKey_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on button userAPIKey UserObject2.png')

"Step 5: Click on button userAPIKey (ShowAPIKey2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_userAPIKey"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_userAPIKey', ['button_userAPIKey_trNthChild': button_userAPIKey_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on button userAPIKey ShowAPIKey2.png')

"Step 6: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on button copyToClipboard CopyToClipboard.png')

"Step 7: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on button object.png')

"Step 8: Click on button CreateAPIKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_CreateAPIKey'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on button CreateAPIKey.png')

"Step 9: Click on input KeyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/input_KeyName'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on input KeyName.png')

"Step 10: Enter input value in input KeyName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user/input_KeyName'), input_KeyName2)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Enter input value in input KeyName2.png')

"Step 11: Click on button Create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_Create'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on button Create.png')

"Step 12: Click on button userAPIKey (ShowAPIKey3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_userAPIKey"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_userAPIKey', ['button_userAPIKey_trNthChild': button_userAPIKey_trNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on button userAPIKey ShowAPIKey3.png')

"Step 13: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on button copyToClipboard CopyToClipboard.png')

"Step 14: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on button object.png')

"Step 15: Click on button UserProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_UserProfile'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on button UserProfile.png')

"Step 16: Click on link SignOut2 -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_SignOut2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on link SignOut2 - Navigate to page logout.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-API Key Management and Logout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}