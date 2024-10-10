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

"Step 4: Click on link projectItems (object) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectItems', ['link_projectItems_internalRoleLinkName': link_projectItems_internalRoleLinkName, 'link_projectItems_team_id': link_projectItems_team_id, 'link_projectItems_project_id': link_projectItems_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC320/Step 4-Click on link projectItems object - Navigate to page teamproject.png')

"Step 5: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC320/Step 5-Click on link Reports - Navigate to page teamproject.png')

"Step 6: Click on link TestRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC320/Step 6-Click on link TestRuns3.png')

"Step 7: Click on link executionItems (1538) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionItems', ['link_executionItems_trNthChild': link_executionItems_trNthChild, 'link_executionItems_internalRoleLinkName': link_executionItems_internalRoleLinkName, 'link_executionItems_project_id': link_executionItems_project_id, 'link_executionItems_executions_id': link_executionItems_executions_id, 'link_executionItems_team_id': link_executionItems_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC320/Step 7-Click on link executionItems 1538 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on span errorMessage (ErrorMV011)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorMessage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorMessage', ['span_errorMessage_class': span_errorMessage_class, 'span_errorMessage_internalRoleButtonName': span_errorMessage_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC320/Step 8-Click on span errorMessage ErrorMV011.png')

"Step 9: Click on div RightSidebar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar_1'))

WebUI.takeScreenshot(reportLocation + '/TC320/Step 9-Click on div RightSidebar.png')

"Step 10: Click on button FailedMV013 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_FailedMV013'))

WebUI.takeScreenshot(reportLocation + '/TC320/Step 10-Click on button FailedMV013 - Navigate to page teamprojectexecutionstest-result.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC320-Access Reports and Verify Execution Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}