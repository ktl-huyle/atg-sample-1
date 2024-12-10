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

"Step 3: Navigate to /SearchDisplay"

TrueTestScripts.navigate("/SearchDisplay")

"Step 4: Click on div SearchTermWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/div_SearchTermWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on div SearchTermWrapper.png')

"Step 5: Enter input value in input SearchTerm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_SearchDisplay/input_SearchTerm2'), input_SearchTerm2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Enter input value in input SearchTerm2.png')

"Step 6: Click on link juniorLearningDominoes (object115) -> Navigate to page '/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_SearchDisplay/link_juniorLearningDominoes'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on link juniorLearningDominoes object115 - Navigate to page .png')

"Step 7: Click on input SearchTerm3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchTerm3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on input SearchTerm3.png')

"Step 8: Enter input value in input SearchTerm4 -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_SearchTerm3'), input_SearchTerm4)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Enter input value in input SearchTerm4 - Navigate to page SearchDisplay.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Search and Product Navigation from Search Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}