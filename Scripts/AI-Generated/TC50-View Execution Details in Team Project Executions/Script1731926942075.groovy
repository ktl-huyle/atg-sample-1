import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

TrueTestScripts.navigate("team/*/project/*/executions")

"Step 4: Click on link executionDetails (Execution20350)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'executions_id': executions_id, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 4-Click on link executionDetails Execution20350.png')

"Step 5: Click on link executionDetails (Execution20348)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'executions_id': executions_id_1, 'team_id': team_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 5-Click on link executionDetails Execution20348.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC50-View Execution Details in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}