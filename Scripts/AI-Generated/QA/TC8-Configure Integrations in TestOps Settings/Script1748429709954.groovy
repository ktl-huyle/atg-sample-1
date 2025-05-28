import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${organization_id}/home")

"Step 2: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on span object.png')

"Step 3: Click on div mdMhDefaultOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on div mdMhDefaultOrganization.png')

"Step 4: Click on link testOpsCore -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/link_testOpsCore'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link testOpsCore - Navigate to page teamproject.png')

"Step 5: Click on link settings2 -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project/link_settings2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link settings2 - Navigate to page teamprojectsettings.png')

"Step 6: Click on link integrations2 -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_settings/link_integrations2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on link integrations2 - Navigate to page teamprojectintegrations.png')

"Step 7: Click on button testOpsCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/button_testOpsCore'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on button testOpsCore.png')

"Step 8: Click on link mhManProject -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/link_mhManProject'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on link mhManProject - Navigate to page teamproject.png')

"Step 9: Click on link settings3 -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project/link_settings3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on link settings3 - Navigate to page teamprojectsettings.png')

"Step 10: Click on link testEnvironments -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_settings/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on link testEnvironments - Navigate to page teamprojectagent.png')

"Step 11: Click on link integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_agent/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on link integrations.png')

"Step 12: Click on link integrations -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_agent/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on link integrations - Navigate to page teamprojectintegrations.png')

"Step 13: Click on div jiraXrayIntegration -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/div_jiraXrayIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on div jiraXrayIntegration - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Configure Integrations in TestOps Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}