import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.confirmDeleteAction
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

"Step 3: Navigate to /team/*/project/*"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Settings2 -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 4-Click on link Settings2 - Navigate to page teamprojectsettings.png')

"Step 5: Click on link Executions2 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 5-Click on link Executions2 - Navigate to page teamprojecttest-runs.png')

"Step 6: Click on link Schedules2 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 6-Click on link Schedules2 - Navigate to page teamprojectgrid.png')

"Step 7: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 7-Click on input Search.png')

"Step 8: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC127/Step 8-Enter input value in input Search.png')

"Step 9: Click on link testRunLinks (token manager) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 9-Click on link testRunLinks token manager - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on link configurationLinks (Configuration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 10-Click on link configurationLinks Configuration.png')

"Step 11: Confirm deletion of an item with a specified number"

confirmDeleteAction.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 12-Click on input Search.png')

"Step 13: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC127/Step 13-Enter input value in input Search.png')

"Step 14: Click on link testRunLinks (Test Service ala ala) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 14-Click on link testRunLinks Test Service ala ala - Navigate to page teamprojectgridplanjob.png')

"Step 15: Click on link configurationLinks (Configuration2) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_1, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 15-Click on link configurationLinks Configuration2 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 16: Click on p ConfigType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/p_ConfigType'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 16-Click on p ConfigType.png')

"Step 17: Click on p ConfigType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/p_ConfigType'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 17-Click on p ConfigType.png')

"Step 18: Click on link Schedules -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 18-Click on link Schedules - Navigate to page teamprojectgrid.png')

"Step 19: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 19-Click on input Search.png')

"Step 20: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC127/Step 20-Enter input value in input Search.png')

"Step 21: Click on link testRunLinks (token manager2) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 21-Click on link testRunLinks token manager2 - Navigate to page teamprojectgridplanjob.png')

"Step 22: Click on link configurationLinks (Configuration3) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_2, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 22-Click on link configurationLinks Configuration3 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 23: Click on link Sessions -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 23-Click on link Sessions - Navigate to page teamprojectgridplanjobsession.png')

"Step 24: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 24-Click on button Run.png')

"Step 25: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 25-Click on div Backdrop.png')

"Step 26: Click on link Configuration -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/link_Configuration'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 26-Click on link Configuration - Navigate to page teamprojectgridplanjobsummary.png')

"Step 27: Click on link testRunLinks (TestRuns) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 27-Click on link testRunLinks TestRuns - Navigate to page teamprojectgridplanjob.png')

"Step 28: Click on link configurationLinks (Configuration3) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_3, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 28-Click on link configurationLinks Configuration3 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 29: Click on link Sessions -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 29-Click on link Sessions - Navigate to page teamprojectgridplanjobsession.png')

"Step 30: Click on link Configuration -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/link_Configuration'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 30-Click on link Configuration - Navigate to page teamprojectgridplanjobsummary.png')

"Step 31: Click on link testRunLinks (TestRuns) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 31-Click on link testRunLinks TestRuns - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on link configurationLinks (Configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_4, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 32-Click on link configurationLinks Configuration3.png')

"Step 33: Click on link Schedules -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 33-Click on link Schedules - Navigate to page teamprojectgrid.png')

"Step 34: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 34-Click on input Search.png')

"Step 35: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC127/Step 35-Enter input value in input Search.png')

"Step 36: Click on link testRunLinks (Test Service ala ala) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_2, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 36-Click on link testRunLinks Test Service ala ala - Navigate to page teamprojectgridplanjob.png')

"Step 37: Click on link executionDetails (ProjectExecution) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 37-Click on link executionDetails ProjectExecution - Navigate to page teamprojectexecutions.png')

"Step 38: Click on link TestResults2 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults2'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 38-Click on link TestResults2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 39: Click on th Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/th_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 39-Click on th Summary.png')

"Step 40: Click on th Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/th_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 40-Click on th Summary.png')

"Step 41: Click on div ReviewStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ReviewStatus'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 41-Click on div ReviewStatus.png')

"Step 42: Click on link Files -> Navigate to page '/team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 42-Click on link Files - Navigate to page teamprojectexecutionsfiles.png')

"Step 43: Click on link TestResults -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 43-Click on link TestResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 44: Click on link Summary -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 44-Click on link Summary - Navigate to page teamprojectexecutions.png')

"Step 45: Click on link TestResults2 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults2'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 45-Click on link TestResults2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 46: Click on link Summary -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 46-Click on link Summary - Navigate to page teamprojectexecutions.png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC127-Manage Test Runs and Sessions in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}