import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.viewProfileStatistics
import internal.GlobalVariable
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

"Step 4: Click on link Reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports2_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 4-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 5: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 5-Click on link TestRuns5 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on button SelectOrganization -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_SelectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 6-Click on button SelectOrganization - Navigate to page teamproject.png')

"Step 7: Click on link Reports3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 7-Click on link Reports3 - Navigate to page teamproject.png')

"Step 8: Click on link TestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 8-Click on link TestRuns.png')

"Step 9: Click on button CustomFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 9-Click on button CustomFields.png')

"Step 10: Click on div TestOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestOptions'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 10-Click on div TestOptions.png')

"Step 11: Click on button rowActions (Row591)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteResults_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteResults_1', ['button_rowActions_trNthChild': button_rowActions_trNthChild, 'button_rowActions_internalRoleRowName': button_rowActions_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 11-Click on button rowActions Row591.png')

"Step 12: Click on link executionLinks (Execution591)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_team_id': link_executionLinks_team_id, 'link_executionLinks_executions_id': link_executionLinks_executions_id, 'link_executionLinks_project_id': link_executionLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 12-Click on link executionLinks Execution591.png')

"Step 13: Click on input SearchTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 13-Click on input SearchTestRun.png')

"Step 14: Click on link Overview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Overview_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 14-Click on link Overview.png')

"Step 15: Click on link Executions7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 15-Click on link Executions7.png')

"Step 16: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 16-Click on body object.png')

"Step 17: Click on item Running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_Running'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 17-Click on item Running.png')

"Step 18: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 18-Click on input Executor.png')

"Step 19: Click on div historyDetails (HistorySchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_historyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_historyDetails', ['div_historyDetails_internalText': div_historyDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 19-Click on div historyDetails HistorySchedule.png')

"Step 20: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 20-Click on input DateRange.png')

"Step 21: Click on button gridCellActions (GridCell20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class, 'button_gridCellActions_internalRoleGridcellName': button_gridCellActions_internalRoleGridcellName, 'button_gridCellActions_nth': button_gridCellActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 21-Click on button gridCellActions GridCell20.png')

"Step 22: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 22-Click on input DateRange.png')

"Step 23: Click on button gridCellActions (GridCell1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 23-Click on button gridCellActions GridCell1.png')

"Step 24: Click on button gridCellActions (GridCell20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class_2, 'button_gridCellActions_internalRoleGridcellName': button_gridCellActions_internalRoleGridcellName_1, 'button_gridCellActions_nth': button_gridCellActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 24-Click on button gridCellActions GridCell20.png')

"Step 25: Click on input SelectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 25-Click on input SelectAllRows.png')

"Step 26: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 26-Click on button Terminate.png')

"Step 27: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 27-Click on button Confirm.png')

"Step 28: Click on input DateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 28-Click on input DateRange2.png')

"Step 29: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 29-Click on button monthNavigation PreviousMonth.png')

"Step 30: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_1, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 30-Click on button monthNavigation PreviousMonth.png')

"Step 31: Click on button gridCellActions (GridCell12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 31-Click on button gridCellActions GridCell12.png')

"Step 32: Click on button gridCellActions (GridCell202)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class_4, 'button_gridCellActions_internalRoleGridcellName': button_gridCellActions_internalRoleGridcellName_2, 'button_gridCellActions_nth': button_gridCellActions_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 32-Click on button gridCellActions GridCell202.png')

"Step 33: Click on input SelectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 33-Click on input SelectAllRows.png')

"Step 34: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 34-Click on button Terminate.png')

"Step 35: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 35-Click on button Confirm.png')

"Step 36: Click on link Reports4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 36-Click on link Reports4.png')

"Step 37: Click on link TestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 37-Click on link TestRuns.png')

"Step 38: Click on link Executions7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 38-Click on link Executions7.png')

"Step 39: Click on input SelectRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectRow'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 39-Click on input SelectRow.png')

"Step 40: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 40-Click on button Terminate.png')

"Step 41: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 41-Click on button Confirm.png')

"Step 42: Click on header testRunHeaders (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 42-Click on header testRunHeaders UntitledTestRun.png')

"Step 43: Click on button closeActions (CloseAlert)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 43-Click on button closeActions CloseAlert.png')

"Step 44: Click on link Reports3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 44-Click on link Reports3.png')

"Step 45: Click on link TestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 45-Click on link TestRuns.png')

"Step 46: Click on button SelectOrganization -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SelectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 46-Click on button SelectOrganization - Navigate to page teamproject.png')

"Step 47: Click on link Executions8 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions8_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 47-Click on link Executions8 - Navigate to page teamproject.png')

"Step 48: Click on i TimeIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_TimeIcon'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 48-Click on i TimeIcon.png')

"Step 49: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_2, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 49-Click on button monthNavigation PreviousMonth.png')

"Step 50: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_3, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 50-Click on button monthNavigation PreviousMonth.png')

"Step 51: Click on button gridCellActions (GridCell12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 51-Click on button gridCellActions GridCell12.png')

"Step 52: Click on button monthNavigation (NextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_4, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 52-Click on button monthNavigation NextMonth.png')

"Step 53: Click on button monthNavigation (NextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_5, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 53-Click on button monthNavigation NextMonth.png')

"Step 54: Click on button gridCellActions (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class_6, 'button_gridCellActions_internalRoleGridcellName': button_gridCellActions_internalRoleGridcellName_3, 'button_gridCellActions_nth': button_gridCellActions_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 54-Click on button gridCellActions GridCell.png')

"Step 55: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 55-Click on input Executor.png')

"Step 56: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 56-Click on body object.png')

"Step 57: Click on div RunningStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RunningStatus'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 57-Click on div RunningStatus.png')

"Step 58: Click on input SelectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 58-Click on input SelectAllRows.png')

"Step 59: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 59-Click on button Terminate.png')

"Step 60: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 60-Click on button Confirm.png')

"Step 61: Click on link navigationLinks (Calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks', ['link_navigationLinks_nthChild': link_navigationLinks_nthChild, 'link_navigationLinks_internalRoleLinkName': link_navigationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 61-Click on link navigationLinks Calendar.png')

"Step 62: Click on link moreOptions (MoreDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 62-Click on link moreOptions MoreDetails.png')

"Step 63: Click on span ImportingStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ImportingStatus'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 63-Click on span ImportingStatus.png')

"Step 64: Click on link Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Details'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 64-Click on link Details - Navigate to page teamprojectexecutions.png')

"Step 65: Click on link TestResults5 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults5_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 65-Click on link TestResults5 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 66: Click on link Files2 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files2_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 66-Click on link Files2 - Navigate to page teamprojectexecutionsfiles.png')

"Step 67: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 67-Click on link Reports.png')

"Step 68: Click on span OrganizationName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/span_OrganizationName'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 68-Click on span OrganizationName.png')

"Step 69: Click on link BOrganization -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_BOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 69-Click on link BOrganization - Navigate to page teamproject.png')

"Step 70: Click on link Reports3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 70-Click on link Reports3 - Navigate to page teamproject.png')

"Step 71: Click on link TestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 71-Click on link TestRuns.png')

"Step 72: Click on link executionLinks (ExecutionNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild_1, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_1, 'link_executionLinks_team_id': link_executionLinks_team_id_1, 'link_executionLinks_executions_id': link_executionLinks_executions_id_1, 'link_executionLinks_project_id': link_executionLinks_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 72-Click on link executionLinks ExecutionNumber.png')

"Step 73: Click on button SelectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SelectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 73-Click on button SelectOrganization.png')

"Step 74: Click on link BOrganizationIP -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_BOrganizationIP'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 74-Click on link BOrganizationIP - Navigate to page teamproject.png')

"Step 75: Click on link Executions8 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions8_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 75-Click on link Executions8 - Navigate to page teamproject.png')

"Step 76: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 76-Click on input DateRange.png')

"Step 77: Click on button gridCellActions (GridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCellActions', ['button_gridCellActions_class': button_gridCellActions_class_7, 'button_gridCellActions_internalRoleGridcellName': button_gridCellActions_internalRoleGridcellName_4, 'button_gridCellActions_nth': button_gridCellActions_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 77-Click on button gridCellActions GridCell2.png')

"Step 78: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 78-Click on body object.png')

"Step 79: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 79-Click on div dynamicObject object.png')

"Step 80: Click on i ExecutorIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_ExecutorIcon'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 80-Click on i ExecutorIcon.png')

"Step 81: Click on button OpenDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_OpenDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 81-Click on button OpenDropdown.png')

"Step 82: Enter input value in input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Executor'), input_Executor)

WebUI.takeScreenshot(reportLocation + '/TC180/Step 82-Enter input value in input Executor.png')

"Step 83: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 83-Click on div UserEmail.png')

"Step 84: Click on header testRunHeaders (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 84-Click on header testRunHeaders UntitledTestRun2.png')

"Step 85: Click on button Icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 85-Click on button Icon2.png')

"Step 86: Click on link Executions9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions9'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 86-Click on link Executions9.png')

"Step 87: Click on link Executions9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions9'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 87-Click on link Executions9.png')

"Step 88: Click on link Reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports2_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 88-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 89: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 89-Click on link TestRuns5.png')

"Step 90: View statistical data for the selected profile."

viewProfileStatistics.execute()

"Step 91: Click on button AugustDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_AugustDate'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 91-Click on button AugustDate.png')

"Step 92: Click on button AugustDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_AugustDate'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 92-Click on button AugustDate.png')

"Step 93: Click on button ApplyFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_ApplyFilter'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 93-Click on button ApplyFilter.png')

"Step 94: Click on div TestRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 94-Click on div TestRunDetails.png')

"Step 95: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 95-Click on link Executions - Navigate to page teamproject.png')

"Step 96: Click on link navigationLinks (Calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks', ['link_navigationLinks_nthChild': link_navigationLinks_nthChild_1, 'link_navigationLinks_internalRoleLinkName': link_navigationLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 96-Click on link navigationLinks Calendar.png')

"Step 97: Click on link moreOptions (MoreDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 97-Click on link moreOptions MoreDetails.png')

"Step 98: Click on div GridBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_GridBackground'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 98-Click on div GridBackground.png')

"Step 99: Click on link moreOptions (MoreDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 99-Click on link moreOptions MoreDetails.png')

"Step 100: Click on link Reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports2_1'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 100-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 101: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 101-Click on link TestRuns5 - Navigate to page teamprojectexecutions.png')

"Step 102: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC180-View Statistical Data for Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}