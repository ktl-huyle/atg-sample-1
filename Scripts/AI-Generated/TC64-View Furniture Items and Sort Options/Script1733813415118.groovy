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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on link Seating -> Navigate to page 'furniture/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Seating'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 4-Click on link Seating - Navigate to page furniture.png')

"Step 5: Click on link furnitureItems (ChairAccessories) -> Navigate to page 'furniture/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/furniture/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_furniture/link_furnitureItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_furniture/link_furnitureItems', ['link_furnitureItems_internalRoleLinkName': link_furnitureItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 5-Click on link furnitureItems ChairAccessories - Navigate to page furniture.png')

"Step 6: Click on select SortOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/furniture/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_furniture/select_SortOptions'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 6-Click on select SortOptions.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC64-View Furniture Items and Sort Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}