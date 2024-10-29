import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.common.searchAndContinueShopping
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

"Step 4: Click on input SearchTerm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchTerm'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 4-Click on input SearchTerm.png')

"Step 5: Click on input SearchTerm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchTerm'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 5-Click on input SearchTerm.png')

"Step 6: Enter input value in input SearchTerm -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_SearchTerm'), input_SearchTerm)

WebUI.takeScreenshot(reportLocation + '/TC235/Step 6-Enter input value in input SearchTerm - Navigate to page SearchDisplay.png')

"Step 7: Click on input quantityField (Quantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_SearchDisplay/input_quantityField'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 7-Click on input quantityField Quantity.png')

"Step 8: Search for product and continue shopping after adding to cart"

searchAndContinueShopping.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC235-Search and Add to Cart While Continuing to Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}