package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class confirmDeleteAction {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button Delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_Delete'))
        
        "Step 2: Click on button DeleteDialog"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_DeleteDialog'))
        
        "Step 3: Click on input NumberInput"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/input_NumberInput'))
        
        "Step 4: Enter input value in input NumberInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/input_NumberInput'), data['input_NumberInput'])
        
        "Step 5: Click on button DeleteDialog"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_DeleteDialog'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_NumberInput'] = testData.getValue('input_NumberInput', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_NumberInput'] = 'default_data'
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

