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

"Step 1: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 2: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button CloseButton.png')

"Step 3: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button ScheduleTestRun.png')

"Step 4: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on input Name.png')

"Step 5: Click on div ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on div ScheduleTestRun.png')

"Step 6: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_detail/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Enter input value in input Name.png')

"Step 7: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on div SelectEnvironment2.png')

"Step 8: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on item MoreOptions.png')

"Step 9: Click on span CreatedWith"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/span_CreatedWith'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on span CreatedWith.png')

"Step 10: Click on div TestCount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestCount'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on div TestCount.png')

"Step 11: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on button Save.png')

"Step 12: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button Run.png')

"Step 13: Click on header TestRunHeading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/header_TestRunHeading'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on header TestRunHeading.png')

"Step 14: Click on div testRunDetails (TestRunDetail)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on div testRunDetails TestRunDetail.png')

"Step 15: Click on button closeAction (CloseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_closeAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_closeAction', ['button_closeAction_class': button_closeAction_class]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on button closeAction CloseButton2.png')

"Step 16: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on button CloseButton.png')

"Step 17: Click on div testRunDetails (TestRunDetail2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on div testRunDetails TestRunDetail2.png')

"Step 18: Click on div TestRunImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestRunImage'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Click on div TestRunImage.png')

"Step 19: Click on div PersonIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_PersonIcon'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on div PersonIcon.png')

"Step 20: Click on div testRunDetails (TestRunDetail2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Click on div testRunDetails TestRunDetail2.png')

"Step 21: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Click on button CloseButton.png')

"Step 22: Click on link Schedules -> Navigate to page 'team project grid#team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Click on link Schedules - Navigate to page team project gridteamprojectgrid.png')

"Step 23: Click on link TestRunDetails -> Navigate to page 'project management#team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23-Click on link TestRunDetails - Navigate to page project managementteamprojectgridplanjob.png')

"Step 24: Click on div TestRunTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_TestRunTitle'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24-Click on div TestRunTitle.png')

"Step 25: Click on link TestExecution -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_TestExecution'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 25-Click on link TestExecution - Navigate to page team project executionsteamprojectexecutions.png')

"Step 26: Click on link TestExecutionJob -> Navigate to page 'team project grid plan job#team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestExecutionJob'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26-Click on link TestExecutionJob - Navigate to page team project grid plan jobteamprojectgridplanjob.png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Run and Verify Scheduled Test Run in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}