import truetest.custom.TrueTestScripts
import truetest.common.createNewApiKey
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to form:/{fixed part}/{fixed page}"

TrueTestScripts.navigate("/{fixed_part}/{fixed_page}")

"Step 2: Click on button CellButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CellButton2'))

WebUI.takeScreenshot()

"Step 3: Click on button ShowApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ShowApiKey'))

WebUI.takeScreenshot()

"Step 4: Click on button CopyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CopyToClipboard'))

WebUI.takeScreenshot()

"Step 5: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_object'))

WebUI.takeScreenshot()

"Step 6: Create a new API key for the application"

createNewApiKey.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on button ShowApiKey2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_ShowApiKey2'))

WebUI.takeScreenshot()

"Step 8: Click on button CopyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_CopyToClipboard'))

WebUI.takeScreenshot()

"Step 9: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_object'))

WebUI.takeScreenshot()

"Step 10: Click on button NK"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/button_NK'))

WebUI.takeScreenshot()

"Step 11: Click on link SignOut -> Navigate to page 'form:/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_fixed_page/link_SignOut'))

WebUI.takeScreenshot()

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Create and Copy Multiple API Keys_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}