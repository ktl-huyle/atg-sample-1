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

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 4: Click on div dynamicObject (web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild, 'div_dynamicObject_internalText': div_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 4-Click on div dynamicObject web.png')

"Step 5: Click on button dynamicObject (uploadedData) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_dynamicObject', ['button_dynamicObject_internalHasText': button_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 5-Click on button dynamicObject uploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on span treeSwitcher (Icon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher'))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 6-Click on span treeSwitcher Icon2.png')

"Step 7: Click on span treeSwitcher (TreeSwitcher9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1', ['span_treeSwitcher_class': span_treeSwitcher_class, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 7-Click on span treeSwitcher TreeSwitcher9.png')

"Step 8: Click on span treeSwitcher (TreeSwitcherIcon4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_1, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_1, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 8-Click on span treeSwitcher TreeSwitcherIcon4.png')

"Step 9: Click on span treeSwitcher (TreeSwitcherIcon5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_2, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_2, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 9-Click on span treeSwitcher TreeSwitcherIcon5.png')

"Step 10: Click on span treeSwitcher (treeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_3, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_3, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 10-Click on span treeSwitcher treeSwitcherIcon.png')

"Step 11: Click on span treeSwitcher (treeSwitcherIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_2', ['span_treeSwitcher_class': span_treeSwitcher_class_4]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 11-Click on span treeSwitcher treeSwitcherIcon2.png')

"Step 12: Click on span treeSwitcher (TreeSwitcher10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_5, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_4, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 12-Click on span treeSwitcher TreeSwitcher10.png')

"Step 13: Click on span treeSwitcher (treeSwitcherIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_6, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_5, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 13-Click on span treeSwitcher treeSwitcherIcon3.png')

"Step 14: Click on span treeSwitcher (treeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1', ['span_treeSwitcher_class': span_treeSwitcher_class_7, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_6, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 14-Click on span treeSwitcher treeSwitcher.png')

"Step 15: Click on span treeSwitcher (treeSwitcherIcon4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_8, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_7, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 15-Click on span treeSwitcher treeSwitcherIcon4.png')

"Step 16: Click on div sanityLabel -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_sanityLabel'))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 16-Click on div sanityLabel - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on div dynamicObject (sanityLabel2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild_1, 'div_dynamicObject_internalText': div_dynamicObject_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC99/Step 17-Click on div dynamicObject sanityLabel2 - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC99-Interact with Test Design Cases and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}