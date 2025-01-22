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

"Step 1: Navigate to user/apikey"

TrueTestScripts.navigate("user/apikey")

"Step 2: Click on button apiKeyManagement (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_management/button_apiKeyManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_management/button_apiKeyManagement', ['button_apiKeyManagement_trNthChild': button_apiKeyManagement_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 2-Click on button apiKeyManagement object.png')

"Step 3: Click on button apiKeyManagement (showApiKey)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_management/button_apiKeyManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_management/button_apiKeyManagement', ['button_apiKeyManagement_trNthChild': button_apiKeyManagement_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Click on button apiKeyManagement showApiKey.png')

"Step 4: Click on button copyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on button copyToClipboard.png')

"Step 5: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on button object2.png')

"Step 6: Click on button createApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/button_createApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on button createApiKey.png')

"Step 7: Click on input keyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/input_keyName'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on input keyName.png')

"Step 8: Enter input value in input keyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_management/input_keyName'), input_keyName)

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Enter input value in input keyName.png')

"Step 9: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Click on button create.png')

"Step 10: Click on button apiKeyManagement (showApiKey2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_management/button_apiKeyManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_management/button_apiKeyManagement', ['button_apiKeyManagement_trNthChild': button_apiKeyManagement_trNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on button apiKeyManagement showApiKey2.png')

"Step 11: Click on button copyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 11-Click on button copyToClipboard.png')

"Step 12: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 12-Click on button object2.png')

"Step 13: Click on button nidhiKachhadiya"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/button_nidhiKachhadiya'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 13-Click on button nidhiKachhadiya.png')

"Step 14: Click on link signOut -> Navigate to page 'user action#logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_management/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 14-Click on link signOut - Navigate to page user actionlogout.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Create and Manage API Key in User Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}