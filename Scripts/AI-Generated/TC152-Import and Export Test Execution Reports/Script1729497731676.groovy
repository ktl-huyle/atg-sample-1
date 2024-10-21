import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectLinks (GrantedLicense) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 4-Click on link projectLinks GrantedLicense - Navigate to page teamproject.png')

"Step 5: Click on link Reports4 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 5-Click on link Reports4 - Navigate to page teamprojectoverview.png')

"Step 6: Click on link Executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 6-Click on link Executions2.png')

"Step 7: Schedule multiple test runs with different configurations"

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on link testRunViews (ViewCheckMultipleTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/link_testRunViews"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/link_testRunViews', ['link_testRunViews_internalRoleLinkName': link_testRunViews_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 8-Click on link testRunViews ViewCheckMultipleTest.png')

"Step 9: Click on header testRunTitles (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 9-Click on header testRunTitles CheckMultipleTestSuite.png')

"Step 10: Click on div testRunDetails (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails_1', ['div_testRunDetails_internalLabel': div_testRunDetails_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 10-Click on div testRunDetails CheckMultipleTestSuite.png')

"Step 11: Click on div SubscribedTestCloudSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SubscribedTestCloudSessions'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 11-Click on div SubscribedTestCloudSessions.png')

"Step 12: Click on link Tests2 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 12-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link Executions2 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 13-Click on link Executions2 - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on header testRunTitles (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 14-Click on header testRunTitles CheckMultipleTestSuite.png')

"Step 15: Click on button Details2 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 15-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on link Settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 16-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 17: Click on link Reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 17-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 18: Click on link TestRuns8 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 18-Click on link TestRuns8 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on link UploadReports -> Navigate to page '/team/*/project/*/import-manual-reports'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_UploadReports'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 19-Click on link UploadReports - Navigate to page teamprojectimport-manual-reports.png')

"Step 20: Click on input Select Katalon Report Files"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/input_Select_Katalon_Report_Files'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 20-Click on input Select Katalon Report Files.png')

"Step 21: Click on input Select Tags"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/input_Select_Tags'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 21-Click on input Select Tags.png')

"Step 22: Click on div Custom Fields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/div_Custom_Fields'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 22-Click on div Custom Fields.png')

"Step 23: Click on button Import"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/button_Import'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 23-Click on button Import.png')

"Step 24: Click on link Executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import_manual_reports/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 24-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 25: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 25-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 26: Click on link TestRuns8 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 26-Click on link TestRuns8 - Navigate to page teamprojectexecutions.png')

"Step 27: Click on link executionLinks (TestRun2) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 27-Click on link executionLinks TestRun2 - Navigate to page teamprojectexecutions.png')

"Step 28: Click on button DownloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DownloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 28-Click on button DownloadExecutionFile.png')

"Step 29: Click on button CompressFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CompressFile'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 29-Click on button CompressFile.png')

"Step 30: Click on link ExportExecutionFile -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_ExportExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 30-Click on link ExportExecutionFile - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC152-Import and Export Test Execution Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}