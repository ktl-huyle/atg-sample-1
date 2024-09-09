import katalon.truetest.TrueTestScripts
import katalon.common.configureTestSettingsAndRunSuites
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link ojOracleJde -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ojOracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 4-Click on link ojOracleJde - Navigate to page teamproject.png')

"Step 5: Click on link settings2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings2'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 5-Click on link settings2 - Navigate to page teamproject.png')

"Step 6: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 6-Click on link scriptRepositories.png')

"Step 7: Click on link oracleJde -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_oracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 7-Click on link oracleJde - Navigate to page teamprojecttest-project.png')

"Step 8: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 8-Click on button scheduleTestRun.png')

"Step 9: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 10-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 11: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 11-Click on span object.png')

"Step 12: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 12-Click on span object2.png')

"Step 13: Click on div testCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 13-Click on div testCases.png')

"Step 14: Click on input selectTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_selectTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 14-Click on input selectTestCase.png')

"Step 15: Click on link settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 15-Click on link settings - Navigate to page teamproject.png')

"Step 16: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 16-Click on link scriptRepositories.png')

"Step 17: Click on link oracleJde -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_oracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 17-Click on link oracleJde - Navigate to page teamprojecttest-project.png')

"Step 18: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 18-Click on button scheduleTestRun.png')

"Step 19: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_1, Integer.valueOf(index_1))

"Step 20: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 20-Click on div object2.png')

"Step 21: Click on div historyCalendarSchedules"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_historyCalendarSchedules'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 21-Click on div historyCalendarSchedules.png')

"Step 22: Click on link viewEppsAutomationTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewEppsAutomationTest'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 22-Click on link viewEppsAutomationTest.png')

"Step 23: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 23-Click on div object3.png')

"Step 24: Click on div object3 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 24-Click on div object3 - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC50-Configure Test Settings for Oracle JDE_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}