import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.scheduleAndRunTestExecution
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectExecutions (firstProjectNoData) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutions', ['link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName, 'link_projectExecutions_team_id': link_projectExecutions_team_id, 'link_projectExecutions_project_id': link_projectExecutions_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 4-Click on link projectExecutions firstProjectNoData - Navigate to page teamproject.png')

"Step 5: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 5-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 6-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 7: Click on div testRunDetails (untitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 7-Click on div testRunDetails untitledTestRun.png')

"Step 8: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details_1'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 8-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 9: Click on link files -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 9-Click on link files - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div testRunDetails (untitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 10-Click on div testRunDetails untitledTestRun2.png')

"Step 11: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details_1'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 11-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 12: Click on link files2 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files2'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 12-Click on link files2 - Navigate to page teamprojectexecutionsfiles.png')

"Step 13: Click on link executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 13-Click on link executions.png')

"Step 14: Schedule a test run and execute various test suites."

scheduleAndRunTestExecution.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on button sessionTabs (sessionsTab)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionTabs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionTabs', ['button_sessionTabs_class': button_sessionTabs_class, 'button_sessionTabs_internalRoleTabName': button_sessionTabs_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 15-Click on button sessionTabs sessionsTab.png')

"Step 16: Click on div sortingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_sortingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 16-Click on div sortingInfo.png')

"Step 17: Click on div historyInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_historyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 17-Click on div historyInfo.png')

"Step 18: Click on div testExecutionLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testExecutionLabel'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 18-Click on div testExecutionLabel.png')

"Step 19: Click on div testRunElements (untitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunElements', ['div_testRunElements_internalHasText': div_testRunElements_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 19-Click on div testRunElements untitledTestRun3.png')

"Step 20: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details_1'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 20-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 21: Click on link files3 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files3'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 21-Click on link files3 - Navigate to page teamprojectexecutionsfiles.png')

"Step 22: Click on link executionFiles (executionFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles', ['link_executionFiles_trNthChild': link_executionFiles_trNthChild, 'link_executionFiles_internalRoleLinkName': link_executionFiles_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 22-Click on link executionFiles executionFile.png')

"Step 23: Click on button downloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/button_downloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 23-Click on button downloadExecutionFile.png')

"Step 24: Click on button compressFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/button_compressFile'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 24-Click on button compressFile.png')

"Step 25: Click on link exportExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_exportExecution'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 25-Click on link exportExecution.png')

"Step 26: Click on link pageLinks (page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageLinks', ['link_pageLinks_liNthChild': link_pageLinks_liNthChild, 'link_pageLinks_internalLabel': link_pageLinks_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 26-Click on link pageLinks page2.png')

"Step 27: Click on link pageLinks (page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageLinks', ['link_pageLinks_liNthChild': link_pageLinks_liNthChild_1, 'link_pageLinks_internalLabel': link_pageLinks_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 27-Click on link pageLinks page3.png')

"Step 28: Click on link executionFiles (executionReport) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles', ['link_executionFiles_trNthChild': link_executionFiles_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 28-Click on link executionFiles executionReport - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC424-Manage Test Runs and View Execution Details in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}