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

"Step 4: Click on button teamMemberAction (AI2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction', ['button_teamMemberAction_internalRoleButtonName': button_teamMemberAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 4-Click on button teamMemberAction AI2.png')

"Step 5: Click on link ViewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ViewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 5-Click on link ViewProfile.png')

"Step 6: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop_1'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 6-Click on div Backdrop.png')

"Step 7: Click on div TopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_TopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 7-Click on div TopNavbar.png')

"Step 8: Click on button organizationAction (OrganizationAdmin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction', ['button_organizationAction_internalRoleButtonName': button_organizationAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 8-Click on button organizationAction OrganizationAdmin.png')

"Step 9: Click on button organizationAction (OrganizationAdmin2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 9-Click on button organizationAction OrganizationAdmin2.png')

"Step 10: Click on div TopLeftNavbar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_TopLeftNavbar2'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 10-Click on div TopLeftNavbar2.png')

"Step 11: Click on button organizationAction (OrganizationAdmin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction', ['button_organizationAction_internalRoleButtonName': button_organizationAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 11-Click on button organizationAction OrganizationAdmin.png')

"Step 12: Click on link organizationNavigation (OrganizationAdmin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation_2', ['link_organizationNavigation_class': link_organizationNavigation_class, 'link_organizationNavigation_internalRoleLinkName': link_organizationNavigation_internalRoleLinkName, 'link_organizationNavigation_organization_id': link_organizationNavigation_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 12-Click on link organizationNavigation OrganizationAdmin.png')

"Step 13: Click on link ViewAllProjects -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 13-Click on link ViewAllProjects - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC61-View Team Member Profile and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}