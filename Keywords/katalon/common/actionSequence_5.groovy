package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_5 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_delete'))
        
        "Step 2: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_delete2'))
        
        "Step 3: Click on input object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/input_object'))
        
        "Step 4: Enter input value in input object"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/input_object'), data['input_object'])
        
        "Step 5: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_delete2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_object'] = testData.getValue('input_object', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_object'] = 'default_data'
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

