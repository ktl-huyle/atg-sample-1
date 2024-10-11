import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.deleteFailedTestExecutions

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

"Step 4: Click on link testRunDetails (ExecutionDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails', ['link_testRunDetails_nthChild': link_testRunDetails_nthChild, 'link_testRunDetails_class': link_testRunDetails_class, 'link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id, 'link_testRunDetails_team_id': link_testRunDetails_team_id, 'link_testRunDetails_project_id': link_testRunDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 4-Click on link testRunDetails ExecutionDetails - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 5-Click on div LoadingSpinner.png')

"Step 6: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 6-Click on div LoadingSpinner.png')

"Step 7: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 7-Click on link TestRuns5 - Navigate to page teamprojectoverview.png')

"Step 8: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 8-Click on link TestRuns5 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on label failedExecution (FailedExecution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecution', ['label_failedExecution_for': label_failedExecution_for, 'label_failedExecution_internalRoleRowName': label_failedExecution_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 9-Click on label failedExecution FailedExecution.png')

"Step 10: Click on label failedExecution (FailedExecution2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecution', ['label_failedExecution_for': label_failedExecution_for_1, 'label_failedExecution_internalRoleRowName': label_failedExecution_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 10-Click on label failedExecution FailedExecution2.png')

"Step 11: Click on label failedExecution (FailedExecution3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecution', ['label_failedExecution_for': label_failedExecution_for_2, 'label_failedExecution_internalRoleRowName': label_failedExecution_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 11-Click on label failedExecution FailedExecution3.png')

"Step 12: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 12-Click on button Delete.png')

"Step 13: Delete failed test executions from the execution list"

deleteFailedTestExecutions.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on link TestRuns6 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 14-Click on link TestRuns6 - Navigate to page teamprojectoverview.png')

"Step 15: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 15-Click on link TestRuns5 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button deleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_deleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 16-Click on button deleteExecution.png')

"Step 17: Delete failed test executions from the execution list"

deleteFailedTestExecutions.execute(data_path_1, Integer.valueOf(index_1))

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC96-Delete Failed Test Executions from List_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}