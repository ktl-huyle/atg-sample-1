import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/{*}/project/{*}/executions"

TrueTestScripts.navigate("team/{*}/project/{*}/executions")

"Step 4: Click on link projectExecutions (ProjectExecution 20350)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions', ['link_projectExecutions_trNthChild': link_projectExecutions_trNthChild, 'link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on link projectExecutions ProjectExecution 20350.png')

"Step 5: Click on link projectExecutions (ProjectExecution 20348)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions', ['link_projectExecutions_trNthChild': link_projectExecutions_trNthChild_1, 'link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on link projectExecutions ProjectExecution 20348.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify Project Executions in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}