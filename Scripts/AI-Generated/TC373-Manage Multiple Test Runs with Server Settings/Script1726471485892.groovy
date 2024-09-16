import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.scheduleMultipleTestRuns
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link noDataProjects (fpFirstProjectNoData) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_project_id': link_noDataProjects_project_id, 'link_noDataProjects_team_id': link_noDataProjects_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 4-Click on link noDataProjects fpFirstProjectNoData - Navigate to page teamproject.png')

"Step 5: Click on link tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests2'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 5-Click on link tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 6-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 7: Click on div testRunDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 7-Click on div testRunDetails object.png')

"Step 8: Click on button details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_details'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 8-Click on button details - Navigate to page teamprojectexecutions.png')

"Step 9: Click on link files -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 9-Click on link files - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div testRunDetails (untitledTestRun396)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 10-Click on div testRunDetails untitledTestRun396.png')

"Step 11: Click on button details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_details'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 11-Click on button details - Navigate to page teamprojectexecutions.png')

"Step 12: Click on link files2 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files2'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 12-Click on link files2 - Navigate to page teamprojectexecutionsfiles.png')

"Step 13: Click on link executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 13-Click on link executions.png')

"Step 14: Schedule multiple test runs with server URL and environment settings."

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on button sessionManagement (sessions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement', ['button_sessionManagement_class': button_sessionManagement_class, 'button_sessionManagement_internalRoleTabName': button_sessionManagement_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 15-Click on button sessionManagement sessions5.png')

"Step 16: Click on div sortIddescending"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_sortIddescending_1'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 16-Click on div sortIddescending.png')

"Step 17: Click on div testRunStatus (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunStatus'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 17-Click on div testRunStatus object2.png')

"Step 18: Click on div testExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testExecution'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 18-Click on div testExecution.png')

"Step 19: Click on div testRunDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails_1', ['div_testRunDetails_internalHasText': div_testRunDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 19-Click on div testRunDetails object3.png')

"Step 20: Click on button details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_details'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 20-Click on button details - Navigate to page teamprojectexecutions.png')

"Step 21: Click on link files3 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files3'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 21-Click on link files3 - Navigate to page teamprojectexecutionsfiles.png')

"Step 22: Click on link executionFiles (20240821225003html)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles', ['link_executionFiles_trNthChild': link_executionFiles_trNthChild, 'link_executionFiles_internalRoleLinkName': link_executionFiles_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 22-Click on link executionFiles 20240821225003html.png')

"Step 23: Click on button downloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/button_downloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 23-Click on button downloadExecutionFile.png')

"Step 24: Click on button compressFileZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/button_compressFileZip'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 24-Click on button compressFileZip.png')

"Step 25: Click on link exportFileTypeZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_exportFileTypeZip'))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 25-Click on link exportFileTypeZip.png')

"Step 26: Click on link pageNavigation (page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 26-Click on link pageNavigation page2.png')

"Step 27: Click on link pageNavigation (page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild_1, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 27-Click on link pageNavigation page3.png')

"Step 28: Click on link executionFiles (testSuiteCollection) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles', ['link_executionFiles_trNthChild': link_executionFiles_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC373/Step 28-Click on link executionFiles testSuiteCollection - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC373-Manage Multiple Test Runs with Server Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}