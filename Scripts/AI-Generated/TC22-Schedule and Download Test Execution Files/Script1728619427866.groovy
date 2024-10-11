import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.scheduleAndRunTestDemo

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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link organizationLinks (OrgGrantedLicense) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_project_id': link_organizationLinks_project_id, 'link_organizationLinks_team_id': link_organizationLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on link organizationLinks OrgGrantedLicense - Navigate to page teamproject.png')

"Step 5: Click on link Reports5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on link Reports5 - Navigate to page teamproject.png')

"Step 6: Click on link reportLinks (Executions4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on link reportLinks Executions4.png')

"Step 7: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on button ScheduleTestRun.png')

"Step 8: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on link ViewCheckMultipleTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewCheckMultipleTest'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on link ViewCheckMultipleTest.png')

"Step 10: Click on header testRunAgents (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents', ['header_testRunAgents_internalRoleHeadingName': header_testRunAgents_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on header testRunAgents CheckMultipleTestSuite.png')

"Step 11: Click on div CheckMultipleTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CheckMultipleTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on div CheckMultipleTestSuite.png')

"Step 12: Click on div SubscribedTestCloudSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SubscribedTestCloudSessions'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on div SubscribedTestCloudSessions.png')

"Step 13: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link testDesignNavigation (Executions2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testDesignNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testDesignNavigation', ['link_testDesignNavigation_internalRoleLinkName': link_testDesignNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on link testDesignNavigation Executions2 - Navigate to page teamproject.png')

"Step 15: Click on header testRunAgents (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents', ['header_testRunAgents_internalRoleHeadingName': header_testRunAgents_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on header testRunAgents CheckMultipleTestSuite.png')

"Step 16: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 17: Click on link Settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on link Settings - Navigate to page teamproject.png')

"Step 18: Click on link reportLinks (Reports6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on link reportLinks Reports6.png')

"Step 19: Click on link TestRuns6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on link TestRuns6.png')

"Step 20: Click on link UploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UploadReports'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on link UploadReports.png')

"Step 21: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_1, Integer.valueOf(index_1))

"Step 22: Click on link reportLinks (Executions4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 22-Click on link reportLinks Executions4.png')

"Step 23: Click on link Reports5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 23-Click on link Reports5.png')

"Step 24: Click on link TestRuns6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 24-Click on link TestRuns6.png')

"Step 25: Click on link executionLinks (Execution678) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks', ['link_executionLinks_project_id': link_executionLinks_project_id, 'link_executionLinks_executions_id': link_executionLinks_executions_id, 'link_executionLinks_team_id': link_executionLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 25-Click on link executionLinks Execution678 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on button DownloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DownloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 26-Click on button DownloadExecutionFile.png')

"Step 27: Click on button CompressFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CompressFile'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 27-Click on button CompressFile.png')

"Step 28: Click on link ExportExecutionFile -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_ExportExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 28-Click on link ExportExecutionFile - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Schedule and Download Test Execution Files_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}