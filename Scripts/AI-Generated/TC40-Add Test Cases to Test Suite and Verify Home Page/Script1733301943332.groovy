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

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 4: Click on div testCaseItems (testCaseItems)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_nthChild': div_testCaseItems_nthChild, 'div_testCaseItems_internalText': div_testCaseItems_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 4-Click on div testCaseItems testCaseItems.png')

"Step 5: Click on button addToTestSuite -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_addToTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 5-Click on button addToTestSuite - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on span testCaseItems (testCaseItems2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 6-Click on span testCaseItems testCaseItems2.png')

"Step 7: Click on span treeSwitcher (treeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 7-Click on span treeSwitcher treeSwitcher.png')

"Step 8: Click on span testCaseItems (objectItems5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_class': span_testCaseItems_class, 'span_testCaseItems_nthChild': span_testCaseItems_nthChild, 'span_testCaseItems_divNthChild': span_testCaseItems_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 8-Click on span testCaseItems objectItems5.png')

"Step 9: Click on span testCaseItems (objectItems6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_class': span_testCaseItems_class_1, 'span_testCaseItems_nthChild': span_testCaseItems_nthChild_1, 'span_testCaseItems_divNthChild': span_testCaseItems_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 9-Click on span testCaseItems objectItems6.png')

"Step 10: Click on span testCaseItems (objectItems7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_class': span_testCaseItems_class_2, 'span_testCaseItems_nthChild': span_testCaseItems_nthChild_2, 'span_testCaseItems_divNthChild': span_testCaseItems_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 10-Click on span testCaseItems objectItems7.png')

"Step 11: Click on span treeSwitchers (treeSwitchers2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 11-Click on span treeSwitchers treeSwitchers2.png')

"Step 12: Click on span testCaseItems (objectItems8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_class': span_testCaseItems_class_3, 'span_testCaseItems_nthChild': span_testCaseItems_nthChild_3, 'span_testCaseItems_divNthChild': span_testCaseItems_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 12-Click on span testCaseItems objectItems8.png')

"Step 13: Click on span testCaseItems (objectItems9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_class': span_testCaseItems_class_4, 'span_testCaseItems_nthChild': span_testCaseItems_nthChild_4, 'span_testCaseItems_divNthChild': span_testCaseItems_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 13-Click on span testCaseItems objectItems9.png')

"Step 14: Click on span treeSwitcher (treeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_1, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 14-Click on span treeSwitcher treeSwitcher2.png')

"Step 15: Click on span testCaseItems (objectItems10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_class': span_testCaseItems_class_5, 'span_testCaseItems_nthChild': span_testCaseItems_nthChild_5, 'span_testCaseItems_divNthChild': span_testCaseItems_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 15-Click on span testCaseItems objectItems10.png')

"Step 16: Click on div Sanity -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_Sanity'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 16-Click on div Sanity - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on div testCaseItems (testCaseItems2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_nthChild': div_testCaseItems_nthChild_1, 'div_testCaseItems_internalText': div_testCaseItems_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 17-Click on div testCaseItems testCaseItems2 - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC40-Add Test Cases to Test Suite and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}