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

"Step 3: Navigate to team/*/project/*/web-services"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/web-services")

"Step 4: Click on button BDDPOC"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/web-services?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_web_services/button_BDDPOC'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 4-Click on button BDDPOC.png')

"Step 5: Click on link MyOrganization01 -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/web-services?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_web_services/link_MyOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 5-Click on link MyOrganization01 - Navigate to page organizationhome.png')

"Step 6: Click on link projectNavigation (BPBDDPOCNoData) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_team_id': link_projectNavigation_team_id, 'link_projectNavigation_project_id': link_projectNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 6-Click on link projectNavigation BPBDDPOCNoData - Navigate to page teamproject.png')

"Step 7: Click on button projectAction (BDDPOC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectAction', ['button_projectAction_internalRoleButtonName': button_projectAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 7-Click on button projectAction BDDPOC.png')

"Step 8: Click on link Settings3 -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings3'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 8-Click on link Settings3 - Navigate to page teamprojectsettings.png')

"Step 9: Click on label EnableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/label_EnableBDDReports'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 9-Click on label EnableBDDReports.png')

"Step 10: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 10-Click on button Save.png')

"Step 11: Click on div AssertionPattern"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_AssertionPattern'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 11-Click on div AssertionPattern.png')

"Step 12: Click on link Integrations -> Navigate to page 'team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 12-Click on link Integrations - Navigate to page teamprojectintegrations.png')

"Step 13: Click on div integrationTool (KatalonStudio)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool', ['div_integrationTool_class': div_integrationTool_class]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 13-Click on div integrationTool KatalonStudio.png')

"Step 14: Click on div integrationTool (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool_1', ['div_integrationTool_internalRoleTreeitemName': div_integrationTool_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 14-Click on div integrationTool ALMTestManagement.png')

"Step 15: Click on div integrationTool (MobileDeviceTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool_2', ['div_integrationTool_internalText': div_integrationTool_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 15-Click on div integrationTool MobileDeviceTesting.png')

"Step 16: Click on div integrationTool (Kobiton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool', ['div_integrationTool_class': div_integrationTool_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 16-Click on div integrationTool Kobiton.png')

"Step 17: Click on div integrationTool (TestingFramework) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTool_2', ['div_integrationTool_internalText': div_integrationTool_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 17-Click on div integrationTool TestingFramework - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC86-Configure and Save Project Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}