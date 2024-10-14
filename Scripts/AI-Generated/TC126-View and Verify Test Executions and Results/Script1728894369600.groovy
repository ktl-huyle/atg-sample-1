import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Click on link Page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page2'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 4-Click on link Page2.png')

"Step 5: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 5-Click on link TestRuns - Navigate to page teamproject.png')

"Step 6: Click on link TestRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 6-Click on link TestRuns2.png')

"Step 7: Click on link testIdentifier7040 (7040)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testIdentifier7040"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testIdentifier7040', ['link_testIdentifier7040_trNthChild': link_testIdentifier7040_trNthChild, 'link_testIdentifier7040_internalRoleLinkName': link_testIdentifier7040_internalRoleLinkName, 'link_testIdentifier7040_executions_id': link_testIdentifier7040_executions_id, 'link_testIdentifier7040_team_id': link_testIdentifier7040_team_id, 'link_testIdentifier7040_project_id': link_testIdentifier7040_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 7-Click on link testIdentifier7040 7040.png')

"Step 8: Click on link testIdentifiers7036And7041 (7036) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testIdentifiers7036And7041"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testIdentifiers7036And7041', ['link_testIdentifiers7036And7041_trNthChild': link_testIdentifiers7036And7041_trNthChild, 'link_testIdentifiers7036And7041_internalRoleLinkName': link_testIdentifiers7036And7041_internalRoleLinkName, 'link_testIdentifiers7036And7041_team_id': link_testIdentifiers7036And7041_team_id, 'link_testIdentifiers7036And7041_executions_id': link_testIdentifiers7036And7041_executions_id, 'link_testIdentifiers7036And7041_project_id': link_testIdentifiers7036And7041_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 8-Click on link testIdentifiers7036And7041 7036 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on td TestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 9-Click on td TestCases.png')

"Step 10: Click on div SessionsStatus -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SessionsStatus'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 10-Click on div SessionsStatus - Navigate to page teamproject.png')

"Step 11: Click on link testIdentifiers7036And7041 (7041) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testIdentifiers7036And7041"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testIdentifiers7036And7041', ['link_testIdentifiers7036And7041_trNthChild': link_testIdentifiers7036And7041_trNthChild_1, 'link_testIdentifiers7036And7041_internalRoleLinkName': link_testIdentifiers7036And7041_internalRoleLinkName_1, 'link_testIdentifiers7036And7041_team_id': link_testIdentifiers7036And7041_team_id_1, 'link_testIdentifiers7036And7041_executions_id': link_testIdentifiers7036And7041_executions_id_1, 'link_testIdentifiers7036And7041_project_id': link_testIdentifiers7036And7041_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 11-Click on link testIdentifiers7036And7041 7041 - Navigate to page teamprojectexecutions.png')

"Step 12: Click on pre failedTestCase (FailedC17094)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCase', ['pre_failedTestCase_class': pre_failedTestCase_class, 'pre_failedTestCase_internalRoleButtonName': pre_failedTestCase_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 12-Click on pre failedTestCase FailedC17094.png')

"Step 13: Click on link object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 13-Click on link object - Navigate to page teamprojectexecutionstest-result.png')

"Step 14: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 14-Click on item object.png')

"Step 15: Click on pre TestStepFailed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStepFailed'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 15-Click on pre TestStepFailed.png')

"Step 16: Click on pre TestStepFailed -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStepFailed'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 16-Click on pre TestStepFailed - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC126-View and Verify Test Executions and Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}