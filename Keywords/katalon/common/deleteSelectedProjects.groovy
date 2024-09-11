package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class deleteSelectedProjects {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_delete'))
        
        "Step 2: Click on input selectProjects"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/input_selectProjects'))
        
        "Step 3: Click on div update"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/div_update'))
        
        "Step 4: Enter input value in button object"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/button_object'), data['button_object'])
        
        "Step 5: Click on link untitledTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_untitledTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_object'] = testData.getValue('button_object', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_object'] = 'default_data'
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

