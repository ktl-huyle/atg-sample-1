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

"Step 3: Navigate to /Logoff"

TrueTestScripts.navigate("/Logoff")

"Step 4: Click on link SignInCreateAccount -> Navigate to page '/LogonForm'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/Logoff?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_Logoff/link_SignInCreateAccount'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 4-Click on link SignInCreateAccount - Navigate to page LogonForm.png')

"Step 5: Click on link SignIn5 -> Navigate to page 'webapp/wcs/stores/servlet/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_LogonForm/link_SignIn5'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 5-Click on link SignIn5 - Navigate to page webappwcsstoresservlet.png')

"Step 6: Click on div Content"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_webapp_wcs_stores_servlet/div_Content'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 6-Click on div Content.png')

"Step 7: Click on link shoppingCart (ShoppingCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_webapp_wcs_stores_servlet/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 7-Click on link shoppingCart ShoppingCart.png')

"Step 8: Click on div QuickCartContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_webapp_wcs_stores_servlet/div_QuickCartContainer'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 8-Click on div QuickCartContainer.png')

"Step 9: Click on link shoppingCart (ShoppingCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_webapp_wcs_stores_servlet/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 9-Click on link shoppingCart ShoppingCart2.png')

"Step 10: Click on link ViewAllItems -> Navigate to page '/AjaxOrderItemDisplayView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/webapp/wcs/stores/servlet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_webapp_wcs_stores_servlet/link_ViewAllItems'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 10-Click on link ViewAllItems - Navigate to page AjaxOrderItemDisplayView.png')

"Step 11: Click on div Box"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/div_Box'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 11-Click on div Box.png')

"Step 12: Click on link classroomResources (ClassroomDecorations) -> Navigate to page 'ideas-resources/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxOrderItemDisplayView?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_AjaxOrderItemDisplayView/link_classroomResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_AjaxOrderItemDisplayView/link_classroomResources', ['link_classroomResources_internalRoleMenuitemName': link_classroomResources_internalRoleMenuitemName]))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 12-Click on link classroomResources ClassroomDecorations - Navigate to page ideas-resources.png')

"Step 13: Click on link SocialEmotionalLearning -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ideas-resources/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ideas_resources/link_SocialEmotionalLearning'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 13-Click on link SocialEmotionalLearning - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC91-Navigate and Verify Home Page from Logoff_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}