import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleAndRunTestSuite
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts

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

"Step 3: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 4: Click on link organizationItems (FirstProject) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationItems', ['link_organizationItems_internalRoleLinkName': link_organizationItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link organizationItems FirstProject - Navigate to page team projectteamproject.png')

"Step 5: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link Executions.png')

"Step 6: Schedule a test run and execute the test suite with settings"

scheduleAndRunTestSuite.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Schedule Test Run and Execute Test Suite in Organization Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}