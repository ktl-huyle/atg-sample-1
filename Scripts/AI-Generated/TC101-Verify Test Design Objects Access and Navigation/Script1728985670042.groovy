import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 3: Navigate to /organization/*/settings/agent"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/settings/agent")

"Step 4: Click on link OfflineAgentSettings -> Navigate to page '/organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_OfflineAgentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 4-Click on link OfflineAgentSettings - Navigate to page organizationsettingsagentlocal.png')

"Step 5: Click on link AgentSettings -> Navigate to page '/organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 5-Click on link AgentSettings - Navigate to page organizationsettingsagent.png')

"Step 6: Click on link Kubernetes -> Navigate to page '/organization/*/settings/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 6-Click on link Kubernetes - Navigate to page organizationsettingsagent.png')

"Step 7: Click on link CircleCI -> Navigate to page '/organization/*/settings/agent/circle-ci'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 7-Click on link CircleCI - Navigate to page organizationsettingsagentcircle-ci.png')

"Step 8: Click on link Local -> Navigate to page '/organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/circle-ci?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_circle_ci/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 8-Click on link Local - Navigate to page organizationsettingsagent.png')

"Step 9: Click on button Navigation -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/button_Navigation'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 9-Click on button Navigation - Navigate to page organizationhome.png')

"Step 10: Click on link projectLinks (FirstProject2) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 10-Click on link projectLinks FirstProject2 - Navigate to page teamproject.png')

"Step 11: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 11-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link Executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 12-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 13: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 13-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link Executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 14-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 15: Click on link Reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 15-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 16: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 16-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on link TestSuites -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 17-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link TestObjects -> Navigate to page '/team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 18-Click on link TestObjects - Navigate to page teamprojecttest-designtest-objects.png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC101-Verify Test Design Objects Access and Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}