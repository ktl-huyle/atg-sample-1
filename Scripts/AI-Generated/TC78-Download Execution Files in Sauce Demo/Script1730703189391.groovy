import truetest.common.configureTestSuiteAndRun
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectResources (GrantedLicense) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources', ['link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName, 'link_projectResources_project_id': link_projectResources_project_id, 'link_projectResources_team_id': link_projectResources_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 4-Click on link projectResources GrantedLicense - Navigate to page teamproject.png')

"Step 5: Click on link Reports9 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports9'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 5-Click on link Reports9 - Navigate to page teamproject.png')

"Step 6: Click on link Executions17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions17'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 6-Click on link Executions17.png')

"Step 7: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun_1'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 7-Click on button ScheduleTestRun.png')

"Step 8: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on link viewTestRuns (ViewCheckMultipleTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns', ['link_viewTestRuns_internalRoleLinkName': link_viewTestRuns_internalRoleLinkName, 'link_viewTestRuns_project_id': link_viewTestRuns_project_id, 'link_viewTestRuns_team_id': link_viewTestRuns_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 9-Click on link viewTestRuns ViewCheckMultipleTest.png')

"Step 10: Click on header testRuns (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 10-Click on header testRuns CheckMultipleTestSuite.png')

"Step 11: Click on div testRunLabels (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunLabels', ['div_testRunLabels_internalLabel': div_testRunLabels_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 11-Click on div testRunLabels CheckMultipleTestSuite.png')

"Step 12: Click on div SubscribedSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SubscribedSessions'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 12-Click on div SubscribedSessions.png')

"Step 13: Click on link Tests9 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests9'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 13-Click on link Tests9 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link Executions7 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 14-Click on link Executions7 - Navigate to page teamproject.png')

"Step 15: Click on header testRuns (CheckMultipleTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 15-Click on header testRuns CheckMultipleTestSuite.png')

"Step 16: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 16-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 17: Click on link executionSettings (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings', ['link_executionSettings_internalRoleLinkName': link_executionSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 17-Click on link executionSettings Settings - Navigate to page teamproject.png')

"Step 18: Click on link Reports10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports10'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 18-Click on link Reports10.png')

"Step 19: Click on link TestRuns11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns11'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 19-Click on link TestRuns11.png')

"Step 20: Click on link UploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UploadReports'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 20-Click on link UploadReports.png')

"Step 21: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_1, Integer.valueOf(index_1))

"Step 22: Click on link Executions17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions17'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 22-Click on link Executions17.png')

"Step 23: Click on link Reports9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports9'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 23-Click on link Reports9.png')

"Step 24: Click on link TestRuns11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns11'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 24-Click on link TestRuns11.png')

"Step 25: Click on link executionDetails (teamProjectExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 25-Click on link executionDetails teamProjectExecution - Navigate to page teamprojectexecutions.png')

"Step 26: Click on button downloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_downloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 26-Click on button downloadExecutionFile.png')

"Step 27: Click on button compressFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_compressFile'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 27-Click on button compressFile.png')

"Step 28: Click on link exportExecutionFile -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_exportExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 28-Click on link exportExecutionFile - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC78-Download Execution Files in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}