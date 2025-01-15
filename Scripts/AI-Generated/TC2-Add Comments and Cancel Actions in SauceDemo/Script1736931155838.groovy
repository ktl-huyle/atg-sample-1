import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /browse/*"

TrueTestScripts.navigate("/browse/${GlobalVariable.browse_id}")

"Step 2: Click on p Description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/p_Description'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on p Description.png')

"Step 3: Click on textarea Description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/textarea_Description'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on textarea Description.png')

"Step 4: Enter input value in textarea Description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_browse/textarea_Description'), textarea_Description)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Enter input value in textarea Description.png')

"Step 5: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button Cancel.png')

"Step 6: Click on link All"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/link_All'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link All.png')

"Step 7: Click on div AddComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/div_AddComment'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on div AddComment.png')

"Step 8: Click on link AddComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/link_AddComment'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link AddComment.png')

"Step 9: Enter input value in textarea Comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_browse/textarea_Comment'), textarea_Comment)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Enter input value in textarea Comment.png')

"Step 10: Click on button Visual"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/button_Visual'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on button Visual.png')

"Step 11: Click on div TabsPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/div_TabsPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on div TabsPlaceholder.png')

"Step 12: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on button Add.png')

"Step 13: Click on link AddComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/link_AddComment'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on link AddComment.png')

"Step 14: Click on link Cancel -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/link_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link Cancel - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add Comments and Cancel Actions in SauceDemo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}