package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class markFailedTestResultsAsPassed {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button testResultActions (FailedAutomationsApply)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': data['button_testResultActions_class'], 'button_testResultActions_internalRoleButtonName': data['button_testResultActions_internalRoleButtonName']]))
        
        "Step 2: Click on button testResultActions (FailedPortalLogin)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': data['button_testResultActions_class_1'], 'button_testResultActions_internalRoleButtonName': data['button_testResultActions_internalRoleButtonName_1']]))
        
        "Step 3: Click on button failedPortal (FailedPortalHelperLogin) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_failedPortal"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_failedPortal', ['button_failedPortal_class': data['button_failedPortal_class'], 'button_failedPortal_internalRoleButtonName': data['button_failedPortal_internalRoleButtonName']]))
        
        "Step 4: Click on button MarkAsPassed"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))
        
        "Step 5: Click on label ChangeTestResultStatus"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))
        
        "Step 6: Click on button Submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_failedPortal_class'] = testData.getValue('button_failedPortal_class', rowIndex)
        data['button_failedPortal_internalRoleButtonName'] = testData.getValue('button_failedPortal_internalRoleButtonName', rowIndex)
        data['button_testResultActions_class'] = testData.getValue('button_testResultActions_class', rowIndex)
        data['button_testResultActions_class_1'] = testData.getValue('button_testResultActions_class_1', rowIndex)
        data['button_testResultActions_internalRoleButtonName'] = testData.getValue('button_testResultActions_internalRoleButtonName', rowIndex)
        data['button_testResultActions_internalRoleButtonName_1'] = testData.getValue('button_testResultActions_internalRoleButtonName_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_failedPortal_class'] = 'default_data'
        data['button_failedPortal_internalRoleButtonName'] = 'default_data'
        data['button_testResultActions_class'] = 'default_data'
        data['button_testResultActions_class_1'] = 'default_data'
        data['button_testResultActions_internalRoleButtonName'] = 'default_data'
        data['button_testResultActions_internalRoleButtonName_1'] = 'default_data'
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

