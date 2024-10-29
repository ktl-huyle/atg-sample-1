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

"Step 1: Navigate to display list of items:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}"

TrueTestScripts.navigate("display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}")

"Step 2: Click on div UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_UntitledTestRun'))

WebUI.takeScreenshot()

"Step 3: Click on div NavigationBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_NavigationBar'))

WebUI.takeScreenshot()

"Step 4: Click on div UntitledTestRun2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_UntitledTestRun2'))

WebUI.takeScreenshot()

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Navigate and Verify Home Page from Untitled Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}