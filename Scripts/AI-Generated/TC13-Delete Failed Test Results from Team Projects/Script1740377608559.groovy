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

"Step 1: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 2: Click on div customCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_customCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on div customCheckbox.png')

"Step 3: Click on label failedTestResults (failed655FailedSISBook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on label failedTestResults failed655FailedSISBook.png')

"Step 4: Click on label failedTestResults (failed654FailedSISBook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for_1, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on label failedTestResults failed654FailedSISBook.png')

"Step 5: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on button delete.png')

"Step 6: Click on button deleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_deleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on button deleteDialog.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Delete Failed Test Results from Team Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}