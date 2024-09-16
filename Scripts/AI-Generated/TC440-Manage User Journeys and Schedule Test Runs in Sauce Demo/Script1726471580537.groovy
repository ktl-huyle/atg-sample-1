import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.scheduleTestRunWithActiveTunnels
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on link noDataProjects (ojOracleJde2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_team_id': link_noDataProjects_team_id, 'link_noDataProjects_project_id': link_noDataProjects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 4-Click on link noDataProjects ojOracleJde2 - Navigate to page teamproject.png')

"Step 5: Click on link settings7 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings7'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 5-Click on link settings7 - Navigate to page teamproject.png')

"Step 6: Click on link truetest3 -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_truetest3'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 6-Click on link truetest3 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 7: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 7-Click on link reports - Navigate to page teamproject.png')

"Step 8: Click on link executions21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions21'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 8-Click on link executions21.png')

"Step 9: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 9-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 10: Click on span objectElements (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 10-Click on span objectElements object3.png')

"Step 11: Click on div userflowUi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_userflowUi'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 11-Click on div userflowUi.png')

"Step 12: Click on div testCaseUploadedDataKatalon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_testCaseUploadedDataKatalon'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 12-Click on div testCaseUploadedDataKatalon.png')

"Step 13: Click on span objectElements (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_divNthChild': span_objectElements_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 13-Click on span objectElements object.png')

"Step 14: Click on span objectElements (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 14-Click on span objectElements object2.png')

"Step 15: Click on div testCaseDetails (testCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 15-Click on div testCaseDetails testCases.png')

"Step 16: Click on link testLinks (testCdc002) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testLinks', ['link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName, 'link_testLinks_project_id': link_testLinks_project_id, 'link_testLinks_team_id': link_testLinks_team_id, 'link_testLinks_test_cases_id': link_testLinks_test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 16-Click on link testLinks testCdc002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on button addToTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_addToTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 17-Click on button addToTestSuite.png')

"Step 18: Click on div treeSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_treeSelect'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 18-Click on div treeSelect.png')

"Step 19: Click on span treeSwitcher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_treeSwitcher'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 19-Click on span treeSwitcher.png')

"Step 20: Click on span testcdc2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_testcdc2'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 20-Click on span testcdc2.png')

"Step 21: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 21-Click on button add.png')

"Step 22: Click on button uploadedDataActions (object) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 22-Click on button uploadedDataActions object - Navigate to page teamprojecttest-designtest-cases.png')

"Step 23: Click on link testLinks (testCdc002) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testLinks', ['link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_1, 'link_testLinks_project_id': link_testLinks_project_id_1, 'link_testLinks_team_id': link_testLinks_team_id_1, 'link_testLinks_test_cases_id': link_testLinks_test_cases_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 23-Click on link testLinks testCdc002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 24: Click on link testSuites7 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites7'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 24-Click on link testSuites7 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 25: Click on div oracleJde"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_oracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 25-Click on div oracleJde.png')

"Step 26: Click on div testSuiteDetails (testSuites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 26-Click on div testSuiteDetails testSuites.png')

"Step 27: Click on div testSuiteDetails (testOps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 27-Click on div testSuiteDetails testOps.png')

"Step 28: Click on link testcdc2 -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_testcdc2'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 28-Click on link testcdc2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 29: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC440/Step 29-Click on button scheduleTestRun.png')

"Step 30: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_0, Integer.valueOf(index_0))

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC440-Manage User Journeys and Schedule Test Runs in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}