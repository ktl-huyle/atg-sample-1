import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/{*}/project/{*}/{*}/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/{*}/{*}")

"Step 4: Click on link Dashboard -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 4-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 5: Click on link Executions4 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 5-Click on link Executions4 - Navigate to page team projectteamproject.png')

"Step 6: Click on link Settings -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 6-Click on link Settings - Navigate to page team project settingsteamprojectsettings.png')

"Step 7: Click on link scriptRepositories (ScriptRepositories) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories', ['link_scriptRepositories_nthChild': link_scriptRepositories_nthChild, 'link_scriptRepositories_internalRoleLinkName': link_scriptRepositories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 7-Click on link scriptRepositories ScriptRepositories - Navigate to page team projectteamproject.png')

"Step 8: Click on td testAutomationInfo (katalonWebsite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/td_testAutomationInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/td_testAutomationInfo', ['td_testAutomationInfo_internalRoleCellName': td_testAutomationInfo_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 8-Click on td testAutomationInfo katalonWebsite.png')

"Step 9: Click on link projectResources (katalonWebsite) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectResources', ['link_projectResources_trNthChild': link_projectResources_trNthChild, 'link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 9-Click on link projectResources katalonWebsite - Navigate to page team projectteamproject.png')

"Step 10: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 10-Click on button RefreshScriptRepository.png')

"Step 11: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_RefreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 11-Click on button RefreshScriptRepository2.png')

"Step 12: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_RefreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 12-Click on button RefreshScriptRepository2.png')

"Step 13: Click on link Dashboard2 -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 13-Click on link Dashboard2 - Navigate to page team projectteamproject.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC156-Refresh Script Repository in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}