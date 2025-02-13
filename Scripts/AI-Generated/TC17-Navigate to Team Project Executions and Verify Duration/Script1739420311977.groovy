import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on div RecentProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_RecentProjects'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on div RecentProjects.png')

"Step 3: Click on link executionOverview (TestDetails) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionOverview"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionOverview', ['executions_id': executions_id, 'link_executionOverview_class': link_executionOverview_class, 'link_executionOverview_internalRoleLinkName': link_executionOverview_internalRoleLinkName, 'link_executionOverview_nthChild': link_executionOverview_nthChild, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on link executionOverview TestDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 4: Click on td CoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_CoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on td CoordinatorCore.png')

"Step 5: Click on link testSuites (CoordinatorCore) -> Navigate to page 'team project details#team/*/project/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'link_testSuites_trNthChild': link_testSuites_trNthChild, 'path_param_5': path_param_5, 'path_param_6': path_param_6, 'path_param_7': path_param_7, 'project_id': project_id_1, 'team_id': team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on link testSuites CoordinatorCore - Navigate to page team project detailsteamproject.png')

"Step 6: Click on link testSuiteResults (CoordinatorCore) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuiteResults', ['executions_id': executions_id_1, 'link_testSuiteResults_internalRoleRowName': link_testSuiteResults_internalRoleRowName, 'project_id': project_id_2, 'team_id': team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on link testSuiteResults CoordinatorCore - Navigate to page team project executionsteamprojectexecutions.png')

"Step 7: Click on tr PassedCoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/tr_PassedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on tr PassedCoordinatorCore.png')

"Step 8: Click on td DurationDetails -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_DurationDetails'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on td DurationDetails - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Navigate to Team Project Executions and Verify Duration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}