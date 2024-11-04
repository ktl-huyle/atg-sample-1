import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

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

"Step 4: Click on button organizationManagement (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement', ['button_organizationManagement_internalRoleButtonName': button_organizationManagement_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 4-Click on button organizationManagement DNEX.png')

"Step 5: Click on button organizationManagement (DNEX2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 5-Click on button organizationManagement DNEX2.png')

"Step 6: Click on button organizationManagement (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement', ['button_organizationManagement_internalRoleButtonName': button_organizationManagement_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 6-Click on button organizationManagement DNEX.png')

"Step 7: Click on div recentProjects (RecentProjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects', ['div_recentProjects_internalText': div_recentProjects_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 7-Click on div recentProjects RecentProjects.png')

"Step 8: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 8-Click on span Settings.png')

"Step 9: Click on link testOps (TestOpsHomepage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testOps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testOps', ['link_testOps_internalRoleLinkName': link_testOps_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 9-Click on link testOps TestOpsHomepage.png')

"Step 10: Click on span DownloadKatalonPackage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_DownloadKatalonPackage'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 10-Click on span DownloadKatalonPackage.png')

"Step 11: Click on button userProfile (AI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile', ['button_userProfile_internalRoleButtonName': button_userProfile_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 11-Click on button userProfile AI.png')

"Step 12: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 12-Click on div Backdrop.png')

"Step 13: Click on button userProfile (AI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile', ['button_userProfile_internalRoleButtonName': button_userProfile_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 13-Click on button userProfile AI.png')

"Step 14: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 14-Click on div Backdrop.png')

"Step 15: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 15-Click on button Settings.png')

"Step 16: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 16-Click on div Backdrop.png')

"Step 17: Click on span DownloadKatalonPackage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_DownloadKatalonPackage'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 17-Click on span DownloadKatalonPackage.png')

"Step 18: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 18-Click on button Settings.png')

"Step 19: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 19-Click on div Backdrop.png')

"Step 20: Click on span organizationNames (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 20-Click on span organizationNames DNEX.png')

"Step 21: Click on div currentOrganizationDetails (TooltipButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails', ['div_currentOrganizationDetails_class': div_currentOrganizationDetails_class, 'div_currentOrganizationDetails_internalHasText': div_currentOrganizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 21-Click on div currentOrganizationDetails TooltipButton.png')

"Step 22: Click on link projectResources (KTKatalonTutorial) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources', ['link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName, 'link_projectResources_team_id': link_projectResources_team_id, 'link_projectResources_project_id': link_projectResources_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 22-Click on link projectResources KTKatalonTutorial - Navigate to page teamproject.png')

"Step 23: Click on button projectActions (KatalonTutorial)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 23-Click on button projectActions KatalonTutorial.png')

"Step 24: Click on link DNEX -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_DNEX'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 24-Click on link DNEX - Navigate to page organizationhome.png')

"Step 25: Click on button organizationManagement (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement', ['button_organizationManagement_internalRoleButtonName': button_organizationManagement_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 25-Click on button organizationManagement DNEX.png')

"Step 26: Click on link myOrganizations (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_myOrganizations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_myOrganizations', ['link_myOrganizations_class': link_myOrganizations_class, 'link_myOrganizations_internalRoleLinkName': link_myOrganizations_internalRoleLinkName, 'link_myOrganizations_organization_id': link_myOrganizations_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 26-Click on link myOrganizations DNEX.png')

"Step 27: Click on link projectResources (KTKatalonTutorial) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources', ['link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName_1, 'link_projectResources_team_id': link_projectResources_team_id_1, 'link_projectResources_project_id': link_projectResources_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 27-Click on link projectResources KTKatalonTutorial - Navigate to page teamproject.png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC43-Verify Project Resources in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}