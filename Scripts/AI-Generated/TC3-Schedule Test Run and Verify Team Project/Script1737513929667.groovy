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

"Step 2: Click on div testRunDetails (APIMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on div testRunDetails APIMediaFiles.png')

"Step 3: Click on div sortOptions (SortIDDescending)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_sortOptions', ['div_sortOptions_internalHasText': div_sortOptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on div sortOptions SortIDDescending.png')

"Step 4: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button CloseButton.png')

"Step 5: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button ScheduleTestRun.png')

"Step 6: Click on div SelectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_SelectEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on div SelectEnvironment.png')

"Step 7: Click on div AdvancedSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_AdvancedSettings'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on div AdvancedSettings.png')

"Step 8: Click on div ScheduleAtStart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ScheduleAtStart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on div ScheduleAtStart.png')

"Step 9: Click on div ExecutionProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ExecutionProfile'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on div ExecutionProfile.png')

"Step 10: Click on div DefaultProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_DefaultProfile'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on div DefaultProfile.png')

"Step 11: Click on div TestSuitesProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestSuitesProduct'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on div TestSuitesProduct.png')

"Step 12: Click on div TestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on div TestSuite.png')

"Step 13: Click on link RefreshTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_RefreshTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on link RefreshTestSuite.png')

"Step 14: Click on div TestSuiteValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestSuiteValue'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on div TestSuiteValue.png')

"Step 15: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on button CloseDialog.png')

"Step 16: Click on link Settings -> Navigate to page 'settings#team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on link Settings - Navigate to page settingsteamprojectsettings.png')

"Step 17: Click on link ScriptRepositories -> Navigate to page 'team project#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/link_ScriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on link ScriptRepositories - Navigate to page team projectteamproject.png')

"Step 18: Click on link KatalonWebsite -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_KatalonWebsite'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on link KatalonWebsite - Navigate to page team project detailsteamproject.png')

"Step 19: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on button RefreshScriptRepository.png')

"Step 20: Click on link Dashboard -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 21: Click on link Executions -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Click on link Executions - Navigate to page team project detailteamproject.png')

"Step 22: Click on link Settings -> Navigate to page 'settings#team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Click on link Settings - Navigate to page settingsteamprojectsettings.png')

"Step 23: Click on link ScriptRepositories -> Navigate to page 'team project#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/link_ScriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Click on link ScriptRepositories - Navigate to page team projectteamproject.png')

"Step 24: Click on td KatalonWebsite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_KatalonWebsite'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 24-Click on td KatalonWebsite.png')

"Step 25: Click on link KatalonWebsite -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_KatalonWebsite'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 25-Click on link KatalonWebsite - Navigate to page team project detailsteamproject.png')

"Step 26: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 26-Click on button RefreshScriptRepository.png')

"Step 27: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 27-Click on button RefreshScriptRepository.png')

"Step 28: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 28-Click on button RefreshScriptRepository.png')

"Step 29: Click on link Dashboard -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 29-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Schedule Test Run and Verify Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}