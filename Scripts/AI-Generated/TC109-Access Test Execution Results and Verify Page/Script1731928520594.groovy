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

"Step 1: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 2: Click on div dynamicObject (object55)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class, 'div_dynamicObject_internalRoleButtonName': div_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 3: Click on link teamProjectExecutionsTestResultC17094 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_teamProjectExecutionsTestResultC17094'))

WebUI.takeScreenshot()

"Step 4: Click on li object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/li_object'))

WebUI.takeScreenshot()

"Step 5: Click on li object2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/li_object2'))

WebUI.takeScreenshot()

"Step 6: Click on link object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object2'))

WebUI.takeScreenshot()

"Step 7: Click on link testRuns5 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns5'))

WebUI.takeScreenshot()

"Step 8: Click on link testRuns13 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns13'))

WebUI.takeScreenshot()

"Step 9: Click on link teamProjectExecutions (teamProjectExecutions19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions', ['link_teamProjectExecutions_trNthChild': link_teamProjectExecutions_trNthChild, 'link_teamProjectExecutions_internalRoleLinkName': link_teamProjectExecutions_internalRoleLinkName, 'link_teamProjectExecutions_team_id': link_teamProjectExecutions_team_id, 'link_teamProjectExecutions_project_id': link_teamProjectExecutions_project_id, 'link_teamProjectExecutions_executions_id': link_teamProjectExecutions_executions_id]))

WebUI.takeScreenshot()

"Step 10: Click on link teamProjectExecutions (teamProjectExecutions20) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions', ['link_teamProjectExecutions_trNthChild': link_teamProjectExecutions_trNthChild_1, 'link_teamProjectExecutions_internalRoleLinkName': link_teamProjectExecutions_internalRoleLinkName_1, 'link_teamProjectExecutions_team_id': link_teamProjectExecutions_team_id_1, 'link_teamProjectExecutions_project_id': link_teamProjectExecutions_project_id_1, 'link_teamProjectExecutions_executions_id': link_teamProjectExecutions_executions_id_1]))

WebUI.takeScreenshot()

"Step 11: Click on td dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_dynamicObject', ['td_dynamicObject_internalRoleCellName': td_dynamicObject_internalRoleCellName]))

WebUI.takeScreenshot()

"Step 12: Click on div dynamicObject (object56) -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject_1'))

WebUI.takeScreenshot()

"Step 13: Click on link teamProjectExecutions (teamProjectExecutions21) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_teamProjectExecutions', ['link_teamProjectExecutions_trNthChild': link_teamProjectExecutions_trNthChild_2, 'link_teamProjectExecutions_internalRoleLinkName': link_teamProjectExecutions_internalRoleLinkName_2, 'link_teamProjectExecutions_team_id': link_teamProjectExecutions_team_id_2, 'link_teamProjectExecutions_project_id': link_teamProjectExecutions_project_id_2, 'link_teamProjectExecutions_executions_id': link_teamProjectExecutions_executions_id_2]))

WebUI.takeScreenshot()

"Step 14: Click on pre dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_dynamicObject', ['pre_dynamicObject_class': pre_dynamicObject_class, 'pre_dynamicObject_internalRoleButtonName': pre_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 15: Click on link object3 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object3'))

WebUI.takeScreenshot()

"Step 16: Click on li object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/li_object2'))

WebUI.takeScreenshot()

"Step 17: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_object'))

WebUI.takeScreenshot()

"Step 18: Click on pre object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_object'))

WebUI.takeScreenshot()

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC109-Access Test Execution Results and Verify Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}