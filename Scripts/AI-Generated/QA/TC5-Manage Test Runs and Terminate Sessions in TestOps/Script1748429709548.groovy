import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${organization_id}/home")

"Step 2: Click on button userActions (userInitial)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_organization_home/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_organization_home/button_userActions', ['button_userActions_buttonTitle': button_userActions_buttonTitle]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on button userActions userInitial.png')

"Step 3: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on div object2.png')

"Step 4: Click on button organization05"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/button_organization05'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button organization05.png')

"Step 5: Click on link organizationOptions (gen3SubOrg)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_organization_home/link_organizationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_organization_home/link_organizationOptions', ['link_organizationOptions_divNthChild': link_organizationOptions_divNthChild, 'link_organizationOptions_divNthOfType': link_organizationOptions_divNthOfType, 'link_organizationOptions_href_variable': link_organizationOptions_href_variable]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on link organizationOptions gen3SubOrg.png')

"Step 6: Click on button gen3SubOrg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/button_gen3SubOrg'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button gen3SubOrg.png')

"Step 7: Click on link organizationOptions (orgWithAllLicenses)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_organization_home/link_organizationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_organization_home/link_organizationOptions', ['link_organizationOptions_divNthChild': link_organizationOptions_divNthChild_1, 'link_organizationOptions_divNthOfType': link_organizationOptions_divNthOfType_1, 'link_organizationOptions_href_variable': link_organizationOptions_href_variable_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on link organizationOptions orgWithAllLicenses.png')

"Step 8: Click on link pwPrjWithLicenses -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/link_pwPrjWithLicenses'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on link pwPrjWithLicenses - Navigate to page teamproject.png')

"Step 9: Click on link executions2 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on link executions2 - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on button scheduleTestRun.png')

"Step 11: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on div testSuites.png')

"Step 12: Click on div testSuiteDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testSuiteDescription'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on div testSuiteDescription.png')

"Step 13: Click on div testSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on div testSuites2.png')

"Step 14: Click on div testSuites3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testSuites3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on div testSuites3.png')

"Step 15: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_team_project_test_runs/input_object'), input_object)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Enter input value in input object.png')

"Step 16: Click on div testSuites4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testSuites4'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on div testSuites4.png')

"Step 17: Click on div selectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_selectEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on div selectEnvironment.png')

"Step 18: Click on div windowsChrome135"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_windowsChrome135'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on div windowsChrome135.png')

"Step 19: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on input name.png')

"Step 20: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_team_project_test_runs/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Enter input value in input name.png')

"Step 21: Click on button run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_run'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on button run.png')

"Step 22: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on div object2.png')

"Step 23: Click on button testRunSessions (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_test_runs/button_testRunSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_test_runs/button_testRunSessions', ['button_testRunSessions_internalHasText': button_testRunSessions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on button testRunSessions sessions.png')

"Step 24: Click on button goToDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_goToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Click on button goToDetails.png')

"Step 25: Click on div windows1Hour"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_windows1Hour'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on div windows1Hour.png')

"Step 26: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on button terminate.png')

"Step 27: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on button confirm.png')

"Step 28: Click on header testRunTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/header_testRunTitle'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on header testRunTitle.png')

"Step 29: Click on button details -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_details'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on button details - Navigate to page teamprojectexecutions.png')

"Step 30: Click on div configurations -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_executions/div_configurations'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on div configurations - Navigate to page teamprojectgridplanjob.png')

"Step 31: Click on button edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Click on button edit.png')

"Step 32: Click on div testSuiteId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/div_testSuiteId'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Click on div testSuiteId.png')

"Step 33: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Click on div object.png')

"Step 34: Click on button run -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/button_run'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34-Click on button run - Navigate to page teamprojectgrid.png')

"Step 35: Click on button selectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid/button_selectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35-Click on button selectOrganization.png')

"Step 36: Click on div subscribedSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid/div_subscribedSessions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 36-Click on div subscribedSessions.png')

"Step 37: Click on link history -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 37-Click on link history - Navigate to page teamprojecttest-runs.png')

"Step 38: Click on header windows1Hour"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/header_testRunTitle'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 38-Click on header windows1Hour.png')

"Step 39: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 39-Click on button terminate.png')

"Step 40: Click on button confirm -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 40-Click on button confirm - Navigate to page organizationhome.png')

"Step 41: Click on link executionDetails -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/link_executionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 41-Click on link executionDetails - Navigate to page teamprojectexecutions.png')

"Step 42: Click on div configurations -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_executions/div_configurations'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 42-Click on div configurations - Navigate to page teamprojectgridplanjob.png')

"Step 43: Click on button edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 43-Click on button edit.png')

"Step 44: Click on div cloudianAutomation2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/div_cloudianAutomation2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 44-Click on div cloudianAutomation2.png')

"Step 45: Click on div cloudianAutomationOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/div_cloudianAutomationOption'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 45-Click on div cloudianAutomationOption.png')

"Step 46: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 46-Click on div object2.png')

"Step 47: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/input_object'), input_object_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 47-Enter input value in input object.png')

"Step 48: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 48-Click on div testSuites.png')

"Step 49: Click on button run -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/button_run'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 49-Click on button run - Navigate to page teamprojectgrid.png')

"Step 50: Click on link windows1Hour -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid/link_windows1Hour'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 50-Click on link windows1Hour - Navigate to page teamprojectgridplanjob.png')

"Step 51: Click on link execution269 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_grid_plan_job/link_execution269'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 51-Click on link execution269 - Navigate to page teamprojectexecutions.png')

"Step 52: Click on link job374 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_executions/link_job374'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 52-Click on link job374 - Navigate to page .png')

"Step 53: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Manage Test Runs and Terminate Sessions in TestOps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}