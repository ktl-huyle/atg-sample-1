import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div qualityRoles (QualityEngineer2) -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_welcome/div_qualityRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_welcome/div_qualityRoles', ['div_qualityRoles_nthChild': div_qualityRoles_nthChild, 'div_qualityRoles_internalHasText': div_qualityRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC183/Step 4-Click on div qualityRoles QualityEngineer2 - Navigate to page teamprojectsettings.png')

"Step 5: Click on div UserflowModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_UserflowModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC183/Step 5-Click on div UserflowModalBackdrop.png')

"Step 6: Click on button PO"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_PO'))

WebUI.takeScreenshot(reportLocation + '/TC183/Step 6-Click on button PO.png')

"Step 7: Click on link UserSettings -> Navigate to page '/user/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_UserSettings'))

WebUI.takeScreenshot(reportLocation + '/TC183/Step 7-Click on link UserSettings - Navigate to page usersettings.png')

"Step 8: Click on button userActions (PO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_settings/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_settings/button_userActions', ['button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC183/Step 8-Click on button userActions PO.png')

"Step 9: Click on link ViewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_ViewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC183/Step 9-Click on link ViewProfile.png')

"Step 10: Click on div Backdrop -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC183/Step 10-Click on div Backdrop - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC183-Access User Settings from Welcome Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}