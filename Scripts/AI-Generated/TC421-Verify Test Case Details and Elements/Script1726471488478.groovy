import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 4: Click on div testDetails (webs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testDetails', ['div_testDetails_nthChild': div_testDetails_nthChild, 'div_testDetails_internalText': div_testDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 4-Click on div testDetails webs.png')

"Step 5: Click on button uploadedDataActions (uploadedDataTestCases) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions', ['button_uploadedDataActions_internalHasText': button_uploadedDataActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 5-Click on button uploadedDataActions uploadedDataTestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on span objectElements (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements'))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 6-Click on span objectElements object3.png')

"Step 7: Click on span objectDetails (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1', ['span_objectDetails_nthChild': span_objectDetails_nthChild, 'span_objectDetails_class': span_objectDetails_class, 'span_objectDetails_divNthChild': span_objectDetails_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 7-Click on span objectDetails object12.png')

"Step 8: Click on span objectElements (object18)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class, 'span_objectElements_nthChild': span_objectElements_nthChild, 'span_objectElements_divNthChild': span_objectElements_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 8-Click on span objectElements object18.png')

"Step 9: Click on span objectElements (object19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class_1, 'span_objectElements_nthChild': span_objectElements_nthChild_1, 'span_objectElements_divNthChild': span_objectElements_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 9-Click on span objectElements object19.png')

"Step 10: Click on span objectElements (object20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class_2, 'span_objectElements_nthChild': span_objectElements_nthChild_2, 'span_objectElements_divNthChild': span_objectElements_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 10-Click on span objectElements object20.png')

"Step 11: Click on span testCaseLabels (object21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseLabels', ['span_testCaseLabels_class': span_testCaseLabels_class]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 11-Click on span testCaseLabels object21.png')

"Step 12: Click on span objectElements (object22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class_3, 'span_objectElements_nthChild': span_objectElements_nthChild_3, 'span_objectElements_divNthChild': span_objectElements_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 12-Click on span objectElements object22.png')

"Step 13: Click on span objectElements (object23)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class_4, 'span_objectElements_nthChild': span_objectElements_nthChild_4, 'span_objectElements_divNthChild': span_objectElements_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 13-Click on span objectElements object23.png')

"Step 14: Click on span objectDetails (object24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1', ['span_objectDetails_nthChild': span_objectDetails_nthChild_1, 'span_objectDetails_class': span_objectDetails_class_1, 'span_objectDetails_divNthChild': span_objectDetails_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 14-Click on span objectDetails object24.png')

"Step 15: Click on span objectElements (object25)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class_5, 'span_objectElements_nthChild': span_objectElements_nthChild_5, 'span_objectElements_divNthChild': span_objectElements_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 15-Click on span objectElements object25.png')

"Step 16: Click on div sanity -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_sanity'))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 16-Click on div sanity - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on div testDetails (sanityS) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testDetails', ['div_testDetails_nthChild': div_testDetails_nthChild_1, 'div_testDetails_internalText': div_testDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC421/Step 17-Click on div testDetails sanityS - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC421-Verify Test Case Details and Elements_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}