import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 4: Click on link projectExecutionDetails (28W2JFForumPosting) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutionDetails', ['link_projectExecutionDetails_class': link_projectExecutionDetails_class, 'link_projectExecutionDetails_nthChild': link_projectExecutionDetails_nthChild, 'link_projectExecutionDetails_internalRoleLinkName': link_projectExecutionDetails_internalRoleLinkName, 'link_projectExecutionDetails_project_id': link_projectExecutionDetails_project_id, 'link_projectExecutionDetails_executions_id': link_projectExecutionDetails_executions_id, 'link_projectExecutionDetails_team_id': link_projectExecutionDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 4-Click on link projectExecutionDetails 28W2JFForumPosting - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns_2'))

WebUI.takeScreenshot(reportLocation + '/TC404/Step 5-Click on link TestRuns - Navigate to page teamproject.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC404-Verify Project Execution Details Navigation and Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}