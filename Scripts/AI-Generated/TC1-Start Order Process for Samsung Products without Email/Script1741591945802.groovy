import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInfoWithoutEmail
import truetest.common.initiateOrderAndProceedToCheckout
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

"Step 3: Click on link mobileProducts (SamsungGalaxyS23Ultra)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_categories/link_mobileProducts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_categories/link_mobileProducts', ['link_mobileProducts_class': link_mobileProducts_class, 'link_mobileProducts_internalRoleLinkName': link_mobileProducts_internalRoleLinkName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link mobileProducts SamsungGalaxyS23Ultra.png')

"Step 4: Start order process by entering email and proceed to shipping."

initiateOrderAndProceedToCheckout.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Enter shipping information and complete order without email input."

fillShippingInfoWithoutEmail.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Start Order Process for Samsung Products without Email_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}