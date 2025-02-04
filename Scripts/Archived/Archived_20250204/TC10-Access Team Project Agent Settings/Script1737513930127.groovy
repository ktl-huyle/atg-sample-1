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

"Step 2: Click on div projectOverview (firstProject) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_organization_home/div_projectOverview"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_organization_home/div_projectOverview', ['div_projectOverview_internalRoleLinkName': div_projectOverview_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on div projectOverview firstProject - Navigate to page team projectteamproject.png')

"Step 3: Click on link settings -> Navigate to page 'settings#team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on link settings - Navigate to page settingsteamprojectsettings.png')

"Step 4: Click on link settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_settings/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on link settings.png')

"Step 5: Click on link testEnvironments -> Navigate to page 'team project agent#team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_settings/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on link testEnvironments - Navigate to page team project agentteamprojectagent.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Access Team Project Agent Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}