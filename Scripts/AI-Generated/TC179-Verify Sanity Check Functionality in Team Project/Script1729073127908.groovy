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

"Step 3: Navigate to team/{*}/project/{*}/{*}/{*}/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/{*}/{*}/{*}")

"Step 4: Click on div sanityCheck (Web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/div_sanityCheck"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/div_sanityCheck', ['div_sanityCheck_nthChild': div_sanityCheck_nthChild, 'div_sanityCheck_internalText': div_sanityCheck_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 4-Click on div sanityCheck Web.png')

"Step 5: Click on button UploadedData -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_UploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 5-Click on button UploadedData - Navigate to page team projectteamproject.png')

"Step 6: Click on span treeSwitcherIcons (AntIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons'))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 6-Click on span treeSwitcherIcons AntIcon.png')

"Step 7: Click on span treeSwitcher (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher', ['span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 7-Click on span treeSwitcher TreeSwitcher.png')

"Step 8: Click on span treeSwitcherIcons (CaretDown5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 8-Click on span treeSwitcherIcons CaretDown5.png')

"Step 9: Click on span treeSwitcherIcons (CaretDown6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_1, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_1, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 9-Click on span treeSwitcherIcons CaretDown6.png')

"Step 10: Click on span treeSwitcherIcons (treeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_2, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_2, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 10-Click on span treeSwitcherIcons treeSwitcherIcon.png')

"Step 11: Click on span treeSwitcherIcons (treeSwitcherIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons_1', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 11-Click on span treeSwitcherIcons treeSwitcherIcon2.png')

"Step 12: Click on span treeSwitcherIcons (treeSwitcherIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_3, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_4, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 12-Click on span treeSwitcherIcons treeSwitcherIcon3.png')

"Step 13: Click on span treeSwitcherIcons (treeSwitcherIcon4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_4, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_5, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 13-Click on span treeSwitcherIcons treeSwitcherIcon4.png')

"Step 14: Click on span treeSwitcher (treeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher', ['span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_1, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 14-Click on span treeSwitcher treeSwitcher.png')

"Step 15: Click on span treeSwitcherIcons (treeSwitcherIcon5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_5, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_6, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 15-Click on span treeSwitcherIcons treeSwitcherIcon5.png')

"Step 16: Click on div sanityLabel -> Navigate to page 'team project details#team/{*}/project/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_sanityLabel'))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 16-Click on div sanityLabel - Navigate to page team project detailsteamproject.png')

"Step 17: Click on div sanityCheck (sanityLabel) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/div_sanityCheck"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/div_sanityCheck', ['div_sanityCheck_nthChild': div_sanityCheck_nthChild_1, 'div_sanityCheck_internalText': div_sanityCheck_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC179/Step 17-Click on div sanityCheck sanityLabel - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC179-Verify Sanity Check Functionality in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}