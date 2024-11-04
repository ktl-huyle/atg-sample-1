package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class deleteFailedExecutionRecords {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button Delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))
        
        "Step 2: Click on label failedExecutions (FailedExecution)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions', ['label_failedExecutions_for': data['label_failedExecutions_for'], 'label_failedExecutions_internalRoleRowName': data['label_failedExecutions_internalRoleRowName']]))
        
        "Step 3: Click on label failedExecutions (FailedExecution2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions', ['label_failedExecutions_for': data['label_failedExecutions_for_1'], 'label_failedExecutions_internalRoleRowName': data['label_failedExecutions_internalRoleRowName_1']]))
        
        "Step 4: Click on label failedExecutions (FailedExecution3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedExecutions', ['label_failedExecutions_for': data['label_failedExecutions_for_2'], 'label_failedExecutions_internalRoleRowName': data['label_failedExecutions_internalRoleRowName_2']]))
        
        "Step 5: Click on button Delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))
        
        "Step 6: Click on button Delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['label_failedExecutions_for'] = testData.getValue('label_failedExecutions_for', rowIndex)
        data['label_failedExecutions_for_1'] = testData.getValue('label_failedExecutions_for_1', rowIndex)
        data['label_failedExecutions_for_2'] = testData.getValue('label_failedExecutions_for_2', rowIndex)
        data['label_failedExecutions_internalRoleRowName'] = testData.getValue('label_failedExecutions_internalRoleRowName', rowIndex)
        data['label_failedExecutions_internalRoleRowName_1'] = testData.getValue('label_failedExecutions_internalRoleRowName_1', rowIndex)
        data['label_failedExecutions_internalRoleRowName_2'] = testData.getValue('label_failedExecutions_internalRoleRowName_2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['label_failedExecutions_for'] = 'default_data'
        data['label_failedExecutions_for_1'] = 'default_data'
        data['label_failedExecutions_for_2'] = 'default_data'
        data['label_failedExecutions_internalRoleRowName'] = 'default_data'
        data['label_failedExecutions_internalRoleRowName_1'] = 'default_data'
        data['label_failedExecutions_internalRoleRowName_2'] = 'default_data'
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

