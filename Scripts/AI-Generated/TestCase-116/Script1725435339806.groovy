import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on div object3 -> Navigate to page 'home/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_welcome/div_object3'))

WebUI.takeScreenshot()

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-116_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}