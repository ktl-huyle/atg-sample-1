import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/web-services"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/web-services")

"Step 2: Click on button SelectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/web-services?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_web_services/button_SelectOrganization'))

WebUI.takeScreenshot()

"Step 3: Click on link MyOrganization -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/web-services?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_web_services/link_MyOrganization'))

WebUI.takeScreenshot()

"Step 4: Click on link navigation (BPBDDPOC) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_navigation', ['link_navigation_internalRoleLinkName': link_navigation_internalRoleLinkName, 'link_navigation_team_id': link_navigation_team_id, 'link_navigation_project_id': link_navigation_project_id]))

WebUI.takeScreenshot()

"Step 5: Click on button BDDPOC"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_BDDPOC'))

WebUI.takeScreenshot()

"Step 6: Click on link Settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings'))

WebUI.takeScreenshot()

"Step 7: Click on label EnableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/label_EnableBDDReports'))

WebUI.takeScreenshot()

"Step 8: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_Save'))

WebUI.takeScreenshot()

"Step 9: Click on div AssertionPattern"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_AssertionPattern'))

WebUI.takeScreenshot()

"Step 10: Click on link Integrations -> Navigate to page 'team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Integrations'))

WebUI.takeScreenshot()

"Step 11: Click on div integrationComponents (KatalonStudio)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_2', ['div_integrationComponents_class': div_integrationComponents_class]))

WebUI.takeScreenshot()

"Step 12: Click on div integrationComponents (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents', ['div_integrationComponents_internalRoleTreeitemName': div_integrationComponents_internalRoleTreeitemName]))

WebUI.takeScreenshot()

"Step 13: Click on div integrationComponents (MobileDeviceTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_3', ['div_integrationComponents_internalText': div_integrationComponents_internalText]))

WebUI.takeScreenshot()

"Step 14: Click on div integrationComponents (Kobiton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_2', ['div_integrationComponents_class': div_integrationComponents_class_1]))

WebUI.takeScreenshot()

"Step 15: Click on div integrationComponents (TestingFramework) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationComponents_3', ['div_integrationComponents_internalText': div_integrationComponents_internalText_1]))

WebUI.takeScreenshot()

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Configure Web Services Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}