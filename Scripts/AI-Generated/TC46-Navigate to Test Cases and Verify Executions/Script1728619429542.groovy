import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 4: Click on link projectNavigation (BbhtIpExecution) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_team_id': link_projectNavigation_team_id, 'link_projectNavigation_project_id': link_projectNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 4-Click on link projectNavigation BbhtIpExecution - Navigate to page teamproject.png')

"Step 5: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 5-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCasesSection (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection', ['div_testCasesSection_internalText': div_testCasesSection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 6-Click on div testCasesSection UploadedData.png')

"Step 7: Click on span treeSwitcher (CaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_2', ['span_treeSwitcher_class': span_treeSwitcher_class]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 7-Click on span treeSwitcher CaretDown.png')

"Step 8: Click on span treeSwitcher (TreeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_1, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 8-Click on span treeSwitcher TreeSwitcherIcon.png')

"Step 9: Click on span treeSwitcher (TreeSwitcherIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_2, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_1, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 9-Click on span treeSwitcher TreeSwitcherIcon2.png')

"Step 10: Click on span treeSwitcher (TreeSwitcherIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_3, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_2, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 10-Click on span treeSwitcher TreeSwitcherIcon3.png')

"Step 11: Click on div testCasesSection (CountyDemographics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection', ['div_testCasesSection_internalText': div_testCasesSection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 11-Click on div testCasesSection CountyDemographics.png')

"Step 12: Click on link testCaseNavigation (InsuranceDemographics) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_internalRoleLinkName': link_testCaseNavigation_internalRoleLinkName, 'link_testCaseNavigation_test_cases_id': link_testCaseNavigation_test_cases_id, 'link_testCaseNavigation_team_id': link_testCaseNavigation_team_id, 'link_testCaseNavigation_project_id': link_testCaseNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 12-Click on link testCaseNavigation InsuranceDemographics - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 13-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 14: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 14-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 15: Click on link executionDetails (523) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 15-Click on link executionDetails 523 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button PushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_PushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 16-Click on button PushToXray.png')

"Step 17: Click on div SelectDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SelectDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 17-Click on div SelectDropdown.png')

"Step 18: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 18-Click on button CloseDialog.png')

"Step 19: Click on link testNavigation (Tests) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testNavigation', ['link_testNavigation_team_id': link_testNavigation_team_id, 'link_testNavigation_project_id': link_testNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 19-Click on link testNavigation Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 20-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 21: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 21-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC46-Navigate to Test Cases and Verify Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}