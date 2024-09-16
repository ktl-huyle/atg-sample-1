import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import katalon.common.runCustomFieldsReport
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 4: Click on link reports5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports5'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 4-Click on link reports5 - Navigate to page teamprojectoverview.png')

"Step 5: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 5-Click on link testRuns2 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on button bhtIp -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 6-Click on button bhtIp - Navigate to page teamproject.png')

"Step 7: Click on link reports6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports6'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 7-Click on link reports6 - Navigate to page teamproject.png')

"Step 8: Click on link testRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 8-Click on link testRuns10.png')

"Step 9: Run a report for custom fields over the last seven days."

runCustomFieldsReport.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on link overview2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_overview2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 10-Click on link overview2.png')

"Step 11: Click on link executions14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions14'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 11-Click on link executions14.png')

"Step 12: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 12-Click on body object.png')

"Step 13: Click on item running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_running'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 13-Click on item running.png')

"Step 14: Click on input executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_executor'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 14-Click on input executor.png')

"Step 15: Click on div testRunStatus (object52)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus', ['div_testRunStatus_internalText': div_testRunStatus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 15-Click on div testRunStatus object52.png')

"Step 16: Click on input dateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_dateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 16-Click on input dateRange2.png')

"Step 17: Click on button objectActions (object20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class, 'button_objectActions_internalRoleGridcellName': button_objectActions_internalRoleGridcellName, 'button_objectActions_nth': button_objectActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 17-Click on button objectActions object20.png')

"Step 18: Click on input dateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_dateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 18-Click on input dateRange2.png')

"Step 19: Click on button objectActions (object21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 19-Click on button objectActions object21.png')

"Step 20: Click on button objectActions (object20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_2, 'button_objectActions_internalRoleGridcellName': button_objectActions_internalRoleGridcellName_1, 'button_objectActions_nth': button_objectActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 20-Click on button objectActions object20.png')

"Step 21: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 21-Click on input selectAllRows.png')

"Step 22: Click on button terminate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 22-Click on button terminate2.png')

"Step 23: Click on button confirm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 23-Click on button confirm2.png')

"Step 24: Click on input dateRange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_dateRange3'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 24-Click on input dateRange3.png')

"Step 25: Click on button monthNavigation (previousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 25-Click on button monthNavigation previousMonth.png')

"Step 26: Click on button monthNavigation (previousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_1, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 26-Click on button monthNavigation previousMonth.png')

"Step 27: Click on button objectActions (object22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 27-Click on button objectActions object22.png')

"Step 28: Click on button objectActions (object23)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_4, 'button_objectActions_internalRoleGridcellName': button_objectActions_internalRoleGridcellName_2, 'button_objectActions_nth': button_objectActions_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 28-Click on button objectActions object23.png')

"Step 29: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 29-Click on input selectAllRows.png')

"Step 30: Click on button terminate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 30-Click on button terminate2.png')

"Step 31: Click on button confirm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 31-Click on button confirm2.png')

"Step 32: Click on link reports7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports7'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 32-Click on link reports7.png')

"Step 33: Click on link testRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 33-Click on link testRuns10.png')

"Step 34: Click on link executions14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions14'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 34-Click on link executions14.png')

"Step 35: Click on input selectRowUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectRowUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 35-Click on input selectRowUntitledTest.png')

"Step 36: Click on button terminate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 36-Click on button terminate2.png')

"Step 37: Click on button confirm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 37-Click on button confirm2.png')

"Step 38: Click on header projectObjects (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 38-Click on header projectObjects object10.png')

"Step 39: Click on button objectActions (alert)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 39-Click on button objectActions alert.png')

"Step 40: Click on link reports6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports6'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 40-Click on link reports6.png')

"Step 41: Click on link testRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 41-Click on link testRuns10.png')

"Step 42: Click on button bhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 42-Click on button bhtLnc - Navigate to page teamproject.png')

"Step 43: Click on link executions15 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions15'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 43-Click on link executions15 - Navigate to page teamproject.png')

"Step 44: Click on i time"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_time'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 44-Click on i time.png')

"Step 45: Click on button monthNavigation (previousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_2, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 45-Click on button monthNavigation previousMonth.png')

"Step 46: Click on button monthNavigation (previousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_3, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 46-Click on button monthNavigation previousMonth.png')

"Step 47: Click on button objectActions (object22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_6]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 47-Click on button objectActions object22.png')

"Step 48: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_4, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 48-Click on button monthNavigation nextMonth.png')

"Step 49: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class_5, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 49-Click on button monthNavigation nextMonth.png')

"Step 50: Click on button objectActions (object24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_7, 'button_objectActions_internalRoleGridcellName': button_objectActions_internalRoleGridcellName_3, 'button_objectActions_nth': button_objectActions_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 50-Click on button objectActions object24.png')

"Step 51: Click on input executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_executor'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 51-Click on input executor.png')

"Step 52: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 52-Click on body object.png')

"Step 53: Click on div running"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_running'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 53-Click on div running.png')

"Step 54: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 54-Click on input selectAllRows.png')

"Step 55: Click on button terminate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 55-Click on button terminate2.png')

"Step 56: Click on button confirm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 56-Click on button confirm2.png')

"Step 57: Click on link projectNavigation (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 57-Click on link projectNavigation calendar.png')

"Step 58: Click on link moreOptions (17More)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 58-Click on link moreOptions 17More.png')

"Step 59: Click on span importing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_importing'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 59-Click on span importing.png')

"Step 60: Click on link details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_details'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 60-Click on link details - Navigate to page teamprojectexecutions.png')

"Step 61: Click on link testResults7 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults7'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 61-Click on link testResults7 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 62: Click on link files3 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files3'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 62-Click on link files3 - Navigate to page teamprojectexecutionsfiles.png')

"Step 63: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 63-Click on link reports.png')

"Step 64: Click on span bhtIp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/span_bhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 64-Click on span bhtIp.png')

"Step 65: Click on link bBhtLnc -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_bBhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 65-Click on link bBhtLnc - Navigate to page teamproject.png')

"Step 66: Click on link reports6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports6'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 66-Click on link reports6 - Navigate to page teamproject.png')

"Step 67: Click on link testRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 67-Click on link testRuns10.png')

"Step 68: Click on link objectLinks (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_objectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_objectLinks', ['link_objectLinks_trNthChild': link_objectLinks_trNthChild, 'link_objectLinks_internalRoleLinkName': link_objectLinks_internalRoleLinkName, 'link_objectLinks_executions_id': link_objectLinks_executions_id, 'link_objectLinks_team_id': link_objectLinks_team_id, 'link_objectLinks_project_id': link_objectLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 68-Click on link objectLinks object.png')

"Step 69: Click on button bhtLnc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_bhtLnc'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 69-Click on button bhtLnc.png')

"Step 70: Click on link bBhtIp -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_bBhtIp'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 70-Click on link bBhtIp - Navigate to page teamproject.png')

"Step 71: Click on link executions15 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions15'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 71-Click on link executions15 - Navigate to page teamproject.png')

"Step 72: Click on input dateRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_dateRange2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 72-Click on input dateRange2.png')

"Step 73: Click on button objectActions (object25)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_8, 'button_objectActions_internalRoleGridcellName': button_objectActions_internalRoleGridcellName_4, 'button_objectActions_nth': button_objectActions_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 73-Click on button objectActions object25.png')

"Step 74: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 74-Click on body object.png')

"Step 75: Click on div objectComponents (object44)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 75-Click on div objectComponents object44.png')

"Step 76: Click on i executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_executor'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 76-Click on i executor.png')

"Step 77: Click on button arrowDropDownIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_arrowDropDownIcon'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 77-Click on button arrowDropDownIcon.png')

"Step 78: Enter input value in input executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_executor'), input_executor)

WebUI.takeScreenshot(reportLocation + '/TC404/Step 78-Enter input value in input executor.png')

"Step 79: Click on div object53"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object53'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 79-Click on div object53.png')

"Step 80: Click on header projectObjects (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 80-Click on header projectObjects object11.png')

"Step 81: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 81-Click on button object6.png')

"Step 82: Click on link executions16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions16'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 82-Click on link executions16.png')

"Step 83: Click on link executions16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions16'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 83-Click on link executions16.png')

"Step 84: Click on link reports5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports5'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 84-Click on link reports5 - Navigate to page teamprojectoverview.png')

"Step 85: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 85-Click on link testRuns2 - Navigate to page teamprojectexecutions.png')

"Step 86: Click on link executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 86-Click on link executions2.png')

"Step 87: Click on link executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 87-Click on link executions2.png')

"Step 88: Click on link reports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 88-Click on link reports2.png')

"Step 89: Click on link testRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 89-Click on link testRuns4.png')

"Step 90: Click on button profileAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileAll'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 90-Click on button profileAll.png')

"Step 91: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 91-Click on button object.png')

"Step 92: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 92-Click on button object.png')

"Step 93: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 93-Click on button apply.png')

"Step 94: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 94-Click on div object8.png')

"Step 95: Click on link executions3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 95-Click on link executions3 - Navigate to page teamproject.png')

"Step 96: Click on link projectNavigation (calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 96-Click on link projectNavigation calendar.png')

"Step 97: Click on link moreOptions (17More)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 97-Click on link moreOptions 17More.png')

"Step 98: Click on div object54"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object54'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 98-Click on div object54.png')

"Step 99: Click on link moreOptions (17More)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 99-Click on link moreOptions 17More.png')

"Step 100: Click on link reports5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports5'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 100-Click on link reports5 - Navigate to page teamprojectoverview.png')

"Step 101: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 101-Click on link testRuns2 - Navigate to page teamprojectexecutions.png')

"Step 102: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC404-Generate Custom Reports Over Time_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}