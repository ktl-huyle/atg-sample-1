import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to user/settings"

TrueTestScripts.navigate("user/settings")

"Step 4: Click on link KatalonStudioLicenses -> Navigate to page 'user/license'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_KatalonStudioLicenses'))

WebUI.takeScreenshot(reportLocation + '/TC87/Step 4-Click on link KatalonStudioLicenses - Navigate to page userlicense.png')

"Step 5: Click on td licenseStatus (KSENodeLocked)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_license/td_licenseStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_license/td_licenseStatus', ['td_licenseStatus_nth': td_licenseStatus_nth]))

WebUI.takeScreenshot(reportLocation + '/TC87/Step 5-Click on td licenseStatus KSENodeLocked.png')

"Step 6: Click on span KSENodeLocked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/span_KSENodeLocked'))

WebUI.takeScreenshot(reportLocation + '/TC87/Step 6-Click on span KSENodeLocked.png')

"Step 7: Click on td licenseStatus (KSENodeLocked2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_license/td_licenseStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_license/td_licenseStatus', ['td_licenseStatus_nth': td_licenseStatus_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC87/Step 7-Click on td licenseStatus KSENodeLocked2.png')

"Step 8: Click on link Subscribe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/license?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_license/link_Subscribe'))

WebUI.takeScreenshot(reportLocation + '/TC87/Step 8-Click on link Subscribe - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC87-Manage Katalon Studio Licenses_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}