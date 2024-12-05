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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to organization/*/settings/agent"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/settings/agent")

"Step 4: Click on link OfflineMyAgent -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_OfflineMyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 4-Click on link OfflineMyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 5: Click on link AgentSettings -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 5-Click on link AgentSettings - Navigate to page organizationsettingsagent.png')

"Step 6: Click on link Kubernetes -> Navigate to page 'organization/*/settings/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 6-Click on link Kubernetes - Navigate to page organizationsettingsagent.png')

"Step 7: Click on link CircleCI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 7-Click on link CircleCI.png')

"Step 8: Click on link Local -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 8-Click on link Local - Navigate to page organizationsettingsagent.png')

"Step 9: Click on button NavigationButton -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/button_NavigationButton'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 9-Click on button NavigationButton - Navigate to page organizationhome.png')

"Step 10: Click on link firstProjectsAndDataStatus (FPFirstProject) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_firstProjectsAndDataStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_firstProjectsAndDataStatus', ['link_firstProjectsAndDataStatus_internalRoleLinkName': link_firstProjectsAndDataStatus_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 10-Click on link firstProjectsAndDataStatus FPFirstProject - Navigate to page teamproject.png')

"Step 11: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 11-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link Executions2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 12-Click on link Executions2 - Navigate to page teamproject.png')

"Step 13: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 13-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link Executions2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 14-Click on link Executions2 - Navigate to page teamproject.png')

"Step 15: Click on link reportsAndSettings (Reports2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndSettings', ['link_reportsAndSettings_nthChild': link_reportsAndSettings_nthChild, 'link_reportsAndSettings_internalRoleLinkName': link_reportsAndSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 15-Click on link reportsAndSettings Reports2.png')

"Step 16: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 16-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 17-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link TestObjects -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 18-Click on link TestObjects - Navigate to page teamprojecttest-designtest-objects.png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-Verify Test Design Objects in Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}