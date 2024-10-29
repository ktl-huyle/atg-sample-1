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

"Step 3: Navigate to /*"

TrueTestScripts.navigate("/${GlobalVariable.path_param_2}")

"Step 4: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC233/Step 4-Click on button Close.png')

"Step 5: Click on link productImages (ChildcraftStandardUnit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productImages', ['link_productImages_internalRoleOptionName': link_productImages_internalRoleOptionName]))

WebUI.takeScreenshot(reportLocation + '/TC233/Step 5-Click on link productImages ChildcraftStandardUnit.png')

"Step 6: Click on link Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Close'))

WebUI.takeScreenshot(reportLocation + '/TC233/Step 6-Click on link Close - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC233-Close Product Display and Return to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}