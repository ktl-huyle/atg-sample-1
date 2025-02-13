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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link executionLinks (ExecutionOverview) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionLinks', ['executions_id': executions_id, 'link_executionLinks_class': link_executionLinks_class, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_nthChild': link_executionLinks_nthChild, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Click on link executionLinks ExecutionOverview - Navigate to page team project executionsteamprojectexecutions.png')

"Step 3: Click on link TestRuns -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link TestRuns - Navigate to page team project overviewteamprojectoverview.png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Access Test Runs Overview in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}