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

"Step 4: Click on div TopLeftNavbar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_TopLeftNavbar2'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 4-Click on div TopLeftNavbar2.png')

"Step 5: Click on button organizationAction (DivisiDDB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction', ['button_organizationAction_internalRoleButtonName': button_organizationAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 5-Click on button organizationAction DivisiDDB.png')

"Step 6: Click on div navigationMenu (CurrentDDDivisiDDB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_navigationMenu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_navigationMenu', ['div_navigationMenu_class': div_navigationMenu_class, 'div_navigationMenu_internalHasText': div_navigationMenu_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 6-Click on div navigationMenu CurrentDDDivisiDDB.png')

"Step 7: Click on link organizationNavigation (SSenyum) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation', ['link_organizationNavigation_nthChild': link_organizationNavigation_nthChild, 'link_organizationNavigation_internalRoleLinkName': link_organizationNavigation_internalRoleLinkName, 'link_organizationNavigation_project_id': link_organizationNavigation_project_id, 'link_organizationNavigation_team_id': link_organizationNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 7-Click on link organizationNavigation SSenyum - Navigate to page teamproject.png')

"Step 8: Click on link Executions10 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions10'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 8-Click on link Executions10 - Navigate to page teamproject.png')

"Step 9: Click on header testRun (UntitledTestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 9-Click on header testRun UntitledTestRun6.png')

"Step 10: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 10-Click on div object.png')

"Step 11: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 11-Click on div object2.png')

"Step 12: Click on div testRunDetailDrawer -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testRunDetailDrawer'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 12-Click on div testRunDetailDrawer - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC79-Navigate to Project Settings and Verify Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}