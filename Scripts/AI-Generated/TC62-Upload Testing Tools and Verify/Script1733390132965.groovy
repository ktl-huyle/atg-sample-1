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

"Step 4: Click on div testingTools (web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testingTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testingTools', ['div_testingTools_nthChild': div_testingTools_nthChild, 'div_testingTools_internalText': div_testingTools_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 4-Click on div testingTools web.png')

"Step 5: Click on button uploadedData -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_uploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 5-Click on button uploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on span treeSwitchers (treeSwitcher0)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 6-Click on span treeSwitchers treeSwitcher0.png')

"Step 7: Click on span treeSwitchers (TreeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 7-Click on span treeSwitchers TreeSwitcher2.png')

"Step 8: Click on span treeSwitchers (treeSwitcher22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_1, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 8-Click on span treeSwitchers treeSwitcher22.png')

"Step 9: Click on span treeSwitchers (treeSwitcher32)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class_1, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_2, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 9-Click on span treeSwitchers treeSwitcher32.png')

"Step 10: Click on span treeSwitchers (treeSwitcher12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class_2, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_3, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 10-Click on span treeSwitchers treeSwitcher12.png')

"Step 11: Click on span katalonStudio (treeSwitcher23)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_katalonStudio"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_katalonStudio', ['span_katalonStudio_class': span_katalonStudio_class]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 11-Click on span katalonStudio treeSwitcher23.png')

"Step 12: Click on span treeSwitchers (TreeSwitcher3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class_3, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_4, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 12-Click on span treeSwitchers TreeSwitcher3.png')

"Step 13: Click on span treeSwitchers (treeSwitcher33)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class_4, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_5, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 13-Click on span treeSwitchers treeSwitcher33.png')

"Step 14: Click on span treeSwitchers (treeSwitcher4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_6, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 14-Click on span treeSwitchers treeSwitcher4.png')

"Step 15: Click on span treeSwitchers (treeSwitcher5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class_5, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_7, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 15-Click on span treeSwitchers treeSwitcher5.png')

"Step 16: Click on div sanity -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_sanity'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 16-Click on div sanity - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on div testingTools (sanity2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testingTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testingTools', ['div_testingTools_nthChild': div_testingTools_nthChild_1, 'div_testingTools_internalText': div_testingTools_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 17-Click on div testingTools sanity2 - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC62-Upload Testing Tools and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}