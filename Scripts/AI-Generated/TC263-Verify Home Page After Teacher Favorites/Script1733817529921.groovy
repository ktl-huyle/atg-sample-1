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

"Step 3: Navigate to school-office-supplies/*"

TrueTestScripts.navigate("school-office-supplies/${GlobalVariable.school_office_supplies_id}")

"Step 4: Click on button AcceptAllCookies"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/school-office-supplies/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_school_office_supplies/button_AcceptAllCookies'))

WebUI.takeScreenshot(reportLocation + '/TC263/Step 4-Click on button AcceptAllCookies.png')

"Step 5: Click on div ProductInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/school-office-supplies/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_school_office_supplies/div_ProductInfo'))

WebUI.takeScreenshot(reportLocation + '/TC263/Step 5-Click on div ProductInfo.png')

"Step 6: Click on link teacherFavorites (TexasInstrumentsTI83Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/school-office-supplies/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_school_office_supplies/link_teacherFavorites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_school_office_supplies/link_teacherFavorites', ['link_teacherFavorites_internalRoleLinkName': link_teacherFavorites_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC263/Step 6-Click on link teacherFavorites TexasInstrumentsTI83Plus.png')

"Step 7: Click on div EmptyDiv -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/school-office-supplies/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_school_office_supplies/div_EmptyDiv'))

WebUI.takeScreenshot(reportLocation + '/TC263/Step 7-Click on div EmptyDiv - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC263-Verify Home Page After Teacher Favorites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}