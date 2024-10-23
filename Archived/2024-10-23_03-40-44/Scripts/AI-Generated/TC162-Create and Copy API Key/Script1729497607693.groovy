import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import truetest.common.createApiKey
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 4: Create a new API key with a specified name"

createApiKey.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button apiKeyActions (Object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 5-Click on button apiKeyActions Object.png')

"Step 6: Click on button ShowApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_ShowApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 6-Click on button ShowApiKey.png')

"Step 7: Click on input apiKeyDetails (ApiKeyTextbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/input_apiKeyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 7-Click on input apiKeyDetails ApiKeyTextbox.png')

"Step 8: Click on input apiKeyDetails (Password)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/input_apiKeyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 8-Click on input apiKeyDetails Password.png')

"Step 9: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_apikey/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 9-Click on button copyToClipboard CopyToClipboard.png')

"Step 10: Click on button NidhiKachhadiya"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_NidhiKachhadiya'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 10-Click on button NidhiKachhadiya.png')

"Step 11: Click on link SignOut -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/apikey?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 11-Click on link SignOut - Navigate to page organizationhome.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC162-Create and Copy API Key_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}