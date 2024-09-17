import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

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

"Step 3: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 4: Click on link executionReports (executions20350)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionReports', ['link_executionReports_trNthChild': link_executionReports_trNthChild, 'link_executionReports_internalRoleLinkName': link_executionReports_internalRoleLinkName, 'link_executionReports_team_id': link_executionReports_team_id, 'link_executionReports_executions_id': link_executionReports_executions_id, 'link_executionReports_project_id': link_executionReports_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC485/Step 4-Click on link executionReports executions20350.png')

"Step 5: Click on link executionReports (executions20348)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionReports', ['link_executionReports_trNthChild': link_executionReports_trNthChild_1, 'link_executionReports_internalRoleLinkName': link_executionReports_internalRoleLinkName_1, 'link_executionReports_team_id': link_executionReports_team_id_1, 'link_executionReports_executions_id': link_executionReports_executions_id_1, 'link_executionReports_project_id': link_executionReports_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC485/Step 5-Click on link executionReports executions20348.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC485-View Execution Reports in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}