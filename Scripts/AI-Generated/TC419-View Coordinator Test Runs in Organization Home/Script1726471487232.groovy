import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 4: Click on div ccCareContinuityPortalsDevTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_ccCareContinuityPortalsDevTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC419/Step 4-Click on div ccCareContinuityPortalsDevTestCases.png')

"Step 5: Click on link testRuns (object) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns', ['link_testRuns_class': link_testRuns_class, 'link_testRuns_nthChild': link_testRuns_nthChild, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName, 'link_testRuns_project_id': link_testRuns_project_id, 'link_testRuns_executions_id': link_testRuns_executions_id, 'link_testRuns_team_id': link_testRuns_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC419/Step 5-Click on link testRuns object - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link coordinatorCore2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_coordinatorCore2'))

WebUI.takeScreenshot(reportLocation + '/TC419/Step 6-Click on link coordinatorCore2.png')

"Step 7: Click on pre failedVerifications (failedVerifyFaxReceived) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications', ['pre_failedVerifications_class': pre_failedVerifications_class, 'pre_failedVerifications_internalRoleButtonName': pre_failedVerifications_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC419/Step 7-Click on pre failedVerifications failedVerifyFaxReceived - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC419-View Coordinator Test Runs in Organization Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}