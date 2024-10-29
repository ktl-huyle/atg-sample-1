import truetest.custom.TrueTestScripts
import truetest.common.scheduleTestRunAndConfigureEnvironment
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

"Step 2: Click on div APImediaFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_APImediaFiles'))

WebUI.takeScreenshot()

"Step 3: Click on div SortIDDescending"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_SortIDDescending'))

WebUI.takeScreenshot()

"Step 4: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/button_CloseButton'))

WebUI.takeScreenshot()

"Step 5: Schedule a test run and configure the environment settings"

scheduleTestRunAndConfigureEnvironment.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on link Settings2 -> Navigate to page 'form:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/link_Settings2'))

WebUI.takeScreenshot()

"Step 7: Click on link ScriptRepositories -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/link_ScriptRepositories'))

WebUI.takeScreenshot()

"Step 8: Click on link KatalonWebsite -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_KatalonWebsite'))

WebUI.takeScreenshot()

"Step 9: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_RefreshScriptRepository'))

WebUI.takeScreenshot()

"Step 10: Click on link Dashboard -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_Dashboard'))

WebUI.takeScreenshot()

"Step 11: Click on link Executions4 -> Navigate to page 'display list of items:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_Executions4'))

WebUI.takeScreenshot()

"Step 12: Click on link Settings2 -> Navigate to page 'form:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/link_Settings2'))

WebUI.takeScreenshot()

"Step 13: Click on link ScriptRepositories -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/link_ScriptRepositories'))

WebUI.takeScreenshot()

"Step 14: Click on td KatalonWebsite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/td_KatalonWebsite'))

WebUI.takeScreenshot()

"Step 15: Click on link KatalonWebsite -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_KatalonWebsite'))

WebUI.takeScreenshot()

"Step 16: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_RefreshScriptRepository'))

WebUI.takeScreenshot()

"Step 17: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_RefreshScriptRepository2'))

WebUI.takeScreenshot()

"Step 18: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_RefreshScriptRepository2'))

WebUI.takeScreenshot()

"Step 19: Click on link Dashboard2 -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_Dashboard2'))

WebUI.takeScreenshot()

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Refresh Script Repository and Verify Item Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}