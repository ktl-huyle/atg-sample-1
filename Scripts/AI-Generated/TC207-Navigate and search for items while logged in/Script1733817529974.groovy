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

"Step 3: Navigate to /*"

TrueTestScripts.navigate("/${GlobalVariable.path_param_2}")

"Step 4: Click on header pageTitles (PageHeading)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/header_pageTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/header_pageTitles', ['header_pageTitles_internalRoleHeadingName': header_pageTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC207/Step 4-Click on header pageTitles PageHeading.png')

"Step 5: Click on input SearchTerm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchTerm2'))

WebUI.takeScreenshot(reportLocation + '/TC207/Step 5-Click on input SearchTerm2.png')

"Step 6: Enter input value in input SearchTerm162"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_SearchTerm2'), input_SearchTerm162)

WebUI.takeScreenshot(reportLocation + '/TC207/Step 6-Enter input value in input SearchTerm162.png')

"Step 7: Click on link Search -> Navigate to page '/SearchDisplay'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Search'))

WebUI.takeScreenshot(reportLocation + '/TC207/Step 7-Click on link Search - Navigate to page SearchDisplay.png')

"Step 8: Click on div Column -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/SearchDisplay?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/div_Column'))

WebUI.takeScreenshot(reportLocation + '/TC207/Step 8-Click on div Column - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC207-Navigate and search for items while logged in_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}