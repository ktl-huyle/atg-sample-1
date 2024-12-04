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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/grid"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid")

"Step 4: Click on link dynamicObject (UntitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'plan_id': plan_id, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on link dynamicObject UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 5: Click on link executionDetails (ExecutionDetails4) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id_1, 'executions_id': executions_id, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on link executionDetails ExecutionDetails4 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link executionDetails (execution8) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'plan_id': plan_id_1, 'team_id': team_id_2, 'project_id': project_id_2, 'job_id': job_id]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on link executionDetails execution8 - Navigate to page teamprojectgridplanjob.png')

"Step 7: Click on link calendar -> Navigate to page 'team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on link calendar - Navigate to page teamprojecttest-planning.png')

"Step 8: Click on item calendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/item_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on item calendar.png')

"Step 9: Click on link history -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on link history - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div testRunItems (untitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on div testRunItems untitledTestRun.png')

"Step 11: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 11-Click on button showMore.png')

"Step 12: Click on button goToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_goToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 12-Click on button goToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 13: Click on div thumbnailImage -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 13-Click on div thumbnailImage - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on button Details"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 14-Click on button Details.png')

"Step 15: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 15-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 16: Click on link settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 16-Click on link settings - Navigate to page teamprojectsettings.png')

"Step 17: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories_1'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 17-Click on link scriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 18: Click on link testProjects (katalonTesting) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects', ['link_testProjects_trNthChild': link_testProjects_trNthChild, 'link_testProjects_internalRoleLinkName': link_testProjects_internalRoleLinkName, 'team_id': team_id_3, 'test_project_id': test_project_id, 'project_id': project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 18-Click on link testProjects katalonTesting - Navigate to page teamprojecttest-project.png')

"Step 19: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 19-Click on button RefreshScriptRepository.png')

"Step 20: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 20-Click on button RefreshScriptRepository.png')

"Step 21: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 21-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on div testCases (TestCases9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 22-Click on div testCases TestCases9.png')

"Step 23: Click on link indi1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_indi1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 23-Click on link indi1040SS.png')

"Step 24: Click on tr failedIndi1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/tr_failedIndi1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 24-Click on tr failedIndi1040SS.png')

"Step 25: Click on div testCaseSummary (TestCaseSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseSummary'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 25-Click on div testCaseSummary TestCaseSummary.png')

"Step 26: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 26-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 27: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 27-Click on button ScheduleTestRun.png')

"Step 28: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 28-Click on div testSuites.png')

"Step 29: Click on div testSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 29-Click on div testSuites2.png')

"Step 30: Click on div TestSuiteControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteControl'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 30-Click on div TestSuiteControl.png')

"Step 31: Click on div testSuites3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites3'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 31-Click on div testSuites3.png')

"Step 32: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 32-Click on div SelectEnvironment2.png')

"Step 33: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 33-Click on item MoreOptions.png')

"Step 34: Click on span ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 34-Click on span ChromeHeadless.png')

"Step 35: Click on div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 35-Click on div Object.png')

"Step 36: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 36-Click on button Save3.png')

"Step 37: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 37-Click on button Run.png')

"Step 38: Click on link viewUntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_viewUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 38-Click on link viewUntitledTestRun.png')

"Step 39: Click on div testRunItems (untitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 39-Click on div testRunItems untitledTestRun2.png')

"Step 40: Click on div testRunItems (untitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 40-Click on div testRunItems untitledTestRun3.png')

"Step 41: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 41-Click on button showMore.png')

"Step 42: Click on div indi1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_indi1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 42-Click on div indi1040SS.png')

"Step 43: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 43-Click on div elementClickIntercepted.png')

"Step 44: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 44-Click on div elementClickIntercepted.png')

"Step 45: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 45-Click on div elementClickIntercepted.png')

"Step 46: Click on div testRunItems (untitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 46-Click on div testRunItems untitledTestRun3.png')

"Step 47: Click on div testRunItems (untitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 47-Click on div testRunItems untitledTestRun3.png')

"Step 48: Click on button goToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_goToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 48-Click on button goToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 49: Click on pre elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 49-Click on pre elementClickIntercepted.png')

"Step 50: Click on pre elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 50-Click on pre elementClickIntercepted.png')

"Step 51: Click on pre elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 51-Click on pre elementClickIntercepted.png')

"Step 52: Click on pre elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 52-Click on pre elementClickIntercepted.png')

"Step 53: Click on pre elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 53-Click on pre elementClickIntercepted.png')

"Step 54: Click on image dynamicObject (TestResult)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject', ['image_dynamicObject_internalRoleImgName': image_dynamicObject_internalRoleImgName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 54-Click on image dynamicObject TestResult.png')

"Step 55: Click on image dynamicObject (TestResult)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject', ['image_dynamicObject_internalRoleImgName': image_dynamicObject_internalRoleImgName_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 55-Click on image dynamicObject TestResult.png')

"Step 56: Click on image dynamicObject (TestResult)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject', ['image_dynamicObject_internalRoleImgName': image_dynamicObject_internalRoleImgName_2]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 56-Click on image dynamicObject TestResult.png')

"Step 57: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 57-Click on button close.png')

"Step 58: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 58-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 59: Click on div testRunItems (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_5]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 59-Click on div testRunItems UntitledTestRun4.png')

"Step 60: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 60-Click on button showMore.png')

"Step 61: Click on button Details"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 61-Click on button Details.png')

"Step 62: Click on div testRunItems (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_6]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 62-Click on div testRunItems UntitledTestRun4.png')

"Step 63: Click on header testRun (EPPsAutomationTestCaseRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 63-Click on header testRun EPPsAutomationTestCaseRun5.png')

"Step 64: Click on header testRun (EPPsAutomationTestCaseRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 64-Click on header testRun EPPsAutomationTestCaseRun5.png')

"Step 65: Click on div testRunItems (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_7]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 65-Click on div testRunItems UntitledTestRun4.png')

"Step 66: Click on button goToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_goToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 66-Click on button goToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 67: Click on div thumbnailItems (thumbnailImage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImage', ['div_thumbnailItems_class': div_thumbnailItems_class]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 67-Click on div thumbnailItems thumbnailImage2.png')

"Step 68: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 68-Click on button close.png')

"Step 69: Click on div InputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_InputField'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 69-Click on div InputField.png')

"Step 70: Click on input FailureReasonSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/input_FailureReasonSelect'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 70-Click on input FailureReasonSelect.png')

"Step 71: Click on div FailureReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_FailureReason'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 71-Click on div FailureReason.png')

"Step 72: Click on span logItems (LogItem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 72-Click on span logItems LogItem.png')

"Step 73: Click on div ShadowElement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ShadowElement'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 73-Click on div ShadowElement.png')

"Step 74: Click on div thumbnailItems (Object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImage', ['div_thumbnailItems_class': div_thumbnailItems_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 74-Click on div thumbnailItems Object.png')

"Step 75: Click on button Close -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 75-Click on button Close - Navigate to page teamprojecttest-runs.png')

"Step 76: Click on button Details"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 76-Click on button Details.png')

"Step 77: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 77-Click on button ScheduleTestRun.png')

"Step 78: Click on input Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 78-Click on input Name2.png')

"Step 79: Click on div ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 79-Click on div ScheduleTestRun2.png')

"Step 80: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name2'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC24/Step 80-Enter input value in input Name.png')

"Step 81: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 81-Click on div SelectEnvironment2.png')

"Step 82: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 82-Click on item MoreOptions.png')

"Step 83: Click on span CreatedWithSketchEdge"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_CreatedWithSketchEdge'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 83-Click on span CreatedWithSketchEdge.png')

"Step 84: Click on div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 84-Click on div Object.png')

"Step 85: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 85-Click on button Save3.png')

"Step 86: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 86-Click on button Run.png')

"Step 87: Click on header testRun (EPPsAutomationTestCaseRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 87-Click on header testRun EPPsAutomationTestCaseRun5.png')

"Step 88: Click on div testRunItems (EdgeOpenTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_8]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 88-Click on div testRunItems EdgeOpenTest.png')

"Step 89: Click on button closeActions (Close3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeActions', ['button_closeActions_class': button_closeActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 89-Click on button closeActions Close3.png')

"Step 90: Click on button Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 90-Click on button Object.png')

"Step 91: Click on div testRunItems (EdgeOpenTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_9]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 91-Click on div testRunItems EdgeOpenTest2.png')

"Step 92: Click on div EdgeOpenTestImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_EdgeOpenTestImage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 92-Click on div EdgeOpenTestImage.png')

"Step 93: Click on div PersonIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_PersonIcon'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 93-Click on div PersonIcon.png')

"Step 94: Click on div testRunItems (EdgeOpenTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_10]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 94-Click on div testRunItems EdgeOpenTest2.png')

"Step 95: Click on button Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 95-Click on button Object.png')

"Step 96: Click on link Schedules2 -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 96-Click on link Schedules2 - Navigate to page teamprojectgrid.png')

"Step 97: Click on link dynamicObject (UntitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild_1, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName_1, 'plan_id': plan_id_2, 'team_id': team_id_4, 'project_id': project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 97-Click on link dynamicObject UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 98: Click on div testRun (TestPlanJob)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRun', ['div_testRun_internalText': div_testRun_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 98-Click on div testRun TestPlanJob.png')

"Step 99: Click on link executionDetails (ExecutionDetails4) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_2, 'team_id': team_id_5, 'executions_id': executions_id_1, 'project_id': project_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 99-Click on link executionDetails ExecutionDetails4 - Navigate to page teamprojectexecutions.png')

"Step 100: Click on link executionDetails (TestRunID2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_3, 'plan_id': plan_id_3, 'team_id': team_id_6, 'project_id': project_id_6, 'job_id': job_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 100-Click on link executionDetails TestRunID2 - Navigate to page teamprojectgridplanjob.png')

"Step 101: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Verify Team Project Grid and Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}