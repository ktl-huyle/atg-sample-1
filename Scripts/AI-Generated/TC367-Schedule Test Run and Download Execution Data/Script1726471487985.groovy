import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.scheduleTestRunFromProjectSettings
import katalon.common.downloadTestExecutionData
import internal.GlobalVariable
import katalon.common.scheduleTestRunWithActiveTunnels
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Schedule a test run from the project settings page."

scheduleTestRunFromProjectSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Download data related to test executions."

downloadTestExecutionData.execute()

"Step 7: Click on button setupTunnels (setup) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_setupTunnels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_setupTunnels', ['button_setupTunnels_internalRoleTabName': button_setupTunnels_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC367/Step 7-Click on button setupTunnels setup - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC367-Schedule Test Run and Download Execution Data_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}