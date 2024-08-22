import internal.GlobalVariable
import katalon.common.duplicateTestSuitesAndAccessTestCase
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

"Step 2: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/div_object'))

WebUI.takeScreenshot()

"Step 3: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/div_object_1'))

WebUI.takeScreenshot()

"Step 4: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/div_object_2'))

WebUI.takeScreenshot()

"Step 5: Click on link testCase342"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/link_testCase342'))

WebUI.takeScreenshot()

"Step 6: Duplicate selected test suites in the application"

duplicateTestSuites.execute()

"Step 7: Duplicate test suites and access specific test cases"

duplicateTestSuitesAndAccessTestCase.execute()

"Step 8: Click on link testCase442 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/262587/project/375002/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/link_testCase442'))

WebUI.takeScreenshot()

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Duplicate Test Suites and Access Test Cases in Design_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}