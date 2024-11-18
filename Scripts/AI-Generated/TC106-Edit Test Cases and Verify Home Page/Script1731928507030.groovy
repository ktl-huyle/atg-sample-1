import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 2: Click on div dynamicObject (object14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject_1', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild, 'div_dynamicObject_internalText': div_dynamicObject_internalText]))

WebUI.takeScreenshot()

"Step 3: Click on button dynamicObject (object3) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_dynamicObject', ['button_dynamicObject_internalHasText': button_dynamicObject_internalHasText]))

WebUI.takeScreenshot()

"Step 4: Click on span dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild, 'span_dynamicObject_class': span_dynamicObject_class, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild]))

WebUI.takeScreenshot()

"Step 5: Click on span dynamicObject (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject_1', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_1, 'span_dynamicObject_class': span_dynamicObject_class_1, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_1]))

WebUI.takeScreenshot()

"Step 6: Click on span dynamicObject (object22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_2, 'span_dynamicObject_class': span_dynamicObject_class_2, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_2]))

WebUI.takeScreenshot()

"Step 7: Click on span dynamicObject (object23)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_3, 'span_dynamicObject_class': span_dynamicObject_class_3, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_3]))

WebUI.takeScreenshot()

"Step 8: Click on span dynamicObject (object24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_4, 'span_dynamicObject_class': span_dynamicObject_class_4, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_4]))

WebUI.takeScreenshot()

"Step 9: Click on span dynamicObject (object25)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject_2', ['span_dynamicObject_class': span_dynamicObject_class_5]))

WebUI.takeScreenshot()

"Step 10: Click on span dynamicObject (object26)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_5, 'span_dynamicObject_class': span_dynamicObject_class_6, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_5]))

WebUI.takeScreenshot()

"Step 11: Click on span dynamicObject (object27)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_6, 'span_dynamicObject_class': span_dynamicObject_class_7, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_6]))

WebUI.takeScreenshot()

"Step 12: Click on span dynamicObject (object28)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject_1', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_7, 'span_dynamicObject_class': span_dynamicObject_class_8, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_7]))

WebUI.takeScreenshot()

"Step 13: Click on span dynamicObject (object29)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_8, 'span_dynamicObject_class': span_dynamicObject_class_9, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_8]))

WebUI.takeScreenshot()

"Step 14: Click on div object15 -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_object15'))

WebUI.takeScreenshot()

"Step 15: Click on div dynamicObject (object16) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dynamicObject_1', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild_1, 'div_dynamicObject_internalText': div_dynamicObject_internalText_1]))

WebUI.takeScreenshot()

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC106-Edit Test Cases and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}