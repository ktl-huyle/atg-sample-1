import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 4: Click on link executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 4-Click on link executions3.png')

"Step 5: Click on link executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 5-Click on link executions3.png')

"Step 6: Click on link executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 6-Click on link executions3.png')

"Step 7: Click on link executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 7-Click on link executions3.png')

"Step 8: Click on link testResultSummary (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 8-Click on link testResultSummary object4.png')

"Step 9: Click on link testResultSummary (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_1, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 9-Click on link testResultSummary object5.png')

"Step 10: Click on header projectObjects (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 10-Click on header projectObjects object.png')

"Step 11: Click on button details"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 11-Click on button details.png')

"Step 12: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 12-Click on button object.png')

"Step 13: Click on div objectComponents (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 13-Click on div objectComponents object6.png')

"Step 14: Click on div objectDetails (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2', ['div_objectDetails_internalLabel': div_objectDetails_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 14-Click on div objectDetails object7.png')

"Step 15: Click on div objectDetails (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2', ['div_objectDetails_internalLabel': div_objectDetails_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 15-Click on div objectDetails object7.png')

"Step 16: Click on div objectDetails (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2', ['div_objectDetails_internalLabel': div_objectDetails_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 16-Click on div objectDetails object7.png')

"Step 17: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 17-Click on div object8.png')

"Step 18: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 18-Click on div object8.png')

"Step 19: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 19-Click on button object.png')

"Step 20: Click on div objectComponents (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 20-Click on div objectComponents object6.png')

"Step 21: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 21-Click on div object8.png')

"Step 22: Click on button sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 22-Click on button sessions.png')

"Step 23: Click on button failedTestResults -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_failedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC375/Step 23-Click on button failedTestResults - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC375-Manage Test Runs and Verify Home Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}