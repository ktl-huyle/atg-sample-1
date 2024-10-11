import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link organizationLinks (B2BSAS) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_project_id': link_organizationLinks_project_id, 'link_organizationLinks_team_id': link_organizationLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link organizationLinks B2BSAS - Navigate to page teamproject.png')

"Step 5: Click on link CreateRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_CreateRelease'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link CreateRelease.png')

"Step 6: Click on link Executions3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on link Executions3 - Navigate to page teamproject.png')

"Step 7: Click on link reportLinks (Reports)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on link reportLinks Reports.png')

"Step 8: Click on link reportLinks (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_nthChild': link_reportLinks_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on link reportLinks Settings.png')

"Step 9: Click on link projectNavigation (ScriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on link projectNavigation ScriptRepositories.png')

"Step 10: Click on link projectNavigation (TestEnvironments)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on link projectNavigation TestEnvironments.png')

"Step 11: Click on list LocalKubernetes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/list_LocalKubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on list LocalKubernetes.png')

"Step 12: Click on link Kubernetes -> Navigate to page 'team/*/project/*/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on link Kubernetes - Navigate to page teamprojectagent.png')

"Step 13: Click on link CircleCI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on link CircleCI.png')

"Step 14: Click on link TestCloud -> Navigate to page 'team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on link TestCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 15: Click on link Integrations -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on link Integrations - Navigate to page teamproject.png')

"Step 16: Click on div Jenkins"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Jenkins'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on div Jenkins.png')

"Step 17: Click on link projectNavigation (TestCloudTunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_2, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on link projectNavigation TestCloudTunnels.png')

"Step 18: Click on button Setup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Setup'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on button Setup.png')

"Step 19: Click on link projectNavigation (CustomFields)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on link projectNavigation CustomFields.png')

"Step 20: Click on link Dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on link Dashboard2 - Navigate to page teamproject.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Navigate to Project Links and Setup_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}