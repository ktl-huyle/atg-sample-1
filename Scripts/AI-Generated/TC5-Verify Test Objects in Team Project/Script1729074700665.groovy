import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to organization/{*}/settings/agent"

TrueTestScripts.navigate("organization/{*}/settings/agent")

"Step 4: Click on link OfflineMyAgent -> Navigate to page 'settings page#organization/{*}/settings/agent/local/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_OfflineMyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link OfflineMyAgent - Navigate to page settings pageorganizationsettingsagentlocal.png')

"Step 5: Click on link AgentSettings -> Navigate to page 'organization settings#organization/{*}/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent/local/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings_page/link_AgentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on link AgentSettings - Navigate to page organization settingsorganizationsettingsagent.png')

"Step 6: Click on link Kubernetes -> Navigate to page 'settings page#organization/{*}/settings/agent/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link Kubernetes - Navigate to page settings pageorganizationsettingsagent.png')

"Step 7: Click on link CircleCI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings_page/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on link CircleCI.png')

"Step 8: Click on link Local -> Navigate to page 'organization settings#organization/{*}/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings_page/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on link Local - Navigate to page organization settingsorganizationsettingsagent.png')

"Step 9: Click on button object -> Navigate to page 'organization home#organization/{*}/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on button object - Navigate to page organization homeorganizationhome.png')

"Step 10: Click on link projectExecution (FirstProject) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecution', ['link_projectExecution_internalRoleLinkName': link_projectExecution_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on link projectExecution FirstProject - Navigate to page team projectteamproject.png')

"Step 11: Click on link Tests -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on link Tests - Navigate to page team projectteamproject.png')

"Step 12: Click on link Executions -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on link Executions - Navigate to page team projectteamproject.png')

"Step 13: Click on link Tests2 -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on link Tests2 - Navigate to page team projectteamproject.png')

"Step 14: Click on link Executions -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on link Executions - Navigate to page team projectteamproject.png')

"Step 15: Click on link Reports -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on link Reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 16: Click on link Tests -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on link Tests - Navigate to page team projectteamproject.png')

"Step 17: Click on link TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on link TestSuites.png')

"Step 18: Click on link TestObjects -> Navigate to page 'team project test objects#team/{*}/project/{*}/{*}/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on link TestObjects - Navigate to page team project test objectsteamprojecttest-objects.png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Test Objects in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}