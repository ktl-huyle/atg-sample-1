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

"Step 4: Click on button runActions (LinkToRelease)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions', ['button_runActions_internalRoleButtonName': button_runActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 4-Click on button runActions LinkToRelease.png')

"Step 5: Click on span R5Maintenance"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/span_R5Maintenance'))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 5-Click on span R5Maintenance.png')

"Step 6: Click on button runActions (Run4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions', ['button_runActions_internalRoleButtonName': button_runActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 6-Click on button runActions Run4.png')

"Step 7: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 7-Click on link Reports - Navigate to page teamproject.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC70-Run Maintenance Actions in Team Project Grid_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}