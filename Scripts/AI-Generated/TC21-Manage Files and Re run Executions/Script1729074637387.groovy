import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/{*}/project/{*}/executions/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/executions/{*}")

"Step 4: Click on link Files -> Navigate to page 'file management#team/{*}/project/{*}/executions/{*}/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Files'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on link Files - Navigate to page file managementteamprojectexecutionsfiles.png')

"Step 5: Click on link fileManagement (MaintenanceFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_file_management/link_fileManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_file_management/link_fileManagement', ['link_fileManagement_trNthChild': link_fileManagement_trNthChild, 'link_fileManagement_internalRoleLinkName': link_fileManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on link fileManagement MaintenanceFile.png')

"Step 6: Click on button ReRun -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/button_ReRun'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on button ReRun - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Manage Files and Re run Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}