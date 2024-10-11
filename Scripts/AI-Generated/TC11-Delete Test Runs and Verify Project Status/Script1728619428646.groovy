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

"Step 3: Navigate to team/*/project/*/grid/plan/*/job/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid/plan/${GlobalVariable.plan_id}/job/${GlobalVariable.job_id}")

"Step 4: Enter input value in input NumberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_NumberInput'), input_NumberInput)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Enter input value in input NumberInput.png')

"Step 5: Click on button Delete -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on button Delete - Navigate to page teamproject.png')

"Step 6: Click on link testSuiteManagement (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteManagement', ['link_testSuiteManagement_trNthChild': link_testSuiteManagement_trNthChild, 'link_testSuiteManagement_internalRoleLinkName': link_testSuiteManagement_internalRoleLinkName, 'link_testSuiteManagement_plan_id': link_testSuiteManagement_plan_id, 'link_testSuiteManagement_project_id': link_testSuiteManagement_project_id, 'link_testSuiteManagement_team_id': link_testSuiteManagement_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link testSuiteManagement UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 7: Click on link Sessions -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on link Sessions - Navigate to page teamprojectgridplanjob.png')

"Step 8: Click on span Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/span_Object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on span Object.png')

"Step 9: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on button Delete2.png')

"Step 10: Enter input value in input NumberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_NumberInput'), input_NumberInput)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Enter input value in input NumberInput.png')

"Step 11: Click on button Delete -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on button Delete - Navigate to page teamproject.png')

"Step 12: Click on link projectNavigation (Calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on link projectNavigation Calendar.png')

"Step 13: Click on div testRunStatus (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus', ['div_testRunStatus_class': div_testRunStatus_class, 'div_testRunStatus_internalText': div_testRunStatus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on div testRunStatus TestRun.png')

"Step 14: Click on div testRunStatus (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus', ['div_testRunStatus_class': div_testRunStatus_class_1, 'div_testRunStatus_internalText': div_testRunStatus_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on div testRunStatus TestRun2.png')

"Step 15: Click on div testRunStatus (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus', ['div_testRunStatus_class': div_testRunStatus_class_2, 'div_testRunStatus_internalText': div_testRunStatus_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on div testRunStatus TestRun.png')

"Step 16: Click on div testRunStatus (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus', ['div_testRunStatus_class': div_testRunStatus_class_3, 'div_testRunStatus_internalText': div_testRunStatus_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on div testRunStatus TestRun2.png')

"Step 17: Click on div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on div Object.png')

"Step 18: Click on link projectNavigation (Schedules)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on link projectNavigation Schedules.png')

"Step 19: Click on div Object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Click on div Object2 - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Delete Test Runs and Verify Project Status_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}