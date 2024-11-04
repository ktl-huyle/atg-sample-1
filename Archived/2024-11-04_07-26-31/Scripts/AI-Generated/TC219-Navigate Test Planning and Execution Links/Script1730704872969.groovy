import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.scheduleMultipleTestRuns

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

"Step 4: Click on link testRunLinks (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_project_id': link_testRunLinks_project_id, 'link_testRunLinks_plan_id': link_testRunLinks_plan_id, 'link_testRunLinks_team_id': link_testRunLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 4-Click on link testRunLinks UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 5: Click on link executionLinks (TestExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_project_id': link_executionLinks_project_id, 'link_executionLinks_team_id': link_executionLinks_team_id, 'link_executionLinks_executions_id': link_executionLinks_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 5-Click on link executionLinks TestExecution - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link executionLinks (TestExecution) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks_1', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_1, 'link_executionLinks_project_id': link_executionLinks_project_id_1, 'link_executionLinks_job_id': link_executionLinks_job_id, 'link_executionLinks_team_id': link_executionLinks_team_id_1, 'link_executionLinks_plan_id': link_executionLinks_plan_id]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 6-Click on link executionLinks TestExecution - Navigate to page teamprojectgridplanjob.png')

"Step 7: Click on link Calendar -> Navigate to page 'team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Calendar'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 7-Click on link Calendar - Navigate to page teamprojecttest-planning.png')

"Step 8: Click on item Calendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/item_Calendar'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 8-Click on item Calendar.png')

"Step 9: Click on link History -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_History'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 9-Click on link History - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div testRunInfo (UntitledTestRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 10-Click on div testRunInfo UntitledTestRun5.png')

"Step 11: Click on button ShowMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ShowMore'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 11-Click on button ShowMore.png')

"Step 12: Click on button GoToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_GoToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 12-Click on button GoToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 13: Click on div ThumbnailImage3 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 13-Click on div ThumbnailImage3 - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 14-Click on button Close2.png')

"Step 15: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 15-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 16: Click on link Settings2 -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 16-Click on link Settings2 - Navigate to page teamprojectsettings.png')

"Step 17: Click on link ScriptRepositories2 -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories2'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 17-Click on link ScriptRepositories2 - Navigate to page teamprojecttest-project.png')

"Step 18: Click on link testAutomationLinks (KatalonTesting) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks', ['link_testAutomationLinks_trNthChild': link_testAutomationLinks_trNthChild, 'link_testAutomationLinks_internalRoleLinkName': link_testAutomationLinks_internalRoleLinkName, 'link_testAutomationLinks_test_project_id': link_testAutomationLinks_test_project_id, 'link_testAutomationLinks_team_id': link_testAutomationLinks_team_id, 'link_testAutomationLinks_project_id': link_testAutomationLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 18-Click on link testAutomationLinks KatalonTesting - Navigate to page teamprojecttest-project.png')

"Step 19: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 19-Click on button RefreshScriptRepository.png')

"Step 20: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 20-Click on button RefreshScriptRepository.png')

"Step 21: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 21-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on div testCases (TestCases3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 22-Click on div testCases TestCases3.png')

"Step 23: Click on link TestCasesINDI1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestCasesINDI1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 23-Click on link TestCasesINDI1040SS.png')

"Step 24: Click on tr SelectFailedINDI1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/tr_SelectFailedINDI1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 24-Click on tr SelectFailedINDI1040SS.png')

"Step 25: Click on div testCaseSummary (TestCaseSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 25-Click on div testCaseSummary TestCaseSummary.png')

"Step 26: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 26-Click on link Executions3.png')

"Step 27: Schedule multiple test runs with various configurations."

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 28: Click on link ViewUntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ViewUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 28-Click on link ViewUntitledTestRun.png')

"Step 29: Click on div testRunInfo (UntitledTestRun11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 29-Click on div testRunInfo UntitledTestRun11.png')

"Step 30: Click on div testRunInfo (UntitledTestRun10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 30-Click on div testRunInfo UntitledTestRun10.png')

"Step 31: Click on button ShowMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ShowMore'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 31-Click on button ShowMore.png')

"Step 32: Click on div IND1040SS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_IND1040SS'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 32-Click on div IND1040SS.png')

"Step 33: Click on div ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 33-Click on div ElementClickIntercepted.png')

"Step 34: Click on div ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 34-Click on div ElementClickIntercepted.png')

"Step 35: Click on div ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 35-Click on div ElementClickIntercepted.png')

"Step 36: Click on div testRunInfo (UntitledTestRun10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 36-Click on div testRunInfo UntitledTestRun10.png')

"Step 37: Click on div testRunInfo (UntitledTestRun10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 37-Click on div testRunInfo UntitledTestRun10.png')

"Step 38: Click on button GoToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_GoToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 38-Click on button GoToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 39: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 39-Click on pre ElementClickIntercepted.png')

"Step 40: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 40-Click on pre ElementClickIntercepted.png')

"Step 41: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 41-Click on pre ElementClickIntercepted.png')

"Step 42: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 42-Click on pre ElementClickIntercepted.png')

"Step 43: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 43-Click on pre ElementClickIntercepted.png')

"Step 44: Click on image testRunImages (TestRunImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunImages', ['image_testRunImages_internalRoleImgName': image_testRunImages_internalRoleImgName]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 44-Click on image testRunImages TestRunImage.png')

"Step 45: Click on image testRunImages (TestRunImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunImages', ['image_testRunImages_internalRoleImgName': image_testRunImages_internalRoleImgName_1]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 45-Click on image testRunImages TestRunImage.png')

"Step 46: Click on image testRunImages (TestRunImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunImages', ['image_testRunImages_internalRoleImgName': image_testRunImages_internalRoleImgName_2]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 46-Click on image testRunImages TestRunImage.png')

"Step 47: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 47-Click on button Close.png')

"Step 48: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 48-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 49: Click on div testRunInfo (UntitledTestRun112)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_5]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 49-Click on div testRunInfo UntitledTestRun112.png')

"Step 50: Click on button ShowMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ShowMore'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 50-Click on button ShowMore.png')

"Step 51: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 51-Click on button Close2.png')

"Step 52: Click on div testRunInfo (UntitledTestRun112)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_6]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 52-Click on div testRunInfo UntitledTestRun112.png')

"Step 53: Click on header testRuns (UntitledTestRun11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 53-Click on header testRuns UntitledTestRun11.png')

"Step 54: Click on header testRuns (UntitledTestRun11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 54-Click on header testRuns UntitledTestRun11.png')

"Step 55: Click on div testRunInfo (UntitledTestRun112)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_7]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 55-Click on div testRunInfo UntitledTestRun112.png')

"Step 56: Click on button GoToDetails -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_GoToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 56-Click on button GoToDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 57: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 57-Click on div ThumbnailImage3.png')

"Step 58: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 58-Click on button Close.png')

"Step 59: Click on div InputBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_InputBase'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 59-Click on div InputBase.png')

"Step 60: Click on input FailureReasonSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/input_FailureReasonSelect'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 60-Click on input FailureReasonSelect.png')

"Step 61: Click on div FailureReasonBeta"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_FailureReasonBeta'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 61-Click on div FailureReasonBeta.png')

"Step 62: Click on span listenerActions (LogItemContent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_listenerActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_listenerActions', ['span_listenerActions_nthChild': span_listenerActions_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 62-Click on span listenerActions LogItemContent.png')

"Step 63: Click on div ShadowNone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ShadowNone'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 63-Click on div ShadowNone.png')

"Step 64: Click on div thumbnailImages (ThumbnailImage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 64-Click on div thumbnailImages ThumbnailImage2.png')

"Step 65: Click on button Close -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 65-Click on button Close - Navigate to page teamprojecttest-runs.png')

"Step 66: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 66-Click on button Close2.png')

"Step 67: Schedule multiple test runs with various configurations."

scheduleMultipleTestRuns.execute(data_path_1, Integer.valueOf(index_1))

"Step 68: Click on header testRuns (EdgeOpen1040SSTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 68-Click on header testRuns EdgeOpen1040SSTest.png')

"Step 69: Click on div testRunInfo (EdgeOpen1040SSTest12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_8]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 69-Click on div testRunInfo EdgeOpen1040SSTest12.png')

"Step 70: Click on button testRunButton (TestRunButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_testRunButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_testRunButton', ['button_testRunButton_class': button_testRunButton_class]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 70-Click on button testRunButton TestRunButton.png')

"Step 71: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 71-Click on button Close.png')

"Step 72: Click on div testRunInfo (EdgeOpen1040SSTest122)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_9]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 72-Click on div testRunInfo EdgeOpen1040SSTest122.png')

"Step 73: Click on div EdgeOpen1040SSTestImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_EdgeOpen1040SSTestImage'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 73-Click on div EdgeOpen1040SSTestImage.png')

"Step 74: Click on div PersonIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_PersonIcon'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 74-Click on div PersonIcon.png')

"Step 75: Click on div testRunInfo (EdgeOpen1040SSTest122)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_10]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 75-Click on div testRunInfo EdgeOpen1040SSTest122.png')

"Step 76: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 76-Click on button Close.png')

"Step 77: Click on link Schedules -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules_1'))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 77-Click on link Schedules - Navigate to page teamprojectgrid.png')

"Step 78: Click on link testRunLinks (EdgeOpen1040SSTest) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_1, 'link_testRunLinks_project_id': link_testRunLinks_project_id_1, 'link_testRunLinks_plan_id': link_testRunLinks_plan_id_1, 'link_testRunLinks_team_id': link_testRunLinks_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 78-Click on link testRunLinks EdgeOpen1040SSTest - Navigate to page teamprojectgridplanjob.png')

"Step 79: Click on div testRunLinks (EdgeOpen1040SSTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunLinks', ['div_testRunLinks_internalText': div_testRunLinks_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 79-Click on div testRunLinks EdgeOpen1040SSTest.png')

"Step 80: Click on link executionLinks (Execution12) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_2, 'link_executionLinks_project_id': link_executionLinks_project_id_2, 'link_executionLinks_team_id': link_executionLinks_team_id_2, 'link_executionLinks_executions_id': link_executionLinks_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 80-Click on link executionLinks Execution12 - Navigate to page teamprojectexecutions.png')

"Step 81: Click on link executionLinks (Execution10) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks_1', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_3, 'link_executionLinks_project_id': link_executionLinks_project_id_3, 'link_executionLinks_job_id': link_executionLinks_job_id_1, 'link_executionLinks_team_id': link_executionLinks_team_id_3, 'link_executionLinks_plan_id': link_executionLinks_plan_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC219/Step 81-Click on link executionLinks Execution10 - Navigate to page teamprojectgridplanjob.png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC219-Navigate Test Planning and Execution Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}