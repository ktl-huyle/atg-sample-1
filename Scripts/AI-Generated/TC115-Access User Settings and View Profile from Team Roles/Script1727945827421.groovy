import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div teamRoles (QualityEngineer2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_welcome/div_teamRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_welcome/div_teamRoles', ['div_teamRoles_nthChild': div_teamRoles_nthChild, 'div_teamRoles_internalHasText': div_teamRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 4-Click on div teamRoles QualityEngineer2 - Navigate to page teamproject.png')

"Step 5: Click on div UserflowModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserflowModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 5-Click on div UserflowModalBackdrop.png')

"Step 6: Click on button dynamicObject (PO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 6-Click on button dynamicObject PO.png')

"Step 7: Click on link UserSettings -> Navigate to page 'user/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UserSettings'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 7-Click on link UserSettings - Navigate to page usersettings.png')

"Step 8: Click on button dynamicObject (PO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_settings/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_settings/button_dynamicObject', ['button_dynamicObject_internalRoleButtonName': button_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 8-Click on button dynamicObject PO.png')

"Step 9: Click on link ViewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_ViewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 9-Click on link ViewProfile.png')

"Step 10: Click on div Backdrop -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 10-Click on div Backdrop - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC115-Access User Settings and View Profile from Team Roles_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}