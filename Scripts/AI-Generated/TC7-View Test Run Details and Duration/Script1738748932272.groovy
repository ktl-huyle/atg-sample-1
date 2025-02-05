import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on div TopLeftNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_TopLeftNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on div TopLeftNavbar.png')

"Step 3: Click on button organizationAdmin (DivisiDDB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin', ['button_organizationAdmin_internalRoleButtonName': button_organizationAdmin_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button organizationAdmin DivisiDDB.png')

"Step 4: Click on div currentDivisions (CurrentDDDivisi)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentDivisions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentDivisions', ['div_currentDivisions_internalHasText': div_currentDivisions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on div currentDivisions CurrentDDDivisi.png')

"Step 5: Click on link organizationDetails (Senyum) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationDetails', ['link_organizationDetails_internalRoleLinkName': link_organizationDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on link organizationDetails Senyum - Navigate to page team projectteamproject.png')

"Step 6: Click on link Executions -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on link Executions - Navigate to page team project detailteamproject.png')

"Step 7: Click on header testRun (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on header testRun UntitledTestRun.png')

"Step 8: Click on div TestRunDuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestRunDuration'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on div TestRunDuration.png')

"Step 9: Click on div TestRunHours"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestRunHours'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on div TestRunHours.png')

"Step 10: Click on div TestRunDetailDrawer -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestRunDetailDrawer'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on div TestRunDetailDrawer - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-View Test Run Details and Duration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}