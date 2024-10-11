import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button Close.png')

"Step 5: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on button Close.png')

"Step 6: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on input DateRange.png')

"Step 7: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on body PageContent.png')

"Step 8: Click on div menuComponents (MenuBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuComponents'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on div menuComponents MenuBackdrop.png')

"Step 9: Click on div ExecutionStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionStatus'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on div ExecutionStatus.png')

"Step 10: Click on div Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on div Executor.png')

"Step 11: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on body PageContent.png')

"Step 12: Click on div menuComponents (MenuBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuComponents'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on div menuComponents MenuBackdrop.png')

"Step 13: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on input Executor.png')

"Step 14: Click on div ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on div ScheduleTestRun.png')

"Step 15: Click on label Status"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_Status'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on label Status.png')

"Step 16: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on body PageContent.png')

"Step 17: Click on div menuComponents (MenuBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuComponents'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on div menuComponents MenuBackdrop.png')

"Step 18: Click on div AllStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AllStatus'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on div AllStatus.png')

"Step 19: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Click on input DateRange.png')

"Step 20: Click on button gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on button gridCells GridCell.png')

"Step 21: Click on div HistorySchedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_HistorySchedule'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on div HistorySchedule.png')

"Step 22: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Click on button Close.png')

"Step 23: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Click on button Close.png')

"Step 24: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on button Close.png')

"Step 25: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Click on body PageContent.png')

"Step 26: Click on div menuComponents (Menu)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuComponents'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Click on div menuComponents Menu.png')

"Step 27: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Click on input DateRange.png')

"Step 28: Click on button PreviousMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_PreviousMonth'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 28-Click on button PreviousMonth.png')

"Step 29: Click on button gridCells (GridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_internalRoleGridcellName': button_gridCells_internalRoleGridcellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 29-Click on button gridCells GridCell2.png')

"Step 30: Click on div ScheduleTestRun -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 30-Click on div ScheduleTestRun - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Schedule and Verify Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}