import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 4: Click on link organizationResources (object) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationResources', ['link_organizationResources_internalRoleLinkName': link_organizationResources_internalRoleLinkName, 'link_organizationResources_project_id': link_organizationResources_project_id, 'link_organizationResources_team_id': link_organizationResources_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 4-Click on link organizationResources object - Navigate to page teamproject.png')

"Step 5: Click on link Reports4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 5-Click on link Reports4 - Navigate to page teamproject.png')

"Step 6: Click on link TestRuns8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 6-Click on link TestRuns8.png')

"Step 7: Click on link executionHistory (1538) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionHistory', ['link_executionHistory_trNthChild': link_executionHistory_trNthChild, 'link_executionHistory_internalRoleLinkName': link_executionHistory_internalRoleLinkName, 'link_executionHistory_team_id': link_executionHistory_team_id, 'link_executionHistory_project_id': link_executionHistory_project_id, 'link_executionHistory_executions_id': link_executionHistory_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 7-Click on link executionHistory 1538 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on span errorDetails (ErrorMV011)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails_1', ['span_errorDetails_class': span_errorDetails_class, 'span_errorDetails_internalRoleButtonName': span_errorDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 8-Click on span errorDetails ErrorMV011.png')

"Step 9: Click on div RightSidebar3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar3'))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 9-Click on div RightSidebar3.png')

"Step 10: Click on button FailedMV013 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_FailedMV013'))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 10-Click on button FailedMV013 - Navigate to page teamprojectexecutionstest-result.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC133-Access Test Execution History from Organization Resources_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}