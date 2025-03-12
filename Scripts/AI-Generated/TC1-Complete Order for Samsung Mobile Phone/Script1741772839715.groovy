import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.buyItemAndProceedToCheckout
import truetest.common.fillShippingDetailsAndCompleteOrder
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link Samsung -> Navigate to page 'product categories#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Samsung'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link Samsung - Navigate to page product categories.png')

"Step 3: Click on link mobileProduct (SamsungGalaxyS23Ultra)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_categories/link_mobileProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_categories/link_mobileProduct', ['link_mobileProduct_class': link_mobileProduct_class, 'link_mobileProduct_internalRoleLinkName': link_mobileProduct_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link mobileProduct SamsungGalaxyS23Ultra.png')

"Step 4: Select an item and proceed to the checkout process."

buyItemAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Fill in shipping details and complete the order process."

fillShippingDetailsAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Order for Samsung Mobile Phone_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}