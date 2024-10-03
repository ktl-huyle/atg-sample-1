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

"Step 3: Navigate to team/*/project/*/grid/plan/*/job"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid/plan/${GlobalVariable.plan_id}/job")

"Step 4: Click on button projectActions (Edit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 4-Click on button projectActions Edit.png')

"Step 5: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 5-Click on link ConfigureEnvironments.png')

"Step 6: Click on div ActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_ActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 6-Click on div ActiveTunnels.png')

"Step 7: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 7-Click on div UserEmail.png')

"Step 8: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 8-Click on button Save.png')

"Step 9: Click on button Schedule -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Schedule'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 9-Click on button Schedule - Navigate to page teamproject.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC106-Configure Environments and Schedule Projects in Team Project Grid Plan_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}