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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectDetails (ExecutionDetails) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on link projectDetails ExecutionDetails - Navigate to page teamproject.png')

"Step 5: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCases (TestCases9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on div testCases TestCases9.png')

"Step 7: Click on span treeSwitchers (CaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on span treeSwitchers CaretDown.png')

"Step 8: Click on span objectItems (Object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectItems', ['span_objectItems_class': span_objectItems_class, 'span_objectItems_nthChild': span_objectItems_nthChild, 'span_objectItems_divNthChild': span_objectItems_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on span objectItems Object.png')

"Step 9: Click on span objectItems (Object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectItems', ['span_objectItems_class': span_objectItems_class_1, 'span_objectItems_nthChild': span_objectItems_nthChild_1, 'span_objectItems_divNthChild': span_objectItems_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on span objectItems Object2.png')

"Step 10: Click on span objectItems (Object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectItems', ['span_objectItems_class': span_objectItems_class_2, 'span_objectItems_nthChild': span_objectItems_nthChild_2, 'span_objectItems_divNthChild': span_objectItems_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Click on span objectItems Object3.png')

"Step 11: Click on div testCases (TestCases9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Click on div testCases TestCases9.png')

"Step 12: Click on link testCDC (TestCDC0023) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCDC"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCDC', ['link_testCDC_nthChild': link_testCDC_nthChild, 'link_testCDC_internalRoleLinkName': link_testCDC_internalRoleLinkName, 'team_id': team_id_1, 'project_id': project_id_1, 'test_cases_id': test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on link testCDC TestCDC0023 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link Reports3 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 13-Click on link Reports3 - Navigate to page teamprojectoverview.png')

"Step 14: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14-Click on link TestRuns5 - Navigate to page teamprojectexecutions.png')

"Step 15: Click on link executionDetails (ExecutionDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id_2, 'executions_id': executions_id, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 15-Click on link executionDetails ExecutionDetails - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button PushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_PushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 16-Click on button PushToXray.png')

"Step 17: Click on div Select"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Select'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 17-Click on div Select.png')

"Step 18: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 18-Click on button CloseDialog.png')

"Step 19: Click on link testItems (Tests2) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testItems', ['team_id': team_id_3, 'project_id': project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 19-Click on link testItems Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link Reports4 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 20-Click on link Reports4 - Navigate to page teamprojectoverview.png')

"Step 21: Click on link TestRuns6 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 21-Click on link TestRuns6 - Navigate to page teamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Verify Test Case Links and Execution Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}