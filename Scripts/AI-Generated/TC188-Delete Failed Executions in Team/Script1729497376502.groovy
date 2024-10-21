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

"Step 3: Navigate to /team/*"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}")

"Step 4: Click on button FailedExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_FailedExecution'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 4-Click on button FailedExecution.png')

"Step 5: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_DeleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 5-Click on button DeleteExecution.png')

"Step 6: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 6-Click on button Delete.png')

"Step 7: Click on button FailedExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_FailedExecution'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 7-Click on button FailedExecution.png')

"Step 8: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_DeleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 8-Click on button DeleteExecution.png')

"Step 9: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 9-Click on button Delete.png')

"Step 10: Click on div ExecutionDoneMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_ExecutionDoneMessage'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 10-Click on div ExecutionDoneMessage.png')

"Step 11: Click on div DashboardLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_DashboardLink'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 11-Click on div DashboardLink.png')

"Step 12: Click on div LeftNavbarImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_LeftNavbarImage'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 12-Click on div LeftNavbarImage.png')

"Step 13: Click on div dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 13-Click on div dashboard.png')

"Step 14: Click on div dashboard2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC188/Step 14-Click on div dashboard2.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC188-Delete Failed Executions in Team_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}