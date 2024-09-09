import katalon.common.scheduleTestRunWithSuitesAndEnvironments
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*/grid"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid")

"Step 4: Click on link viewUntitledTestRun -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_viewUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on link viewUntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 5: Click on link 10 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_10'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on link 10 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link 8 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_8'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on link 8 - Navigate to page teamprojectgridplanjob.png')

"Step 7: Click on link calendar -> Navigate to page 'team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on link calendar - Navigate to page teamprojecttest-planning.png')

"Step 8: Click on item calendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/item_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on item calendar.png')

"Step 9: Click on link history -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Click on link history - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on div parallelSuite751.png')

"Step 11: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Click on button showMore.png')

"Step 12: Click on button object4 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on button object4 - Navigate to page teamprojectexecutionstest-result.png')

"Step 13: Click on div thumbnailImage -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on div thumbnailImage - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on button object3.png')

"Step 15: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 16: Click on link settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_settings_1'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on link settings - Navigate to page teamprojectsettings.png')

"Step 17: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on link scriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 18: Click on link ehsTestAutomationGit -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_ehsTestAutomationGit'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 18-Click on link ehsTestAutomationGit - Navigate to page teamprojecttest-project.png')

"Step 19: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 19-Click on button refreshScriptRepository.png')

"Step 20: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 20-Click on button refreshScriptRepository.png')

"Step 21: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 21-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on div testCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 22-Click on div testCases.png')

"Step 23: Click on link indi1040Ss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_indi1040Ss'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 23-Click on link indi1040Ss.png')

"Step 24: Click on tr selectFailedIndi1040Ss11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/tr_selectFailedIndi1040Ss11'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 24-Click on tr selectFailedIndi1040Ss11.png')

"Step 25: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 25-Click on div object.png')

"Step 26: Click on link executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 26-Click on link executions.png')

"Step 27: Schedule a test run with selected test suites and environments"

scheduleTestRunWithSuitesAndEnvironments.execute(data_path_0, Integer.valueOf(index_0))

"Step 28: Click on link viewUntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_viewUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 28-Click on link viewUntitledTestRun.png')

"Step 29: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 29-Click on div parallelSuite751.png')

"Step 30: Click on div parallelSuite750"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object17'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 30-Click on div parallelSuite750.png')

"Step 31: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 31-Click on button showMore.png')

"Step 32: Click on div indi1040Ss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_indi1040Ss'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 32-Click on div indi1040Ss.png')

"Step 33: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 33-Click on div elementClickIntercepted.png')

"Step 34: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 34-Click on div elementClickIntercepted.png')

"Step 35: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 35-Click on div elementClickIntercepted.png')

"Step 36: Click on div parallelSuite750"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object17'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 36-Click on div parallelSuite750.png')

"Step 37: Click on div parallelSuite750"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object17'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 37-Click on div parallelSuite750.png')

"Step 38: Click on button object4 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 38-Click on button object4 - Navigate to page teamprojectexecutionstest-result.png')

"Step 39: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 39-Click on pre elementClickInterceptedNth0.png')

"Step 40: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 40-Click on pre elementClickInterceptedNth0.png')

"Step 41: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 41-Click on pre elementClickInterceptedNth0.png')

"Step 42: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 42-Click on pre elementClickInterceptedNth0.png')

"Step 43: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 43-Click on pre elementClickInterceptedNth0.png')

"Step 44: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/image_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 44-Click on image object.png')

"Step 45: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/image_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 45-Click on image object.png')

"Step 46: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/image_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 46-Click on image object.png')

"Step 47: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 47-Click on button close.png')

"Step 48: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 48-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 49: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 49-Click on div parallelSuite751.png')

"Step 50: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 50-Click on button showMore.png')

"Step 51: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 51-Click on button object3.png')

"Step 52: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 52-Click on div parallelSuite751.png')

"Step 53: Click on header untitledTestRun285"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/header_untitledTestRun285'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 53-Click on header untitledTestRun285.png')

"Step 54: Click on header untitledTestRun285"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/header_untitledTestRun285'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 54-Click on header untitledTestRun285.png')

"Step 55: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 55-Click on div parallelSuite751.png')

"Step 56: Click on button object4 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 56-Click on button object4 - Navigate to page teamprojectexecutionstest-result.png')

"Step 57: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 57-Click on div thumbnailImage.png')

"Step 58: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 58-Click on button close.png')

"Step 59: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 59-Click on div object.png')

"Step 60: Click on input failureReasonSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/input_failureReasonSelect'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 60-Click on input failureReasonSelect.png')

"Step 61: Click on div failureReasonBetaThis"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_failureReasonBetaThis'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 61-Click on div failureReasonBetaThis.png')

"Step 62: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 62-Click on span object.png')

"Step 63: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 63-Click on div object2.png')

"Step 64: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 64-Click on div thumbnailImage.png')

"Step 65: Click on button close -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 65-Click on button close - Navigate to page teamprojecttest-runs.png')

"Step 66: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 66-Click on button object3.png')

"Step 67: Schedule a test run with selected test suites and environments"

scheduleTestRunWithSuitesAndEnvironments.execute(data_path_1, Integer.valueOf(index_1))

"Step 68: Click on header edgeOpen1040Sstest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/header_edgeOpen1040Sstest'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 68-Click on header edgeOpen1040Sstest.png')

"Step 69: Click on div edgeOpen1040Sstest12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_edgeOpen1040Sstest12'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 69-Click on div edgeOpen1040Sstest12.png')

"Step 70: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 70-Click on button object2.png')

"Step 71: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 71-Click on button object.png')

"Step 72: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 72-Click on div parallelSuite751.png')

"Step 73: Click on div edgeOpen1040Sstest122"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_edgeOpen1040Sstest122'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 73-Click on div edgeOpen1040Sstest122.png')

"Step 74: Click on div edgeOpen1040Sstest123"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_edgeOpen1040Sstest123'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 74-Click on div edgeOpen1040Sstest123.png')

"Step 75: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 75-Click on div parallelSuite751.png')

"Step 76: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 76-Click on button object.png')

"Step 77: Click on link schedules -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_schedules'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 77-Click on link schedules - Navigate to page teamprojectgrid.png')

"Step 78: Click on link viewUntitledTestRun -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_viewUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 78-Click on link viewUntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 79: Click on div edgeOpen1040Sstest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_edgeOpen1040Sstest'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 79-Click on div edgeOpen1040Sstest.png')

"Step 80: Click on link 10 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_10'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 80-Click on link 10 - Navigate to page teamprojectexecutions.png')

"Step 81: Click on link 8 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_8'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 81-Click on link 8 - Navigate to page teamprojectgridplanjob.png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Schedule Test Runs and Verify Execution in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}