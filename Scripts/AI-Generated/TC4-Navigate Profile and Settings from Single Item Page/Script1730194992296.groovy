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

"Step 2: Click on button NidhiKachhadiya"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/button_NidhiKachhadiya'))

WebUI.takeScreenshot()

"Step 3: Click on link ViewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/link_ViewProfile'))

WebUI.takeScreenshot()

"Step 4: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/div_Backdrop'))

WebUI.takeScreenshot()

"Step 5: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/span_Settings'))

WebUI.takeScreenshot()

"Step 6: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/div_Backdrop'))

WebUI.takeScreenshot()

"Step 7: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/span_Settings'))

WebUI.takeScreenshot()

"Step 8: Click on link TestOpsHomepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/link_TestOpsHomepage'))

WebUI.takeScreenshot()

"Step 9: Click on div EEnCompass -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/div_EEnCompass'))

WebUI.takeScreenshot()

"Step 10: Click on link Executions3 -> Navigate to page 'display list of items:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_Executions3'))

WebUI.takeScreenshot()

"Step 11: Click on link Settings -> Navigate to page 'form:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/link_Settings'))

WebUI.takeScreenshot()

"Step 12: Click on link Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/link_Settings'))

WebUI.takeScreenshot()

"Step 13: Click on button NotificationAction -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/button_NotificationAction'))

WebUI.takeScreenshot()

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate Profile and Settings from Single Item Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}