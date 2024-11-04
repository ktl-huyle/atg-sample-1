import truetest.custom.TrueTestScripts
import truetest.common.createApiKey
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 4: Create a new API key for application access."

createApiKey.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button apiKeyControls (CellButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls', ['button_apiKeyControls_trNthChild': button_apiKeyControls_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC268/Step 5-Click on button apiKeyControls CellButton.png')

"Step 6: Click on button ShowApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_ShowApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC268/Step 6-Click on button ShowApiKey.png')

"Step 7: Click on input userInputs (TextInput)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/input_userInputs'))

WebUI.takeScreenshot(reportLocation + '/TC268/Step 7-Click on input userInputs TextInput.png')

"Step 8: Click on input userInputs (PasswordInput)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/input_userInputs'))

WebUI.takeScreenshot(reportLocation + '/TC268/Step 8-Click on input userInputs PasswordInput.png')

"Step 9: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC268/Step 9-Click on button copyToClipboard CopyToClipboard.png')

"Step 10: Click on button NidhiKachhadiya"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_NidhiKachhadiya'))

WebUI.takeScreenshot(reportLocation + '/TC268/Step 10-Click on button NidhiKachhadiya.png')

"Step 11: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC268/Step 11-Click on link SignOut - Navigate to page organizationhome.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC268-Create API Key for Application Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}