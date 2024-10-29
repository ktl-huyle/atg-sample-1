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

"Step 1: Navigate to display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}"

TrueTestScripts.navigate("display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}")

"Step 2: Click on link TestRuns4 -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_TestRuns4'))

WebUI.takeScreenshot()

"Step 3: Click on link TestRuns5 -> Navigate to page 'display list of items:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_TestRuns5'))

WebUI.takeScreenshot()

"Step 4: Click on div PenTestIssuesSprintA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_PenTestIssuesSprintA'))

WebUI.takeScreenshot()

"Step 5: Click on link PenTestIssuesSprintA -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/link_PenTestIssuesSprintA'))

WebUI.takeScreenshot()

"Step 6: Click on link TestRuns4 -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_TestRuns4'))

WebUI.takeScreenshot()

"Step 7: Click on link TestRuns5 -> Navigate to page 'display list of items:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_TestRuns5'))

WebUI.takeScreenshot()

"Step 8: Click on div PenTestIssuesSprintA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/div_PenTestIssuesSprintA'))

WebUI.takeScreenshot()

"Step 9: Click on link PenTestIssuesSprintA -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_list_of_items:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_list_of_items_fixed_part_item_id_or_slug_fixed_part_id/link_PenTestIssuesSprintA'))

WebUI.takeScreenshot()

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Access and Verify Pen Test Issues_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}