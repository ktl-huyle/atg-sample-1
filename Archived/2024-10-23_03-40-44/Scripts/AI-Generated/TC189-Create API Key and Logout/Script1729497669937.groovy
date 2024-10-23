import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.createApiKey

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

"Step 3: Navigate to /user/apikey"

TrueTestScripts.navigate("/user/apikey")

"Step 4: Click on button apiKeyActions (Object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 4-Click on button apiKeyActions Object2.png')

"Step 5: Click on button apiKeyActions (ShowAPIKey)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 5-Click on button apiKeyActions ShowAPIKey.png')

"Step 6: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 6-Click on button copyToClipboard CopyToClipboard.png')

"Step 7: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 7-Click on button Close.png')

"Step 8: Create a new API key with a specified name"

createApiKey.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button apiKeyActions (ShowAPIKey2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 9-Click on button apiKeyActions ShowAPIKey2.png')

"Step 10: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 10-Click on button copyToClipboard CopyToClipboard.png')

"Step 11: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 11-Click on button Close.png')

"Step 12: Click on button NidhiKachhadiya"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_NidhiKachhadiya'))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 12-Click on button NidhiKachhadiya.png')

"Step 13: Click on link SignOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC189/Step 13-Click on link SignOut - Navigate to page logout.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC189-Create API Key and Logout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}