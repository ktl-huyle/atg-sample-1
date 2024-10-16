import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 4: Click on div webDetails (Web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/div_webDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/div_webDetails', ['div_webDetails_nthChild': div_webDetails_nthChild, 'div_webDetails_internalText': div_webDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 4-Click on div webDetails Web.png')

"Step 5: Click on button UploadedData -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_UploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 5-Click on button UploadedData - Navigate to page team projectteamproject.png')

"Step 6: Click on span treeSwitcherIcon (AntIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 6-Click on span treeSwitcherIcon AntIcon.png')

"Step 7: Click on span treeSwitcher (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher', ['span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 7-Click on span treeSwitcher TreeSwitcher.png')

"Step 8: Click on span treeSwitcherIcon (CaretDown5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 8-Click on span treeSwitcherIcon CaretDown5.png')

"Step 9: Click on span treeSwitcherIcon (CaretDown6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild_1, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_1, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 9-Click on span treeSwitcherIcon CaretDown6.png')

"Step 10: Click on span treeSwitcherIcon (treeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild_2, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_2, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 10-Click on span treeSwitcherIcon treeSwitcherIcon.png')

"Step 11: Click on span treeSwitcherIcon (treeSwitcherIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon_1', ['span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 11-Click on span treeSwitcherIcon treeSwitcherIcon2.png')

"Step 12: Click on span treeSwitcherIcon (treeSwitcherIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild_3, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_4, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 12-Click on span treeSwitcherIcon treeSwitcherIcon3.png')

"Step 13: Click on span treeSwitcherIcon (treeSwitcherIcon4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild_4, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_5, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 13-Click on span treeSwitcherIcon treeSwitcherIcon4.png')

"Step 14: Click on span treeSwitcher (treeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher', ['span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_1, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 14-Click on span treeSwitcher treeSwitcher.png')

"Step 15: Click on span treeSwitcherIcon (treeSwitcherIcon5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild_5, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_6, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 15-Click on span treeSwitcherIcon treeSwitcherIcon5.png')

"Step 16: Click on div sanityLabel -> Navigate to page 'team project details#team/{*}/project/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_sanityLabel'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 16-Click on div sanityLabel - Navigate to page team project detailsteamproject.png')

"Step 17: Click on div webDetails (sanityLabel) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/div_webDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/div_webDetails', ['div_webDetails_nthChild': div_webDetails_nthChild_1, 'div_webDetails_internalText': div_webDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 17-Click on div webDetails sanityLabel - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC35-Interact with Web Details in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}