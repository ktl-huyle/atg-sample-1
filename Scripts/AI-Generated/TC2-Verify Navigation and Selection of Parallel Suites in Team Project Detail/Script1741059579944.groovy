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

"Step 1: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${team_id}/project/${project_id}/${path_param_5}")

"Step 2: Click on div parallelSuites (ParallelSuite749)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites', ['div_parallelSuites_internalRoleCellName': div_parallelSuites_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on div parallelSuites ParallelSuite749.png')

"Step 3: Click on div parallelSuites (ParallelSuite750)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites', ['div_parallelSuites_internalRoleCellName': div_parallelSuites_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on div parallelSuites ParallelSuite750.png')

"Step 4: Click on div parallelSuites (ParallelSuite751) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites', ['div_parallelSuites_internalRoleCellName': div_parallelSuites_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on div parallelSuites ParallelSuite751 - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Navigation and Selection of Parallel Suites in Team Project Detail_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}