import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on div userflowjsModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_userflowjsModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC396/Step 4-Click on div userflowjsModalBackdrop.png')

"Step 5: Click on button objectActions (po)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3', ['button_objectActions_nthChild': button_objectActions_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC396/Step 5-Click on button objectActions po.png')

"Step 6: Click on link userSettings -> Navigate to page 'user/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_userSettings'))

WebUI.takeScreenshot(reportLocation + '/TC396/Step 6-Click on link userSettings - Navigate to page usersettings.png')

"Step 7: Click on button objectActions (po)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_settings/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_settings/button_objectActions', ['button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC396/Step 7-Click on button objectActions po.png')

"Step 8: Click on link viewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_viewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC396/Step 8-Click on link viewProfile.png')

"Step 9: Click on div object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC396/Step 9-Click on div object - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC396-View User Profile from Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}