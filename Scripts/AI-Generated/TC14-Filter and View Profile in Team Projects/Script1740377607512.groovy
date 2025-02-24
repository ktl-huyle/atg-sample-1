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

"Step 2: Click on span profileAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_profileAll'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on span profileAll.png')

"Step 3: Click on input filterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_filterByProfile'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on input filterByProfile.png')

"Step 4: Enter input value in input filterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_filterByProfile'), input_filterByProfile)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Enter input value in input filterByProfile.png')

"Step 5: Click on button update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_update'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on button update.png')

"Step 6: Click on link more"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_more'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on link more.png')

"Step 7: Click on div createdWithSketchtool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_createdWithSketchtool'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on div createdWithSketchtool.png')

"Step 8: Click on button mrChild (mr1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_mrChild"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_mrChild', ['button_mrChild_nthChild': button_mrChild_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button mrChild mr1.png')

"Step 9: Click on button mrChild (mr1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_mrChild"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_mrChild', ['button_mrChild_nthChild': button_mrChild_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on button mrChild mr1.png')

"Step 10: Click on button mrChild (mr1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_mrChild"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_mrChild', ['button_mrChild_nthChild': button_mrChild_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on button mrChild mr1.png')

"Step 11: Click on button mrChild (mr1Child)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_mrChild"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_mrChild', ['button_mrChild_nthChild': button_mrChild_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on button mrChild mr1Child.png')

"Step 12: Click on button mrChild (mr1Child)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_mrChild"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_mrChild', ['button_mrChild_nthChild': button_mrChild_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on button mrChild mr1Child.png')

"Step 13: Click on button mrChild (mr1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_mrChild"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_mrChild', ['button_mrChild_nthChild': button_mrChild_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on button mrChild mr1.png')

"Step 14: Click on pre tooltipWebElement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_tooltipWebElement'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on pre tooltipWebElement.png')

"Step 15: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on div thumbnailImage.png')

"Step 16: Click on button showSlides (showSlide2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on button showSlides showSlide2.png')

"Step 17: Click on button showSlides (showSlide3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on button showSlides showSlide3.png')

"Step 18: Click on button showSlides (showSlide4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on button showSlides showSlide4.png')

"Step 19: Click on button showSlides (showSlide5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on button showSlides showSlide5.png')

"Step 20: Click on button showSlides (showSlide6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Click on button showSlides showSlide6.png')

"Step 21: Click on button showSlides (showSlide7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Click on button showSlides showSlide7.png')

"Step 22: Click on button showSlides (showSlide8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Click on button showSlides showSlide8.png')

"Step 23: Click on button showSlides (showSlide9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Click on button showSlides showSlide9.png')

"Step 24: Click on button showSlides (showSlide10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showSlides"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showSlides', ['button_showSlides_internalLabel': button_showSlides_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Click on button showSlides showSlide10.png')

"Step 25: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 25-Click on button close.png')

"Step 26: Click on form reportDefect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/form_reportDefect'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 26-Click on form reportDefect.png')

"Step 27: Click on div summaryWebElement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_summaryWebElement'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 27-Click on div summaryWebElement.png')

"Step 28: Click on div rowContent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_rowContent'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 28-Click on div rowContent - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Filter and View Profile in Team Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}