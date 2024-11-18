import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.configureEnvironmentsAndScheduleJob

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

"Step 3: Navigate to team/*/project/*/grid/plan/*/job"

TrueTestScripts.navigate("team/*/project/*/grid/plan/*/job")

"Step 4: Configure environments and schedule a job"

configureEnvironmentsAndScheduleJob.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on input Search -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Click on input Search - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Search from Team Project Grid Plan Job_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}