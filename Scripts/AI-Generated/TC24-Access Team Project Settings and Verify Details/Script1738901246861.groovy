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

"Step 1: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 2: Click on link Executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on link Executions2.png')

"Step 3: Click on link Executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on link Executions2.png')

"Step 4: Click on link Schedules2 -> Navigate to page 'team project grid#team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on link Schedules2 - Navigate to page team project gridteamprojectgrid.png')

"Step 5: Click on link Settings -> Navigate to page 'settings#team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on link Settings - Navigate to page settingsteamprojectsettings.png')

"Step 6: Click on link TestEnvironments -> Navigate to page 'team project agent#team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on link TestEnvironments - Navigate to page team project agentteamprojectagent.png')

"Step 7: Click on link ScriptRepositories2 -> Navigate to page 'team project#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_ScriptRepositories2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on link ScriptRepositories2 - Navigate to page team projectteamproject.png')

"Step 8: Click on link Executions3 -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on link Executions3 - Navigate to page team project detailteamproject.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Access Team Project Settings and Verify Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}