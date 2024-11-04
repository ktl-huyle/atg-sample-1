import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
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

"Step 4: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 4-Click on input Search.png')

"Step 5: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC216/Step 5-Enter input value in input Search.png')

"Step 6: Click on input FilterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_FilterByProfile'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 6-Click on input FilterByProfile.png')

"Step 7: Enter input value in input FilterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_FilterByProfile'), input_FilterByProfile)

WebUI.takeScreenshot(reportLocation + '/TC216/Step 7-Enter input value in input FilterByProfile.png')

"Step 8: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 8-Click on button Update.png')

"Step 9: Click on link moreOptions (MoreOptions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreOptions', ['link_moreOptions_internalRoleLinkName': link_moreOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 9-Click on link moreOptions MoreOptions.png')

"Step 10: Click on div CreatedWithSketchtool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketchtool'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 10-Click on div CreatedWithSketchtool.png')

"Step 11: Click on button dynamicButtons (FirstButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons', ['button_dynamicButtons_nthChild': button_dynamicButtons_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 11-Click on button dynamicButtons FirstButton.png')

"Step 12: Click on button dynamicButtons (FirstButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons', ['button_dynamicButtons_nthChild': button_dynamicButtons_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 12-Click on button dynamicButtons FirstButton.png')

"Step 13: Click on button dynamicButtons (FirstButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons', ['button_dynamicButtons_nthChild': button_dynamicButtons_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 13-Click on button dynamicButtons FirstButton.png')

"Step 14: Click on button dynamicButtons (SecondButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons', ['button_dynamicButtons_nthChild': button_dynamicButtons_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 14-Click on button dynamicButtons SecondButton.png')

"Step 15: Click on button dynamicButtons (SecondButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons', ['button_dynamicButtons_nthChild': button_dynamicButtons_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 15-Click on button dynamicButtons SecondButton.png')

"Step 16: Click on button dynamicButtons (FirstButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicButtons', ['button_dynamicButtons_nthChild': button_dynamicButtons_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 16-Click on button dynamicButtons FirstButton.png')

"Step 17: Click on pre WebElementTooltip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_WebElementTooltip'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 17-Click on pre WebElementTooltip.png')

"Step 18: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 18-Click on div ThumbnailImage.png')

"Step 19: Click on button slideControls (ShowSlide2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 19-Click on button slideControls ShowSlide2.png')

"Step 20: Click on button slideControls (ShowSlide3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 20-Click on button slideControls ShowSlide3.png')

"Step 21: Click on button slideControls (ShowSlide4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 21-Click on button slideControls ShowSlide4.png')

"Step 22: Click on button slideControls (ShowSlide5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 22-Click on button slideControls ShowSlide5.png')

"Step 23: Click on button slideControls (ShowSlide6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 23-Click on button slideControls ShowSlide6.png')

"Step 24: Click on button slideControls (ShowSlide7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 24-Click on button slideControls ShowSlide7.png')

"Step 25: Click on button slideControls (ShowSlide8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 25-Click on button slideControls ShowSlide8.png')

"Step 26: Click on button slideControls (ShowSlide9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 26-Click on button slideControls ShowSlide9.png')

"Step 27: Click on button slideControls (ShowSlide10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_slideControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_slideControls', ['button_slideControls_internalLabel': button_slideControls_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 27-Click on button slideControls ShowSlide10.png')

"Step 28: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 28-Click on button Close.png')

"Step 29: Click on form ReportDefect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/form_ReportDefect'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 29-Click on form ReportDefect.png')

"Step 30: Click on div SummaryWebElement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SummaryWebElement'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 30-Click on div SummaryWebElement.png')

"Step 31: Click on div ChildElement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ChildElement'))

WebUI.takeScreenshot(reportLocation + '/TC216/Step 31-Click on div ChildElement - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC216-Search and Manage Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}