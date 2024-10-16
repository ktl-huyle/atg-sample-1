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

"Step 3: Navigate to team/{*}/project/{*}/grid"

TrueTestScripts.navigate("team/{*}/project/{*}/grid")

"Step 4: Click on div infoSidebar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_infoSidebar'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on div infoSidebar.png')

"Step 5: Click on button row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_row'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Click on button row.png')

"Step 6: Click on link planJob -> Navigate to page 'team project job#team/{*}/project/{*}/grid/plan/{*}/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_planJob'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 6-Click on link planJob - Navigate to page team project jobteamprojectgridplanjob.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Verify Team Project Job Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}