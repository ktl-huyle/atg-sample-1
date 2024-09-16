package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class deleteTestRun {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete2'))
        
        "Step 2: Click on input agentProjectLink"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_agentProjectLink'))
        
        "Step 3: Click on div update"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_update'))
        
        "Step 4: Enter input value in button leftNavbarRoleButton"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_leftNavbarRoleButton'), data['button_leftNavbarRoleButton'])
        
        "Step 5: Click on link fpEuntitledTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_fpEuntitledTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_leftNavbarRoleButton'] = testData.getValue('button_leftNavbarRoleButton', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_leftNavbarRoleButton'] = 'default_data'
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

