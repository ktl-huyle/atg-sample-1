package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleAndRunTestInSauceDemo {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))
        
        "Step 2: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_name'))
        
        "Step 3: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_name'), data['input_name'])
        
        "Step 4: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object'))
        
        "Step 5: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object_1'))
        
        "Step 6: Click on button katalonCommand"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_katalonCommand'))
        
        "Step 7: Enter input value in textarea katalonCommand"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/textarea_katalonCommand'), data['textarea_katalonCommand'])
        
        "Step 8: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object_2'))
        
        "Step 9: Click on item scheduleTestRunCreated"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/item_scheduleTestRunCreated'))
        
        "Step 10: Click on input radioButtons"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_radioButtons'))
        
        "Step 11: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object_3'))
        
        "Step 12: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object_4'))
        
        "Step 13: Click on button saveConfigureTs"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_saveConfigureTs'))
        
        "Step 14: Click on button advancedSettings"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_advancedSettings'))
        
        "Step 15: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object_5'))
        
        "Step 16: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object_6'))
        
        "Step 17: Click on button object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_object'))
        
        "Step 18: Click on button run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_run'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['textarea_katalonCommand'] = testData.getValue('textarea_katalonCommand', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
        data['textarea_katalonCommand'] = 'default_data'
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

