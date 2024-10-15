import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.common.accessTestRunsAndViewExecutionDetails
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

"Step 4: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 4-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 5: Click on link TestRuns4 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 5-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on button selectOrganization (SelectOrganization2) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization', ['button_selectOrganization_internalRoleButtonName': button_selectOrganization_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 6-Click on button selectOrganization SelectOrganization2 - Navigate to page teamproject.png')

"Step 7: Click on link Reports3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 7-Click on link Reports3.png')

"Step 8: Access test runs and view execution details"

accessTestRunsAndViewExecutionDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on link Overview -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Overview'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 9-Click on link Overview - Navigate to page teamprojectoverview.png')

"Step 10: Click on link Executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 10-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 11: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 11-Click on body MainContent.png')

"Step 12: Click on item Running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_Running'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 12-Click on item Running.png')

"Step 13: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 13-Click on input Executor.png')

"Step 14: Click on div historyInfo (HistorySchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 14-Click on div historyInfo HistorySchedule.png')

"Step 15: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 15-Click on input DateRange.png')

"Step 16: Click on button gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class, 'button_gridCells_nth': button_gridCells_nth, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 16-Click on button gridCells GridCell.png')

"Step 17: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 17-Click on input DateRange.png')

"Step 18: Click on button gridCells (GridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 18-Click on button gridCells GridCell2.png')

"Step 19: Click on button gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class_2, 'button_gridCells_nth': button_gridCells_nth_1, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 19-Click on button gridCells GridCell.png')

"Step 20: Click on input SelectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_SelectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 20-Click on input SelectAllRows.png')

"Step 21: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 21-Click on button Terminate.png')

"Step 22: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 22-Click on button Confirm.png')

"Step 23: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 23-Click on input DateRange2.png')

"Step 24: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 24-Click on button monthNavigation PreviousMonth.png')

"Step 25: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_1, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 25-Click on button monthNavigation PreviousMonth.png')

"Step 26: Click on button gridCells (GridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 26-Click on button gridCells GridCell3.png')

"Step 27: Click on button gridCells (GridCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class_4, 'button_gridCells_nth': button_gridCells_nth_2, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 27-Click on button gridCells GridCell4.png')

"Step 28: Click on input SelectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_SelectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 28-Click on input SelectAllRows.png')

"Step 29: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 29-Click on button Terminate.png')

"Step 30: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 30-Click on button Confirm.png')

"Step 31: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 31-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 32: Click on link TestRuns6 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 32-Click on link TestRuns6 - Navigate to page teamprojectexecutions.png')

"Step 33: Click on link Executions4 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 33-Click on link Executions4 - Navigate to page teamprojecttest-runs.png')

"Step 34: Click on input SelectRowCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_SelectRowCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 34-Click on input SelectRowCheckbox.png')

"Step 35: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 35-Click on button Terminate.png')

"Step 36: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 36-Click on button Confirm.png')

"Step 37: Click on header testRunTitles (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 37-Click on header testRunTitles UntitledTestRun3.png')

"Step 38: Click on button AlertButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_AlertButton'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 38-Click on button AlertButton.png')

"Step 39: Click on link Reports3 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 39-Click on link Reports3 - Navigate to page teamprojectoverview.png')

"Step 40: Click on link TestRuns6 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 40-Click on link TestRuns6 - Navigate to page teamprojectexecutions.png')

"Step 41: Click on button selectOrganization (SelectOrganization3) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization', ['button_selectOrganization_internalRoleButtonName': button_selectOrganization_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 41-Click on button selectOrganization SelectOrganization3 - Navigate to page teamproject.png')

"Step 42: Click on link executions2 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 42-Click on link executions2 - Navigate to page teamprojecttest-runs.png')

"Step 43: Click on i Time"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_Time'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 43-Click on i Time.png')

"Step 44: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_2, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 44-Click on button monthNavigation PreviousMonth.png')

"Step 45: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_3, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 45-Click on button monthNavigation PreviousMonth.png')

"Step 46: Click on button gridCells (GridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 46-Click on button gridCells GridCell3.png')

"Step 47: Click on button monthNavigation (NextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_4, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 47-Click on button monthNavigation NextMonth.png')

"Step 48: Click on button monthNavigation (NextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_5, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 48-Click on button monthNavigation NextMonth.png')

"Step 49: Click on button gridCells (GridCell5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class_6, 'button_gridCells_nth': button_gridCells_nth_3, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 49-Click on button gridCells GridCell5.png')

"Step 50: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 50-Click on input Executor.png')

"Step 51: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 51-Click on body MainContent.png')

"Step 52: Click on div RunningStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_RunningStatus'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 52-Click on div RunningStatus.png')

"Step 53: Click on input SelectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_SelectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 53-Click on input SelectAllRows.png')

"Step 54: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 54-Click on button Terminate.png')

"Step 55: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 55-Click on button Confirm.png')

"Step 56: Click on link Calendar -> Navigate to page '/team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Calendar'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 56-Click on link Calendar - Navigate to page teamprojecttest-planning.png')

"Step 57: Click on link moreOptions (MoreDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 57-Click on link moreOptions MoreDetails.png')

"Step 58: Click on span Importing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/span_Importing'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 58-Click on span Importing.png')

"Step 59: Click on link Details -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Details'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 59-Click on link Details - Navigate to page teamprojectexecutions.png')

"Step 60: Click on link testResults -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 60-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 61: Click on link files -> Navigate to page '/team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 61-Click on link files - Navigate to page teamprojectexecutionsfiles.png')

"Step 62: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 62-Click on link reports.png')

"Step 63: Click on span bhtIp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/span_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 63-Click on span bhtIp.png')

"Step 64: Click on link bhtLnc -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 64-Click on link bhtLnc - Navigate to page teamproject.png')

"Step 65: Click on link Reports3 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 65-Click on link Reports3 - Navigate to page teamprojectoverview.png')

"Step 66: Click on link TestRuns6 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 66-Click on link TestRuns6 - Navigate to page teamprojectexecutions.png')

"Step 67: Click on link executionLinks (TestExecution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 67-Click on link executionLinks TestExecution.png')

"Step 68: Click on button selectOrganization (SelectOrganization3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization', ['button_selectOrganization_internalRoleButtonName': button_selectOrganization_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 68-Click on button selectOrganization SelectOrganization3.png')

"Step 69: Click on link BhtIp -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_BhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 69-Click on link BhtIp - Navigate to page teamproject.png')

"Step 70: Click on link executions2 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 70-Click on link executions2 - Navigate to page teamprojecttest-runs.png')

"Step 71: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 71-Click on input DateRange.png')

"Step 72: Click on button gridCells (GridCell6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_gridCells', ['button_gridCells_class': button_gridCells_class_7, 'button_gridCells_nth': button_gridCells_nth_4, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 72-Click on button gridCells GridCell6.png')

"Step 73: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 73-Click on body MainContent.png')

"Step 74: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 74-Click on div dynamicObject object.png')

"Step 75: Click on i Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 75-Click on i Executor.png')

"Step 76: Click on button Open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Open'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 76-Click on button Open.png')

"Step 77: Enter input value in input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Executor'), input_Executor)

WebUI.takeScreenshot(reportLocation + '/TC140/Step 77-Enter input value in input Executor.png')

"Step 78: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 78-Click on div UserEmail.png')

"Step 79: Click on header testRunTitles (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 79-Click on header testRunTitles UntitledTestRun4.png')

"Step 80: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 80-Click on button Delete.png')

"Step 81: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 81-Click on link Executions3.png')

"Step 82: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 82-Click on link Executions3.png')

"Step 83: Click on link Reports4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 83-Click on link Reports4.png')

"Step 84: Access test runs and view execution details"

accessTestRunsAndViewExecutionDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 85: Click on link executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 85-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 86: Click on link Calendar -> Navigate to page '/team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Calendar'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 86-Click on link Calendar - Navigate to page teamprojecttest-planning.png')

"Step 87: Click on link moreOptions (MoreDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 87-Click on link moreOptions MoreDetails.png')

"Step 88: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 88-Click on div object.png')

"Step 89: Click on link moreOptions (MoreDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 89-Click on link moreOptions MoreDetails.png')

"Step 90: Click on link Reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 90-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 91: Click on link TestRuns4 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 91-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 92: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC140-Access Test Runs and View Execution Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}