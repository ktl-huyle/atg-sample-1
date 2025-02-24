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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on div RecentProjects.png')

"Step 3: Click on link executionDetails (TestExecutionDetails) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['executions_id': executions_id, 'link_executionDetails_class': link_executionDetails_class, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_nthChild': link_executionDetails_nthChild, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link executionDetails TestExecutionDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 4: Click on td CoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_CoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on td CoordinatorCore.png')

"Step 5: Click on link CoordinatorCoreTestSuites -> Navigate to page 'team project details#team/*/project/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_CoordinatorCoreTestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link CoordinatorCoreTestSuites - Navigate to page team project detailsteamproject.png')

"Step 6: Click on link CoordinatorCore -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_CoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link CoordinatorCore - Navigate to page team project executionsteamprojectexecutions.png')

"Step 7: Click on tr PassedCoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/tr_PassedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on tr PassedCoordinatorCore.png')

"Step 8: Click on td DurationInfo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_DurationInfo'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on td DurationInfo - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Access and Review Coordinator Core Test Suites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}