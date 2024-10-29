import truetest.custom.TrueTestScripts
import truetest.common.markTestResultsAndSubmitChanges
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

"Step 2: Mark test results and submit the changes"

markTestResultsAndSubmitChanges.execute()

"Step 3: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 4: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 5: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 6: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 7: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 8: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 9: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 10: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 11: Click on button Submit -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 12: Click on button ExternalLink4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink4'))

WebUI.takeScreenshot()

"Step 13: Click on button ExternalLink5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink5'))

WebUI.takeScreenshot()

"Step 14: Click on button ExternalLink6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink6'))

WebUI.takeScreenshot()

"Step 15: Click on button ExternalLink7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink7'))

WebUI.takeScreenshot()

"Step 16: Mark test results and submit the changes"

markTestResultsAndSubmitChanges.execute()

"Step 17: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 18: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 19: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 20: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 21: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 22: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 23: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 24: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 25: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 26: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 27: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 28: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 29: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 30: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 31: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 32: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 33: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 34: Click on button Submit -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 35: Click on button ExternalLink8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink8'))

WebUI.takeScreenshot()

"Step 36: Click on button ExternalLink9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink9'))

WebUI.takeScreenshot()

"Step 37: Click on button InsightlyAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_InsightlyAutomation'))

WebUI.takeScreenshot()

"Step 38: Click on link Insightly -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/link_Insightly'))

WebUI.takeScreenshot()

"Step 39: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 40: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 41: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 42: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))

WebUI.takeScreenshot()

"Step 43: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))

WebUI.takeScreenshot()

"Step 44: Click on button Submit -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed page}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}/{fixed_part}/{item_id_or_slug}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))

WebUI.takeScreenshot()

"Step 45: Click on link TestExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/display_single_item:/{fixed_part}/{item_id_or_slug}/{fixed_page}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_page/link_TestExecution'))

WebUI.takeScreenshot()

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Mark Test Results and Verify Execution Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}