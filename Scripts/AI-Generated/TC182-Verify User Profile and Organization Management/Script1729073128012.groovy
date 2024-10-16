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

"Step 3: Navigate to team/{*}/project/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}")

"Step 4: Click on link executions -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 4-Click on link executions - Navigate to page team projectteamproject.png')

"Step 5: Click on div testRunElements (parallelSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 5-Click on div testRunElements parallelSuite.png')

"Step 6: Click on div testRunElements (parallelSuite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 6-Click on div testRunElements parallelSuite2.png')

"Step 7: Click on div testRunElements (parallelSuite3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 7-Click on div testRunElements parallelSuite3.png')

"Step 8: Click on div testRunElements (parallelSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 8-Click on div testRunElements parallelSuite.png')

"Step 9: Click on button jobReady"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_jobReady'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 9-Click on button jobReady.png')

"Step 10: Click on div myOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_myOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 10-Click on div myOrganization.png')

"Step 11: Click on link viewAllProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 11-Click on link viewAllProjects.png')

"Step 12: Click on div currentReadyTechJob"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_currentReadyTechJob'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 12-Click on div currentReadyTechJob.png')

"Step 13: Click on link jrJobReady -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_jrJobReady'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 13-Click on link jrJobReady - Navigate to page team projectteamproject.png')

"Step 14: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 14-Click on span SettingsButton.png')

"Step 15: Click on link organizationManagement -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_organizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 15-Click on link organizationManagement - Navigate to page team project settingsteamprojectsettings.png')

"Step 16: Click on p ReadyCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/p_ReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 16-Click on p ReadyCase.png')

"Step 17: Click on input UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/input_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 17-Click on input UserEmail.png')

"Step 18: Enter input value in input UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_settings/input_UserEmail'), input_UserEmail)

WebUI.takeScreenshot(reportLocation + '/TC182/Step 18-Enter input value in input UserEmail.png')

"Step 19: Click on div ProjectProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_ProjectProfile'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 19-Click on div ProjectProfile.png')

"Step 20: Click on input Timezone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/input_Timezone'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 20-Click on input Timezone.png')

"Step 21: Click on div EnableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_EnableBDDReports'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 21-Click on div EnableBDDReports.png')

"Step 22: Click on div InputBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_InputBase'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 22-Click on div InputBase.png')

"Step 23: Click on span Settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/span_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 23-Click on span Settings2.png')

"Step 24: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 24-Click on div Backdrop.png')

"Step 25: Click on div InputBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_InputBase'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 25-Click on div InputBase.png')

"Step 26: Enter input value in input UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_settings/input_UserEmail'), input_UserEmail)

WebUI.takeScreenshot(reportLocation + '/TC182/Step 26-Enter input value in input UserEmail.png')

"Step 27: Click on div TeamProfile -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_TeamProfile'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 27-Click on div TeamProfile - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC182-Verify User Profile and Organization Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}