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

"Step 1: Navigate to display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{item main or descendent item category id or slug}"

TrueTestScripts.navigate("display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}")

"Step 2: Click on button BDDPOC"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_BDDPOC'))

WebUI.takeScreenshot()

"Step 3: Click on link MyOrganization -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{item_main_or_descendent_item_category_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_MyOrganization'))

WebUI.takeScreenshot()

"Step 4: Click on link BPBDDPOC -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/link_BPBDDPOC'))

WebUI.takeScreenshot()

"Step 5: Click on button BDDPOC"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_BDDPOC'))

WebUI.takeScreenshot()

"Step 6: Click on link Settings -> Navigate to page 'form:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_Settings'))

WebUI.takeScreenshot()

"Step 7: Click on label EnableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/label_EnableBDDReports'))

WebUI.takeScreenshot()

"Step 8: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/button_Save'))

WebUI.takeScreenshot()

"Step 9: Click on div AssertionPattern"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/div_AssertionPattern'))

WebUI.takeScreenshot()

"Step 10: Click on link Integrations -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/form:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_fixed_part_item_id_or_slug_fixed_part_item_id_or_slug_page/link_Integrations'))

WebUI.takeScreenshot()

"Step 11: Click on div KatalonStudio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/div_KatalonStudio'))

WebUI.takeScreenshot()

"Step 12: Click on div ChevronRightIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/div_ChevronRightIcon'))

WebUI.takeScreenshot()

"Step 13: Click on div MobileDeviceTesting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/div_MobileDeviceTesting'))

WebUI.takeScreenshot()

"Step 14: Click on div Kobiton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/div_Kobiton'))

WebUI.takeScreenshot()

"Step 15: Click on div TestingFramework -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/div_TestingFramework'))

WebUI.takeScreenshot()

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Configure BDD Reports and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}