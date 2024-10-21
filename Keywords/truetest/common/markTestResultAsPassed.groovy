package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class markTestResultAsPassed {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button testResultDetails (FailedAutomationsApply)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': data['button_testResultDetails_class'], 'button_testResultDetails_internalRoleButtonName': data['button_testResultDetails_internalRoleButtonName']]))
        
        "Step 2: Click on button testResultDetails (FailedPortalLogin)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': data['button_testResultDetails_class_1'], 'button_testResultDetails_internalRoleButtonName': data['button_testResultDetails_internalRoleButtonName_1']]))
        
        "Step 3: Click on button failedLoginActions (FailedPortalHelperLogin) -> Navigate to page '/team/*/project/*/executions/*/test-result/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_failedLoginActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_failedLoginActions', ['button_failedLoginActions_class': data['button_failedLoginActions_class'], 'button_failedLoginActions_internalRoleButtonName': data['button_failedLoginActions_internalRoleButtonName']]))
        
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
        data['button_failedLoginActions_class'] = testData.getValue('button_failedLoginActions_class', rowIndex)
        data['button_failedLoginActions_internalRoleButtonName'] = testData.getValue('button_failedLoginActions_internalRoleButtonName', rowIndex)
        data['button_testResultDetails_class'] = testData.getValue('button_testResultDetails_class', rowIndex)
        data['button_testResultDetails_class_1'] = testData.getValue('button_testResultDetails_class_1', rowIndex)
        data['button_testResultDetails_internalRoleButtonName'] = testData.getValue('button_testResultDetails_internalRoleButtonName', rowIndex)
        data['button_testResultDetails_internalRoleButtonName_1'] = testData.getValue('button_testResultDetails_internalRoleButtonName_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_failedLoginActions_class'] = 'default_data'
        data['button_failedLoginActions_internalRoleButtonName'] = 'default_data'
        data['button_testResultDetails_class'] = 'default_data'
        data['button_testResultDetails_class_1'] = 'default_data'
        data['button_testResultDetails_internalRoleButtonName'] = 'default_data'
        data['button_testResultDetails_internalRoleButtonName_1'] = 'default_data'
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

