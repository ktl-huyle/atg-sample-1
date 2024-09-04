import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_object'))

WebUI.takeScreenshot()

"Step 3: Click on link testopsHomepage -> Navigate to page 'organization/*/settings/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_testopsHomepage'))

WebUI.takeScreenshot()

"Step 4: Click on link organizationSettingsTruetest -> Navigate to page 'organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_organizationSettingsTruetest'))

WebUI.takeScreenshot()

"Step 5: Click on link llaDigitalJamaicaECommerceFlow -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_llaDigitalJamaicaECommerceFlow'))

WebUI.takeScreenshot()

"Step 6: Click on link settings2 -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings2'))

WebUI.takeScreenshot()

"Step 7: Click on div graphVisualizationUserJourney"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_graphVisualizationUserJourney'))

WebUI.takeScreenshot()

"Step 8: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_object'))

WebUI.takeScreenshot()

"Step 9: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot()

"Step 10: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object2'))

WebUI.takeScreenshot()

"Step 11: Click on link s3AmazonawsComAiS3E2etgProcessedTraffi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_s3AmazonawsComAiS3E2etgProcessedTraffi'))

WebUI.takeScreenshot()

"Step 12: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/span_object'))

WebUI.takeScreenshot()

"Step 13: Click on link manageE2etg -> Navigate to page 'organization/*/settings/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_manageE2etg'))

WebUI.takeScreenshot()

"Step 14: Click on link organizationSettingsTruetest -> Navigate to page 'organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_organizationSettingsTruetest'))

WebUI.takeScreenshot()

"Step 15: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_object'))

WebUI.takeScreenshot()

"Step 16: Click on div httpsFlsitjamDiscoverflowLlaDigital"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_httpsFlsitjamDiscoverflowLlaDigital'))

WebUI.takeScreenshot()

"Step 17: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/p_object'))

WebUI.takeScreenshot()

"Step 18: Click on link llaDigitalJamaicaECommerceFlow -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_llaDigitalJamaicaECommerceFlow'))

WebUI.takeScreenshot()

"Step 19: Click on link settings2 -> Navigate to page 'team/*/project/*/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings2'))

WebUI.takeScreenshot()

"Step 20: Click on button viewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest/button_viewDetails'))

WebUI.takeScreenshot()

"Step 21: Click on input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'))

WebUI.takeScreenshot()

"Step 22: Enter input value in input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'), input_searchFlowsInput)

WebUI.takeScreenshot()

"Step 23: Click on input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'))

WebUI.takeScreenshot()

"Step 24: Enter input value in input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'), input_searchFlowsInput)

WebUI.takeScreenshot()

"Step 25: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_object'))

WebUI.takeScreenshot()

"Step 26: Click on button keyboardarrowrighticon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_keyboardarrowrighticon'))

WebUI.takeScreenshot()

"Step 27: Click on p object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_object2'))

WebUI.takeScreenshot()

"Step 28: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object3'))

WebUI.takeScreenshot()

"Step 29: Click on button keyboardarrowrighticon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_keyboardarrowrighticon'))

WebUI.takeScreenshot()

"Step 30: Click on input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'))

WebUI.takeScreenshot()

"Step 31: Enter input value in input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'), input_searchFlowsInput)

WebUI.takeScreenshot()

"Step 32: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_object'))

WebUI.takeScreenshot()

"Step 33: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object4'))

WebUI.takeScreenshot()

"Step 34: Click on input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'))

WebUI.takeScreenshot()

"Step 35: Enter input value in input searchFlowsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlowsInput'), input_searchFlowsInput)

WebUI.takeScreenshot()

"Step 36: Click on button object5 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object5'))

WebUI.takeScreenshot()

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-068_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}