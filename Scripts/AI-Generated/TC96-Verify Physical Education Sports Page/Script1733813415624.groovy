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

"Step 3: Navigate to physical-education-sport/*/*/*"

TrueTestScripts.navigate("physical-education-sport/${GlobalVariable.physical_education_sport_id}/${GlobalVariable.path_param_3}/${GlobalVariable.path_param_4}")

"Step 4: Click on image ProductThumbnail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/physical-education-sport/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_physical_education_sport/image_ProductThumbnail'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 4-Click on image ProductThumbnail.png')

"Step 5: Click on image ProductThumbnail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/physical-education-sport/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_physical_education_sport/image_ProductThumbnail'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 5-Click on image ProductThumbnail.png')

"Step 6: Click on link CloseModal -> Navigate to page 'physical-education-sport/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/physical-education-sport/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_physical_education_sport/link_CloseModal'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 6-Click on link CloseModal - Navigate to page physical-education-sport.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC96-Verify Physical Education Sports Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}