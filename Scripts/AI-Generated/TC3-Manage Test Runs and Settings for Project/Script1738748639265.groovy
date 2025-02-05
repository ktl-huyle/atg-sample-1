import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 2: Click on div testRunElements (ParallelSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on div testRunElements ParallelSuite.png')

"Step 3: Click on div testRunElements (ParallelSuite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on div testRunElements ParallelSuite2.png')

"Step 4: Click on div testRunElements (ParallelSuite3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on div testRunElements ParallelSuite3.png')

"Step 5: Click on button JobReady"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_JobReady'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button JobReady.png')

"Step 6: Click on div OrganizationButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_OrganizationButton'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on div OrganizationButton.png')

"Step 7: Click on link ViewAllProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link ViewAllProjects.png')

"Step 8: Click on div CurrentReadyTech"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CurrentReadyTech'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on div CurrentReadyTech.png')

"Step 9: Click on link JRJobReady -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_JRJobReady'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on link JRJobReady - Navigate to page team projectteamproject.png')

"Step 10: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on span Settings.png')

"Step 11: Click on link OrganizationManagement -> Navigate to page 'settings#team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link OrganizationManagement - Navigate to page settingsteamprojectsettings.png')

"Step 12: Click on p ReadyCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/p_ReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on p ReadyCase.png')

"Step 13: Click on input UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/input_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on input UserEmail.png')

"Step 14: Enter input value in input UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_settings/input_UserEmail'), input_UserEmail)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Enter input value in input UserEmail.png')

"Step 15: Click on div ProjectProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/div_ProjectProfile'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on div ProjectProfile.png')

"Step 16: Click on input TimezoneConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/input_TimezoneConfig'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on input TimezoneConfig.png')

"Step 17: Click on div EnableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/div_EnableBDDReports'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on div EnableBDDReports.png')

"Step 18: Click on div MuiInputBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/div_MuiInputBase'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on div MuiInputBase.png')

"Step 19: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on span Settings.png')

"Step 20: Click on div MuiBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/div_MuiBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on div MuiBackdrop.png')

"Step 21: Click on div MuiInputBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/div_MuiInputBase'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Click on div MuiInputBase.png')

"Step 22: Enter input value in input UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_settings/input_UserEmail'), input_UserEmail_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Enter input value in input UserEmail.png')

"Step 23: Click on div TeamReadyCase -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/div_TeamReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Click on div TeamReadyCase - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Manage Test Runs and Settings for Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}