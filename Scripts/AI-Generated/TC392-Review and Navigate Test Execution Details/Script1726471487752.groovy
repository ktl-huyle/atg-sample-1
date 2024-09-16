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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on div failedQueries (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries', ['div_failedQueries_class': div_failedQueries_class, 'div_failedQueries_internalRoleButtonName': div_failedQueries_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 4-Click on div failedQueries object.png')

"Step 5: Click on link requests -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_requests'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 5-Click on link requests - Navigate to page teamprojectexecutionstest-result.png')

"Step 6: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 6-Click on item object.png')

"Step 7: Click on item object2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 7-Click on item object2 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on link page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_page2'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 8-Click on link page2.png')

"Step 9: Click on link testRuns2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 9-Click on link testRuns2 - Navigate to page teamproject.png')

"Step 10: Click on link testRuns6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 10-Click on link testRuns6.png')

"Step 11: Click on link objectLinks (executions8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_objectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_objectLinks', ['link_objectLinks_trNthChild': link_objectLinks_trNthChild, 'link_objectLinks_internalRoleLinkName': link_objectLinks_internalRoleLinkName, 'link_objectLinks_project_id': link_objectLinks_project_id, 'link_objectLinks_team_id': link_objectLinks_team_id, 'link_objectLinks_executions_id': link_objectLinks_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 11-Click on link objectLinks executions8.png')

"Step 12: Click on link executionObjects (executions7036) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName, 'link_executionObjects_project_id': link_executionObjects_project_id, 'link_executionObjects_team_id': link_executionObjects_team_id, 'link_executionObjects_executions_id': link_executionObjects_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 12-Click on link executionObjects executions7036 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on td testCaseDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCaseDetails', ['td_testCaseDetails_internalRoleCellName': td_testCaseDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 13-Click on td testCaseDetails object3.png')

"Step 14: Click on div object2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 14-Click on div object2 - Navigate to page teamproject.png')

"Step 15: Click on link executionObjects (executions9) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild_1, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName_1, 'link_executionObjects_project_id': link_executionObjects_project_id_1, 'link_executionObjects_team_id': link_executionObjects_team_id_1, 'link_executionObjects_executions_id': link_executionObjects_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 15-Click on link executionObjects executions9 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on pre failedVerifications (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications', ['pre_failedVerifications_class': pre_failedVerifications_class, 'pre_failedVerifications_internalRoleButtonName': pre_failedVerifications_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 16-Click on pre failedVerifications object.png')

"Step 17: Click on link object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 17-Click on link object - Navigate to page teamprojectexecutionstest-result.png')

"Step 18: Click on item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 18-Click on item object2.png')

"Step 19: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 19-Click on pre object.png')

"Step 20: Click on pre object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC392/Step 20-Click on pre object - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC392-Review and Navigate Test Execution Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}