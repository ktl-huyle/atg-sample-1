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

"Step 2: Click on div DailyPast7Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_DailyPast7Days'))

WebUI.takeScreenshot()

"Step 3: Click on div TestRunByStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_TestRunByStatus'))

WebUI.takeScreenshot()

"Step 4: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/span_Settings'))

WebUI.takeScreenshot()

"Step 5: Click on link UserManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/link_UserManagement'))

WebUI.takeScreenshot()

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Access User Management from Test Run Status_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}