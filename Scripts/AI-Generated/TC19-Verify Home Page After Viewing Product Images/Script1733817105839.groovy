import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.viewMultipleProductImages
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

"Step 3: Navigate to /*"

TrueTestScripts.navigate("/${GlobalVariable.path_param_2}")

"Step 4: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on button Close.png')

"Step 5: Click on link productImages (ProductImagesModal2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productImages_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productImages_2', ['link_productImages_internalRoleLinkName': link_productImages_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on link productImages ProductImagesModal2.png')

"Step 6: View multiple product images"

viewMultipleProductImages.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Verify Home Page After Viewing Product Images_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}