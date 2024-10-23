import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to /team/*/project/*/test-planning"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-planning")

"Step 4: Click on span ProfileAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/span_ProfileAll'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 4-Click on span ProfileAll.png')

"Step 5: Click on input FilterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_FilterByProfile'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 5-Click on input FilterByProfile.png')

"Step 6: Enter input value in input FilterByProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/input_FilterByProfile'), input_FilterByProfile)

WebUI.takeScreenshot(reportLocation + '/TC143/Step 6-Enter input value in input FilterByProfile.png')

"Step 7: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 7-Click on button Update.png')

"Step 8: Click on link moreDetails (More)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_moreDetails', ['link_moreDetails_internalRoleLinkName': link_moreDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 8-Click on link moreDetails More.png')

"Step 9: Click on div sketchToolDetails (CreatedWithSketchtool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_sketchToolDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_sketchToolDetails', ['div_sketchToolDetails_type': div_sketchToolDetails_type, 'div_sketchToolDetails_internalText': div_sketchToolDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 9-Click on div sketchToolDetails CreatedWithSketchtool.png')

"Step 10: Click on button slideShow (ShowSlide)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow', ['button_slideShow_nthChild': button_slideShow_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 10-Click on button slideShow ShowSlide.png')

"Step 11: Click on button slideShow (ShowSlide)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow', ['button_slideShow_nthChild': button_slideShow_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 11-Click on button slideShow ShowSlide.png')

"Step 12: Click on button slideShow (ShowSlide)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow', ['button_slideShow_nthChild': button_slideShow_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 12-Click on button slideShow ShowSlide.png')

"Step 13: Click on button slideShow (ShowSlide2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow', ['button_slideShow_nthChild': button_slideShow_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 13-Click on button slideShow ShowSlide2.png')

"Step 14: Click on button slideShow (ShowSlide2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow', ['button_slideShow_nthChild': button_slideShow_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 14-Click on button slideShow ShowSlide2.png')

"Step 15: Click on button slideShow (ShowSlide)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow', ['button_slideShow_nthChild': button_slideShow_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 15-Click on button slideShow ShowSlide.png')

"Step 16: Click on pre Tooltip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/pre_Tooltip'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 16-Click on pre Tooltip.png')

"Step 17: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 17-Click on div ThumbnailImage.png')

"Step 18: Click on button slideShow (ShowSlide3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 18-Click on button slideShow ShowSlide3.png')

"Step 19: Click on button slideShow (ShowSlide4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 19-Click on button slideShow ShowSlide4.png')

"Step 20: Click on button slideShow (ShowSlide5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 20-Click on button slideShow ShowSlide5.png')

"Step 21: Click on button slideShow (ShowSlide6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 21-Click on button slideShow ShowSlide6.png')

"Step 22: Click on button slideShow (ShowSlide7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 22-Click on button slideShow ShowSlide7.png')

"Step 23: Click on button slideShow (ShowSlide8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 23-Click on button slideShow ShowSlide8.png')

"Step 24: Click on button slideShow (ShowSlide9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 24-Click on button slideShow ShowSlide9.png')

"Step 25: Click on button slideShow (ShowSlide10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 25-Click on button slideShow ShowSlide10.png')

"Step 26: Click on button slideShow (ShowSlide11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/button_slideShow_1', ['button_slideShow_internalLabel': button_slideShow_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 26-Click on button slideShow ShowSlide11.png')

"Step 27: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 27-Click on button Close.png')

"Step 28: Click on form ReportDefect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/form_ReportDefect'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 28-Click on form ReportDefect.png')

"Step 29: Click on div Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 29-Click on div Summary.png')

"Step 30: Click on div TestRun -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC143/Step 30-Click on div TestRun - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC143-View and Report Defects in Test Planning_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}