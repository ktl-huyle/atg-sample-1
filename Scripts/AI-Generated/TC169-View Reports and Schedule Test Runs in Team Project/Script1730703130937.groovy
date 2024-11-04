import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectLinks (BhtIp) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_project_id': link_projectLinks_project_id, 'link_projectLinks_team_id': link_projectLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 4-Click on link projectLinks BhtIp - Navigate to page teamproject.png')

"Step 5: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 5-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCases (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 6-Click on div testCases UploadedData.png')

"Step 7: Click on span treeSwitchers (CaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 7-Click on span treeSwitchers CaretDown.png')

"Step 8: Click on span treeSwitchers (TreeSwitcher4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_class': span_treeSwitchers_class_1, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 8-Click on span treeSwitchers TreeSwitcher4.png')

"Step 9: Click on span treeSwitchers (TreeSwitcher5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_class': span_treeSwitchers_class_2, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_1, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 9-Click on span treeSwitchers TreeSwitcher5.png')

"Step 10: Click on span treeSwitchers (TreeSwitcher6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_class': span_treeSwitchers_class_3, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_2, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 10-Click on span treeSwitchers TreeSwitcher6.png')

"Step 11: Click on div testCases (CountyDemographics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 11-Click on div testCases CountyDemographics.png')

"Step 12: Click on link testCaseLinks (InsuranceDemographics) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseLinks', ['link_testCaseLinks_internalRoleLinkName': link_testCaseLinks_internalRoleLinkName, 'link_testCaseLinks_team_id': link_testCaseLinks_team_id, 'link_testCaseLinks_test_cases_id': link_testCaseLinks_test_cases_id, 'link_testCaseLinks_project_id': link_testCaseLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 12-Click on link testCaseLinks InsuranceDemographics - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link Reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 13-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 14: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 14-Click on link TestRuns5 - Navigate to page teamprojectexecutions.png')

"Step 15: Click on link executionLinks (Execution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_team_id': link_executionLinks_team_id, 'link_executionLinks_executions_id': link_executionLinks_executions_id, 'link_executionLinks_project_id': link_executionLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 15-Click on link executionLinks Execution - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button PushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_PushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 16-Click on button PushToXray.png')

"Step 17: Click on div SelectOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SelectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 17-Click on div SelectOptions.png')

"Step 18: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 18-Click on button CloseDialog.png')

"Step 19: Click on link testLinks (Tests) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks', ['link_testLinks_project_id': link_testLinks_project_id, 'link_testLinks_team_id': link_testLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 19-Click on link testLinks Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link Reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 20-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 21: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 21-Click on link TestRuns5 - Navigate to page teamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC169-View Reports and Schedule Test Runs in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}