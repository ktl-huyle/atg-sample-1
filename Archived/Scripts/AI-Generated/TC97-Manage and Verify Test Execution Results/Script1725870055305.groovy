import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.configureTestSettingsAndRunSuites
import internal.GlobalVariable

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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on i checkCircle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_checkCircle'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 4-Click on i checkCircle.png')

"Step 5: Click on header object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/header_object2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 5-Click on header object2.png')

"Step 6: Click on i fileLines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_fileLines'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 6-Click on i fileLines.png')

"Step 7: Click on i fileLines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_fileLines'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 7-Click on i fileLines.png')

"Step 8: Click on button sessions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_sessions3'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 8-Click on button sessions3.png')

"Step 9: Click on button failedTestResults3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_failedTestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 9-Click on button failedTestResults3.png')

"Step 10: Click on button details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 10-Click on button details2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on link coordinatorCore -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_coordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 11-Click on link coordinatorCore - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link passedCoordinatorCore -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_passedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 12-Click on link passedCoordinatorCore - Navigate to page teamprojectexecutions.png')

"Step 13: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 13-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 14: Click on span passedSuperE2EtestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_passedSuperE2EtestCase'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 14-Click on span passedSuperE2EtestCase.png')

"Step 15: Click on div infoSidebarHeaderCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_infoSidebarHeaderCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 15-Click on div infoSidebarHeaderCloseButton.png')

"Step 16: Click on link settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 16-Click on link settings.png')

"Step 17: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 18-Click on button settings.png')

"Step 19: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 19-Click on div object5.png')

"Step 20: Click on link integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 20-Click on link integrations.png')

"Step 21: Click on div codelessAutomationTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_codelessAutomationTool'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 21-Click on div codelessAutomationTool.png')

"Step 22: Click on div codelessAutomationTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_codelessAutomationTool'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 22-Click on div codelessAutomationTool.png')

"Step 23: Click on div almTestManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_almTestManagement'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 23-Click on div almTestManagement.png')

"Step 24: Click on div almTestManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_almTestManagement'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 24-Click on div almTestManagement.png')

"Step 25: Click on div ciCdpipeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ciCdpipeline'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 25-Click on div ciCdpipeline.png')

"Step 26: Click on div ciCdpipeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ciCdpipeline'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 26-Click on div ciCdpipeline.png')

"Step 27: Click on link customFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_customFields'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 27-Click on link customFields.png')

"Step 28: Click on link testCloudTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 28-Click on link testCloudTunnels.png')

"Step 29: Click on link customFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_customFields'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 29-Click on link customFields.png')

"Step 30: Click on link integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 30-Click on link integrations.png')

"Step 31: Click on div gptManualTestGenerator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_gptManualTestGenerator'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 31-Click on div gptManualTestGenerator.png')

"Step 32: Click on div integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 32-Click on div integrations.png')

"Step 33: Click on link testEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 33-Click on link testEnvironments.png')

"Step 34: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 34-Click on link scriptRepositories.png')

"Step 35: Click on link testRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 35-Click on link testRuns.png')

"Step 36: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 36-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 37: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 37-Click on link executions - Navigate to page teamproject.png')

"Step 38: Click on button selectRowUntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_selectRowUntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 38-Click on button selectRowUntitledTestRun.png')

"Step 39: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 39-Click on div object5.png')

"Step 40: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 40-Click on link reports.png')

"Step 41: Click on link uploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_uploadReports'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 41-Click on link uploadReports.png')

"Step 42: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_1, Integer.valueOf(index_1))

"Step 43: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 43-Click on link reports.png')

"Step 44: Click on link testRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 44-Click on link testRuns.png')

"Step 45: Click on link testRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 45-Click on link testRuns2.png')

"Step 46: Click on link executions5 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions5'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 46-Click on link executions5 - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 47-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 48-Click on label customControlLabel.png')

"Step 49: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 49-Click on label customControlLabel.png')

"Step 50: Click on button object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 50-Click on button object - Navigate to page teamprojectexecutionstest-result.png')

"Step 51: Click on span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_object4'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 51-Click on span object4.png')

"Step 52: Click on span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_object4'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 52-Click on span object4.png')

"Step 53: Click on span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_object3'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 53-Click on span object3.png')

"Step 54: Click on span createdWithSketchtool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_createdWithSketchtool'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 54-Click on span createdWithSketchtool.png')

"Step 55: Click on span executingTestCaseOnPlatform"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_executingTestCaseOnPlatform'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 55-Click on span executingTestCaseOnPlatform.png')

"Step 56: Click on span executingTestCaseOnPlatform"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_executingTestCaseOnPlatform'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 56-Click on span executingTestCaseOnPlatform.png')

"Step 57: Click on span elseIfPlatformNameEqualsIgnoreCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_elseIfPlatformNameEqualsIgnoreCase'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 57-Click on span elseIfPlatformNameEqualsIgnoreCase.png')

"Step 58: Click on span elseIfPlatformNameEqualsIgnoreCase -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_elseIfPlatformNameEqualsIgnoreCase'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 58-Click on span elseIfPlatformNameEqualsIgnoreCase - Navigate to page teamprojectexecutionstest-runs.png')

"Step 59: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 59-Click on link reports.png')

"Step 60: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 60-Click on link reports.png')

"Step 61: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 61-Click on link reports.png')

"Step 62: Click on link summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 62-Click on link summary - Navigate to page teamprojectexecutions.png')

"Step 63: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 63-Click on link reports.png')

"Step 64: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 64-Click on link executions - Navigate to page teamproject.png')

"Step 65: Click on header object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/header_object2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 65-Click on header object2.png')

"Step 66: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 66-Click on button object3.png')

"Step 67: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 67-Click on div object5.png')

"Step 68: Click on button details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 68-Click on button details2 - Navigate to page teamprojectexecutions.png')

"Step 69: Click on link androidTestSuite -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_androidTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 69-Click on link androidTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 70: Click on link passedCoordinatorCore -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_passedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 70-Click on link passedCoordinatorCore - Navigate to page teamprojectexecutions.png')

"Step 71: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 71-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 72: Click on button object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 72-Click on button object - Navigate to page teamprojectexecutionstest-result.png')

"Step 73: Click on div createdWithSketchCreatedWithSketchTextView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_createdWithSketchCreatedWithSketchTextView'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 73-Click on div createdWithSketchCreatedWithSketchTextView.png')

"Step 74: Click on link requests -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_requests'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 74-Click on link requests - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 75: Click on link testObjects -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_testObjects'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 75-Click on link testObjects - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 76: Click on link similarFailures -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_similarFailures'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 76-Click on link similarFailures - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 77: Click on link reRuns2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_reRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 77-Click on link reRuns2 - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 78: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC97-Manage and Verify Test Execution Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}