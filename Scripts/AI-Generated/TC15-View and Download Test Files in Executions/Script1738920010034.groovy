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

"Step 1: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 2: Click on pre failedTestMessages (ErrorMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestMessages', ['pre_failedTestMessages_class': pre_failedTestMessages_class, 'pre_failedTestMessages_internalRoleButtonName': pre_failedTestMessages_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Click on pre failedTestMessages ErrorMessage.png')

"Step 3: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on div ThumbnailImage.png')

"Step 4: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on div GalleryView.png')

"Step 5: Click on button ShowSlide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_ShowSlide'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on button ShowSlide.png')

"Step 6: Click on div PreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_PreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on div PreviewMessage.png')

"Step 7: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on div ThumbnailImage3.png')

"Step 8: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on button close.png')

"Step 9: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on div ThumbnailImage3.png')

"Step 10: Click on button Download"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Download'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on button Download.png')

"Step 11: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Click on button close.png')

"Step 12: Click on div ResourceCenter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ResourceCenter'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on div ResourceCenter.png')

"Step 13: Click on pre Timestamp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_Timestamp'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Click on pre Timestamp.png')

"Step 14: Click on div InfoSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_InfoSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Click on div InfoSidebar2.png')

"Step 15: Click on div UnderNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_UnderNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Click on div UnderNavbar.png')

"Step 16: Click on button CareContinuityPortals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CareContinuityPortals'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on button CareContinuityPortals.png')

"Step 17: Click on div UnderNavbar -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_UnderNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 17-Click on div UnderNavbar - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-View and Download Test Files in Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}