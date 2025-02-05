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

"Step 1: Navigate to organization/*/settings/agent"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/settings/agent")

"Step 2: Click on link OfflineMyAgent -> Navigate to page 'settings#organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_OfflineMyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link OfflineMyAgent - Navigate to page settingsorganizationsettingsagentlocal.png')

"Step 3: Click on link AgentSettings -> Navigate to page 'organization settings#organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/link_AgentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link AgentSettings - Navigate to page organization settingsorganizationsettingsagent.png')

"Step 4: Click on link Kubernetes -> Navigate to page 'settings#organization/*/settings/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link Kubernetes - Navigate to page settingsorganizationsettingsagent.png')

"Step 5: Click on link CircleCI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link CircleCI.png')

"Step 6: Click on link Local -> Navigate to page 'organization settings#organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link Local - Navigate to page organization settingsorganizationsettingsagent.png')

"Step 7: Click on button Settings -> Navigate to page 'organization home#organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button Settings - Navigate to page organization homeorganizationhome.png')

"Step 8: Click on link projectDetails (FirstProjectDetails) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link projectDetails FirstProjectDetails - Navigate to page team projectteamproject.png')

"Step 9: Click on link tests (Tests) -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_tests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_tests', ['link_tests_nthChild': link_tests_nthChild, 'path_param_6': path_param_6, 'team_id': team_id_1, 'project_id': project_id_1, 'path_param_5': path_param_5]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on link tests Tests - Navigate to page team project detailsteamproject.png')

"Step 10: Click on link Executions -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on link Executions - Navigate to page team project detailteamproject.png')

"Step 11: Click on link Tests -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on link Tests - Navigate to page team project detailsteamproject.png')

"Step 12: Click on link Executions -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on link Executions - Navigate to page team project detailteamproject.png')

"Step 13: Click on link Reports -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on link Reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 14: Click on link Tests -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on link Tests - Navigate to page team project detailsteamproject.png')

"Step 15: Click on link testSuites (TestSuites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites', ['link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'path_param_6': path_param_6_1, 'team_id': team_id_2, 'project_id': project_id_2, 'path_param_5': path_param_5_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on link testSuites TestSuites.png')

"Step 16: Click on link testSuites (TestObjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites', ['link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName_1, 'path_param_6': path_param_6_2, 'team_id': team_id_3, 'project_id': project_id_3, 'path_param_5': path_param_5_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on link testSuites TestObjects.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Configure Project Settings and Verify Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}