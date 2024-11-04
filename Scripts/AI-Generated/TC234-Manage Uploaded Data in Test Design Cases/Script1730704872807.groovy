import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 4: Click on div dynamicObject (Web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild, 'div_dynamicObject_internalText': div_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 4-Click on div dynamicObject Web.png')

"Step 5: Click on button uploadedData (UploadedData) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedData', ['button_uploadedData_internalHasText': button_uploadedData_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 5-Click on button uploadedData UploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on span treeSwitchers (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 6-Click on span treeSwitchers Icon.png')

"Step 7: Click on span treeSwitchers (TreeSwitcher7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 7-Click on span treeSwitchers TreeSwitcher7.png')

"Step 8: Click on span treeSwitchers (TreeSwitcher8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_1, 'span_treeSwitchers_class': span_treeSwitchers_class_1, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 8-Click on span treeSwitchers TreeSwitcher8.png')

"Step 9: Click on span treeSwitchers (TreeSwitcher9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_2, 'span_treeSwitchers_class': span_treeSwitchers_class_2, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 9-Click on span treeSwitchers TreeSwitcher9.png')

"Step 10: Click on span treeSwitchers (TreeSwitcher10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_3, 'span_treeSwitchers_class': span_treeSwitchers_class_3, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 10-Click on span treeSwitchers TreeSwitcher10.png')

"Step 11: Click on span treeSwitchers (TreeSwitcher11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2', ['span_treeSwitchers_class': span_treeSwitchers_class_4]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 11-Click on span treeSwitchers TreeSwitcher11.png')

"Step 12: Click on span treeSwitchers (TreeSwitcher12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_4, 'span_treeSwitchers_class': span_treeSwitchers_class_5, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 12-Click on span treeSwitchers TreeSwitcher12.png')

"Step 13: Click on span treeSwitchers (TreeSwitcher13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_5, 'span_treeSwitchers_class': span_treeSwitchers_class_6, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 13-Click on span treeSwitchers TreeSwitcher13.png')

"Step 14: Click on span treeSwitchers (TreeSwitcher14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_6, 'span_treeSwitchers_class': span_treeSwitchers_class_7, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 14-Click on span treeSwitchers TreeSwitcher14.png')

"Step 15: Click on span treeSwitchers (TreeSwitcher15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_7, 'span_treeSwitchers_class': span_treeSwitchers_class_8, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 15-Click on span treeSwitchers TreeSwitcher15.png')

"Step 16: Click on div Sanity -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_Sanity'))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 16-Click on div Sanity - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on div dynamicObject (Sanity2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild_1, 'div_dynamicObject_internalText': div_dynamicObject_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC234/Step 17-Click on div dynamicObject Sanity2 - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC234-Manage Uploaded Data in Test Design Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}