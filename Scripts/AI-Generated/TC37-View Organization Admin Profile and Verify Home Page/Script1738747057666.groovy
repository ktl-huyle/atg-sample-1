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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on button ai"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_ai'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 2-Click on button ai.png')

"Step 3: Click on link viewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_viewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 3-Click on link viewProfile.png')

"Step 4: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 4-Click on div Backdrop.png')

"Step 5: Click on div topNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_topNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 5-Click on div topNavbar.png')

"Step 6: Click on button organizationAdmin (organizationAdmin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin', ['button_organizationAdmin_internalRoleButtonName': button_organizationAdmin_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 6-Click on button organizationAdmin organizationAdmin.png')

"Step 7: Click on button organizationAdmin (organizationAdmin2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin', ['button_organizationAdmin_internalRoleButtonName': button_organizationAdmin_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 7-Click on button organizationAdmin organizationAdmin2.png')

"Step 8: Click on div TopLeftNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_TopLeftNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 8-Click on div TopLeftNavbar.png')

"Step 9: Click on button organizationAdmin (organizationAdmin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdmin', ['button_organizationAdmin_internalRoleButtonName': button_organizationAdmin_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 9-Click on button organizationAdmin organizationAdmin.png')

"Step 10: Click on link organizationAdmin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_organizationAdmin'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 10-Click on link organizationAdmin.png')

"Step 11: Click on link viewAllProjects -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_viewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 11-Click on link viewAllProjects - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-View Organization Admin Profile and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}