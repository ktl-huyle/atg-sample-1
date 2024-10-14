import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleAndRunMultipleTestExecutions
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectNavigation (executionDetails2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_team_id': link_projectNavigation_team_id, 'link_projectNavigation_project_id': link_projectNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 4-Click on link projectNavigation executionDetails2 - Navigate to page teamproject.png')

"Step 5: Click on link executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 5-Click on link executions3.png')

"Step 6: Schedule and run multiple test executions with various settings"

scheduleAndRunMultipleTestExecutions.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 7-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 8: Click on link testSuites2 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 8-Click on link testSuites2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 9: Click on div testSuitesSection (gitRepository)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection', ['div_testSuitesSection_internalText': div_testSuitesSection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 9-Click on div testSuitesSection gitRepository.png')

"Step 10: Click on div testSuitesSection (testSuites2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 10-Click on div testSuitesSection testSuites2.png')

"Step 11: Click on div testSuitesSection (katalonCloud2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection', ['div_testSuitesSection_internalText': div_testSuitesSection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 11-Click on div testSuitesSection katalonCloud2.png')

"Step 12: Click on div testSuitesSection (uploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection', ['div_testSuitesSection_internalText': div_testSuitesSection_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 12-Click on div testSuitesSection uploadedData.png')

"Step 13: Click on div testSuitesSection (testSuites3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection', ['div_testSuitesSection_internalText': div_testSuitesSection_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 13-Click on div testSuitesSection testSuites3.png')

"Step 14: Click on link executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 14-Click on link executions.png')

"Step 15: Schedule and run multiple test executions with various settings"

scheduleAndRunMultipleTestExecutions.execute(data_path_1, Integer.valueOf(index_1))

"Step 16: Click on link reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 16-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC92-Schedule Multiple Test Executions and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}