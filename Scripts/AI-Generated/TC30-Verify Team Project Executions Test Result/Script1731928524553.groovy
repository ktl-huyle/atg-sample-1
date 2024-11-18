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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link testCases (rRdCrewPaycalMaxtermTlStaffRegTestCases1) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testCases', ['link_testCases_internalRoleLinkName': link_testCases_internalRoleLinkName, 'link_testCases_team_id': link_testCases_team_id, 'link_testCases_project_id': link_testCases_project_id]))

WebUI.takeScreenshot()

"Step 3: Click on link reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports_1'))

WebUI.takeScreenshot()

"Step 4: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns2'))

WebUI.takeScreenshot()

"Step 5: Click on link teamProjectExecutions (teamProjectExecutions) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions', ['link_teamProjectExecutions_trNthChild': link_teamProjectExecutions_trNthChild, 'link_teamProjectExecutions_internalRoleLinkName': link_teamProjectExecutions_internalRoleLinkName, 'link_teamProjectExecutions_team_id': link_teamProjectExecutions_team_id, 'link_teamProjectExecutions_project_id': link_teamProjectExecutions_project_id, 'link_teamProjectExecutions_executions_id': link_teamProjectExecutions_executions_id]))

WebUI.takeScreenshot()

"Step 6: Click on span dynamicObject (testSuitesTsMasterVendorDebugQaUat)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_dynamicObject_1', ['span_dynamicObject_class': span_dynamicObject_class, 'span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 7: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object_1'))

WebUI.takeScreenshot()

"Step 8: Click on button externalLink (externalLinkButton) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLink'))

WebUI.takeScreenshot()

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC30-Verify Team Project Executions Test Result_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}