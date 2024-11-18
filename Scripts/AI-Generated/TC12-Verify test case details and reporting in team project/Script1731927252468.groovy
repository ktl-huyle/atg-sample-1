import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on link projectLinks (BhtIp) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link projectLinks BhtIp - Navigate to page teamproject.png')

"Step 5: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCaseDetails (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on div testCaseDetails UploadedData.png')

"Step 7: Click on span treeSwitcher (CaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on span treeSwitcher CaretDown.png')

"Step 8: Click on span testCaseSwitchers (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers', ['span_testCaseSwitchers_nthChild': span_testCaseSwitchers_nthChild, 'span_testCaseSwitchers_class': span_testCaseSwitchers_class, 'span_testCaseSwitchers_divNthChild': span_testCaseSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on span testCaseSwitchers TreeSwitcher.png')

"Step 9: Click on span testCaseSwitchers (TreeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers', ['span_testCaseSwitchers_nthChild': span_testCaseSwitchers_nthChild_1, 'span_testCaseSwitchers_class': span_testCaseSwitchers_class_1, 'span_testCaseSwitchers_divNthChild': span_testCaseSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on span testCaseSwitchers TreeSwitcher2.png')

"Step 10: Click on span testCaseSwitchers (TreeSwitcher3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers', ['span_testCaseSwitchers_nthChild': span_testCaseSwitchers_nthChild_2, 'span_testCaseSwitchers_class': span_testCaseSwitchers_class_2, 'span_testCaseSwitchers_divNthChild': span_testCaseSwitchers_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on span testCaseSwitchers TreeSwitcher3.png')

"Step 11: Click on div testCaseDetails (CountyDemographics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on div testCaseDetails CountyDemographics.png')

"Step 12: Click on link testDesignOptions (InsuranceDemographics) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testDesignOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testDesignOptions', ['link_testDesignOptions_nthChild': link_testDesignOptions_nthChild, 'link_testDesignOptions_internalRoleLinkName': link_testDesignOptions_internalRoleLinkName, 'team_id': team_id_1, 'project_id': project_id_1, 'test_cases_id': test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on link testDesignOptions InsuranceDemographics - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 14: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 15: Click on link executionDetails (Execution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id_2, 'project_id': project_id_2, 'executions_id': executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on link executionDetails Execution - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button PushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_PushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on button PushToXray.png')

"Step 17: Click on div SelectOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SelectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on div SelectOptions.png')

"Step 18: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on button CloseDialog.png')

"Step 19: Click on link testDetails (Tests2) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testDetails', ['team_id': team_id_3, 'project_id': project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on link testDetails Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 20-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 21: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 21-Click on link TestRuns2 - Navigate to page teamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Verify test case details and reporting in team project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}