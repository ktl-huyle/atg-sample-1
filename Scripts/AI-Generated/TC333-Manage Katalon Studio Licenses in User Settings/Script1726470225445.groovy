import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 3: Navigate to user/settings"

TrueTestScripts.navigate("user/settings")

"Step 4: Click on link katalonStudioLicenses -> Navigate to page 'user/license'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_katalonStudioLicenses'))

WebUI.takeScreenshot(reportLocation + '/TC333/Step 4-Click on link katalonStudioLicenses - Navigate to page userlicense.png')

"Step 5: Click on td dynamicObject (kseNodeLocked)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_license/td_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_license/td_dynamicObject', ['td_dynamicObject_nth': td_dynamicObject_nth]))

WebUI.takeScreenshot(reportLocation + '/TC333/Step 5-Click on td dynamicObject kseNodeLocked.png')

"Step 6: Click on span kseNodeLocked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/span_kseNodeLocked'))

WebUI.takeScreenshot(reportLocation + '/TC333/Step 6-Click on span kseNodeLocked.png')

"Step 7: Click on td dynamicObject (kseNodeLocked2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_license/td_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_license/td_dynamicObject', ['td_dynamicObject_nth': td_dynamicObject_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC333/Step 7-Click on td dynamicObject kseNodeLocked2.png')

"Step 8: Click on link subscribe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/link_subscribe'))

WebUI.takeScreenshot(reportLocation + '/TC333/Step 8-Click on link subscribe - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC333-Manage Katalon Studio Licenses in User Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}