import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectLinks (Execution) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 4-Click on link projectLinks Execution - Navigate to page teamproject.png')

"Step 5: Click on link Tests2 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 5-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCasesSection (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection', ['div_testCasesSection_internalText': div_testCasesSection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 6-Click on div testCasesSection UploadedData.png')

"Step 7: Click on span treeSwitcherIcons (CaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 7-Click on span treeSwitcherIcons CaretDown.png')

"Step 8: Click on span treeSwitcherIcons (TreeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_1, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 8-Click on span treeSwitcherIcons TreeSwitcherIcon.png')

"Step 9: Click on span treeSwitcherIcons (TreeSwitcherIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_1, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_2, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 9-Click on span treeSwitcherIcons TreeSwitcherIcon2.png')

"Step 10: Click on span treeSwitcherIcons (TreeSwitcherIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_2, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_3, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 10-Click on span treeSwitcherIcons TreeSwitcherIcon3.png')

"Step 11: Click on div testCasesSection (CountyDemographics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection', ['div_testCasesSection_internalText': div_testCasesSection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 11-Click on div testCasesSection CountyDemographics.png')

"Step 12: Click on link InsuranceDemographics -> Navigate to page '/team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_InsuranceDemographics'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 12-Click on link InsuranceDemographics - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 13-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 14: Click on link TestRuns4 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 14-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 15: Click on link executionLinks (Executions2) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 15-Click on link executionLinks Executions2 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button PushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_PushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 16-Click on button PushToXray.png')

"Step 17: Click on div SelectDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SelectDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 17-Click on div SelectDropdown.png')

"Step 18: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 18-Click on button CloseDialog.png')

"Step 19: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 19-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 20-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 21: Click on link TestRuns4 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 21-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC111-Verify Test Design Cases and Reports Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}