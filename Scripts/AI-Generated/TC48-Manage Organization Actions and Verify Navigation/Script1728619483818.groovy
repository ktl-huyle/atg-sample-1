import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on button organizationAction (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction', ['button_organizationAction_internalRoleButtonName': button_organizationAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 4-Click on button organizationAction DNEX.png')

"Step 5: Click on button organizationAction (DNEX2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 5-Click on button organizationAction DNEX2.png')

"Step 6: Click on button organizationAction (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction', ['button_organizationAction_internalRoleButtonName': button_organizationAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 6-Click on button organizationAction DNEX.png')

"Step 7: Click on div recentProjects (RecentProjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects', ['div_recentProjects_internalText': div_recentProjects_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 7-Click on div recentProjects RecentProjects.png')

"Step 8: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 8-Click on span SettingsButton.png')

"Step 9: Click on link organizationNavigation (TestOpsHomepage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation_1', ['link_organizationNavigation_internalRoleLinkName': link_organizationNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 9-Click on link organizationNavigation TestOpsHomepage.png')

"Step 10: Click on span DownloadKatalonPackage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_DownloadKatalonPackage'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 10-Click on span DownloadKatalonPackage.png')

"Step 11: Click on button teamMemberAction (AI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction', ['button_teamMemberAction_internalRoleButtonName': button_teamMemberAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 11-Click on button teamMemberAction AI.png')

"Step 12: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 12-Click on div Backdrop.png')

"Step 13: Click on button teamMemberAction (AI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction', ['button_teamMemberAction_internalRoleButtonName': button_teamMemberAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 13-Click on button teamMemberAction AI.png')

"Step 14: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 14-Click on div Backdrop.png')

"Step 15: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 15-Click on button Settings.png')

"Step 16: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 16-Click on div Backdrop.png')

"Step 17: Click on span DownloadKatalonPackage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_DownloadKatalonPackage'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 17-Click on span DownloadKatalonPackage.png')

"Step 18: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 18-Click on button Settings.png')

"Step 19: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 19-Click on div Backdrop.png')

"Step 20: Click on span organizationSelection (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelection', ['span_organizationSelection_internalRoleButtonName': span_organizationSelection_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 20-Click on span organizationSelection DNEX.png')

"Step 21: Click on div navigationMenu (TopLeftNavbar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_navigationMenu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_navigationMenu', ['div_navigationMenu_class': div_navigationMenu_class, 'div_navigationMenu_internalHasText': div_navigationMenu_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 21-Click on div navigationMenu TopLeftNavbar.png')

"Step 22: Click on link projectNavigation (KTKatalonTutorial) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_project_id': link_projectNavigation_project_id, 'link_projectNavigation_team_id': link_projectNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 22-Click on link projectNavigation KTKatalonTutorial - Navigate to page teamproject.png')

"Step 23: Click on button projectAction (KatalonTutorial)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectAction', ['button_projectAction_internalRoleButtonName': button_projectAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 23-Click on button projectAction KatalonTutorial.png')

"Step 24: Click on link DNEX -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_DNEX'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 24-Click on link DNEX - Navigate to page organizationhome.png')

"Step 25: Click on button organizationAction (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction', ['button_organizationAction_internalRoleButtonName': button_organizationAction_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 25-Click on button organizationAction DNEX.png')

"Step 26: Click on link organizationNavigation (DNEX)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation_2', ['link_organizationNavigation_class': link_organizationNavigation_class, 'link_organizationNavigation_internalRoleLinkName': link_organizationNavigation_internalRoleLinkName_1, 'link_organizationNavigation_organization_id': link_organizationNavigation_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 26-Click on link organizationNavigation DNEX.png')

"Step 27: Click on link projectNavigation (KTKatalonTutorial) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1, 'link_projectNavigation_project_id': link_projectNavigation_project_id_1, 'link_projectNavigation_team_id': link_projectNavigation_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 27-Click on link projectNavigation KTKatalonTutorial - Navigate to page teamproject.png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC48-Manage Organization Actions and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}