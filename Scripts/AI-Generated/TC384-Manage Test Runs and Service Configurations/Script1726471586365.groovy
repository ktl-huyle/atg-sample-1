import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.deleteTestRun

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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link settings3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings3'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 4-Click on link settings3 - Navigate to page teamproject.png')

"Step 5: Click on link executions5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions5'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 5-Click on link executions5.png')

"Step 6: Click on link projectNavigation (schedules)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 6-Click on link projectNavigation schedules.png')

"Step 7: Click on link tokenManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 7-Click on link tokenManager.png')

"Step 8: Enter input value in link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/link_configuration'), link_configuration)

WebUI.takeScreenshot(reportLocation + '/TC384/Step 8-Enter input value in link configuration.png')

"Step 9: Click on link tokenManager -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 9-Click on link tokenManager - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on link configurationSessions (configuration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName, 'link_configurationSessions_team_id': link_configurationSessions_team_id, 'link_configurationSessions_job_id': link_configurationSessions_job_id, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id, 'link_configurationSessions_project_id': link_configurationSessions_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 10-Click on link configurationSessions configuration.png')

"Step 11: Delete a specified test run from the project."

deleteTestRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Click on link tokenManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 12-Click on link tokenManager.png')

"Step 13: Enter input value in link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/link_configuration'), link_configuration)

WebUI.takeScreenshot(reportLocation + '/TC384/Step 13-Enter input value in link configuration.png')

"Step 14: Click on link testServiceRuns (testService) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_trNthChild': link_testServiceRuns_trNthChild, 'link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 14-Click on link testServiceRuns testService - Navigate to page teamprojectgridplanjob.png')

"Step 15: Click on link configurationSessions (configuration2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_1, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_1, 'link_configurationSessions_team_id': link_configurationSessions_team_id_1, 'link_configurationSessions_job_id': link_configurationSessions_job_id_1, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_1, 'link_configurationSessions_project_id': link_configurationSessions_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 15-Click on link configurationSessions configuration2 - Navigate to page teamprojectgridplanjob.png')

"Step 16: Click on strong object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/strong_object'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 16-Click on strong object.png')

"Step 17: Click on strong object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/strong_object'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 17-Click on strong object.png')

"Step 18: Click on link scheduleHistory (schedules) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory', ['link_scheduleHistory_internalRoleLinkName': link_scheduleHistory_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 18-Click on link scheduleHistory schedules - Navigate to page teamproject.png')

"Step 19: Click on link tokenManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 19-Click on link tokenManager.png')

"Step 20: Enter input value in link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/link_configuration'), link_configuration)

WebUI.takeScreenshot(reportLocation + '/TC384/Step 20-Enter input value in link configuration.png')

"Step 21: Click on link testServiceRuns (tokenManager2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_trNthChild': link_testServiceRuns_trNthChild_1, 'link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName_1, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id_1, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id_1, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 21-Click on link testServiceRuns tokenManager2 - Navigate to page teamprojectgridplanjob.png')

"Step 22: Click on link configurationSessions (configuration3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_2, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_2, 'link_configurationSessions_team_id': link_configurationSessions_team_id_2, 'link_configurationSessions_job_id': link_configurationSessions_job_id_2, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_2, 'link_configurationSessions_project_id': link_configurationSessions_project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 22-Click on link configurationSessions configuration3 - Navigate to page teamprojectgridplanjob.png')

"Step 23: Click on link configurationSessions (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_3, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_3, 'link_configurationSessions_team_id': link_configurationSessions_team_id_3, 'link_configurationSessions_job_id': link_configurationSessions_job_id_3, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_3, 'link_configurationSessions_project_id': link_configurationSessions_project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 23-Click on link configurationSessions sessions.png')

"Step 24: Click on button run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_run'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 24-Click on button run.png')

"Step 25: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 25-Click on div object.png')

"Step 26: Click on link configurationSessions (configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_4, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_4, 'link_configurationSessions_team_id': link_configurationSessions_team_id_4, 'link_configurationSessions_job_id': link_configurationSessions_job_id_4, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_4, 'link_configurationSessions_project_id': link_configurationSessions_project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 26-Click on link configurationSessions configuration3.png')

"Step 27: Click on link testRunManagement (testRuns) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement', ['link_testRunManagement_nthChild': link_testRunManagement_nthChild, 'link_testRunManagement_internalRoleLinkName': link_testRunManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 27-Click on link testRunManagement testRuns - Navigate to page teamprojectgridplanjob.png')

"Step 28: Click on link configurationSessions (configuration3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_5, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_5, 'link_configurationSessions_team_id': link_configurationSessions_team_id_5, 'link_configurationSessions_job_id': link_configurationSessions_job_id_5, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_5, 'link_configurationSessions_project_id': link_configurationSessions_project_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 28-Click on link configurationSessions configuration3 - Navigate to page teamprojectgridplanjob.png')

"Step 29: Click on link configurationSessions (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_6, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_6, 'link_configurationSessions_team_id': link_configurationSessions_team_id_6, 'link_configurationSessions_job_id': link_configurationSessions_job_id_6, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_6, 'link_configurationSessions_project_id': link_configurationSessions_project_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 29-Click on link configurationSessions sessions.png')

"Step 30: Click on link configurationSessions (configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_7, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_7, 'link_configurationSessions_team_id': link_configurationSessions_team_id_7, 'link_configurationSessions_job_id': link_configurationSessions_job_id_7, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_7, 'link_configurationSessions_project_id': link_configurationSessions_project_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 30-Click on link configurationSessions configuration3.png')

"Step 31: Click on link testRunManagement (testRuns) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement', ['link_testRunManagement_nthChild': link_testRunManagement_nthChild_1, 'link_testRunManagement_internalRoleLinkName': link_testRunManagement_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 31-Click on link testRunManagement testRuns - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on link configurationSessions (configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_8, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_8, 'link_configurationSessions_team_id': link_configurationSessions_team_id_8, 'link_configurationSessions_job_id': link_configurationSessions_job_id_8, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_8, 'link_configurationSessions_project_id': link_configurationSessions_project_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 32-Click on link configurationSessions configuration3.png')

"Step 33: Click on link scheduleHistory (schedules) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory', ['link_scheduleHistory_internalRoleLinkName': link_scheduleHistory_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 33-Click on link scheduleHistory schedules - Navigate to page teamproject.png')

"Step 34: Click on link tokenManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 34-Click on link tokenManager.png')

"Step 35: Enter input value in link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/link_configuration'), link_configuration)

WebUI.takeScreenshot(reportLocation + '/TC384/Step 35-Enter input value in link configuration.png')

"Step 36: Click on link testServiceRuns (testService) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_trNthChild': link_testServiceRuns_trNthChild_2, 'link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName_2, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id_2, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id_2, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 36-Click on link testServiceRuns testService - Navigate to page teamprojectgridplanjob.png')

"Step 37: Click on link executionDetails (executions) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_project_id': link_executionDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 37-Click on link executionDetails executions - Navigate to page teamprojectexecutions.png')

"Step 38: Click on link testResults3 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults3_1'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 38-Click on link testResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 39: Click on th summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/th_summary'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 39-Click on th summary.png')

"Step 40: Click on th summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/th_summary'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 40-Click on th summary.png')

"Step 41: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 41-Click on div object.png')

"Step 42: Click on link files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files_1'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 42-Click on link files - Navigate to page teamprojectexecutionsfiles.png')

"Step 43: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 43-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 44: Click on link summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 44-Click on link summary - Navigate to page teamprojectexecutions.png')

"Step 45: Click on link testResults3 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults3_1'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 45-Click on link testResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 46: Click on link summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary'))

WebUI.takeScreenshot(reportLocation + '/TC384/Step 46-Click on link summary - Navigate to page teamprojectexecutions.png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC384-Manage Test Runs and Service Configurations_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}