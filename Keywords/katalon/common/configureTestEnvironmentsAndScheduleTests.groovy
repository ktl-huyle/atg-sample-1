package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class configureTestEnvironmentsAndScheduleTests {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button dynamicObject (edit)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_dynamicObject', ['button_dynamicObject_internalRoleButtonName': data['button_dynamicObject_internalRoleButtonName']]))
        
        "Step 2: Click on link configureEnvironmentsForTestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configureEnvironmentsForTestSuites'))
        
        "Step 3: Click on div selectActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_selectActiveTunnels'))
        
        "Step 4: Click on div testCdc2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_testCdc2'))
        
        "Step 5: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_save'))
        
        "Step 6: Click on button schedule"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_schedule'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_dynamicObject_internalRoleButtonName'] = testData.getValue('button_dynamicObject_internalRoleButtonName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_dynamicObject_internalRoleButtonName'] = 'default_data'
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

