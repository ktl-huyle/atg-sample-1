import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import katalon.common.createApiKey

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

"Step 4: Click on button apiKeyActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 4-Click on button apiKeyActions object.png')

"Step 5: Click on button apiKeyActions (showApikey)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 5-Click on button apiKeyActions showApikey.png')

"Step 6: Click on button copyActions (copyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyActions'))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 6-Click on button copyActions copyToClipboard.png')

"Step 7: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 7-Click on button object2.png')

"Step 8: Create a new API key with specified name."

createApiKey.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on button apiKeyActions (showApikey2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_apiKeyActions', ['button_apiKeyActions_trNthChild': button_apiKeyActions_trNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 9-Click on button apiKeyActions showApikey2.png')

"Step 10: Click on button copyActions (copyToClipboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyActions'))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 10-Click on button copyActions copyToClipboard.png')

"Step 11: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 11-Click on button object2.png')

"Step 12: Click on button nk"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_nk'))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 12-Click on button nk.png')

"Step 13: Click on link signOut -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC345/Step 13-Click on link signOut - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC345-Create and Manage API Keys for User_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}