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

"Step 2: Click on div CustomCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_CustomCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on div CustomCheckbox.png')

"Step 3: Click on label testResults (FailedSISBook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_testResults', ['label_testResults_for': label_testResults_for, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on label testResults FailedSISBook.png')

"Step 4: Click on label testResults (FailedSISBook2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_testResults', ['label_testResults_for': label_testResults_for_1, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on label testResults FailedSISBook2.png')

"Step 5: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on button Delete.png')

"Step 6: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete_1'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on button delete.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Delete Test Results from Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}