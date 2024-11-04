package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class configureTestSuiteAndRun {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 2: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 3: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), data['input_Name'])
        
        "Step 4: Click on div TestSuiteControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteControl'))
        
        "Step 5: Click on div TestSuiteOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteOption'))
        
        "Step 6: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment'))
        
        "Step 7: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))
        
        "Step 8: Click on label DesktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))
        
        "Step 9: Click on div ActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnels'))
        
        "Step 10: Click on div UserEmail2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserEmail2'))
        
        "Step 11: Click on input IncludeAPICalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_IncludeAPICalls'))
        
        "Step 12: Click on input RadioButtonA"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA'))
        
        "Step 13: Click on div Indicator"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))
        
        "Step 14: Click on div CreatedWithSketch"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch'))
        
        "Step 15: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save'))
        
        "Step 16: Click on button AdvancedSettings"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AdvancedSettings'))
        
        "Step 17: Click on div Latest"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Latest'))
        
        "Step 18: Click on div VersionNumber"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_VersionNumber'))
        
        "Step 19: Click on div SelectRelease"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))
        
        "Step 20: Enter input value in input ReleaseInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReleaseInput'), data['input_ReleaseInput'])
        
        "Step 21: Click on div NoOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NoOptions'))
        
        "Step 22: Click on div AutocompleteControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AutocompleteControl'))
        
        "Step 23: Click on div SelectReleaseOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectReleaseOption'))
        
        "Step 24: Click on div SelectRelease2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease2'))
        
        "Step 25: Click on div SelectRelease"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))
        
        "Step 26: Enter input value in input ReleaseInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReleaseInput'), data['input_ReleaseInput_1'])
        
        "Step 27: Click on div SelectReleaseOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectReleaseOption'))
        
        "Step 28: Click on div SelectReleaseOption2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectReleaseOption2'))
        
        "Step 29: Click on button GoBack"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoBack'))
        
        "Step 30: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        data['input_ReleaseInput'] = testData.getValue('input_ReleaseInput', rowIndex)
        data['input_ReleaseInput_1'] = testData.getValue('input_ReleaseInput_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Name'] = 'default_data'
        data['input_ReleaseInput'] = 'default_data'
        data['input_ReleaseInput_1'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

