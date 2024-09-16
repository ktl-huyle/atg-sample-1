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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on button sortIdascending"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_sortIdascending'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 4-Click on button sortIdascending.png')

"Step 5: Click on span startedAscending"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_startedAscending'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 5-Click on span startedAscending.png')

"Step 6: Click on div failedAuths (failedEd1451AuthOnly)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedAuths"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedAuths', ['div_failedAuths_class': div_failedAuths_class, 'div_failedAuths_internalRoleButtonName': div_failedAuths_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 6-Click on div failedAuths failedEd1451AuthOnly.png')

"Step 7: Click on div failedEd2364Ecommsale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_failedEd2364Ecommsale'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 7-Click on div failedEd2364Ecommsale.png')

"Step 8: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 8-Click on div thumbnailImage.png')

"Step 9: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 9-Click on button close.png')

"Step 10: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 10-Click on div thumbnailImage.png')

"Step 11: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 11-Click on button close.png')

"Step 12: Click on link page2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_page2'))

WebUI.takeScreenshot(reportLocation + '/TC427/Step 12-Click on link page2 - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC427-Verify Sorting and Navigation in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}