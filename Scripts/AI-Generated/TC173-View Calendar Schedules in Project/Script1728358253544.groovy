import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/grid/plan/*/job/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid/plan/${GlobalVariable.plan_id}/job/${GlobalVariable.job_id}")

"Step 4: Click on link calendarSchedules (Calendar) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarSchedules"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarSchedules', ['link_calendarSchedules_internalRoleLinkName': link_calendarSchedules_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC173/Step 4-Click on link calendarSchedules Calendar - Navigate to page teamproject.png')

"Step 5: Click on div testRuns (Loading) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class, 'div_testRuns_internalText': div_testRuns_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC173/Step 5-Click on div testRuns Loading - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC173-View Calendar Schedules in Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}