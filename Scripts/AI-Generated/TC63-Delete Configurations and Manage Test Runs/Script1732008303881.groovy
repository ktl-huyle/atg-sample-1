import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/*/project/*")

"Step 4: Click on link Settings7 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings7'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 4-Click on link Settings7 - Navigate to page teamproject.png')

"Step 5: Click on link Executions15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions15'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 5-Click on link Executions15.png')

"Step 6: Click on link testResources (Schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 6-Click on link testResources Schedules2.png')

"Step 7: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 7-Click on input Search.png')

"Step 8: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 8-Enter input value in input Search.png')

"Step 9: Click on link TestService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestService'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 9-Click on link TestService.png')

"Step 10: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 10-Click on input Search.png')

"Step 11: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search_1)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 11-Enter input value in input Search.png')

"Step 12: Click on link untitledTestRuns (TokenManager) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns', ['link_untitledTestRuns_trNthChild': link_untitledTestRuns_trNthChild, 'link_untitledTestRuns_internalRoleLinkName': link_untitledTestRuns_internalRoleLinkName, 'team_id': team_id, 'plan_id': plan_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 12-Click on link untitledTestRuns TokenManager - Navigate to page teamprojectgridplanjob.png')

"Step 13: Click on link configuration (Configuration) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName, 'team_id': team_id_1, 'plan_id': plan_id_1, 'job_id': job_id, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 13-Click on link configuration Configuration - Navigate to page teamprojectgridplanjob.png')

"Step 14: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 14-Click on button Delete.png')

"Step 15: Click on strong TestCount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/strong_TestCount'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 15-Click on strong TestCount.png')

"Step 16: Click on strong TestCount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/strong_TestCount'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 16-Click on strong TestCount.png')

"Step 17: Click on input SpinButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_SpinButton'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 17-Click on input SpinButton.png')

"Step 18: Enter input value in input SpinButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_SpinButton'), input_SpinButton)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 18-Enter input value in input SpinButton.png')

"Step 19: Click on button Delete2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 19-Click on button Delete2 - Navigate to page teamproject.png')

"Step 20: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 20-Click on input Search.png')

"Step 21: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search_2)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 21-Enter input value in input Search.png')

"Step 22: Click on link TestService -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestService'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 22-Click on link TestService - Navigate to page teamprojectgridplanjob.png')

"Step 23: Click on link configuration (Configuration2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_1, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_1, 'team_id': team_id_2, 'plan_id': plan_id_2, 'job_id': job_id_1, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 23-Click on link configuration Configuration2 - Navigate to page teamprojectgridplanjob.png')

"Step 24: Click on p ConfigType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/p_ConfigType'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 24-Click on p ConfigType.png')

"Step 25: Click on p ConfigType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/p_ConfigType'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 25-Click on p ConfigType.png')

"Step 26: Click on link Schedules -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 26-Click on link Schedules - Navigate to page teamproject.png')

"Step 27: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 27-Click on input Search.png')

"Step 28: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search_3)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 28-Enter input value in input Search.png')

"Step 29: Click on link untitledTestRuns (TokenManager2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns', ['link_untitledTestRuns_trNthChild': link_untitledTestRuns_trNthChild_1, 'link_untitledTestRuns_internalRoleLinkName': link_untitledTestRuns_internalRoleLinkName_1, 'team_id': team_id_3, 'plan_id': plan_id_3, 'project_id': project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 29-Click on link untitledTestRuns TokenManager2 - Navigate to page teamprojectgridplanjob.png')

"Step 30: Click on link configuration (Configuration3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_2, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_2, 'team_id': team_id_4, 'plan_id': plan_id_4, 'job_id': job_id_2, 'project_id': project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 30-Click on link configuration Configuration3 - Navigate to page teamprojectgridplanjob.png')

"Step 31: Click on link configuration (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_3, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_3, 'team_id': team_id_5, 'plan_id': plan_id_5, 'job_id': job_id_3, 'project_id': project_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 31-Click on link configuration Sessions.png')

"Step 32: Click on button run (Run)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_run'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 32-Click on button run Run.png')

"Step 33: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 33-Click on div Backdrop.png')

"Step 34: Click on link configuration (Configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_4, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_4, 'team_id': team_id_6, 'plan_id': plan_id_6, 'job_id': job_id_4, 'project_id': project_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 34-Click on link configuration Configuration3.png')

"Step 35: Click on link testRuns (TestRuns) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 35-Click on link testRuns TestRuns - Navigate to page teamprojectgridplanjob.png')

"Step 36: Click on link configuration (Configuration3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_5, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_5, 'team_id': team_id_7, 'plan_id': plan_id_7, 'job_id': job_id_5, 'project_id': project_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 36-Click on link configuration Configuration3 - Navigate to page teamprojectgridplanjob.png')

"Step 37: Click on link configuration (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_6, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_6, 'team_id': team_id_8, 'plan_id': plan_id_8, 'job_id': job_id_6, 'project_id': project_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 37-Click on link configuration Sessions.png')

"Step 38: Click on link configuration (Configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_7, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_7, 'team_id': team_id_9, 'plan_id': plan_id_9, 'job_id': job_id_7, 'project_id': project_id_9]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 38-Click on link configuration Configuration3.png')

"Step 39: Click on link testRuns (TestRuns) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild_1, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 39-Click on link testRuns TestRuns - Navigate to page teamprojectgridplanjob.png')

"Step 40: Click on link configuration (Configuration3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_8, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_8, 'team_id': team_id_10, 'plan_id': plan_id_10, 'job_id': job_id_8, 'project_id': project_id_10]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 40-Click on link configuration Configuration3 - Navigate to page teamprojectgridplanjob.png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC63-Delete Configurations and Manage Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}