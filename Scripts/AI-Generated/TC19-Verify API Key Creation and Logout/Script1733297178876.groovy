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

"Step 4: Click on button CreateAPIKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_CreateAPIKey'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on button CreateAPIKey.png')

"Step 5: Click on input KeyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/input_KeyName'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on input KeyName.png')

"Step 6: Enter input value in input KeyName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user/input_KeyName'), input_KeyName2)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Enter input value in input KeyName2.png')

"Step 7: Click on div CancelCreate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/div_CancelCreate'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on div CancelCreate.png')

"Step 8: Click on button Create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_Create'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on button Create.png')

"Step 9: Click on button apiKeyActions (APIKeyCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on button apiKeyActions APIKeyCell.png')

"Step 10: Click on button ShowAPIKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_ShowAPIKey'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Click on button ShowAPIKey.png')

"Step 11: Click on input apiKeyInputs (APIKeyCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/input_apiKeyInputs'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 11-Click on input apiKeyInputs APIKeyCell.png')

"Step 12: Click on input apiKeyInputs (Password)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/input_apiKeyInputs'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 12-Click on input apiKeyInputs Password.png')

"Step 13: Click on button copyActions (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyActions'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 13-Click on button copyActions CopyToClipboard.png')

"Step 14: Click on button NK"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_NK'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 14-Click on button NK.png')

"Step 15: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_SignOut2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 15-Click on link SignOut - Navigate to page organizationhome.png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Verify API Key Creation and Logout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}