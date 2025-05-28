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

"Step 2: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on button object.png')

"Step 3: Click on button userActions (qa)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_organization_home/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_organization_home/button_userActions', ['button_userActions_buttonTitle': button_userActions_buttonTitle]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on button userActions qa.png')

"Step 4: Click on link signOut (signOut)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_organization_home/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_organization_home/link_signOut', ['link_signOut_aTitle': link_signOut_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link signOut signOut.png')

"Step 5: Click on link noDataDisplay -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/link_noDataDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link noDataDisplay - Navigate to page teamproject.png')

"Step 6: Click on link settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link settings - Navigate to page teamprojectsettings.png')

"Step 7: Click on link integrations -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_settings/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link integrations - Navigate to page teamprojectintegrations.png')

"Step 8: Click on div jiraXrayIntegration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/div_jiraXrayIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on div jiraXrayIntegration.png')

"Step 9: Click on button testConnection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/button_testConnection'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on button testConnection.png')

"Step 10: Click on div qaEnv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/div_qaEnv'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on div qaEnv.png')

"Step 11: Click on div qaEnvOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/div_qaEnvOption'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on div qaEnvOption.png')

"Step 12: Click on div qeBoardSelector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/div_qeBoardSelector'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on div qeBoardSelector.png')

"Step 13: Click on div qeBoardOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/div_qeBoardOption'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on div qeBoardOption.png')

"Step 14: Click on button save -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_integrations/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on button save - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Sign Out and Configure Jira Xray Integration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}