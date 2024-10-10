import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link executionDetails (Execution561) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_nthChild': link_executionDetails_nthChild, 'link_executionDetails_class': link_executionDetails_class, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_project_id': link_executionDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 4-Click on link executionDetails Execution561 - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link Execution2592 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Execution2592'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 5-Click on link Execution2592 - Navigate to page teamprojectgridplanjob.png')

"Step 6: Click on link TestCloudWindowsChrome -> Navigate to page 'team/*/project/*/agent/test-cloud/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_TestCloudWindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 6-Click on link TestCloudWindowsChrome - Navigate to page teamprojectagenttest-cloud.png')

"Step 7: Click on link pageNavigation (Page4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 7-Click on link pageNavigation Page4.png')

"Step 8: Click on link pageNavigation (Page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 8-Click on link pageNavigation Page3.png')

"Step 9: Click on link pageNavigation (Page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild_2, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 9-Click on link pageNavigation Page2.png')

"Step 10: Click on link pageNavigation (Page1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild_3, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 10-Click on link pageNavigation Page1.png')

"Step 11: Click on link pageNavigation (Page2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild_4, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 11-Click on link pageNavigation Page2 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC397-Navigate Through Test Cloud Windows and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}