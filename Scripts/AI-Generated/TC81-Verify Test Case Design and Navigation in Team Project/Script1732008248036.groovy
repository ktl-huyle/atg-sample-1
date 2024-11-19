import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/*/project/*/test-design/test-cases/*")

"Step 4: Click on div testTypes (Web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testTypes', ['div_testTypes_nthChild': div_testTypes_nthChild, 'div_testTypes_internalText': div_testTypes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 4-Click on div testTypes Web.png')

"Step 5: Click on button testSuiteActions (UploadedData) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_testSuiteActions'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 5-Click on button testSuiteActions UploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on span treeSwitchers (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 6-Click on span treeSwitchers Icon.png')

"Step 7: Click on span treeSwitchers (TreeSwitcher11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2', ['span_treeSwitchers_class': span_treeSwitchers_class_1, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 7-Click on span treeSwitchers TreeSwitcher11.png')

"Step 8: Click on span treeSwitchers (TreeSwitcher12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_1, 'span_treeSwitchers_class': span_treeSwitchers_class_2, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 8-Click on span treeSwitchers TreeSwitcher12.png')

"Step 9: Click on span treeSwitchers (TreeSwitcher13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_2, 'span_treeSwitchers_class': span_treeSwitchers_class_3, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 9-Click on span treeSwitchers TreeSwitcher13.png')

"Step 10: Click on span treeSwitchers (TreeSwitcher14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_3, 'span_treeSwitchers_class': span_treeSwitchers_class_4, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 10-Click on span treeSwitchers TreeSwitcher14.png')

"Step 11: Click on span treeSwitchers (TreeSwitcher15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 11-Click on span treeSwitchers TreeSwitcher15.png')

"Step 12: Click on span treeSwitchers (TreeSwitcher16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_4, 'span_treeSwitchers_class': span_treeSwitchers_class_6, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 12-Click on span treeSwitchers TreeSwitcher16.png')

"Step 13: Click on span treeSwitchers (TreeSwitcher17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_5, 'span_treeSwitchers_class': span_treeSwitchers_class_7, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 13-Click on span treeSwitchers TreeSwitcher17.png')

"Step 14: Click on span treeSwitchers (TreeSwitcher18)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2', ['span_treeSwitchers_class': span_treeSwitchers_class_8, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 14-Click on span treeSwitchers TreeSwitcher18.png')

"Step 15: Click on span treeSwitchers (TreeSwitcher19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_6, 'span_treeSwitchers_class': span_treeSwitchers_class_9, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 15-Click on span treeSwitchers TreeSwitcher19.png')

"Step 16: Click on div Sanity -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_Sanity'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 16-Click on div Sanity - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on div testTypes (Sanity2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testTypes', ['div_testTypes_nthChild': div_testTypes_nthChild_1, 'div_testTypes_internalText': div_testTypes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 17-Click on div testTypes Sanity2 - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC81-Verify Test Case Design and Navigation in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}