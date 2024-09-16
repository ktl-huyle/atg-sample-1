import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on div organizationDetails (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails', ['div_organizationDetails_internalText': div_organizationDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC390/Step 4-Click on div organizationDetails object4.png')

"Step 5: Click on link testRuns (3827Cc) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns', ['link_testRuns_class': link_testRuns_class, 'link_testRuns_nthChild': link_testRuns_nthChild, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName, 'link_testRuns_project_id': link_testRuns_project_id, 'link_testRuns_team_id': link_testRuns_team_id, 'link_testRuns_executions_id': link_testRuns_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC390/Step 5-Click on link testRuns 3827Cc - Navigate to page teamprojectexecutions.png')

"Step 6: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC390/Step 6-Click on td object.png')

"Step 7: Click on link testSuites (coordinatorCore) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'link_testSuites_project_id': link_testSuites_project_id, 'link_testSuites_test_suites_id': link_testSuites_test_suites_id, 'link_testSuites_team_id': link_testSuites_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC390/Step 7-Click on link testSuites coordinatorCore - Navigate to page teamprojecttest-designtest-suites.png')

"Step 8: Click on link testSuites (passedCoordinatorCore) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites', ['link_testSuites_internalRoleRowName': link_testSuites_internalRoleRowName, 'link_testSuites_executions_id': link_testSuites_executions_id, 'link_testSuites_project_id': link_testSuites_project_id_1, 'link_testSuites_team_id': link_testSuites_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC390/Step 8-Click on link testSuites passedCoordinatorCore - Navigate to page teamprojectexecutions.png')

"Step 9: Click on tr object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/tr_object'))

WebUI.takeScreenshot(reportLocation + '/TC390/Step 9-Click on tr object.png')

"Step 10: Click on td object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_object2'))

WebUI.takeScreenshot(reportLocation + '/TC390/Step 10-Click on td object2 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC390-Navigate Test Suites in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}