package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleAndRunTestDemo {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div ScheduleTestRunInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ScheduleTestRunInfo'))
        
        "Step 2: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 3: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), data['input_Name'])
        
        "Step 4: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment'))
        
        "Step 5: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))
        
        "Step 6: Click on input RadioButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButton'))
        
        "Step 7: Click on div ConfigureTestEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment'))
        
        "Step 8: Click on div CreatedWithSketch"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch'))
        
        "Step 9: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save'))
        
        "Step 10: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))
        
        "Step 11: Click on button ScheduleTestRun2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun2'))
        
        "Step 12: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 13: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), data['input_Name'])
        
        "Step 14: Click on div ContainerInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ContainerInfo'))
        
        "Step 15: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment'))
        
        "Step 16: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))
        
        "Step 17: Click on div LocalInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_LocalInfo'))
        
        "Step 18: Click on div BrowserTypeControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_BrowserTypeControl'))
        
        "Step 19: Click on div ReactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))
        
        "Step 20: Click on div ReactSelectOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectOption'))
        
        "Step 21: Click on div CustomSelectValue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CustomSelectValue'))
        
        "Step 22: Click on div ReactSelectOptionInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectOptionInfo'))
        
        "Step 23: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save'))
        
        "Step 24: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        data['input_Name_1'] = testData.getValue('input_Name_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Name'] = 'default_data'
        data['input_Name_1'] = 'default_data'
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

