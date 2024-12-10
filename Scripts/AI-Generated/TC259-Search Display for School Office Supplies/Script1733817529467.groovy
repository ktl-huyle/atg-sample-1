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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to school-office-supplies/*/*/*"

TrueTestScripts.navigate("school-office-supplies/${GlobalVariable.school_office_supplies_id}/${GlobalVariable.path_param_3}/${GlobalVariable.path_param_4}")

"Step 4: Click on div smartSquadOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/school-office-supplies/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_school_office_supplies/div_smartSquadOption'))

WebUI.takeScreenshot(reportLocation + '/TC259/Step 4-Click on div smartSquadOption.png')

"Step 5: Click on input SearchTermFieldAlt52 -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/school-office-supplies/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_school_office_supplies/input_SearchTermFieldAlt52'))

WebUI.takeScreenshot(reportLocation + '/TC259/Step 5-Click on input SearchTermFieldAlt52 - Navigate to page SearchDisplay.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC259-Search Display for School Office Supplies_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}