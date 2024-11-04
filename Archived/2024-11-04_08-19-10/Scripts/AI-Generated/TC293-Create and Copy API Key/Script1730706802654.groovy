import truetest.common.createApiKey
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

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

"Step 4: Click on button apiKeyControls (CellButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls', ['button_apiKeyControls_trNthChild': button_apiKeyControls_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 4-Click on button apiKeyControls CellButton2.png')

"Step 5: Click on button apiKeyControls (ShowApiKey2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls', ['button_apiKeyControls_trNthChild': button_apiKeyControls_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 5-Click on button apiKeyControls ShowApiKey2.png')

"Step 6: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 6-Click on button copyToClipboard CopyToClipboard.png')

"Step 7: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 7-Click on button Close.png')

"Step 8: Create a new API key for application access."

createApiKey.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button apiKeyControls (ShowApiKey3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyControls', ['button_apiKeyControls_trNthChild': button_apiKeyControls_trNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 9-Click on button apiKeyControls ShowApiKey3.png')

"Step 10: Click on button copyToClipboard (CopyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 10-Click on button copyToClipboard CopyToClipboard.png')

"Step 11: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 11-Click on button Close.png')

"Step 12: Click on button NidhiKachhadiya"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_NidhiKachhadiya'))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 12-Click on button NidhiKachhadiya.png')

"Step 13: Click on link SignOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC293/Step 13-Click on link SignOut - Navigate to page logout.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC293-Create and Copy API Key_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}