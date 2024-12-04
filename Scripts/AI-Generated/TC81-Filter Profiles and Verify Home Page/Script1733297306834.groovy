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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on span ProfileAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ProfileAll'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 4-Click on span ProfileAll.png')

"Step 5: Click on input filterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_filterByProfile'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 5-Click on input filterByProfile.png')

"Step 6: Enter input value in input filterByProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_filterByProfile'), input_filterByProfile2)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 6-Enter input value in input filterByProfile2.png')

"Step 7: Click on button update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_update'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 7-Click on button update.png')

"Step 8: Click on link moreOptions (moreOptions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 8-Click on link moreOptions moreOptions.png')

"Step 9: Click on div createdWithSketchtool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_createdWithSketchtool'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 9-Click on div createdWithSketchtool.png')

"Step 10: Click on button dynamicObject (action)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 10-Click on button dynamicObject action.png')

"Step 11: Click on button dynamicObject (action)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 11-Click on button dynamicObject action.png')

"Step 12: Click on button dynamicObject (action)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 12-Click on button dynamicObject action.png')

"Step 13: Click on button dynamicObject (action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 13-Click on button dynamicObject action2.png')

"Step 14: Click on button dynamicObject (action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 14-Click on button dynamicObject action2.png')

"Step 15: Click on button dynamicObject (action)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 15-Click on button dynamicObject action.png')

"Step 16: Click on pre tooltip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_tooltip'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 16-Click on pre tooltip.png')

"Step 17: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 17-Click on div thumbnailImage.png')

"Step 18: Click on button showSlide (showSlide)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 18-Click on button showSlide showSlide.png')

"Step 19: Click on button showSlide (showSlide2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 19-Click on button showSlide showSlide2.png')

"Step 20: Click on button showSlide (showSlide3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 20-Click on button showSlide showSlide3.png')

"Step 21: Click on button showSlide (showSlide4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 21-Click on button showSlide showSlide4.png')

"Step 22: Click on button showSlide (showSlide5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 22-Click on button showSlide showSlide5.png')

"Step 23: Click on button showSlide (showSlide6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 23-Click on button showSlide showSlide6.png')

"Step 24: Click on button showSlide (showSlide7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 24-Click on button showSlide showSlide7.png')

"Step 25: Click on button showSlide (showSlide8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 25-Click on button showSlide showSlide8.png')

"Step 26: Click on button showSlide (showSlide9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlide"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlide', ['button_showSlide_internalLabel': button_showSlide_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 26-Click on button showSlide showSlide9.png')

"Step 27: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 27-Click on button close.png')

"Step 28: Click on form reportDefect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/form_reportDefect'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 28-Click on form reportDefect.png')

"Step 29: Click on div summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_summary'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 29-Click on div summary.png')

"Step 30: Click on div content -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_content'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 30-Click on div content - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC81-Filter Profiles and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}