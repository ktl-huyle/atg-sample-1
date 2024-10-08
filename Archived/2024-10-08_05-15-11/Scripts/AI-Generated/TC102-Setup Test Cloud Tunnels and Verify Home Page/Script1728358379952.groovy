import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link testCloudTunnels (TestCloudTunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels', ['link_testCloudTunnels_internalRoleLinkName': link_testCloudTunnels_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 4-Click on link testCloudTunnels TestCloudTunnels.png')

"Step 5: Click on link testCloudTunnels (General)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels', ['link_testCloudTunnels_nthChild': link_testCloudTunnels_nthChild, 'link_testCloudTunnels_internalRoleLinkName': link_testCloudTunnels_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 5-Click on link testCloudTunnels General.png')

"Step 6: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 6-Click on span Settings.png')

"Step 7: Click on div backdrop (Backdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops_1', ['div_backdrop_class': div_backdrop_class]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 7-Click on div backdrop Backdrop.png')

"Step 8: Click on link testCloudTunnels (TestCloudTunnels2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels', ['link_testCloudTunnels_nthChild': link_testCloudTunnels_nthChild_1, 'link_testCloudTunnels_internalRoleLinkName': link_testCloudTunnels_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 8-Click on link testCloudTunnels TestCloudTunnels2.png')

"Step 9: Click on button Setup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Setup'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 9-Click on button Setup.png')

"Step 10: Click on button Download -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Download'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 10-Click on button Download - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC102-Setup Test Cloud Tunnels and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}