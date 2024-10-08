package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class configureTestSuiteSettings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 2: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 3: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), data['input_Name'])
        
        "Step 4: Click on div TestSuiteControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteControl'))
        
        "Step 5: Click on div TestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuites'))
        
        "Step 6: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment'))
        
        "Step 7: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))
        
        "Step 8: Click on label DesktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))
        
        "Step 9: Click on div ActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnels'))
        
        "Step 10: Click on div UserEmail"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserEmail'))
        
        "Step 11: Click on input IncludeAPICalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_IncludeAPICalls'))
        
        "Step 12: Click on input RadioButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButton'))
        
        "Step 13: Click on div ReactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))
        
        "Step 14: Click on div CreatedWithSketch2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch2'))
        
        "Step 15: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save_1'))
        
        "Step 16: Click on button AdvancedSettings"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AdvancedSettings'))
        
        "Step 17: Click on div Latest"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Latest'))
        
        "Step 18: Click on div Version"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Version'))
        
        "Step 19: Click on div SelectRelease"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))
        
        "Step 20: Enter input value in input ReactSelectInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReactSelectInput'), data['input_ReactSelectInput'])
        
        "Step 21: Click on div NoOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NoOptions'))
        
        "Step 22: Click on div AutocompleteControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AutocompleteControl'))
        
        "Step 23: Click on div SelectRelease2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease2'))
        
        "Step 24: Click on div SelectRelease3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease3'))
        
        "Step 25: Click on div SelectRelease"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))
        
        "Step 26: Enter input value in input ReactSelectInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReactSelectInput'), data['input_ReactSelectInput'])
        
        "Step 27: Click on div SelectRelease2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease2'))
        
        "Step 28: Click on div SelectRelease4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease4'))
        
        "Step 29: Click on button GoBack"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoBack'))
        
        "Step 30: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        data['input_ReactSelectInput'] = testData.getValue('input_ReactSelectInput', rowIndex)
        data['input_ReactSelectInput_1'] = testData.getValue('input_ReactSelectInput_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Name'] = 'default_data'
        data['input_ReactSelectInput'] = 'default_data'
        data['input_ReactSelectInput_1'] = 'default_data'
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

