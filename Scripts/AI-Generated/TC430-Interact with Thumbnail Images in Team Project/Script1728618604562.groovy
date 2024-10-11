import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 4: Click on span ProfileAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ProfileAll'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 4-Click on span ProfileAll.png')

"Step 5: Click on input FilterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_FilterByProfile'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 5-Click on input FilterByProfile.png')

"Step 6: Enter input value in input FilterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_FilterByProfile'), input_FilterByProfile)

WebUI.takeScreenshot(reportLocation + '/TC430/Step 6-Enter input value in input FilterByProfile.png')

"Step 7: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 7-Click on button Update.png')

"Step 8: Click on link moreItems (MoreItems)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_moreItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_moreItems', ['link_moreItems_internalRoleLinkName': link_moreItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 8-Click on link moreItems MoreItems.png')

"Step 9: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 9-Click on div CreatedWithSketch.png')

"Step 10: Click on button thumbnailActions (ThumbnailAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions', ['button_thumbnailActions_nthChild': button_thumbnailActions_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 10-Click on button thumbnailActions ThumbnailAction.png')

"Step 11: Click on button thumbnailActions (ThumbnailAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions', ['button_thumbnailActions_nthChild': button_thumbnailActions_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 11-Click on button thumbnailActions ThumbnailAction.png')

"Step 12: Click on button thumbnailActions (ThumbnailAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions', ['button_thumbnailActions_nthChild': button_thumbnailActions_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 12-Click on button thumbnailActions ThumbnailAction.png')

"Step 13: Click on button thumbnailActions (ThumbnailAction2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions', ['button_thumbnailActions_nthChild': button_thumbnailActions_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 13-Click on button thumbnailActions ThumbnailAction2.png')

"Step 14: Click on button thumbnailActions (ThumbnailAction2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions', ['button_thumbnailActions_nthChild': button_thumbnailActions_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 14-Click on button thumbnailActions ThumbnailAction2.png')

"Step 15: Click on button thumbnailActions (ThumbnailAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_thumbnailActions', ['button_thumbnailActions_nthChild': button_thumbnailActions_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 15-Click on button thumbnailActions ThumbnailAction.png')

"Step 16: Click on pre TooltipMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_TooltipMessage'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 16-Click on pre TooltipMessage.png')

"Step 17: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 17-Click on div ThumbnailImage.png')

"Step 18: Click on button showSlides (ShowSlide)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 18-Click on button showSlides ShowSlide.png')

"Step 19: Click on button showSlides (ShowSlide2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 19-Click on button showSlides ShowSlide2.png')

"Step 20: Click on button showSlides (ShowSlide3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 20-Click on button showSlides ShowSlide3.png')

"Step 21: Click on button showSlides (ShowSlide4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 21-Click on button showSlides ShowSlide4.png')

"Step 22: Click on button showSlides (ShowSlide5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 22-Click on button showSlides ShowSlide5.png')

"Step 23: Click on button showSlides (ShowSlide6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 23-Click on button showSlides ShowSlide6.png')

"Step 24: Click on button showSlides (ShowSlide7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 24-Click on button showSlides ShowSlide7.png')

"Step 25: Click on button showSlides (ShowSlide8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 25-Click on button showSlides ShowSlide8.png')

"Step 26: Click on button showSlides (ShowSlide9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 26-Click on button showSlides ShowSlide9.png')

"Step 27: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 27-Click on button Close.png')

"Step 28: Click on form ReportDefect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/form_ReportDefect'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 28-Click on form ReportDefect.png')

"Step 29: Click on div SummaryMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SummaryMessage'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 29-Click on div SummaryMessage.png')

"Step 30: Click on div ThumbnailImage2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC430/Step 30-Click on div ThumbnailImage2 - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC430-Interact with Thumbnail Images in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}