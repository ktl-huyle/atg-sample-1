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

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Click on button Close2.png')

"Step 5: Click on div ELAGamesActivities -> Navigate to page 'english-language-arts/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_ELAGamesActivities'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on div ELAGamesActivities - Navigate to page english-language-arts.png')

"Step 6: Click on div EnglishLanguageArts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/english-language-arts/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_english_language_arts/div_EnglishLanguageArts'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on div EnglishLanguageArts.png')

"Step 7: Click on link default (default)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/english-language-arts/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_english_language_arts/link_default'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 7-Click on link default default.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Navigate to English Language Arts Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}