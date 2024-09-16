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

"Step 4: Click on link executions6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions6'))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 4-Click on link executions6.png')

"Step 5: Click on link testResultSummary (object37)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 5-Click on link testResultSummary object37.png')

"Step 6: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 6-Click on button object3.png')

"Step 7: Click on header projectObjects (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 7-Click on header projectObjects object4.png')

"Step 8: Click on button sessions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 8-Click on button sessions2.png')

"Step 9: Click on header projectObjects (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 9-Click on header projectObjects object5.png')

"Step 10: Click on link testResultSummary (object38)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_1, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 10-Click on link testResultSummary object38.png')

"Step 11: Click on link testResultSummary (object39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_2, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 11-Click on link testResultSummary object39.png')

"Step 12: Click on link testResultSummary (object40)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_3, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 12-Click on link testResultSummary object40.png')

"Step 13: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC386/Step 13-Click on button object4.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC386-Verify Test Result Summary Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}