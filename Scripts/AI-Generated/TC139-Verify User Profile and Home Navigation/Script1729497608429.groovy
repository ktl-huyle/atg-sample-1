import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div qualityRoles (QualityEngineer2) -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_welcome/div_qualityRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_welcome/div_qualityRoles', ['div_qualityRoles_nthChild': div_qualityRoles_nthChild, 'div_qualityRoles_internalHasText': div_qualityRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 4-Click on div qualityRoles QualityEngineer2 - Navigate to page organizationhome.png')

"Step 5: Click on button userButtons (AR)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_userButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_userButtons', ['button_userButtons_internalRoleButtonName': button_userButtons_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 5-Click on button userButtons AR.png')

"Step 6: Click on div UserflowModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_UserflowModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 6-Click on div UserflowModalBackdrop.png')

"Step 7: Click on div UserflowModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_UserflowModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 7-Click on div UserflowModalBackdrop.png')

"Step 8: Click on div UserflowModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_UserflowModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 8-Click on div UserflowModalBackdrop.png')

"Step 9: Click on div EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_EmailAddress'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 9-Click on div EmailAddress.png')

"Step 10: Click on div EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_EmailAddress'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 10-Click on div EmailAddress.png')

"Step 11: Click on div Backdrop -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 11-Click on div Backdrop - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC139-Verify User Profile and Home Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}