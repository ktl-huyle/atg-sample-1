import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Reports4 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 4-Click on link Reports4 - Navigate to page teamprojectoverview.png')

"Step 5: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 5-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on button SelectOrganization2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_SelectOrganization2'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 6-Click on button SelectOrganization2 - Navigate to page teamproject.png')

"Step 7: Click on link reportLinks (Reports5) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild, 'link_reportLinks_internalRoleLinkName': link_reportLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 7-Click on link reportLinks Reports5 - Navigate to page teamproject.png')

"Step 8: Click on link testRunLinks (TestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 8-Click on link testRunLinks TestRuns.png')

"Step 9: Click on button CustomFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 9-Click on button CustomFields.png')

"Step 10: Click on div DailyPast7Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DailyPast7Days'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 10-Click on div DailyPast7Days.png')

"Step 11: Click on button ElapsedDuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ElapsedDuration'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 11-Click on button ElapsedDuration.png')

"Step 12: Click on link testRunDetails (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails', ['link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id, 'link_testRunDetails_project_id': link_testRunDetails_project_id, 'link_testRunDetails_team_id': link_testRunDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 12-Click on link testRunDetails TestRunDetails.png')

"Step 13: Click on input SearchTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 13-Click on input SearchTestRun.png')

"Step 14: Click on link testRunLinks (Overview)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 14-Click on link testRunLinks Overview.png')

"Step 15: Click on link executionReports (Executions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionReports', ['link_executionReports_nthChild': link_executionReports_nthChild, 'link_executionReports_internalRoleLinkName': link_executionReports_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 15-Click on link executionReports Executions5.png')

"Step 16: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 16-Click on body PageContent.png')

"Step 17: Click on item RunningOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_RunningOption'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 17-Click on item RunningOption.png')

"Step 18: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 18-Click on input Executor.png')

"Step 19: Click on div HistorySchedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_HistorySchedule'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 19-Click on div HistorySchedule.png')

"Step 20: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 20-Click on input DateRange.png')

"Step 21: Click on button gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName, 'button_gridCells_nth': button_gridCells_nth]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 21-Click on button gridCells GridCell.png')

"Step 22: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 22-Click on input DateRange.png')

"Step 23: Click on button gridCells (gridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 23-Click on button gridCells gridCell.png')

"Step 24: Click on button gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_2, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_1, 'button_gridCells_nth': button_gridCells_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 24-Click on button gridCells GridCell.png')

"Step 25: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 25-Click on input selectAllRows.png')

"Step 26: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 26-Click on button terminate.png')

"Step 27: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 27-Click on button confirm.png')

"Step 28: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 28-Click on input DateRange2.png')

"Step 29: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 29-Click on button monthNavigation PreviousMonth.png')

"Step 30: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_1, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 30-Click on button monthNavigation PreviousMonth.png')

"Step 31: Click on button gridCells (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 31-Click on button gridCells gridCell2.png')

"Step 32: Click on button gridCells (GridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_4, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_2, 'button_gridCells_nth': button_gridCells_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 32-Click on button gridCells GridCell2.png')

"Step 33: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 33-Click on input selectAllRows.png')

"Step 34: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 34-Click on button terminate.png')

"Step 35: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 35-Click on button confirm.png')

"Step 36: Click on link executionReports (Reports6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionReports', ['link_executionReports_nthChild': link_executionReports_nthChild_1, 'link_executionReports_internalRoleLinkName': link_executionReports_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 36-Click on link executionReports Reports6.png')

"Step 37: Click on link testRunLinks (TestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 37-Click on link testRunLinks TestRuns.png')

"Step 38: Click on link executionReports (Executions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionReports', ['link_executionReports_nthChild': link_executionReports_nthChild_2, 'link_executionReports_internalRoleLinkName': link_executionReports_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 38-Click on link executionReports Executions5.png')

"Step 39: Click on input selectRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectRow'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 39-Click on input selectRow.png')

"Step 40: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 40-Click on button terminate.png')

"Step 41: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 41-Click on button confirm.png')

"Step 42: Click on header testRunHeaders (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 42-Click on header testRunHeaders testRun.png')

"Step 43: Click on button alertCloseButtons (AlertClose2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_alertCloseButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertCloseButtons', ['button_alertCloseButtons_class': button_alertCloseButtons_class]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 43-Click on button alertCloseButtons AlertClose2.png')

"Step 44: Click on link reportLinks (Reports5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild_1, 'link_reportLinks_internalRoleLinkName': link_reportLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 44-Click on link reportLinks Reports5.png')

"Step 45: Click on link testRunLinks (TestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 45-Click on link testRunLinks TestRuns.png')

"Step 46: Click on button bhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 46-Click on button bhtLnc - Navigate to page teamproject.png')

"Step 47: Click on link reportLinks (executions2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild_2, 'link_reportLinks_internalRoleLinkName': link_reportLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 47-Click on link reportLinks executions2 - Navigate to page teamproject.png')

"Step 48: Click on i time"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_time'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 48-Click on i time.png')

"Step 49: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_2, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 49-Click on button monthNavigation PreviousMonth.png')

"Step 50: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_3, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 50-Click on button monthNavigation PreviousMonth.png')

"Step 51: Click on button gridCells (gridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 51-Click on button gridCells gridCell2.png')

"Step 52: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_4, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 52-Click on button monthNavigation nextMonth.png')

"Step 53: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_5, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 53-Click on button monthNavigation nextMonth.png')

"Step 54: Click on button gridCells (gridCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_6, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_3, 'button_gridCells_nth': button_gridCells_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 54-Click on button gridCells gridCell3.png')

"Step 55: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 55-Click on input Executor.png')

"Step 56: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 56-Click on body PageContent.png')

"Step 57: Click on div running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_running'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 57-Click on div running.png')

"Step 58: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 58-Click on input selectAllRows.png')

"Step 59: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 59-Click on button terminate.png')

"Step 60: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 60-Click on button confirm.png')

"Step 61: Click on link testManagementOptions (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions', ['link_testManagementOptions_nthChild': link_testManagementOptions_nthChild, 'link_testManagementOptions_internalRoleLinkName': link_testManagementOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 61-Click on link testManagementOptions calendar.png')

"Step 62: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 62-Click on link moreItems more.png')

"Step 63: Click on span importing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_importing'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 63-Click on span importing.png')

"Step 64: Click on link details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_details'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 64-Click on link details - Navigate to page teamprojectexecutions.png')

"Step 65: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 65-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 66: Click on link files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 66-Click on link files - Navigate to page teamprojectexecutionsfiles.png')

"Step 67: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 67-Click on link reports.png')

"Step 68: Click on span bhtIp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/span_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 68-Click on span bhtIp.png')

"Step 69: Click on link bhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 69-Click on link bhtLnc - Navigate to page teamproject.png')

"Step 70: Click on link reportLinks (Reports5) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild_3, 'link_reportLinks_internalRoleLinkName': link_reportLinks_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 70-Click on link reportLinks Reports5 - Navigate to page teamproject.png')

"Step 71: Click on link testRunLinks (TestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 71-Click on link testRunLinks TestRuns.png')

"Step 72: Click on link testRunDetails (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails', ['link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName_1, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id_1, 'link_testRunDetails_project_id': link_testRunDetails_project_id_1, 'link_testRunDetails_team_id': link_testRunDetails_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 72-Click on link testRunDetails testRun.png')

"Step 73: Click on button bhtLnc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 73-Click on button bhtLnc.png')

"Step 74: Click on link bhtIp -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 74-Click on link bhtIp - Navigate to page teamproject.png')

"Step 75: Click on link reportLinks (executions2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild_4, 'link_reportLinks_internalRoleLinkName': link_reportLinks_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 75-Click on link reportLinks executions2 - Navigate to page teamproject.png')

"Step 76: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 76-Click on input DateRange.png')

"Step 77: Click on button gridCells (gridCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_7, 'button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_4, 'button_gridCells_nth': button_gridCells_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 77-Click on button gridCells gridCell4.png')

"Step 78: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 78-Click on body PageContent.png')

"Step 79: Click on div backdropElements (MenuBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements', ['div_backdropElements_class': div_backdropElements_class]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 79-Click on div backdropElements MenuBackdrop.png')

"Step 80: Click on i executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_executor'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 80-Click on i executor.png')

"Step 81: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 81-Click on button open.png')

"Step 82: Enter input value in input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Executor'), input_Executor)

WebUI.takeScreenshot(reportLocation + '/TC449/Step 82-Enter input value in input Executor.png')

"Step 83: Click on div userEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_userEmail'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 83-Click on div userEmail.png')

"Step 84: Click on header testRunHeaders (testRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 84-Click on header testRunHeaders testRun2.png')

"Step 85: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 85-Click on button Close2.png')

"Step 86: Click on link executionReports (executions3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionReports', ['link_executionReports_internalRoleLinkName': link_executionReports_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 86-Click on link executionReports executions3.png')

"Step 87: Click on link executionReports (executions3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionReports', ['link_executionReports_internalRoleLinkName': link_executionReports_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 87-Click on link executionReports executions3.png')

"Step 88: Click on link Reports4 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 88-Click on link Reports4 - Navigate to page teamprojectoverview.png')

"Step 89: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 89-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 90: Click on button profileAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileAll'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 90-Click on button profileAll.png')

"Step 91: Click on p menuItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/p_menuItem'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 91-Click on p menuItem.png')

"Step 92: Click on button profileSit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileSit'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 92-Click on button profileSit.png')

"Step 93: Click on div menuItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_menuItem'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 93-Click on div menuItem.png')

"Step 94: Click on button dailyPast7Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_dailyPast7Days'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 94-Click on button dailyPast7Days.png')

"Step 95: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 95-Click on button aug21.png')

"Step 96: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 96-Click on button aug21.png')

"Step 97: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 97-Click on button apply.png')

"Step 98: Click on div testRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 98-Click on div testRunDetails.png')

"Step 99: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 99-Click on link executions - Navigate to page teamproject.png')

"Step 100: Click on link testManagementOptions (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions', ['link_testManagementOptions_nthChild': link_testManagementOptions_nthChild_1, 'link_testManagementOptions_internalRoleLinkName': link_testManagementOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 100-Click on link testManagementOptions calendar.png')

"Step 101: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 101-Click on link moreItems more.png')

"Step 102: Click on div rowBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_rowBackground'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 102-Click on div rowBackground.png')

"Step 103: Click on link moreItems (more)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 103-Click on link moreItems more.png')

"Step 104: Click on link Reports4 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 104-Click on link Reports4 - Navigate to page teamprojectoverview.png')

"Step 105: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC449/Step 105-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 106: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC449-Manage Test Run Links and Verify Execution Reports in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}