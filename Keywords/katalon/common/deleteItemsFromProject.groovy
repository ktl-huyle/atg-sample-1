package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class deleteItemsFromProject {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button delete3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete3'))
        
        "Step 2: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete2'))
        
        "Step 3: Click on input spinButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_spinButton'))
        
        "Step 4: Enter input value in input spinButton"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_spinButton'), data['input_spinButton'])
        
        "Step 5: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_spinButton'] = testData.getValue('input_spinButton', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_spinButton'] = 'default_data'
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

