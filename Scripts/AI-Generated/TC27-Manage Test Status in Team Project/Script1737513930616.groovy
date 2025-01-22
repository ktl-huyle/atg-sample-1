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

"Step 1: Navigate to team/*/project/*/*/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}/${GlobalVariable.path_param_6}/${GlobalVariable.path_param_7}")

"Step 2: Click on div testStatus (web)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/div_testStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/div_testStatus', ['div_testStatus_nthChild': div_testStatus_nthChild, 'div_testStatus_internalText': div_testStatus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 2-Click on div testStatus web.png')

"Step 3: Click on button object -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3-Click on button object - Navigate to page team project detailsteamproject.png')

"Step 4: Click on span treeSwitcher (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4-Click on span treeSwitcher object.png')

"Step 5: Click on span dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5-Click on span dynamicObject object2.png')

"Step 6: Click on span treeSwitcher (treeSwitcher4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_1, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_1, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6-Click on span treeSwitcher treeSwitcher4.png')

"Step 7: Click on span treeSwitcher (treeSwitcher5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_2, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_2, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7-Click on span treeSwitcher treeSwitcher5.png')

"Step 8: Click on span treeSwitcher (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_3, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_3, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8-Click on span treeSwitcher object3.png')

"Step 9: Click on span katalonInfo (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_katalonInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_katalonInfo', ['span_katalonInfo_class': span_katalonInfo_class]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9-Click on span katalonInfo object4.png')

"Step 10: Click on span treeSwitcher (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_4, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_4, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 10-Click on span treeSwitcher object5.png')

"Step 11: Click on span treeSwitcher (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_5, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_5, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 11-Click on span treeSwitcher object6.png')

"Step 12: Click on span dynamicObject (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild_1, 'span_dynamicObject_divNthChild': span_dynamicObject_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 12-Click on span dynamicObject object7.png')

"Step 13: Click on span treeSwitcher (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_6, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_6, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 13-Click on span treeSwitcher object8.png')

"Step 14: Click on div sanity -> Navigate to page 'team project details#team/*/project/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/div_sanity'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 14-Click on div sanity - Navigate to page team project detailsteamproject.png')

"Step 15: Click on div testStatus (sanity2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/div_testStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/div_testStatus', ['div_testStatus_nthChild': div_testStatus_nthChild_1, 'div_testStatus_internalText': div_testStatus_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 15-Click on div testStatus sanity2 - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Manage Test Status in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}