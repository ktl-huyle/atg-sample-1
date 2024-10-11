import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 4: Click on div testCaseLabels (web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseLabels', ['div_testCaseLabels_nthChild': div_testCaseLabels_nthChild, 'div_testCaseLabels_internalText': div_testCaseLabels_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 4-Click on div testCaseLabels web.png')

"Step 5: Click on button uploadedData -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_uploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 5-Click on button uploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on span treeSwitcherElements (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 6-Click on span treeSwitcherElements Icon.png')

"Step 7: Click on span treeSwitcherIcons (TreeSwitcher3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 7-Click on span treeSwitcherIcons TreeSwitcher3.png')

"Step 8: Click on span treeSwitcherElements (TreeSwitcherIcon4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements', ['span_treeSwitcherElements_class': span_treeSwitcherElements_class, 'span_treeSwitcherElements_nthChild': span_treeSwitcherElements_nthChild, 'span_treeSwitcherElements_divNthChild': span_treeSwitcherElements_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 8-Click on span treeSwitcherElements TreeSwitcherIcon4.png')

"Step 9: Click on span treeSwitcherElements (TreeSwitcherIcon5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements', ['span_treeSwitcherElements_class': span_treeSwitcherElements_class_1, 'span_treeSwitcherElements_nthChild': span_treeSwitcherElements_nthChild_1, 'span_treeSwitcherElements_divNthChild': span_treeSwitcherElements_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 9-Click on span treeSwitcherElements TreeSwitcherIcon5.png')

"Step 10: Click on span treeSwitcherElements (treeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements', ['span_treeSwitcherElements_class': span_treeSwitcherElements_class_2, 'span_treeSwitcherElements_nthChild': span_treeSwitcherElements_nthChild_2, 'span_treeSwitcherElements_divNthChild': span_treeSwitcherElements_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 10-Click on span treeSwitcherElements treeSwitcherIcon.png')

"Step 11: Click on span treeSwitcherIcons (treeSwitcherIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons_1', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 11-Click on span treeSwitcherIcons treeSwitcherIcon2.png')

"Step 12: Click on span treeSwitcherElements (TreeSwitcher4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements', ['span_treeSwitcherElements_class': span_treeSwitcherElements_class_3, 'span_treeSwitcherElements_nthChild': span_treeSwitcherElements_nthChild_3, 'span_treeSwitcherElements_divNthChild': span_treeSwitcherElements_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 12-Click on span treeSwitcherElements TreeSwitcher4.png')

"Step 13: Click on span treeSwitcherElements (treeSwitcherIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements', ['span_treeSwitcherElements_class': span_treeSwitcherElements_class_4, 'span_treeSwitcherElements_nthChild': span_treeSwitcherElements_nthChild_4, 'span_treeSwitcherElements_divNthChild': span_treeSwitcherElements_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 13-Click on span treeSwitcherElements treeSwitcherIcon3.png')

"Step 14: Click on span treeSwitcherIcons (treeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_1, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 14-Click on span treeSwitcherIcons treeSwitcher.png')

"Step 15: Click on span treeSwitcherElements (treeSwitcherIcon4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherElements', ['span_treeSwitcherElements_class': span_treeSwitcherElements_class_5, 'span_treeSwitcherElements_nthChild': span_treeSwitcherElements_nthChild_5, 'span_treeSwitcherElements_divNthChild': span_treeSwitcherElements_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 15-Click on span treeSwitcherElements treeSwitcherIcon4.png')

"Step 16: Click on div sanityLabel -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_sanityLabel'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 16-Click on div sanityLabel - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on div testCaseLabels (sanityLabel2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseLabels', ['div_testCaseLabels_nthChild': div_testCaseLabels_nthChild_1, 'div_testCaseLabels_internalText': div_testCaseLabels_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 17-Click on div testCaseLabels sanityLabel2 - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC436-Review and Manage Test Cases in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}