import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/grid"

TrueTestScripts.navigate("team/*/project/*/grid")

"Step 4: Click on link testRunLinks (untitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'team_id': team_id, 'plan_id': plan_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 4-Click on link testRunLinks untitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 5: Click on link testRunLinks (execution10) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_1, 'team_id': team_id_1, 'executions_id': executions_id, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 5-Click on link testRunLinks execution10 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link testRunLinks (execution8) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_2, 'team_id': team_id_2, 'plan_id': plan_id_1, 'job_id': job_id, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 6-Click on link testRunLinks execution8 - Navigate to page teamprojectgridplanjob.png')

"Step 7: Click on link calendar -> Navigate to page 'team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 7-Click on link calendar - Navigate to page teamprojecttest-planning.png')

"Step 8: Click on item calendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/item_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 8-Click on item calendar.png')

"Step 9: Click on link history -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 9-Click on link history - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div testRunCells (untitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 10-Click on div testRunCells untitledTestRun.png')

"Step 11: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 11-Click on button showMore.png')

"Step 12: Click on button goToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_goToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 12-Click on button goToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 13: Click on div thumbnailImage -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 13-Click on div thumbnailImage - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 14-Click on button Close.png')

"Step 15: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 15-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 16: Click on link settings2 -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_settings2'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 16-Click on link settings2 - Navigate to page teamprojectsettings.png')

"Step 17: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories_1'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 17-Click on link scriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 18: Click on link testingResources (katalonTesting) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testingResources', ['link_testingResources_trNthChild': link_testingResources_trNthChild, 'link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName, 'team_id': team_id_3, 'test_project_id': test_project_id, 'project_id': project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 18-Click on link testingResources katalonTesting - Navigate to page teamprojecttest-project.png')

"Step 19: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 19-Click on button RefreshScriptRepository.png')

"Step 20: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 20-Click on button RefreshScriptRepository.png')

"Step 21: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 21-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on div testCases (testCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 22-Click on div testCases testCases.png')

"Step 23: Click on link indi1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_indi1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 23-Click on link indi1040SS.png')

"Step 24: Click on tr failedIndi1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/tr_failedIndi1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 24-Click on tr failedIndi1040SS.png')

"Step 25: Click on div testDetails (testSuites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testDetails'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 25-Click on div testDetails testSuites.png')

"Step 26: Click on link executions2 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions2_1'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 26-Click on link executions2 - Navigate to page teamprojecttest-runs.png')

"Step 27: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 27-Click on button ScheduleTestRun.png')

"Step 28: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites_1'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 28-Click on div testSuites.png')

"Step 29: Click on div testSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites2_1'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 29-Click on div testSuites2.png')

"Step 30: Click on div TestSuiteControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteControl'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 30-Click on div TestSuiteControl.png')

"Step 31: Click on div testSuites3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites3'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 31-Click on div testSuites3.png')

"Step 32: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 32-Click on div SelectEnvironment2.png')

"Step 33: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 33-Click on item MoreOptions.png')

"Step 34: Click on span ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 34-Click on span ChromeHeadless.png')

"Step 35: Click on div ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 35-Click on div ChromeHeadless.png')

"Step 36: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 36-Click on button Save3.png')

"Step 37: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 37-Click on button Run.png')

"Step 38: Click on link viewUntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_viewUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 38-Click on link viewUntitledTestRun.png')

"Step 39: Click on div testRunCells (untitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 39-Click on div testRunCells untitledTestRun2.png')

"Step 40: Click on div testRunCells (untitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 40-Click on div testRunCells untitledTestRun3.png')

"Step 41: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 41-Click on button showMore.png')

"Step 42: Click on div indi1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_indi1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 42-Click on div indi1040SS.png')

"Step 43: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 43-Click on div elementClickIntercepted.png')

"Step 44: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 44-Click on div elementClickIntercepted.png')

"Step 45: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 45-Click on div elementClickIntercepted.png')

"Step 46: Click on div testRunCells (untitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 46-Click on div testRunCells untitledTestRun3.png')

"Step 47: Click on div testRunCells (untitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 47-Click on div testRunCells untitledTestRun3.png')

"Step 48: Click on button goToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_goToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 48-Click on button goToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 49: Click on pre elementClick (elementClickIntercepted)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/pre_elementClick'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 49-Click on pre elementClick elementClickIntercepted.png')

"Step 50: Click on pre elementClick (elementClickIntercepted)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/pre_elementClick'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 50-Click on pre elementClick elementClickIntercepted.png')

"Step 51: Click on pre elementClick (elementClickIntercepted)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/pre_elementClick'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 51-Click on pre elementClick elementClickIntercepted.png')

"Step 52: Click on pre elementClick (elementClickIntercepted)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/pre_elementClick'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 52-Click on pre elementClick elementClickIntercepted.png')

"Step 53: Click on pre elementClick (elementClickIntercepted)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/pre_elementClick'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 53-Click on pre elementClick elementClickIntercepted.png')

"Step 54: Click on image testImages (testImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testImages', ['image_testImages_internalRoleImgName': image_testImages_internalRoleImgName]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 54-Click on image testImages testImage.png')

"Step 55: Click on image testImages (testImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testImages', ['image_testImages_internalRoleImgName': image_testImages_internalRoleImgName_1]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 55-Click on image testImages testImage.png')

"Step 56: Click on image testImages (testImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testImages', ['image_testImages_internalRoleImgName': image_testImages_internalRoleImgName_2]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 56-Click on image testImages testImage.png')

"Step 57: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 57-Click on button close.png')

"Step 58: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 58-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 59: Click on div testRunCells (UntitledTestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_5]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 59-Click on div testRunCells UntitledTestRun6.png')

"Step 60: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 60-Click on button showMore.png')

"Step 61: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 61-Click on button Close.png')

"Step 62: Click on div testRunCells (UntitledTestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_6]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 62-Click on div testRunCells UntitledTestRun6.png')

"Step 63: Click on header testRunDetails (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 63-Click on header testRunDetails UntitledTestRun2.png')

"Step 64: Click on header testRunDetails (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 64-Click on header testRunDetails UntitledTestRun2.png')

"Step 65: Click on div testRunCells (UntitledTestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_7]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 65-Click on div testRunCells UntitledTestRun6.png')

"Step 66: Click on button goToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_goToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 66-Click on button goToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 67: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 67-Click on div thumbnailImage.png')

"Step 68: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 68-Click on button close.png')

"Step 69: Click on div InputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_InputField'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 69-Click on div InputField.png')

"Step 70: Click on input FailureReasonSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/input_FailureReasonSelect'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 70-Click on input FailureReasonSelect.png')

"Step 71: Click on div FailureReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_FailureReason'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 71-Click on div FailureReason.png')

"Step 72: Click on span logItems (LogItem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild, 'span_logItems_internalHasText': span_logItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 72-Click on span logItems LogItem.png')

"Step 73: Click on div ShadowElement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ShadowElement'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 73-Click on div ShadowElement.png')

"Step 74: Click on div thumbnailImages (ThumbnailImage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 74-Click on div thumbnailImages ThumbnailImage2.png')

"Step 75: Click on button close -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 75-Click on button close - Navigate to page teamprojecttest-runs.png')

"Step 76: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 76-Click on button Close.png')

"Step 77: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 77-Click on button ScheduleTestRun.png')

"Step 78: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 78-Click on input Name.png')

"Step 79: Click on div ScheduleTestRun3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun3'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 79-Click on div ScheduleTestRun3.png')

"Step 80: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC42/Step 80-Enter input value in input Name.png')

"Step 81: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 81-Click on div SelectEnvironment2.png')

"Step 82: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 82-Click on item MoreOptions.png')

"Step 83: Click on span CreatedWithSketchEdge"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_CreatedWithSketchEdge'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 83-Click on span CreatedWithSketchEdge.png')

"Step 84: Click on div ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 84-Click on div ChromeHeadless.png')

"Step 85: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 85-Click on button Save3.png')

"Step 86: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 86-Click on button Run.png')

"Step 87: Click on header testRunDetails (EdgeOpenTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 87-Click on header testRunDetails EdgeOpenTest.png')

"Step 88: Click on div testRunCells (EdgeOpenTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_8]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 88-Click on div testRunCells EdgeOpenTest.png')

"Step 89: Click on button closeActions (Close6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeActions', ['button_closeActions_class': button_closeActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 89-Click on button closeActions Close6.png')

"Step 90: Click on button Close4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close4'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 90-Click on button Close4.png')

"Step 91: Click on div testRunCells (EdgeOpenTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_9]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 91-Click on div testRunCells EdgeOpenTest2.png')

"Step 92: Click on div edgeOpenTestImages (EdgeOpenTestImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_edgeOpenTestImages'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 92-Click on div edgeOpenTestImages EdgeOpenTestImage.png')

"Step 93: Click on div PersonIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_PersonIcon'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 93-Click on div PersonIcon.png')

"Step 94: Click on div testRunCells (EdgeOpenTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_10]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 94-Click on div testRunCells EdgeOpenTest2.png')

"Step 95: Click on button Close4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close4'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 95-Click on button Close4.png')

"Step 96: Click on link Schedules3 -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules3'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 96-Click on link Schedules3 - Navigate to page teamprojectgrid.png')

"Step 97: Click on link testRunLinks (EdgeOpenTest) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_3, 'team_id': team_id_4, 'plan_id': plan_id_2, 'project_id': project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 97-Click on link testRunLinks EdgeOpenTest - Navigate to page teamprojectgridplanjob.png')

"Step 98: Click on div testRunDetails (EdgeOpenTestTable)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails', ['div_testRunDetails_internalText': div_testRunDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 98-Click on div testRunDetails EdgeOpenTestTable.png')

"Step 99: Click on link testRunLinks (TestRunID) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_4, 'team_id': team_id_5, 'executions_id': executions_id_1, 'project_id': project_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 99-Click on link testRunLinks TestRunID - Navigate to page teamprojectexecutions.png')

"Step 100: Click on link testRunLinks (TestRunID) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_5, 'team_id': team_id_6, 'plan_id': plan_id_3, 'job_id': job_id_1, 'project_id': project_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 100-Click on link testRunLinks TestRunID - Navigate to page teamprojectgridplanjob.png')

"Step 101: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC42-Navigate and Execute Test Runs in Team Project Grid_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}