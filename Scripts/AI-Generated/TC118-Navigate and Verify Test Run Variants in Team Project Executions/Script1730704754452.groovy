import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on link Page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page2'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 4-Click on link Page2.png')

"Step 5: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 5-Click on link TestRuns - Navigate to page teamproject.png')

"Step 6: Click on link TestRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 6-Click on link TestRuns2.png')

"Step 7: Click on link testRun (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRun', ['link_testRun_trNthChild': link_testRun_trNthChild, 'link_testRun_internalRoleLinkName': link_testRun_internalRoleLinkName, 'link_testRun_team_id': link_testRun_team_id, 'link_testRun_executions_id': link_testRun_executions_id, 'link_testRun_project_id': link_testRun_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 7-Click on link testRun TestRun.png')

"Step 8: Click on link testRunVariants (TestRun2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunVariants"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunVariants', ['link_testRunVariants_trNthChild': link_testRunVariants_trNthChild, 'link_testRunVariants_internalRoleLinkName': link_testRunVariants_internalRoleLinkName, 'link_testRunVariants_team_id': link_testRunVariants_team_id, 'link_testRunVariants_project_id': link_testRunVariants_project_id, 'link_testRunVariants_executions_id': link_testRunVariants_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 8-Click on link testRunVariants TestRun2 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on td TestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 9-Click on td TestCases.png')

"Step 10: Click on div object -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 10-Click on div object - Navigate to page teamproject.png')

"Step 11: Click on link testRunVariants (TestRun3) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunVariants"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunVariants', ['link_testRunVariants_trNthChild': link_testRunVariants_trNthChild_1, 'link_testRunVariants_internalRoleLinkName': link_testRunVariants_internalRoleLinkName_1, 'link_testRunVariants_team_id': link_testRunVariants_team_id_1, 'link_testRunVariants_project_id': link_testRunVariants_project_id_1, 'link_testRunVariants_executions_id': link_testRunVariants_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 11-Click on link testRunVariants TestRun3 - Navigate to page teamprojectexecutions.png')

"Step 12: Click on pre failedTestInfo (FailedTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestInfo', ['pre_failedTestInfo_class': pre_failedTestInfo_class, 'pre_failedTestInfo_internalRoleButtonName': pre_failedTestInfo_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 12-Click on pre failedTestInfo FailedTest.png')

"Step 13: Click on link object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 13-Click on link object - Navigate to page teamprojectexecutionstest-result.png')

"Step 14: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 14-Click on item object.png')

"Step 15: Click on pre TestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStep'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 15-Click on pre TestStep.png')

"Step 16: Click on pre TestStep -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStep'))

WebUI.takeScreenshot(reportLocation + '/TC118/Step 16-Click on pre TestStep - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC118-Navigate and Verify Test Run Variants in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}