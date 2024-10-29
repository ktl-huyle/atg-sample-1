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

"Step 1: Navigate to display single item:/{fixed part}/{item id or slug}"

TrueTestScripts.navigate("display_single_item:/{fixed_part}/{item_id_or_slug}")

"Step 2: Click on button FailedExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/button_FailedExecution'))

WebUI.takeScreenshot()

"Step 3: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/button_DeleteExecution'))

WebUI.takeScreenshot()

"Step 4: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/button_Delete'))

WebUI.takeScreenshot()

"Step 5: Click on button FailedExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/button_FailedExecution'))

WebUI.takeScreenshot()

"Step 6: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/button_DeleteExecution'))

WebUI.takeScreenshot()

"Step 7: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/button_Delete'))

WebUI.takeScreenshot()

"Step 8: Click on div ExecutionDoneAlert"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/div_ExecutionDoneAlert'))

WebUI.takeScreenshot()

"Step 9: Click on div Dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/div_Dashboard'))

WebUI.takeScreenshot()

"Step 10: Click on div LeftNavbarImage -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug/div_LeftNavbarImage'))

WebUI.takeScreenshot()

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Delete Failed Test Executions and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}