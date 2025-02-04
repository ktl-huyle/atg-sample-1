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

"Step 1: Navigate to team/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}")

"Step 2: Click on button failedReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/button_failedReport'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Click on button failedReport.png')

"Step 3: Click on button deleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/button_deleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on button deleteExecution.png')

"Step 4: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on button delete.png')

"Step 5: Click on button failedReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/button_failedReport'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on button failedReport.png')

"Step 6: Click on button deleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/button_deleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on button deleteExecution.png')

"Step 7: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on button delete.png')

"Step 8: Click on div executionStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/div_executionStatus'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on div executionStatus.png')

"Step 9: Click on div dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/div_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on div dashboard.png')

"Step 10: Click on div leftNavbarImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/div_leftNavbarImage'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Click on div leftNavbarImage.png')

"Step 11: Click on div dashboardFirst"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/div_dashboardFirst'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Click on div dashboardFirst.png')

"Step 12: Click on div dashboardSecond"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team/div_dashboardSecond'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on div dashboardSecond.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Delete Failed Execution Reports in Team_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}