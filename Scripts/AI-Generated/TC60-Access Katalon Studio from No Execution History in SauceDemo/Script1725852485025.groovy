import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to no-execution-history"

TrueTestScripts.navigate("no-execution-history")

"Step 2: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/no-execution-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_no_execution_history/div_object'))

WebUI.takeScreenshot()

"Step 3: Click on button cp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/no-execution-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_no_execution_history/button_cp'))

WebUI.takeScreenshot()

"Step 4: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/no-execution-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_no_execution_history/div_object2'))

WebUI.takeScreenshot()

"Step 5: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/no-execution-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_no_execution_history/p_object'))

WebUI.takeScreenshot()

"Step 6: Click on strong katalonStudio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/no-execution-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_no_execution_history/strong_katalonStudio'))

WebUI.takeScreenshot()

"Step 7: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/no-execution-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_no_execution_history/div_object3'))

WebUI.takeScreenshot()

"Step 8: Click on link katalonStudio -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/no-execution-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_no_execution_history/link_katalonStudio'))

WebUI.takeScreenshot()

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC60-Access Katalon Studio from No Execution History in SauceDemo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}