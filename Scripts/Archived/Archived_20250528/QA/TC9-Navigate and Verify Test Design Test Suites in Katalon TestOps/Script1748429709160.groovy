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

"Step 2: Click on button selectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_organization_home/button_selectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on button selectOrganization.png')

"Step 3: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_organization_home/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on div object3.png')

"Step 4: Click on link viewAllProjects -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_organization_home/link_viewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link viewAllProjects - Navigate to page teamprojectsettings.png')

"Step 5: Click on link executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_settings/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 6: Click on link settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_runs/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link settings - Navigate to page teamprojectsettings.png')

"Step 7: Click on link integrations3 -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_settings/link_integrations3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link integrations3 - Navigate to page teamprojectintegrations.png')

"Step 8: Click on link scriptRepositories -> Navigate to page '/team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_integrations/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link scriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 9: Click on link tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 10: Click on div testSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_design_test_cases/div_testSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on div testSuiteIcon.png')

"Step 11: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_cases/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on button refresh.png')

"Step 12: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_cases/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on span object.png')

"Step 13: Click on div testSuite2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_cases/div_testSuite2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on div testSuite2.png')

"Step 14: Click on link testSuites -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_cases/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on link testSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 15: Click on div testSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_design_test_suites/div_testSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on div testSuiteIcon.png')

"Step 16: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on button refresh.png')

"Step 17: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on span object.png')

"Step 18: Click on div testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on div testSuite.png')

"Step 19: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on span object2.png')

"Step 20: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on div testSuites.png')

"Step 21: Click on div testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on div testSuite.png')

"Step 22: Click on div testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on div testSuite.png')

"Step 23: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on div testSuites.png')

"Step 24: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on div testSuites.png')

"Step 25: Click on div testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on div testSuite.png')

"Step 26: Click on div testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on div testSuite.png')

"Step 27: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on div testSuites.png')

"Step 28: Click on div testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_design_test_suites/div_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Click on div testSuite.png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Navigate and Verify Test Design Test Suites in Katalon TestOps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}