import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}")

"Step 2: Click on button FailedReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_FailedReports'))

WebUI.takeScreenshot()

"Step 3: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_DeleteExecution'))

WebUI.takeScreenshot()

"Step 4: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_Delete'))

WebUI.takeScreenshot()

"Step 5: Click on button FailedReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_FailedReports'))

WebUI.takeScreenshot()

"Step 6: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_DeleteExecution'))

WebUI.takeScreenshot()

"Step 7: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/button_Delete'))

WebUI.takeScreenshot()

"Step 8: Click on div ExecutionDoneAlert"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_ExecutionDoneAlert'))

WebUI.takeScreenshot()

"Step 9: Click on div dashboard (Dashboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team/div_dashboard'))

WebUI.takeScreenshot()

"Step 10: Click on div LeftNavbarImage -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team/div_LeftNavbarImage'))

WebUI.takeScreenshot()

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Delete Failed Test Execution Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}