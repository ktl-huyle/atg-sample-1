import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 4: Click on link testRunLinks (28W2JFForumPosting) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild, 'link_testRunLinks_class': link_testRunLinks_class, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id, 'link_testRunLinks_project_id': link_testRunLinks_project_id, 'link_testRunLinks_team_id': link_testRunLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link testRunLinks 28W2JFForumPosting - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link TestRuns - Navigate to page teamproject.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Access Test Run Links in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}