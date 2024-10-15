import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to /team/*/project/*/test-runs"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 4-Click on i object.png')

"Step 5: Click on header testRunTitles (Untitled Test Run)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 5-Click on header testRunTitles Untitled Test Run.png')

"Step 6: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 6-Click on i object2.png')

"Step 7: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 7-Click on i object2.png')

"Step 8: Click on button SessionsTab4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_SessionsTab4'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 8-Click on button SessionsTab4.png')

"Step 9: Click on button FailedTestResultsTab3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_FailedTestResultsTab3'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 9-Click on button FailedTestResultsTab3.png')

"Step 10: Click on button Details -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 10-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 11: Click on link testSuites (iOS Test Suite) -> Navigate to page '/team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 11-Click on link testSuites iOS Test Suite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link testSuites (Passed iOS Test Suite) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites', ['link_testSuites_internalRoleRowName': link_testSuites_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 12-Click on link testSuites Passed iOS Test Suite - Navigate to page teamprojectexecutions.png')

"Step 13: Click on link TestResults3 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 13-Click on link TestResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 14: Click on span PassedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_PassedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 14-Click on span PassedTestCase.png')

"Step 15: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 15-Click on div InfoSidebarCloseButton.png')

"Step 16: Click on link Settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 16-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 17: Click on label Enable BDD reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/label_Enable_BDD_reports'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 17-Click on label Enable BDD reports.png')

"Step 18: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 18-Click on button Save2.png')

"Step 19: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 19-Click on button Settings.png')

"Step 20: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 20-Click on div Backdrop.png')

"Step 21: Click on link Integrations -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 21-Click on link Integrations - Navigate to page teamprojectintegrations.png')

"Step 22: Click on div integrationTools (Codeless Automation Tool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class, 'div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 22-Click on div integrationTools Codeless Automation Tool.png')

"Step 23: Click on div integrationTools (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 23-Click on div integrationTools object4.png')

"Step 24: Click on div integrationTools (ALM Test Management)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_2, 'div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 24-Click on div integrationTools ALM Test Management.png')

"Step 25: Click on div integrationTools (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 25-Click on div integrationTools object5.png')

"Step 26: Click on div integrationTools (CI CD Pipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_4, 'div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 26-Click on div integrationTools CI CD Pipeline.png')

"Step 27: Click on div integrationTools (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 27-Click on div integrationTools object6.png')

"Step 28: Click on link Custom Fields -> Navigate to page '/team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_Custom_Fields'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 28-Click on link Custom Fields - Navigate to page teamprojectcustom-fields.png')

"Step 29: Click on link TestCloud Tunnels -> Navigate to page '/team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_TestCloud_Tunnels'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 29-Click on link TestCloud Tunnels - Navigate to page teamprojecttestCloudTunnel.png')

"Step 30: Click on link Custom Fields -> Navigate to page '/team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_Custom_Fields'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 30-Click on link Custom Fields - Navigate to page teamprojectcustom-fields.png')

"Step 31: Click on link Integrations -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 31-Click on link Integrations - Navigate to page teamprojectintegrations.png')

"Step 32: Click on div GPT Manual Test Generator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_GPT_Manual_Test_Generator'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 32-Click on div GPT Manual Test Generator.png')

"Step 33: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 33-Click on div object7.png')

"Step 34: Click on link Test Environments -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_Test_Environments'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 34-Click on link Test Environments - Navigate to page teamprojectagent.png')

"Step 35: Click on link Script Repositories -> Navigate to page '/team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_Script_Repositories'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 35-Click on link Script Repositories - Navigate to page teamprojecttest-project.png')

"Step 36: Click on link General -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_General'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 36-Click on link General - Navigate to page teamprojectsettings.png')

"Step 37: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 37-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 38: Click on link Executions3 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 38-Click on link Executions3 - Navigate to page teamprojecttest-runs.png')

"Step 39: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 39-Click on button object.png')

"Step 40: Click on div dynamicObject (popoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 40-Click on div dynamicObject popoverBackdrop.png')

"Step 41: Click on link Reports5 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 41-Click on link Reports5 - Navigate to page teamprojectoverview.png')

"Step 42: Click on link Upload Reports -> Navigate to page '/team/*/project/*/import-manual-reports'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Upload_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 42-Click on link Upload Reports - Navigate to page teamprojectimport-manual-reports.png')

"Step 43: Click on input Select Katalon Report Files"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/input_Select_Katalon_Report_Files'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 43-Click on input Select Katalon Report Files.png')

"Step 44: Click on input Select Tags"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/input_Select_Tags'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 44-Click on input Select Tags.png')

"Step 45: Click on div Custom Fields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/div_Custom_Fields'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 45-Click on div Custom Fields.png')

"Step 46: Click on button Import"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/button_Import'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 46-Click on button Import.png')

"Step 47: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 47-Click on link Reports.png')

"Step 48: Click on link Test Runs -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/link_Test_Runs'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 48-Click on link Test Runs - Navigate to page teamprojectoverview.png')

"Step 49: Click on link Test Runs -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Test_Runs'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 49-Click on link Test Runs - Navigate to page teamprojectexecutions.png')

"Step 50: Click on link executionLinks (object2) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 50-Click on link executionLinks object2 - Navigate to page teamprojectexecutions.png')

"Step 51: Click on link TestResults3 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 51-Click on link TestResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 52: Click on label TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 52-Click on label TestRun.png')

"Step 53: Click on label TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 53-Click on label TestRun.png')

"Step 54: Click on button testResultDetails (TestResultDetails) -> Navigate to page '/team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 54-Click on button testResultDetails TestResultDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 55: Click on span logItems (LogItemImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_internalHasText': span_logItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 55-Click on span logItems LogItemImage.png')

"Step 56: Click on span logItems (StartListenerAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 56-Click on span logItems StartListenerAction.png')

"Step 57: Click on span logItems (CreatedWithSketchtool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_internalHasText': span_logItems_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 57-Click on span logItems CreatedWithSketchtool.png')

"Step 58: Click on span testCaseExecution (CreatedWithSketchtool2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution', ['span_testCaseExecution_class': span_testCaseExecution_class, 'span_testCaseExecution_internalHasText': span_testCaseExecution_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 58-Click on span testCaseExecution CreatedWithSketchtool2.png')

"Step 59: Click on span testCaseExecution (ExecutingTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 59-Click on span testCaseExecution ExecutingTestCase.png')

"Step 60: Click on span testCaseExecution (ExecutingTestCase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution', ['span_testCaseExecution_class': span_testCaseExecution_class_1, 'span_testCaseExecution_internalHasText': span_testCaseExecution_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 60-Click on span testCaseExecution ExecutingTestCase2.png')

"Step 61: Click on span testCaseExecution (ElseIfiOS)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 61-Click on span testCaseExecution ElseIfiOS.png')

"Step 62: Click on span ElseIfiOS2 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_ElseIfiOS2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 62-Click on span ElseIfiOS2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 63: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 63-Click on link Reports.png')

"Step 64: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 64-Click on link Reports.png')

"Step 65: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 65-Click on link Reports.png')

"Step 66: Click on link Summary -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 66-Click on link Summary - Navigate to page teamprojectexecutions.png')

"Step 67: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 67-Click on link Reports.png')

"Step 68: Click on link Executions5 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Executions5'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 68-Click on link Executions5 - Navigate to page teamprojecttest-runs.png')

"Step 69: Click on header testRunTitles (Untitled Test Run)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 69-Click on header testRunTitles Untitled Test Run.png')

"Step 70: Click on button TestRunDetail2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_TestRunDetail2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 70-Click on button TestRunDetail2.png')

"Step 71: Click on div dynamicObject (popoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 71-Click on div dynamicObject popoverBackdrop.png')

"Step 72: Click on button Details -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 72-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 73: Click on link testSuites (Android Test Suite) -> Navigate to page '/team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild_1, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 73-Click on link testSuites Android Test Suite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 74: Click on link testSuites (Passed Android Test Suite) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites', ['link_testSuites_internalRoleRowName': link_testSuites_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 74-Click on link testSuites Passed Android Test Suite - Navigate to page teamprojectexecutions.png')

"Step 75: Click on link TestResults3 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 75-Click on link TestResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 76: Click on button testResultDetails (TestResultDetails) -> Navigate to page '/team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 76-Click on button testResultDetails TestResultDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 77: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 77-Click on div CreatedWithSketch.png')

"Step 78: Click on link Requests2 -> Navigate to page '/team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 78-Click on link Requests2 - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 79: Click on link TestObjects2 -> Navigate to page '/team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 79-Click on link TestObjects2 - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 80: Click on link Comments -> Navigate to page '/team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 80-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 81: Click on link ReRuns2 -> Navigate to page '/team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 81-Click on link ReRuns2 - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC145-Import Manual Reports and Verify Test Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}