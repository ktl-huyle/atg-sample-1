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

"Step 1: Navigate to team/*/project/*/grid/plan/*/job"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid/plan/${GlobalVariable.plan_id}/job")

"Step 2: Click on button executionControls (LinkToRelease)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_executionControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_executionControls', ['button_executionControls_internalRoleButtonName': button_executionControls_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Click on button executionControls LinkToRelease.png')

"Step 3: Click on span ProjectVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/span_ProjectVersion'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on span ProjectVersion.png')

"Step 4: Click on button executionControls (Run)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_executionControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_executionControls', ['button_executionControls_internalRoleButtonName': button_executionControls_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on button executionControls Run.png')

"Step 5: Click on link Reports -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on link Reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Manage Execution Controls and View Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}