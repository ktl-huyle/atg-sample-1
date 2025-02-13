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

"Step 2: Click on button runManagement (LinkToRelease)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_runManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_runManagement', ['button_runManagement_internalRoleButtonName': button_runManagement_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on button runManagement LinkToRelease.png')

"Step 3: Click on span ProjectVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/span_ProjectVersion'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on span ProjectVersion.png')

"Step 4: Click on button runManagement (Run) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_runManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_runManagement', ['button_runManagement_internalRoleButtonName': button_runManagement_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on button runManagement Run - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Run Management in Project Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}