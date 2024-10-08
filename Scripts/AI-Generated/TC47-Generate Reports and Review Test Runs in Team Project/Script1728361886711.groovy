import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.common.searchTestRunDetails
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 4: Click on link Reports5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 4-Click on link Reports5 - Navigate to page teamprojectoverview.png')

"Step 5: Click on link TestRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 5-Click on link TestRuns - Navigate to page teamprojectexecutions.png')

"Step 6: Click on button SelectOrganization2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_SelectOrganization2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 6-Click on button SelectOrganization2 - Navigate to page teamproject.png')

"Step 7: Click on link Reports6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 7-Click on link Reports6 - Navigate to page teamproject.png')

"Step 8: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 8-Click on link TestRuns10.png')

"Step 9: Search for specific details in the test run history."

searchTestRunDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on link Overview2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Overview2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 10-Click on link Overview2.png')

"Step 11: Click on link Executions13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions13'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 11-Click on link Executions13.png')

"Step 12: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 12-Click on body PageContent.png')

"Step 13: Click on item RunningOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_RunningOption'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 13-Click on item RunningOption.png')

"Step 14: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 14-Click on input Executor.png')

"Step 15: Click on div historySchedules (HistorySchedule2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_historySchedules"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_historySchedules', ['div_historySchedules_internalText': div_historySchedules_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 15-Click on div historySchedules HistorySchedule2.png')

"Step 16: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 16-Click on input DateRange2.png')

"Step 17: Click on button gridCells (GridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName, 'button_gridCells_nth': button_gridCells_nth]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 17-Click on button gridCells GridCell3.png')

"Step 18: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 18-Click on input DateRange2.png')

"Step 19: Click on button gridCells (gridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 19-Click on button gridCells gridCell.png')

"Step 20: Click on button gridCells (GridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_2, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_1, 'button_gridCells_nth': button_gridCells_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 20-Click on button gridCells GridCell3.png')

"Step 21: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 21-Click on input selectAllRows.png')

"Step 22: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 22-Click on button terminate.png')

"Step 23: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 23-Click on button confirm.png')

"Step 24: Click on input DateRange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange3'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 24-Click on input DateRange3.png')

"Step 25: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 25-Click on button monthNavigation PreviousMonth.png')

"Step 26: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1', ['button_monthNavigation_class': button_monthNavigation_class_1, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 26-Click on button monthNavigation PreviousMonth.png')

"Step 27: Click on button gridCells (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 27-Click on button gridCells gridCell2.png')

"Step 28: Click on button gridCells (GridCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_4, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_2, 'button_gridCells_nth': button_gridCells_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 28-Click on button gridCells GridCell4.png')

"Step 29: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 29-Click on input selectAllRows.png')

"Step 30: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 30-Click on button terminate.png')

"Step 31: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 31-Click on button confirm.png')

"Step 32: Click on link Reports7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports7'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 32-Click on link Reports7.png')

"Step 33: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 33-Click on link TestRuns10.png')

"Step 34: Click on link Executions13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions13'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 34-Click on link Executions13.png')

"Step 35: Click on input selectRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectRow'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 35-Click on input selectRow.png')

"Step 36: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 36-Click on button terminate.png')

"Step 37: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 37-Click on button confirm.png')

"Step 38: Click on header testRunHeaders (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 38-Click on header testRunHeaders testRun.png')

"Step 39: Click on button alertClose (AlertClose2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_alertClose"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose', ['button_alertClose_class': button_alertClose_class]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 39-Click on button alertClose AlertClose2.png')

"Step 40: Click on link Reports6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 40-Click on link Reports6.png')

"Step 41: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 41-Click on link TestRuns10.png')

"Step 42: Click on button bhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 42-Click on button bhtLnc - Navigate to page teamproject.png')

"Step 43: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 43-Click on link executions - Navigate to page teamproject.png')

"Step 44: Click on i time"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_time'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 44-Click on i time.png')

"Step 45: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1', ['button_monthNavigation_class': button_monthNavigation_class_2, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 45-Click on button monthNavigation PreviousMonth.png')

"Step 46: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1', ['button_monthNavigation_class': button_monthNavigation_class_3, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 46-Click on button monthNavigation PreviousMonth.png')

"Step 47: Click on button gridCells (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 47-Click on button gridCells gridCell2.png')

"Step 48: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1', ['button_monthNavigation_class': button_monthNavigation_class_4, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 48-Click on button monthNavigation nextMonth.png')

"Step 49: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_previousMonth_1', ['button_monthNavigation_class': button_monthNavigation_class_5, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 49-Click on button monthNavigation nextMonth.png')

"Step 50: Click on button gridCells (gridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_6, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_3, 'button_gridCells_nth': button_gridCells_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 50-Click on button gridCells gridCell3.png')

"Step 51: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 51-Click on input Executor.png')

"Step 52: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 52-Click on body PageContent.png')

"Step 53: Click on div running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_running'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 53-Click on div running.png')

"Step 54: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 54-Click on input selectAllRows.png')

"Step 55: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 55-Click on button terminate.png')

"Step 56: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 56-Click on button confirm.png')

"Step 57: Click on link projectLinks (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 57-Click on link projectLinks calendar.png')

"Step 58: Click on link moreOptions (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 58-Click on link moreOptions more.png')

"Step 59: Click on span importing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_importing'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 59-Click on span importing.png')

"Step 60: Click on link details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_details'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 60-Click on link details - Navigate to page teamprojectexecutions.png')

"Step 61: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 61-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 62: Click on link files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 62-Click on link files - Navigate to page teamprojectexecutionsfiles.png')

"Step 63: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 63-Click on link reports.png')

"Step 64: Click on span bhtIp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/span_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 64-Click on span bhtIp.png')

"Step 65: Click on link bhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 65-Click on link bhtLnc - Navigate to page teamproject.png')

"Step 66: Click on link Reports6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 66-Click on link Reports6 - Navigate to page teamproject.png')

"Step 67: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 67-Click on link TestRuns10.png')

"Step 68: Click on link testRunDetails (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails', ['link_testRunDetails_trNthChild': link_testRunDetails_trNthChild, 'link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id, 'link_testRunDetails_team_id': link_testRunDetails_team_id, 'link_testRunDetails_project_id': link_testRunDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 68-Click on link testRunDetails testRun.png')

"Step 69: Click on button bhtLnc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 69-Click on button bhtLnc.png')

"Step 70: Click on link bhtIp -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 70-Click on link bhtIp - Navigate to page teamproject.png')

"Step 71: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 71-Click on link executions - Navigate to page teamproject.png')

"Step 72: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 72-Click on input DateRange2.png')

"Step 73: Click on button gridCells (gridCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_7, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_4, 'button_gridCells_nth': button_gridCells_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 73-Click on button gridCells gridCell4.png')

"Step 74: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 74-Click on body PageContent.png')

"Step 75: Click on div menuBackdrops (MenuBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops', ['div_menuBackdrops_class': div_menuBackdrops_class]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 75-Click on div menuBackdrops MenuBackdrop.png')

"Step 76: Click on i executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_executor'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 76-Click on i executor.png')

"Step 77: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 77-Click on button open.png')

"Step 78: Enter input value in input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Executor'), input_Executor)

WebUI.takeScreenshot(reportLocation + '/TC47/Step 78-Enter input value in input Executor.png')

"Step 79: Click on div userEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_userEmail'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 79-Click on div userEmail.png')

"Step 80: Click on header testRunHeaders (testRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 80-Click on header testRunHeaders testRun2.png')

"Step 81: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 81-Click on button Close2.png')

"Step 82: Click on link executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 82-Click on link executions2.png')

"Step 83: Click on link executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 83-Click on link executions2.png')

"Step 84: Click on link Reports5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 84-Click on link Reports5 - Navigate to page teamprojectoverview.png')

"Step 85: Click on link TestRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 85-Click on link TestRuns - Navigate to page teamprojectexecutions.png')

"Step 86: Click on button profileAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileAll'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 86-Click on button profileAll.png')

"Step 87: Click on p menuItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/p_menuItem'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 87-Click on p menuItem.png')

"Step 88: Click on button profileSit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileSit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 88-Click on button profileSit.png')

"Step 89: Click on div menuItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_menuItem'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 89-Click on div menuItem.png')

"Step 90: Click on button dailyPast7Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_dailyPast7Days'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 90-Click on button dailyPast7Days.png')

"Step 91: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 91-Click on button aug21.png')

"Step 92: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 92-Click on button aug21.png')

"Step 93: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 93-Click on button apply.png')

"Step 94: Click on div testRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 94-Click on div testRunDetails.png')

"Step 95: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 95-Click on link executions - Navigate to page teamproject.png')

"Step 96: Click on link projectLinks (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild_1, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 96-Click on link projectLinks calendar.png')

"Step 97: Click on link moreOptions (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 97-Click on link moreOptions more.png')

"Step 98: Click on div rowBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_rowBackground'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 98-Click on div rowBackground.png')

"Step 99: Click on link moreOptions (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 99-Click on link moreOptions more.png')

"Step 100: Click on link Reports5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 100-Click on link Reports5 - Navigate to page teamprojectoverview.png')

"Step 101: Click on link TestRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 101-Click on link TestRuns - Navigate to page teamprojectexecutions.png')

"Step 102: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC47-Generate Reports and Review Test Runs in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}