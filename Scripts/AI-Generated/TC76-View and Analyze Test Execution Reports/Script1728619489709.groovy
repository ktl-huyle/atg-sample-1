import truetest.common.viewDailyProfileDataPastWeek
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 4-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 5: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 5-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on button SelectOrganization2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_SelectOrganization2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 6-Click on button SelectOrganization2 - Navigate to page teamproject.png')

"Step 7: Click on link Reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 7-Click on link Reports2 - Navigate to page teamproject.png')

"Step 8: Click on link TestRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3_1'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 8-Click on link TestRuns3.png')

"Step 9: Click on button CustomFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 9-Click on button CustomFields.png')

"Step 10: Click on div DailyPast7Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DailyPast7Days'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 10-Click on div DailyPast7Days.png')

"Step 11: Click on button elapsedDuration (ElapsedDuration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_elapsedDuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_elapsedDuration', ['button_elapsedDuration_trNthChild': button_elapsedDuration_trNthChild, 'button_elapsedDuration_internalRoleRowName': button_elapsedDuration_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 11-Click on button elapsedDuration ElapsedDuration.png')

"Step 12: Click on link testRunNavigation (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation', ['link_testRunNavigation_trNthChild': link_testRunNavigation_trNthChild, 'link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName, 'link_testRunNavigation_team_id': link_testRunNavigation_team_id, 'link_testRunNavigation_project_id': link_testRunNavigation_project_id, 'link_testRunNavigation_executions_id': link_testRunNavigation_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 12-Click on link testRunNavigation TestRunDetails.png')

"Step 13: Click on input SearchTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 13-Click on input SearchTestRun.png')

"Step 14: Click on link Overview2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Overview2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 14-Click on link Overview2.png')

"Step 15: Click on link Executions8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions8'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 15-Click on link Executions8.png')

"Step 16: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 16-Click on body PageContent.png')

"Step 17: Click on item RunningOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_RunningOption'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 17-Click on item RunningOption.png')

"Step 18: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 18-Click on input Executor.png')

"Step 19: Click on div historySchedule (HistorySchedule2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_historySchedule"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_historySchedule', ['div_historySchedule_internalText': div_historySchedule_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 19-Click on div historySchedule HistorySchedule2.png')

"Step 20: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 20-Click on input DateRange2.png')

"Step 21: Click on button gridCell (GridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class, 'button_gridCell_nth': button_gridCell_nth, 'button_gridCell_internalRoleGridcellName': button_gridCell_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 21-Click on button gridCell GridCell3.png')

"Step 22: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 22-Click on input DateRange2.png')

"Step 23: Click on button gridCell (gridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 23-Click on button gridCell gridCell.png')

"Step 24: Click on button gridCell (GridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class_2, 'button_gridCell_nth': button_gridCell_nth_1, 'button_gridCell_internalRoleGridcellName': button_gridCell_internalRoleGridcellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 24-Click on button gridCell GridCell3.png')

"Step 25: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 25-Click on input selectAllRows.png')

"Step 26: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 26-Click on button terminate.png')

"Step 27: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 27-Click on button confirm.png')

"Step 28: Click on input DateRange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange3'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 28-Click on input DateRange3.png')

"Step 29: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 29-Click on button monthNavigation PreviousMonth.png')

"Step 30: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_1, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 30-Click on button monthNavigation PreviousMonth.png')

"Step 31: Click on button gridCell (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 31-Click on button gridCell gridCell2.png')

"Step 32: Click on button gridCell (GridCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class_4, 'button_gridCell_nth': button_gridCell_nth_2, 'button_gridCell_internalRoleGridcellName': button_gridCell_internalRoleGridcellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 32-Click on button gridCell GridCell4.png')

"Step 33: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 33-Click on input selectAllRows.png')

"Step 34: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 34-Click on button terminate.png')

"Step 35: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 35-Click on button confirm.png')

"Step 36: Click on link Reports3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3_1'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 36-Click on link Reports3.png')

"Step 37: Click on link TestRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3_1'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 37-Click on link TestRuns3.png')

"Step 38: Click on link Executions8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions8'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 38-Click on link Executions8.png')

"Step 39: Click on input selectRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectRow'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 39-Click on input selectRow.png')

"Step 40: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 40-Click on button terminate.png')

"Step 41: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 41-Click on button confirm.png')

"Step 42: Click on header testRun (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 42-Click on header testRun testRun.png')

"Step 43: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_alertClose_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose_1', ['button_alertClose_class': button_alertClose_class]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 43-Click on button alertClose AlertClose.png')

"Step 44: Click on link Reports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 44-Click on link Reports2.png')

"Step 45: Click on link TestRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3_1'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 45-Click on link TestRuns3.png')

"Step 46: Click on button bhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 46-Click on button bhtLnc - Navigate to page teamproject.png')

"Step 47: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 47-Click on link executions - Navigate to page teamproject.png')

"Step 48: Click on i time"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_time'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 48-Click on i time.png')

"Step 49: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_2, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 49-Click on button monthNavigation PreviousMonth.png')

"Step 50: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_3, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 50-Click on button monthNavigation PreviousMonth.png')

"Step 51: Click on button gridCell (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 51-Click on button gridCell gridCell2.png')

"Step 52: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_4, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 52-Click on button monthNavigation nextMonth.png')

"Step 53: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_5, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 53-Click on button monthNavigation nextMonth.png')

"Step 54: Click on button gridCell (gridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class_6, 'button_gridCell_nth': button_gridCell_nth_3, 'button_gridCell_internalRoleGridcellName': button_gridCell_internalRoleGridcellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 54-Click on button gridCell gridCell3.png')

"Step 55: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 55-Click on input Executor.png')

"Step 56: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 56-Click on body PageContent.png')

"Step 57: Click on div running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_running'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 57-Click on div running.png')

"Step 58: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 58-Click on input selectAllRows.png')

"Step 59: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 59-Click on button terminate.png')

"Step 60: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 60-Click on button confirm.png')

"Step 61: Click on link projectNavigation (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 61-Click on link projectNavigation calendar.png')

"Step 62: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 62-Click on link moreItems more.png')

"Step 63: Click on span importing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_importing'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 63-Click on span importing.png')

"Step 64: Click on link details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_details'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 64-Click on link details - Navigate to page teamprojectexecutions.png')

"Step 65: Click on link testResults2 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 65-Click on link testResults2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 66: Click on link files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 66-Click on link files - Navigate to page teamprojectexecutionsfiles.png')

"Step 67: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 67-Click on link reports.png')

"Step 68: Click on span bhtIp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/span_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 68-Click on span bhtIp.png')

"Step 69: Click on link bhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 69-Click on link bhtLnc - Navigate to page teamproject.png')

"Step 70: Click on link Reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 70-Click on link Reports2 - Navigate to page teamproject.png')

"Step 71: Click on link TestRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3_1'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 71-Click on link TestRuns3.png')

"Step 72: Click on link testRunNavigation (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation', ['link_testRunNavigation_trNthChild': link_testRunNavigation_trNthChild_1, 'link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName_1, 'link_testRunNavigation_team_id': link_testRunNavigation_team_id_1, 'link_testRunNavigation_project_id': link_testRunNavigation_project_id_1, 'link_testRunNavigation_executions_id': link_testRunNavigation_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 72-Click on link testRunNavigation testRun.png')

"Step 73: Click on button bhtLnc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 73-Click on button bhtLnc.png')

"Step 74: Click on link bhtIp -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 74-Click on link bhtIp - Navigate to page teamproject.png')

"Step 75: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 75-Click on link executions - Navigate to page teamproject.png')

"Step 76: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 76-Click on input DateRange2.png')

"Step 77: Click on button gridCell (gridCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCell', ['button_gridCell_class': button_gridCell_class_7, 'button_gridCell_nth': button_gridCell_nth_4, 'button_gridCell_internalRoleGridcellName': button_gridCell_internalRoleGridcellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 77-Click on button gridCell gridCell4.png')

"Step 78: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 78-Click on body PageContent.png')

"Step 79: Click on div menu (MenuBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 79-Click on div menu MenuBackdrop.png')

"Step 80: Click on i executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_executor'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 80-Click on i executor.png')

"Step 81: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 81-Click on button open.png')

"Step 82: Enter input value in input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Executor'), input_Executor)

WebUI.takeScreenshot(reportLocation + '/TC76/Step 82-Enter input value in input Executor.png')

"Step 83: Click on div userEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_userEmail'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 83-Click on div userEmail.png')

"Step 84: Click on header testRun (testRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 84-Click on header testRun testRun2.png')

"Step 85: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 85-Click on button Close2.png')

"Step 86: Click on link executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 86-Click on link executions2.png')

"Step 87: Click on link executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 87-Click on link executions2.png')

"Step 88: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 88-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 89: Click on link TestRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 89-Click on link TestRuns2.png')

"Step 90: View daily profile data for the past week"

viewDailyProfileDataPastWeek.execute()

"Step 91: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 91-Click on button aug21.png')

"Step 92: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 92-Click on button aug21.png')

"Step 93: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 93-Click on button apply.png')

"Step 94: Click on div testRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 94-Click on div testRunDetails.png')

"Step 95: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 95-Click on link executions - Navigate to page teamproject.png')

"Step 96: Click on link projectNavigation (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 96-Click on link projectNavigation calendar.png')

"Step 97: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 97-Click on link moreItems more.png')

"Step 98: Click on div rowBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_rowBackground'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 98-Click on div rowBackground.png')

"Step 99: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 99-Click on link moreItems more.png')

"Step 100: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 100-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 101: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 101-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 102: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC76-View and Analyze Test Execution Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}