import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on link tokenManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 4-Click on link tokenManager.png')

"Step 5: Enter input value in link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/link_configuration'), link_configuration)

WebUI.takeScreenshot(reportLocation + '/TC402/Step 5-Enter input value in link configuration.png')

"Step 6: Click on input filterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_filterByProfile'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 6-Click on input filterByProfile.png')

"Step 7: Enter input value in input filterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_filterByProfile'), input_filterByProfile)

WebUI.takeScreenshot(reportLocation + '/TC402/Step 7-Enter input value in input filterByProfile.png')

"Step 8: Click on button update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_update'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 8-Click on button update.png')

"Step 9: Click on link moreOptions (3More)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 9-Click on link moreOptions 3More.png')

"Step 10: Click on div object50"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object50'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 10-Click on div object50.png')

"Step 11: Click on button objectActions (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions', ['button_objectActions_nthChild': button_objectActions_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 11-Click on button objectActions object10.png')

"Step 12: Click on button objectActions (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions', ['button_objectActions_nthChild': button_objectActions_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 12-Click on button objectActions object10.png')

"Step 13: Click on button objectActions (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions', ['button_objectActions_nthChild': button_objectActions_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 13-Click on button objectActions object10.png')

"Step 14: Click on button objectActions (mr1Nth4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions', ['button_objectActions_nthChild': button_objectActions_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 14-Click on button objectActions mr1Nth4.png')

"Step 15: Click on button objectActions (mr1Nth4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions', ['button_objectActions_nthChild': button_objectActions_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 15-Click on button objectActions mr1Nth4.png')

"Step 16: Click on button objectActions (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions', ['button_objectActions_nthChild': button_objectActions_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 16-Click on button objectActions object10.png')

"Step 17: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 17-Click on pre object.png')

"Step 18: Click on button objectActions (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions', ['button_objectActions_nthChild': button_objectActions_nthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 18-Click on button objectActions object10.png')

"Step 19: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 19-Click on pre object.png')

"Step 20: Click on button objectActions (thumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 20-Click on button objectActions thumbnailImage.png')

"Step 21: Click on button objectActions (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1', ['button_objectActions_internalLabel': button_objectActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 21-Click on button objectActions object11.png')

"Step 22: Click on button objectActions (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1', ['button_objectActions_internalLabel': button_objectActions_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 22-Click on button objectActions object12.png')

"Step 23: Click on button objectActions (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1', ['button_objectActions_internalLabel': button_objectActions_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 23-Click on button objectActions object13.png')

"Step 24: Click on button objectActions (object14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1', ['button_objectActions_internalLabel': button_objectActions_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 24-Click on button objectActions object14.png')

"Step 25: Click on button objectActions (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1', ['button_objectActions_internalLabel': button_objectActions_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 25-Click on button objectActions object15.png')

"Step 26: Click on button objectActions (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1', ['button_objectActions_internalLabel': button_objectActions_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 26-Click on button objectActions object16.png')

"Step 27: Click on button objectActions (object17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_1', ['button_objectActions_internalLabel': button_objectActions_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 27-Click on button objectActions object17.png')

"Step 28: Click on button object18"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object18'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 28-Click on button object18.png')

"Step 29: Click on button object19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object19'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 29-Click on button object19.png')

"Step 30: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 30-Click on button close.png')

"Step 31: Click on div object51 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object51'))

WebUI.takeScreenshot(reportLocation + '/TC402/Step 31-Click on div object51 - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC402-Manage Objects and Filter Profiles in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}