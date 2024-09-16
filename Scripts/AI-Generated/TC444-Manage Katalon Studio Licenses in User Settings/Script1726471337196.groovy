import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

WebUI.takeScreenshot(reportLocation + '/TC444/Step 4-Click on link katalonStudioLicenses - Navigate to page userlicense.png')

"Step 5: Click on td licenseDetails (kseNodeLocked)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_license/td_licenseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_license/td_licenseDetails', ['td_licenseDetails_nth': td_licenseDetails_nth]))

WebUI.takeScreenshot(reportLocation + '/TC444/Step 5-Click on td licenseDetails kseNodeLocked.png')

"Step 6: Click on span kseNodeLocked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/span_kseNodeLocked'))

WebUI.takeScreenshot(reportLocation + '/TC444/Step 6-Click on span kseNodeLocked.png')

"Step 7: Click on td licenseDetails (kseNodeLocked2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_license/td_licenseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_license/td_licenseDetails', ['td_licenseDetails_nth': td_licenseDetails_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC444/Step 7-Click on td licenseDetails kseNodeLocked2.png')

"Step 8: Click on link subscribe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/link_subscribe'))

WebUI.takeScreenshot(reportLocation + '/TC444/Step 8-Click on link subscribe - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC444-Manage Katalon Studio Licenses in User Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}