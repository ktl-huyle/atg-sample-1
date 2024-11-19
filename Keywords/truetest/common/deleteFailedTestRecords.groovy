package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class deleteFailedTestRecords {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label failedTests (Failed652)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': data['label_failedTests_for'], 'label_failedTests_internalRoleRowName': data['label_failedTests_internalRoleRowName']]))
        
        "Step 2: Click on label failedTests (Failed651)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': data['label_failedTests_for_1'], 'label_failedTests_internalRoleRowName': data['label_failedTests_internalRoleRowName_1']]))
        
        "Step 3: Click on label failedTests (Failed650)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': data['label_failedTests_for_2'], 'label_failedTests_internalRoleRowName': data['label_failedTests_internalRoleRowName_2']]))
        
        "Step 4: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete2'))
        
        "Step 5: Click on button Delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete_1'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['label_failedTests_for'] = testData.getValue('label_failedTests_for', rowIndex)
        data['label_failedTests_for_1'] = testData.getValue('label_failedTests_for_1', rowIndex)
        data['label_failedTests_for_2'] = testData.getValue('label_failedTests_for_2', rowIndex)
        data['label_failedTests_internalRoleRowName'] = testData.getValue('label_failedTests_internalRoleRowName', rowIndex)
        data['label_failedTests_internalRoleRowName_1'] = testData.getValue('label_failedTests_internalRoleRowName_1', rowIndex)
        data['label_failedTests_internalRoleRowName_2'] = testData.getValue('label_failedTests_internalRoleRowName_2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['label_failedTests_for'] = 'default_data'
        data['label_failedTests_for_1'] = 'default_data'
        data['label_failedTests_for_2'] = 'default_data'
        data['label_failedTests_internalRoleRowName'] = 'default_data'
        data['label_failedTests_internalRoleRowName_1'] = 'default_data'
        data['label_failedTests_internalRoleRowName_2'] = 'default_data'
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

