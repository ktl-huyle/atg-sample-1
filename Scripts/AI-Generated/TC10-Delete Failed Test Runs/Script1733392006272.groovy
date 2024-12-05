import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 4: Click on link testCaseExecutions (ForumPosting5) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testCaseExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testCaseExecutions', ['link_testCaseExecutions_class': link_testCaseExecutions_class, 'link_testCaseExecutions_nthChild': link_testCaseExecutions_nthChild, 'link_testCaseExecutions_internalRoleLinkName': link_testCaseExecutions_internalRoleLinkName, 'executions_id': executions_id, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on link testCaseExecutions ForumPosting5 - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on div LoadingSpinner.png')

"Step 6: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on div LoadingSpinner.png')

"Step 7: Click on link TestRunsOverview -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRunsOverview'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on link TestRunsOverview - Navigate to page teamprojectoverview.png')

"Step 8: Click on link TestRunsExecutions -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRunsExecutions'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on link TestRunsExecutions - Navigate to page teamprojectexecutions.png')

"Step 9: Click on label failedTestStatus (FailedTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus', ['label_failedTestStatus_for': label_failedTestStatus_for, 'label_failedTestStatus_internalRoleRowName': label_failedTestStatus_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on label failedTestStatus FailedTest.png')

"Step 10: Click on label failedTestStatus (FailedTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus', ['label_failedTestStatus_for': label_failedTestStatus_for_1, 'label_failedTestStatus_internalRoleRowName': label_failedTestStatus_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on label failedTestStatus FailedTest2.png')

"Step 11: Click on label failedTestStatus (FailedTest3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus', ['label_failedTestStatus_for': label_failedTestStatus_for_2, 'label_failedTestStatus_internalRoleRowName': label_failedTestStatus_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on label failedTestStatus FailedTest3.png')

"Step 12: Click on button DeleteTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteTest'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on button DeleteTest.png')

"Step 13: Click on button DeleteConfirmation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteConfirmation'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on button DeleteConfirmation.png')

"Step 14: Click on label failedTestStatus (FailedTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus', ['label_failedTestStatus_for': label_failedTestStatus_for_3, 'label_failedTestStatus_internalRoleRowName': label_failedTestStatus_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on label failedTestStatus FailedTest.png')

"Step 15: Click on label failedTestStatus (FailedTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus', ['label_failedTestStatus_for': label_failedTestStatus_for_4, 'label_failedTestStatus_internalRoleRowName': label_failedTestStatus_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on label failedTestStatus FailedTest2.png')

"Step 16: Click on label failedTestStatus (FailedTest3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestStatus', ['label_failedTestStatus_for': label_failedTestStatus_for_5, 'label_failedTestStatus_internalRoleRowName': label_failedTestStatus_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on label failedTestStatus FailedTest3.png')

"Step 17: Click on button DeleteTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteTest'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on button DeleteTest.png')

"Step 18: Click on button DeleteConfirmation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteConfirmation'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on button DeleteConfirmation.png')

"Step 19: Click on link TestRunsOverview2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRunsOverview2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on link TestRunsOverview2 - Navigate to page teamprojectoverview.png')

"Step 20: Click on link TestRunsExecutions2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRunsExecutions'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on link TestRunsExecutions2 - Navigate to page teamprojectexecutions.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Delete Failed Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}