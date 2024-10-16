import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/{*}/project/{*}/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/{*}")

"Step 4: Click on link testingTools (TestCloudTunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingTools', ['link_testingTools_internalRoleLinkName': link_testingTools_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link testingTools TestCloudTunnels.png')

"Step 5: Click on link General -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_General'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link General - Navigate to page team project settingsteamprojectsettings.png')

"Step 6: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on span Settings.png')

"Step 7: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on div Backdrop.png')

"Step 8: Click on link integrations (TestCloudTunnels) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_settings/link_integrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_settings/link_integrations', ['link_integrations_nthChild': link_integrations_nthChild, 'link_integrations_internalRoleLinkName': link_integrations_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on link integrations TestCloudTunnels - Navigate to page team projectteamproject.png')

"Step 9: Click on button Setup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Setup'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on button Setup.png')

"Step 10: Click on button Download -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Download'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on button Download - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Integrate Testing Tools in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}