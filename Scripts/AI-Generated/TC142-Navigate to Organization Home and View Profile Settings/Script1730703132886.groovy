import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 4: Click on button organizationActions (NidhiKachhadiya)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationActions', ['button_organizationActions_internalRoleButtonName': button_organizationActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 4-Click on button organizationActions NidhiKachhadiya.png')

"Step 5: Click on link ViewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ViewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 5-Click on link ViewProfile.png')

"Step 6: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 6-Click on div Backdrop.png')

"Step 7: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 7-Click on span Settings.png')

"Step 8: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 8-Click on div Backdrop.png')

"Step 9: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 9-Click on span Settings.png')

"Step 10: Click on link testOpsHomepage (TestOpsHomepage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testOpsHomepage"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testOpsHomepage', ['link_testOpsHomepage_internalRoleLinkName': link_testOpsHomepage_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 10-Click on link testOpsHomepage TestOpsHomepage.png')

"Step 11: Click on div organizationLinks (OrganizationLink) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationLinks', ['div_organizationLinks_internalRoleLinkName': div_organizationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 11-Click on div organizationLinks OrganizationLink - Navigate to page teamproject.png')

"Step 12: Click on link Executions3 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 12-Click on link Executions3 - Navigate to page teamprojecttest-runs.png')

"Step 13: Click on link Settings2 -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 13-Click on link Settings2 - Navigate to page teamprojectsettings.png')

"Step 14: Click on link Settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 14-Click on link Settings2.png')

"Step 15: Click on button NotificationAction -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 15-Click on button NotificationAction - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC142-Navigate to Organization Home and View Profile Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}