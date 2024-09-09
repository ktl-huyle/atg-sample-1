import katalon.truetest.TrueTestScripts
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

"Step 4: Click on link bpBddPocthereIsNoData -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ojOracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on link bpBddPocthereIsNoData - Navigate to page teamproject.png')

"Step 5: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div uploadedData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_uploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on div uploadedData.png')

"Step 7: Click on span katalonStudioTestCasesLabelCaretDown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_katalonStudioTestCasesLabelCaretDown'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on span katalonStudioTestCasesLabelCaretDown.png')

"Step 8: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on span object.png')

"Step 9: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on span object2.png')

"Step 10: Click on span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object3_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Click on span object3.png')

"Step 11: Click on div countyDemographicsAnd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_countyDemographicsAnd'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Click on div countyDemographicsAnd.png')

"Step 12: Click on link insuranceDemographics -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_insuranceDemographics'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on link insuranceDemographics - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 13-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 14: Click on link testRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14-Click on link testRuns - Navigate to page teamprojectexecutions.png')

"Step 15: Click on link 523 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_523'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 15-Click on link 523 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button pushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_pushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 16-Click on button pushToXray.png')

"Step 17: Click on div selectNth1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_selectNth1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 17-Click on div selectNth1.png')

"Step 18: Click on button closeDialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_closeDialogButton'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 18-Click on button closeDialogButton.png')

"Step 19: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 19-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 20-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 21: Click on link testRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 21-Click on link testRuns - Navigate to page teamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Navigate and Verify Test Cases and Reports in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}