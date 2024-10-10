import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts

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

"Step 4: Click on div topLeftNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_topLeftNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 4-Click on div topLeftNavbar.png')

"Step 5: Click on button organizationActions (DivisiDDB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationActions', ['button_organizationActions_internalRoleButtonName': button_organizationActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 5-Click on button organizationActions DivisiDDB.png')

"Step 6: Click on div currentOrganization (CurrentDDDivisiDDB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganization', ['div_currentOrganization_class': div_currentOrganization_class, 'div_currentOrganization_internalHasText': div_currentOrganization_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 6-Click on div currentOrganization CurrentDDDivisiDDB.png')

"Step 7: Click on link additionalOrganizations (SSenyum) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_additionalOrganizations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_additionalOrganizations', ['link_additionalOrganizations_nthChild': link_additionalOrganizations_nthChild, 'link_additionalOrganizations_internalRoleLinkName': link_additionalOrganizations_internalRoleLinkName, 'link_additionalOrganizations_project_id': link_additionalOrganizations_project_id, 'link_additionalOrganizations_team_id': link_additionalOrganizations_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 7-Click on link additionalOrganizations SSenyum - Navigate to page teamproject.png')

"Step 8: Click on link Executions15 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions15'))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 8-Click on link Executions15 - Navigate to page teamproject.png')

"Step 9: Click on header testRunDetails (UntitledTestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 9-Click on header testRunDetails UntitledTestRun6.png')

"Step 10: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 10-Click on div object.png')

"Step 11: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 11-Click on div object2.png')

"Step 12: Click on div testRunDetailDrawer -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testRunDetailDrawer'))

WebUI.takeScreenshot(reportLocation + '/TC361/Step 12-Click on div testRunDetailDrawer - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC361-Access Test Run Details from Organization Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}