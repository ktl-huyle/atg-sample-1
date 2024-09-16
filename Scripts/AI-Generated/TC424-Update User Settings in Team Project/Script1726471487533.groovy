import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

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

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link executions19 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions19'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 4-Click on link executions19 - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on div testRunDetails (parallelSuite751)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 5-Click on div testRunDetails parallelSuite751.png')

"Step 6: Click on div testRunDetails (parallelSuite749)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 6-Click on div testRunDetails parallelSuite749.png')

"Step 7: Click on div testRunDetails (parallelSuite750)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 7-Click on div testRunDetails parallelSuite750.png')

"Step 8: Click on div testRunDetails (parallelSuite751)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 8-Click on div testRunDetails parallelSuite751.png')

"Step 9: Click on button jobReady"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_jobReady'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 9-Click on button jobReady.png')

"Step 10: Click on div moMyOrganization01"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_moMyOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 10-Click on div moMyOrganization01.png')

"Step 11: Click on link viewAllProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_viewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 11-Click on link viewAllProjects.png')

"Step 12: Click on div currentReadyTechJrjob"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_currentReadyTechJrjob'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 12-Click on div currentReadyTechJrjob.png')

"Step 13: Click on link jrJobReady -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_jrJobReady'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 13-Click on link jrJobReady - Navigate to page teamproject.png')

"Step 14: Click on span settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_settings2'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 14-Click on span settings2.png')

"Step 15: Click on link organizationManagementEdit -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_organizationManagementEdit'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 15-Click on link organizationManagementEdit - Navigate to page teamproject.png')

"Step 16: Click on p readyCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/p_readyCase'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 16-Click on p readyCase.png')

"Step 17: Click on input userEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_userEmail'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 17-Click on input userEmail.png')

"Step 18: Enter input value in input userEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_userEmail'), input_userEmail)

WebUI.takeScreenshot(reportLocation + '/TC424/Step 18-Enter input value in input userEmail.png')

"Step 19: Click on div object68"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object68'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 19-Click on div object68.png')

"Step 20: Click on input timezoneConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_timezoneConfig'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 20-Click on input timezoneConfig.png')

"Step 21: Click on div enableBddreports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_enableBddreports'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 21-Click on div enableBddreports.png')

"Step 22: Click on div muiInputBaseRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_muiInputBaseRoot'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 22-Click on div muiInputBaseRoot.png')

"Step 23: Click on span settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_settings2'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 23-Click on span settings2.png')

"Step 24: Click on div objectComponents (object41)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class]))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 24-Click on div objectComponents object41.png')

"Step 25: Click on div muiInputBaseRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_muiInputBaseRoot'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 25-Click on div muiInputBaseRoot.png')

"Step 26: Enter input value in input userEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_userEmail'), input_userEmail)

WebUI.takeScreenshot(reportLocation + '/TC424/Step 26-Enter input value in input userEmail.png')

"Step 27: Click on div teamReadyCaseId1591288NameUpdate -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_teamReadyCaseId1591288NameUpdate'))

WebUI.takeScreenshot(reportLocation + '/TC424/Step 27-Click on div teamReadyCaseId1591288NameUpdate - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC424-Update User Settings in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}