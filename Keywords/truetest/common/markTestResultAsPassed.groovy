package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class markTestResultAsPassed {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button externalLinks (FailedAutomationsApply)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': data['button_externalLinks_class'], 'button_externalLinks_internalRoleButtonName': data['button_externalLinks_internalRoleButtonName']]))
        
        "Step 2: Click on button externalLinks (FailedPortalLogin)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': data['button_externalLinks_class_1'], 'button_externalLinks_internalRoleButtonName': data['button_externalLinks_internalRoleButtonName_1']]))
        
        "Step 3: Click on button failedPortalHelperLogin (FailedPortalHelperLogin) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_failedPortalHelperLogin"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_failedPortalHelperLogin', ['button_failedPortalHelperLogin_class': data['button_failedPortalHelperLogin_class'], 'button_failedPortalHelperLogin_internalRoleButtonName': data['button_failedPortalHelperLogin_internalRoleButtonName']]))
        
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
        data['button_externalLinks_class'] = testData.getValue('button_externalLinks_class', rowIndex)
        data['button_externalLinks_class_1'] = testData.getValue('button_externalLinks_class_1', rowIndex)
        data['button_externalLinks_internalRoleButtonName'] = testData.getValue('button_externalLinks_internalRoleButtonName', rowIndex)
        data['button_externalLinks_internalRoleButtonName_1'] = testData.getValue('button_externalLinks_internalRoleButtonName_1', rowIndex)
        data['button_failedPortalHelperLogin_class'] = testData.getValue('button_failedPortalHelperLogin_class', rowIndex)
        data['button_failedPortalHelperLogin_internalRoleButtonName'] = testData.getValue('button_failedPortalHelperLogin_internalRoleButtonName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_externalLinks_class'] = 'default_data'
        data['button_externalLinks_class_1'] = 'default_data'
        data['button_externalLinks_internalRoleButtonName'] = 'default_data'
        data['button_externalLinks_internalRoleButtonName_1'] = 'default_data'
        data['button_failedPortalHelperLogin_class'] = 'default_data'
        data['button_failedPortalHelperLogin_internalRoleButtonName'] = 'default_data'
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

