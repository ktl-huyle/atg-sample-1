package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class runCustomFieldsReport {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button customFields"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_customFields"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_customFields', ['button_customFields_internalRoleButtonName': data['button_customFields_internalRoleButtonName']]))
        
        "Step 2: Click on div dailyPast7DaysReleaseBuildAllProfileAll"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_dailyPast7DaysReleaseBuildAllProfileAll'))
        
        "Step 3: Click on button run"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_run"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_run', ['button_run_trNthChild': data['button_run_trNthChild'], 'button_run_internalRoleRowName': data['button_run_internalRoleRowName']]))
        
        "Step 4: Click on link executions3"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executions3"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executions3', ['link_executions3_trNthChild': data['link_executions3_trNthChild'], 'link_executions3_internalRoleLinkName': data['link_executions3_internalRoleLinkName'], 'link_executions3_executions_id': data['link_executions3_executions_id'], 'link_executions3_team_id': data['link_executions3_team_id'], 'link_executions3_project_id': data['link_executions3_project_id']]))
        
        "Step 5: Click on input searchTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_searchTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_customFields_internalRoleButtonName'] = testData.getValue('button_customFields_internalRoleButtonName', rowIndex)
        data['button_run_internalRoleRowName'] = testData.getValue('button_run_internalRoleRowName', rowIndex)
        data['button_run_trNthChild'] = testData.getValue('button_run_trNthChild', rowIndex)
        data['link_executions3_executions_id'] = testData.getValue('link_executions3_executions_id', rowIndex)
        data['link_executions3_internalRoleLinkName'] = testData.getValue('link_executions3_internalRoleLinkName', rowIndex)
        data['link_executions3_project_id'] = testData.getValue('link_executions3_project_id', rowIndex)
        data['link_executions3_team_id'] = testData.getValue('link_executions3_team_id', rowIndex)
        data['link_executions3_trNthChild'] = testData.getValue('link_executions3_trNthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_customFields_internalRoleButtonName'] = 'default_data'
        data['button_run_internalRoleRowName'] = 'default_data'
        data['button_run_trNthChild'] = 'default_data'
        data['link_executions3_executions_id'] = 'default_data'
        data['link_executions3_internalRoleLinkName'] = 'default_data'
        data['link_executions3_project_id'] = 'default_data'
        data['link_executions3_team_id'] = 'default_data'
        data['link_executions3_trNthChild'] = 'default_data'
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

