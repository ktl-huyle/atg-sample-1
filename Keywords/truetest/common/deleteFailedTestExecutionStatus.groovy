package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class deleteFailedTestExecutionStatus {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label failedTestExecutionStatus (FailedTestExecution)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutionStatus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutionStatus', ['label_failedTestExecutionStatus_for': data['label_failedTestExecutionStatus_for'], 'label_failedTestExecutionStatus_internalRoleRowName': data['label_failedTestExecutionStatus_internalRoleRowName']]))
        
        "Step 2: Click on label failedTestExecutionStatus (FailedTestExecution2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutionStatus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutionStatus', ['label_failedTestExecutionStatus_for': data['label_failedTestExecutionStatus_for_1'], 'label_failedTestExecutionStatus_internalRoleRowName': data['label_failedTestExecutionStatus_internalRoleRowName_1']]))
        
        "Step 3: Click on label failedTestExecutionStatus (FailedTestExecution3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutionStatus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutionStatus', ['label_failedTestExecutionStatus_for': data['label_failedTestExecutionStatus_for_2'], 'label_failedTestExecutionStatus_internalRoleRowName': data['label_failedTestExecutionStatus_internalRoleRowName_2']]))
        
        "Step 4: Click on button Delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))
        
        "Step 5: Click on button Delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['label_failedTestExecutionStatus_for'] = testData.getValue('label_failedTestExecutionStatus_for', rowIndex)
        data['label_failedTestExecutionStatus_for_1'] = testData.getValue('label_failedTestExecutionStatus_for_1', rowIndex)
        data['label_failedTestExecutionStatus_for_2'] = testData.getValue('label_failedTestExecutionStatus_for_2', rowIndex)
        data['label_failedTestExecutionStatus_internalRoleRowName'] = testData.getValue('label_failedTestExecutionStatus_internalRoleRowName', rowIndex)
        data['label_failedTestExecutionStatus_internalRoleRowName_1'] = testData.getValue('label_failedTestExecutionStatus_internalRoleRowName_1', rowIndex)
        data['label_failedTestExecutionStatus_internalRoleRowName_2'] = testData.getValue('label_failedTestExecutionStatus_internalRoleRowName_2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['label_failedTestExecutionStatus_for'] = 'default_data'
        data['label_failedTestExecutionStatus_for_1'] = 'default_data'
        data['label_failedTestExecutionStatus_for_2'] = 'default_data'
        data['label_failedTestExecutionStatus_internalRoleRowName'] = 'default_data'
        data['label_failedTestExecutionStatus_internalRoleRowName_1'] = 'default_data'
        data['label_failedTestExecutionStatus_internalRoleRowName_2'] = 'default_data'
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

