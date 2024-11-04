import truetest.common.deleteFailedExecutionRecords
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link executionDetails (ExecutionDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_class': link_executionDetails_class, 'link_executionDetails_nthChild': link_executionDetails_nthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_team_id': link_executionDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 4-Click on link executionDetails ExecutionDetails - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 5-Click on div LoadingSpinner.png')

"Step 6: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 6-Click on div LoadingSpinner.png')

"Step 7: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 7-Click on link TestRuns3 - Navigate to page teamprojectoverview.png')

"Step 8: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 8-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on label failedExecutions (FailedExecution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions', ['label_failedExecutions_for': label_failedExecutions_for, 'label_failedExecutions_internalRoleRowName': label_failedExecutions_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 9-Click on label failedExecutions FailedExecution.png')

"Step 10: Click on label failedExecutions (FailedExecution2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions', ['label_failedExecutions_for': label_failedExecutions_for_1, 'label_failedExecutions_internalRoleRowName': label_failedExecutions_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 10-Click on label failedExecutions FailedExecution2.png')

"Step 11: Click on label failedExecutions (FailedExecution3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions', ['label_failedExecutions_for': label_failedExecutions_for_2, 'label_failedExecutions_internalRoleRowName': label_failedExecutions_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 11-Click on label failedExecutions FailedExecution3.png')

"Step 12: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 12-Click on button Delete.png')

"Step 13: Delete records of failed test executions."

deleteFailedExecutionRecords.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 14-Click on link TestRuns4 - Navigate to page teamprojectoverview.png')

"Step 15: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 15-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC230/Step 16-Click on button DeleteExecution.png')

"Step 17: Delete records of failed test executions."

deleteFailedExecutionRecords.execute(data_path_1, Integer.valueOf(index_1))

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC230-Delete Records of Failed Test Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}