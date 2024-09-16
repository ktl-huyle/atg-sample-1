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

"Step 4: Click on button objectActions (object28)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3', ['button_objectActions_nthChild': button_objectActions_nthChild, 'button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC412/Step 4-Click on button objectActions object28.png')

"Step 5: Click on font albertoVerifidNet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/font_albertoVerifidNet'))

WebUI.takeScreenshot(reportLocation + '/TC412/Step 5-Click on font albertoVerifidNet.png')

"Step 6: Click on div abAlbertoBebaalbertoVerifid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_abAlbertoBebaalbertoVerifid'))

WebUI.takeScreenshot(reportLocation + '/TC412/Step 6-Click on div abAlbertoBebaalbertoVerifid.png')

"Step 7: Click on link signOut (desconectar) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC412/Step 7-Click on link signOut desconectar - Navigate to page organizationhome.png')

"Step 8: Click on button objectActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_objectActions', ['button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC412/Step 8-Click on button objectActions object.png')

"Step 9: Click on div object7 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC412/Step 9-Click on div object7 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC412-Sign Out from Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}