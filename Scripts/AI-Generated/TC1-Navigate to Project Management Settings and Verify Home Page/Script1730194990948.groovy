import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to display single item:/{fixed part}/{item id or slug}/{fixed page}"

TrueTestScripts.navigate("display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}")

"Step 2: Click on button RicardoLaboy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/button_RicardoLaboy'))

WebUI.takeScreenshot()

"Step 3: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/div_Backdrop'))

WebUI.takeScreenshot()

"Step 4: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/span_Settings'))

WebUI.takeScreenshot()

"Step 5: Click on link ProjectManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/link_ProjectManagement'))

WebUI.takeScreenshot()

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate to Project Management Settings and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}