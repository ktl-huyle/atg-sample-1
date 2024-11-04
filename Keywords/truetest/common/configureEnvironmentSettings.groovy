package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class configureEnvironmentSettings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button gridActions (Edit)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions', ['button_gridActions_internalRoleButtonName': data['button_gridActions_internalRoleButtonName']]))
        
        "Step 2: Click on link ConfigureEnvironments"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_ConfigureEnvironments'))
        
        "Step 3: Click on div ActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_ActiveTunnels'))
        
        "Step 4: Click on div UserEmail"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_UserEmail'))
        
        "Step 5: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Save'))
        
        "Step 6: Click on button Schedule"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Schedule'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_gridActions_internalRoleButtonName'] = testData.getValue('button_gridActions_internalRoleButtonName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_gridActions_internalRoleButtonName'] = 'default_data'
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

