import katalon.common.scheduleMultipleTestRuns
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/grid"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid")

"Step 4: Click on link testRunView (viewUntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunView"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunView', ['link_testRunView_team_id': link_testRunView_team_id, 'link_testRunView_plan_id': link_testRunView_plan_id, 'link_testRunView_project_id': link_testRunView_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 4-Click on link testRunView viewUntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 5: Click on link executionLinks (10) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_executions_id': link_executionLinks_executions_id, 'link_executionLinks_project_id': link_executionLinks_project_id, 'link_executionLinks_team_id': link_executionLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 5-Click on link executionLinks 10 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link executionLinks (8) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_1, 'link_executionLinks_plan_id': link_executionLinks_plan_id, 'link_executionLinks_job_id': link_executionLinks_job_id, 'link_executionLinks_project_id': link_executionLinks_project_id_1, 'link_executionLinks_team_id': link_executionLinks_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 6-Click on link executionLinks 8 - Navigate to page teamprojectgridplanjob.png')

"Step 7: Click on link calendar -> Navigate to page 'team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 7-Click on link calendar - Navigate to page teamprojecttest-planning.png')

"Step 8: Click on item calendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/item_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 8-Click on item calendar.png')

"Step 9: Click on link history -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 9-Click on link history - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div testRunItems (untitledTestRun10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 10-Click on div testRunItems untitledTestRun10.png')

"Step 11: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 11-Click on button showMore.png')

"Step 12: Click on button object2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 12-Click on button object2 - Navigate to page teamprojectexecutionstest-result.png')

"Step 13: Click on div thumbnailImage -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 13-Click on div thumbnailImage - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 14-Click on button object.png')

"Step 15: Click on link tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests3'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 15-Click on link tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 16: Click on link settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 16-Click on link settings - Navigate to page teamprojectsettings.png')

"Step 17: Click on link scriptRepositories2 -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories2'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 17-Click on link scriptRepositories2 - Navigate to page teamprojecttest-project.png')

"Step 18: Click on link projectResources (katalonTesting) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_projectResources', ['link_projectResources_trNthChild': link_projectResources_trNthChild, 'link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName, 'link_projectResources_test_project_id': link_projectResources_test_project_id, 'link_projectResources_team_id': link_projectResources_team_id, 'link_projectResources_project_id': link_projectResources_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 18-Click on link projectResources katalonTesting - Navigate to page teamprojecttest-project.png')

"Step 19: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 19-Click on button refreshScriptRepository.png')

"Step 20: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 20-Click on button refreshScriptRepository.png')

"Step 21: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 21-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on div testCaseItems (testCases2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 22-Click on div testCaseItems testCases2.png')

"Step 23: Click on link indi1040Ss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_indi1040Ss'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 23-Click on link indi1040Ss.png')

"Step 24: Click on tr selectFailedIndi1040Ss11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/tr_selectFailedIndi1040Ss11'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 24-Click on tr selectFailedIndi1040Ss11.png')

"Step 25: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 25-Click on div object.png')

"Step 26: Click on link executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 26-Click on link executions2.png')

"Step 27: Schedule multiple test runs with server URL and environment settings."

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 28: Click on link viewUntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_viewUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 28-Click on link viewUntitledTestRun.png')

"Step 29: Click on div testRunItems (untitledTestRun11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 29-Click on div testRunItems untitledTestRun11.png')

"Step 30: Click on div testRunItems (untitledTestRun102)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 30-Click on div testRunItems untitledTestRun102.png')

"Step 31: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 31-Click on button showMore.png')

"Step 32: Click on div indi1040Ss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_indi1040Ss'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 32-Click on div indi1040Ss.png')

"Step 33: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 33-Click on div elementClickIntercepted.png')

"Step 34: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 34-Click on div elementClickIntercepted.png')

"Step 35: Click on div elementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_elementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 35-Click on div elementClickIntercepted.png')

"Step 36: Click on div testRunItems (untitledTestRun102)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 36-Click on div testRunItems untitledTestRun102.png')

"Step 37: Click on div testRunItems (untitledTestRun102)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 37-Click on div testRunItems untitledTestRun102.png')

"Step 38: Click on button object2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 38-Click on button object2 - Navigate to page teamprojectexecutionstest-result.png')

"Step 39: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 39-Click on pre elementClickInterceptedNth0.png')

"Step 40: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 40-Click on pre elementClickInterceptedNth0.png')

"Step 41: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 41-Click on pre elementClickInterceptedNth0.png')

"Step 42: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 42-Click on pre elementClickInterceptedNth0.png')

"Step 43: Click on pre elementClickInterceptedNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_elementClickInterceptedNth0'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 43-Click on pre elementClickInterceptedNth0.png')

"Step 44: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/image_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 44-Click on image object.png')

"Step 45: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/image_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 45-Click on image object.png')

"Step 46: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/image_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 46-Click on image object.png')

"Step 47: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 47-Click on button close.png')

"Step 48: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 48-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 49: Click on div testRunItems (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_5]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 49-Click on div testRunItems object4.png')

"Step 50: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 50-Click on button showMore.png')

"Step 51: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 51-Click on button object.png')

"Step 52: Click on div testRunItems (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_6]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 52-Click on div testRunItems object4.png')

"Step 53: Click on header testRunDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 53-Click on header testRunDetails object.png')

"Step 54: Click on header testRunDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 54-Click on header testRunDetails object.png')

"Step 55: Click on div testRunItems (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_7]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 55-Click on div testRunItems object4.png')

"Step 56: Click on button object2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 56-Click on button object2 - Navigate to page teamprojectexecutionstest-result.png')

"Step 57: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 57-Click on div thumbnailImage.png')

"Step 58: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 58-Click on button close.png')

"Step 59: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 59-Click on button showMore.png')

"Step 60: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 60-Click on button object.png')

"Step 61: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 61-Click on div object.png')

"Step 62: Click on span objectDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_objectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_objectDetails', ['span_objectDetails_nthChild': span_objectDetails_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 62-Click on span objectDetails object.png')

"Step 63: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 63-Click on div object2.png')

"Step 64: Click on div thumbnailImage (thumbnailImage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImage', ['div_thumbnailImage_class': div_thumbnailImage_class]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 64-Click on div thumbnailImage thumbnailImage2.png')

"Step 65: Click on button close -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 65-Click on button close - Navigate to page teamprojecttest-runs.png')

"Step 66: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 66-Click on button object.png')

"Step 67: Schedule multiple test runs with server URL and environment settings."

scheduleMultipleTestRuns.execute(data_path_1, Integer.valueOf(index_1))

"Step 68: Click on header testRunDetails (edgeOpen1040Sstest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 68-Click on header testRunDetails edgeOpen1040Sstest.png')

"Step 69: Click on div testRunItems (edgeOpen1040Sstest12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_8]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 69-Click on div testRunItems edgeOpen1040Sstest12.png')

"Step 70: Click on button testRunActions (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_testRunActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_testRunActions', ['button_testRunActions_class': button_testRunActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 70-Click on button testRunActions object3.png')

"Step 71: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 71-Click on button object4.png')

"Step 72: Click on div testRunItems (edgeOpen1040Sstest122)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_9]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 72-Click on div testRunItems edgeOpen1040Sstest122.png')

"Step 73: Click on div edgeOpen1040Sstest123"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_edgeOpen1040Sstest123'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 73-Click on div edgeOpen1040Sstest123.png')

"Step 74: Click on div edgeOpen1040Sstest124"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_edgeOpen1040Sstest124'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 74-Click on div edgeOpen1040Sstest124.png')

"Step 75: Click on div testRunItems (edgeOpen1040Sstest122)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_10]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 75-Click on div testRunItems edgeOpen1040Sstest122.png')

"Step 76: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 76-Click on button object4.png')

"Step 77: Click on link schedules2 -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 77-Click on link schedules2 - Navigate to page teamprojectgrid.png')

"Step 78: Click on link testRunView (edgeOpen1040Sstest) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunView"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunView', ['link_testRunView_team_id': link_testRunView_team_id_1, 'link_testRunView_plan_id': link_testRunView_plan_id_1, 'link_testRunView_project_id': link_testRunView_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 78-Click on link testRunView edgeOpen1040Sstest - Navigate to page teamprojectgridplanjob.png')

"Step 79: Click on div edgeOpen1040Sstest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_edgeOpen1040Sstest'))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 79-Click on div edgeOpen1040Sstest.png')

"Step 80: Click on link executionLinks (executions12) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_2, 'link_executionLinks_executions_id': link_executionLinks_executions_id_1, 'link_executionLinks_project_id': link_executionLinks_project_id_2, 'link_executionLinks_team_id': link_executionLinks_team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 80-Click on link executionLinks executions12 - Navigate to page teamprojectexecutions.png')

"Step 81: Click on link executionLinks (executions10) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_3, 'link_executionLinks_plan_id': link_executionLinks_plan_id_1, 'link_executionLinks_job_id': link_executionLinks_job_id_1, 'link_executionLinks_project_id': link_executionLinks_project_id_3, 'link_executionLinks_team_id': link_executionLinks_team_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC346/Step 81-Click on link executionLinks executions10 - Navigate to page teamprojectgridplanjob.png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC346-Manage Test Run Executions and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}