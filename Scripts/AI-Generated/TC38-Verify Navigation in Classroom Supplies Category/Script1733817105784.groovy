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

"Step 3: Navigate to furniture/*/*"

TrueTestScripts.navigate("furniture/${GlobalVariable.furniture_id}/${GlobalVariable.path_param_3}")

"Step 4: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/furniture/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_furniture/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 4-Click on button close.png')

"Step 5: Click on button ShowMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/furniture/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_furniture/button_ShowMore_1'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 5-Click on button ShowMore.png')

"Step 6: Click on link ClassroomSelect -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/furniture/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_furniture/link_ClassroomSelect_1'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 6-Click on link ClassroomSelect - Navigate to page SearchDisplay.png')

"Step 7: Click on p productDescriptions (PhonicsFactoryDescription)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_SearchDisplay/p_productDescriptions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_SearchDisplay/p_productDescriptions_1', ['p_productDescriptions_internalText': p_productDescriptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 7-Click on p productDescriptions PhonicsFactoryDescription.png')

"Step 8: Click on link ClassroomSelectScienceTable -> Navigate to page '/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/link_ClassroomSelectScienceTable_1'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 8-Click on link ClassroomSelectScienceTable - Navigate to page .png')

"Step 9: Click on button ShowMore2 -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_ShowMore2_1'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 9-Click on button ShowMore2 - Navigate to page SearchDisplay.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC38-Verify Navigation in Classroom Supplies Category_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}