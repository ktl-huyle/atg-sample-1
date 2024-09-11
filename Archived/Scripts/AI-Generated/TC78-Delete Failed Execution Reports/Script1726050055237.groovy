import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to team/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}")

"Step 4: Click on button failed809UateastReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_failed809UateastReports'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 4-Click on button failed809UateastReports.png')

"Step 5: Click on button deleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_deleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 5-Click on button deleteExecution.png')

"Step 6: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 6-Click on button delete.png')

"Step 7: Click on button failed809UateastReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_failed809UateastReports'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 7-Click on button failed809UateastReports.png')

"Step 8: Click on button deleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_deleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 8-Click on button deleteExecution.png')

"Step 9: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 9-Click on button delete.png')

"Step 10: Click on div doneTheExecution809Is"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_doneTheExecution809Is'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 10-Click on div doneTheExecution809Is.png')

"Step 11: Click on div dashboardNth2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_dashboardNth2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 11-Click on div dashboardNth2.png')

"Step 12: Click on div leftNavbarCollapseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_leftNavbarCollapseButton'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 12-Click on div leftNavbarCollapseButton.png')

"Step 13: Click on div dashboardNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_dashboardNth0'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 13-Click on div dashboardNth0.png')

"Step 14: Click on div dashboardNth1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_dashboardNth1'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 14-Click on div dashboardNth1.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC78-Delete Failed Execution Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}