import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import katalon.common.duplicateTestSuites
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /team/262587/project/375002/test-design/test-suites"

TrueTestScripts.navigate("/team/262587/project/375002/test-design/test-suites")

"Step 2: Duplicate selected test suites in the application"

duplicateTestSuites.execute()

"Step 3: Click on input selectTestSuite944954"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/input_selectTestSuite944954'))

WebUI.takeScreenshot()

"Step 4: Click on input selectTestSuite944953"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/input_selectTestSuite944953'))

WebUI.takeScreenshot()

"Step 5: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/button_delete'))

WebUI.takeScreenshot()

"Step 6: Click on button delete -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/button_delete_1'))

WebUI.takeScreenshot()

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Duplicate and Delete Test Suites in Test Design_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}