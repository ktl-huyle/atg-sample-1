import truetest.common.searchTermInteraction
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Interact with the search term input and display results."

searchTermInteraction.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on link GoToCart -> Navigate to page '/AjaxOrderItemDisplayView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC251/Step 5-Click on link GoToCart - Navigate to page AjaxOrderItemDisplayView.png')

"Step 6: Click on link Print"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/link_Print'))

WebUI.takeScreenshot(reportLocation + '/TC251/Step 6-Click on link Print.png')

"Step 7: Click on input PrintWithImages"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/input_PrintWithImages'))

WebUI.takeScreenshot(reportLocation + '/TC251/Step 7-Click on input PrintWithImages.png')

"Step 8: Click on link Print2 -> Navigate to page '/PrintOrderView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/link_Print2'))

WebUI.takeScreenshot(reportLocation + '/TC251/Step 8-Click on link Print2 - Navigate to page PrintOrderView.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC251-Search and Print with Images from Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}