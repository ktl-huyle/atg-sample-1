package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class deleteFailedTestExecutions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label failedTestExecutions (FailedTestExecution)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutions', ['label_failedTestExecutions_for': data['label_failedTestExecutions_for'], 'label_failedTestExecutions_internalRoleRowName': data['label_failedTestExecutions_internalRoleRowName']]))
        
        "Step 2: Click on label failedTestExecutions (FailedTestExecution2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutions', ['label_failedTestExecutions_for': data['label_failedTestExecutions_for_1'], 'label_failedTestExecutions_internalRoleRowName': data['label_failedTestExecutions_internalRoleRowName_1']]))
        
        "Step 3: Click on label failedTestExecutions (FailedTestExecution3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestExecutions', ['label_failedTestExecutions_for': data['label_failedTestExecutions_for_2'], 'label_failedTestExecutions_internalRoleRowName': data['label_failedTestExecutions_internalRoleRowName_2']]))
        
        "Step 4: Click on button Delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))
        
        "Step 5: Click on button Delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['label_failedTestExecutions_for'] = testData.getValue('label_failedTestExecutions_for', rowIndex)
        data['label_failedTestExecutions_for_1'] = testData.getValue('label_failedTestExecutions_for_1', rowIndex)
        data['label_failedTestExecutions_for_2'] = testData.getValue('label_failedTestExecutions_for_2', rowIndex)
        data['label_failedTestExecutions_internalRoleRowName'] = testData.getValue('label_failedTestExecutions_internalRoleRowName', rowIndex)
        data['label_failedTestExecutions_internalRoleRowName_1'] = testData.getValue('label_failedTestExecutions_internalRoleRowName_1', rowIndex)
        data['label_failedTestExecutions_internalRoleRowName_2'] = testData.getValue('label_failedTestExecutions_internalRoleRowName_2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['label_failedTestExecutions_for'] = 'default_data'
        data['label_failedTestExecutions_for_1'] = 'default_data'
        data['label_failedTestExecutions_for_2'] = 'default_data'
        data['label_failedTestExecutions_internalRoleRowName'] = 'default_data'
        data['label_failedTestExecutions_internalRoleRowName_1'] = 'default_data'
        data['label_failedTestExecutions_internalRoleRowName_2'] = 'default_data'
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

