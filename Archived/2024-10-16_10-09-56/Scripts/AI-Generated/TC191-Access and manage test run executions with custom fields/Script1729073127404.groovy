import truetest.common.manageTestRunExecutionDetails
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to team/{*}/project/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}")

"Step 4: Click on link Reports5 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 4-Click on link Reports5 - Navigate to page team project overviewteamprojectoverview.png')

"Step 5: Click on link TestRuns4 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 5-Click on link TestRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 6: Click on button selectOrganization (SelectOrganization2) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization', ['button_selectOrganization_internalRoleButtonName': button_selectOrganization_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 6-Click on button selectOrganization SelectOrganization2 - Navigate to page team projectteamproject.png')

"Step 7: Click on link Reports6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 7-Click on link Reports6.png')

"Step 8: Access and manage details of test run executions and custom fields"

manageTestRunExecutionDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on link Overview -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Overview'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 9-Click on link Overview - Navigate to page team project overviewteamprojectoverview.png')

"Step 10: Click on link Executions -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 10-Click on link Executions - Navigate to page team projectteamproject.png')

"Step 11: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 11-Click on body PageContent.png')

"Step 12: Click on item RunningOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_RunningOption'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 12-Click on item RunningOption.png')

"Step 13: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 13-Click on input Executor.png')

"Step 14: Click on div historyInfo (HistorySchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_historyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 14-Click on div historyInfo HistorySchedule.png')

"Step 15: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 15-Click on input DateRange.png')

"Step 16: Click on button gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class, 'button_gridCells_nth': button_gridCells_nth, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 16-Click on button gridCells GridCell.png')

"Step 17: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 17-Click on input DateRange.png')

"Step 18: Click on button gridCells (gridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 18-Click on button gridCells gridCell.png')

"Step 19: Click on button gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_2, 'button_gridCells_nth': button_gridCells_nth_1, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 19-Click on button gridCells GridCell.png')

"Step 20: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 20-Click on input selectAllRows.png')

"Step 21: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 21-Click on button terminate.png')

"Step 22: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 22-Click on button confirm.png')

"Step 23: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 23-Click on input DateRange2.png')

"Step 24: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 24-Click on button monthNavigation PreviousMonth.png')

"Step 25: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_1, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 25-Click on button monthNavigation PreviousMonth.png')

"Step 26: Click on button gridCells (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 26-Click on button gridCells gridCell2.png')

"Step 27: Click on button gridCells (GridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_4, 'button_gridCells_nth': button_gridCells_nth_2, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 27-Click on button gridCells GridCell2.png')

"Step 28: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 28-Click on input selectAllRows.png')

"Step 29: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 29-Click on button terminate.png')

"Step 30: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 30-Click on button confirm.png')

"Step 31: Click on link Reports7 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports7'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 31-Click on link Reports7 - Navigate to page team project overviewteamprojectoverview.png')

"Step 32: Click on link TestRuns6 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 32-Click on link TestRuns6 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 33: Click on link Executions4 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 33-Click on link Executions4 - Navigate to page team projectteamproject.png')

"Step 34: Click on input selectRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectRow'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 34-Click on input selectRow.png')

"Step 35: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 35-Click on button terminate.png')

"Step 36: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 36-Click on button confirm.png')

"Step 37: Click on header testRunDetails (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 37-Click on header testRunDetails testRun.png')

"Step 38: Click on button alertClose (AlertClose2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 38-Click on button alertClose AlertClose2.png')

"Step 39: Click on link Reports6 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 39-Click on link Reports6 - Navigate to page team project overviewteamprojectoverview.png')

"Step 40: Click on link TestRuns6 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 40-Click on link TestRuns6 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 41: Click on button selectOrganization (SelectOrganization3) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization', ['button_selectOrganization_internalRoleButtonName': button_selectOrganization_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 41-Click on button selectOrganization SelectOrganization3 - Navigate to page team projectteamproject.png')

"Step 42: Click on link executions2 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 42-Click on link executions2 - Navigate to page team projectteamproject.png')

"Step 43: Click on i time"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_time'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 43-Click on i time.png')

"Step 44: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_2, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 44-Click on button monthNavigation PreviousMonth.png')

"Step 45: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_3, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 45-Click on button monthNavigation PreviousMonth.png')

"Step 46: Click on button gridCells (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 46-Click on button gridCells gridCell2.png')

"Step 47: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_4, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 47-Click on button monthNavigation nextMonth.png')

"Step 48: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_5, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 48-Click on button monthNavigation nextMonth.png')

"Step 49: Click on button gridCells (gridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_6, 'button_gridCells_nth': button_gridCells_nth_3, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 49-Click on button gridCells gridCell3.png')

"Step 50: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 50-Click on input Executor.png')

"Step 51: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 51-Click on body PageContent.png')

"Step 52: Click on div running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_running'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 52-Click on div running.png')

"Step 53: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 53-Click on input selectAllRows.png')

"Step 54: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 54-Click on button terminate.png')

"Step 55: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 55-Click on button confirm.png')

"Step 56: Click on link teamProjectTools (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_teamProjectTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_teamProjectTools', ['link_teamProjectTools_internalRoleLinkName': link_teamProjectTools_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 56-Click on link teamProjectTools calendar.png')

"Step 57: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 57-Click on link moreItems more.png')

"Step 58: Click on span importing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_importing'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 58-Click on span importing.png')

"Step 59: Click on link details -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_details'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 59-Click on link details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 60: Click on link testResults -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 60-Click on link testResults - Navigate to page team project executionsteamprojectexecutions.png')

"Step 61: Click on link files4 -> Navigate to page 'file management#team/{*}/project/{*}/executions/{*}/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files4'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 61-Click on link files4 - Navigate to page file managementteamprojectexecutionsfiles.png')

"Step 62: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 62-Click on link reports.png')

"Step 63: Click on span bhtIp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/span_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 63-Click on span bhtIp.png')

"Step 64: Click on link bhtLnc -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/link_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 64-Click on link bhtLnc - Navigate to page team projectteamproject.png')

"Step 65: Click on link Reports6 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 65-Click on link Reports6 - Navigate to page team project overviewteamprojectoverview.png')

"Step 66: Click on link TestRuns6 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 66-Click on link TestRuns6 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 67: Click on link executionLinks (TestExecution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 67-Click on link executionLinks TestExecution.png')

"Step 68: Click on button selectOrganization (SelectOrganization3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_selectOrganization', ['button_selectOrganization_internalRoleButtonName': button_selectOrganization_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 68-Click on button selectOrganization SelectOrganization3.png')

"Step 69: Click on link BhtIp -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_BhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 69-Click on link BhtIp - Navigate to page team projectteamproject.png')

"Step 70: Click on link executions2 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 70-Click on link executions2 - Navigate to page team projectteamproject.png')

"Step 71: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 71-Click on input DateRange.png')

"Step 72: Click on button gridCells (gridCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_7, 'button_gridCells_nth': button_gridCells_nth_4, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 72-Click on button gridCells gridCell4.png')

"Step 73: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 73-Click on body PageContent.png')

"Step 74: Click on div backdropElements (MenuBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements', ['div_backdropElements_class': div_backdropElements_class]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 74-Click on div backdropElements MenuBackdrop.png')

"Step 75: Click on i executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_executor'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 75-Click on i executor.png')

"Step 76: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 76-Click on button open.png')

"Step 77: Enter input value in input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Executor'), input_Executor)

WebUI.takeScreenshot(reportLocation + '/TC191/Step 77-Enter input value in input Executor.png')

"Step 78: Click on div userEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_userEmail'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 78-Click on div userEmail.png')

"Step 79: Click on header testRunDetails (testRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 79-Click on header testRunDetails testRun2.png')

"Step 80: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 80-Click on button Close2.png')

"Step 81: Click on link executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 81-Click on link executions3.png')

"Step 82: Click on link executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 82-Click on link executions3.png')

"Step 83: Click on link Reports5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 83-Click on link Reports5.png')

"Step 84: Access and manage details of test run executions and custom fields"

manageTestRunExecutionDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 85: Click on link executions -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 85-Click on link executions - Navigate to page team projectteamproject.png')

"Step 86: Click on link teamProjectTools (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_teamProjectTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_teamProjectTools', ['link_teamProjectTools_internalRoleLinkName': link_teamProjectTools_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 86-Click on link teamProjectTools calendar.png')

"Step 87: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 87-Click on link moreItems more.png')

"Step 88: Click on div rowBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_rowBackground'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 88-Click on div rowBackground.png')

"Step 89: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 89-Click on link moreItems more.png')

"Step 90: Click on link Reports5 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 90-Click on link Reports5 - Navigate to page team project overviewteamprojectoverview.png')

"Step 91: Click on link TestRuns4 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC191/Step 91-Click on link TestRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 92: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC191-Access and manage test run executions with custom fields_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}