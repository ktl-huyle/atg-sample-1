import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.duplicateSelectedTestSuites


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /team/262587/project/375002/test-design/test-suites"

TrueTestScripts.navigate("/team/262587/project/375002/test-design/test-suites")

"Step 2: Duplicate selected test suites in the project"

duplicateSelectedTestSuites.execute()

"Step 3: Click on link teamProjectTestDesignTestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/link_teamProjectTestDesignTestSuites'))

WebUI.takeScreenshot()

"Step 4: Duplicate selected test suites in the project"

duplicateSelectedTestSuites.execute()

"Step 5: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/span_object'))

WebUI.takeScreenshot()

"Step 6: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/button_delete'))

WebUI.takeScreenshot()

"Step 7: Click on link teamProjectTestDesignTestSuites -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/link_teamProjectTestDesignTestSuites'))

WebUI.takeScreenshot()

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Duplicate and Delete Test Suites in Team Project Test Design_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}