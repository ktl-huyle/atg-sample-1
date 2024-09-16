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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link noDataProjects (bBhtIpExecution) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_project_id': link_noDataProjects_project_id, 'link_noDataProjects_team_id': link_noDataProjects_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 4-Click on link noDataProjects bBhtIpExecution - Navigate to page teamproject.png')

"Step 5: Click on link tests5 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests5'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 5-Click on link tests5 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCaseDetails (uploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 6-Click on div testCaseDetails uploadedData.png')

"Step 7: Click on span testCaseLabels (katalonStudioTestCasesLabelCaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseLabels', ['span_testCaseLabels_class': span_testCaseLabels_class]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 7-Click on span testCaseLabels katalonStudioTestCasesLabelCaretDown.png')

"Step 8: Click on span objectElements (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class, 'span_objectElements_nthChild': span_objectElements_nthChild, 'span_objectElements_divNthChild': span_objectElements_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 8-Click on span objectElements object13.png')

"Step 9: Click on span objectElements (object14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class_1, 'span_objectElements_nthChild': span_objectElements_nthChild_1, 'span_objectElements_divNthChild': span_objectElements_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 9-Click on span objectElements object14.png')

"Step 10: Click on span objectElements (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_class': span_objectElements_class_2, 'span_objectElements_nthChild': span_objectElements_nthChild_2, 'span_objectElements_divNthChild': span_objectElements_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 10-Click on span objectElements object15.png')

"Step 11: Click on div testCaseDetails (countyDemographicsAnd)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 11-Click on div testCaseDetails countyDemographicsAnd.png')

"Step 12: Click on link testLinks (insuranceDemographics) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testLinks', ['link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName, 'link_testLinks_project_id': link_testLinks_project_id, 'link_testLinks_team_id': link_testLinks_team_id, 'link_testLinks_test_cases_id': link_testLinks_test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 12-Click on link testLinks insuranceDemographics - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on link reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_reports2'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 13-Click on link reports2 - Navigate to page teamprojectoverview.png')

"Step 14: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 14-Click on link testRuns2 - Navigate to page teamprojectexecutions.png')

"Step 15: Click on link testLinks (523) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks', ['link_testLinks_trNthChild': link_testLinks_trNthChild, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_1, 'link_testLinks_project_id': link_testLinks_project_id_1, 'link_testLinks_team_id': link_testLinks_team_id_1, 'link_testLinks_executions_id': link_testLinks_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 15-Click on link testLinks 523 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on button pushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_pushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 16-Click on button pushToXray.png')

"Step 17: Click on div selectNth1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_selectNth1'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 17-Click on div selectNth1.png')

"Step 18: Click on button closeDialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_closeDialogButton'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 18-Click on button closeDialogButton.png')

"Step 19: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 19-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_reports2'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 20-Click on link reports2 - Navigate to page teamprojectoverview.png')

"Step 21: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC399/Step 21-Click on link testRuns2 - Navigate to page teamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC399-Push Tests to Xray and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}