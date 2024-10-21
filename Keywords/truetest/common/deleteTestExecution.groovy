package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class deleteTestExecution {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label executionStatus (FailedExecution)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': data['label_executionStatus_for'], 'label_executionStatus_internalRoleRowName': data['label_executionStatus_internalRoleRowName']]))
        
        "Step 2: Click on label executionStatus (FailedExecution2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': data['label_executionStatus_for_1'], 'label_executionStatus_internalRoleRowName': data['label_executionStatus_internalRoleRowName_1']]))
        
        "Step 3: Click on label executionStatus (FailedExecution3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': data['label_executionStatus_for_2'], 'label_executionStatus_internalRoleRowName': data['label_executionStatus_internalRoleRowName_2']]))
        
        "Step 4: Click on button executionDeletion (deleteExecution3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion', ['button_executionDeletion_internalRoleButtonName': data['button_executionDeletion_internalRoleButtonName']]))
        
        "Step 5: Click on button deleteExecution2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_deleteExecution2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_executionDeletion_internalRoleButtonName'] = testData.getValue('button_executionDeletion_internalRoleButtonName', rowIndex)
        data['label_executionStatus_for'] = testData.getValue('label_executionStatus_for', rowIndex)
        data['label_executionStatus_for_1'] = testData.getValue('label_executionStatus_for_1', rowIndex)
        data['label_executionStatus_for_2'] = testData.getValue('label_executionStatus_for_2', rowIndex)
        data['label_executionStatus_internalRoleRowName'] = testData.getValue('label_executionStatus_internalRoleRowName', rowIndex)
        data['label_executionStatus_internalRoleRowName_1'] = testData.getValue('label_executionStatus_internalRoleRowName_1', rowIndex)
        data['label_executionStatus_internalRoleRowName_2'] = testData.getValue('label_executionStatus_internalRoleRowName_2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_executionDeletion_internalRoleButtonName'] = 'default_data'
        data['label_executionStatus_for'] = 'default_data'
        data['label_executionStatus_for_1'] = 'default_data'
        data['label_executionStatus_for_2'] = 'default_data'
        data['label_executionStatus_internalRoleRowName'] = 'default_data'
        data['label_executionStatus_internalRoleRowName_1'] = 'default_data'
        data['label_executionStatus_internalRoleRowName_2'] = 'default_data'
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

