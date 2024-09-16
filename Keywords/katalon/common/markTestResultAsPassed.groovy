package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class markTestResultAsPassed {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button object5"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions_1', ['button_object5_class': data['button_object5_class']]))
        
        "Step 2: Click on button object"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions_2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions_2', ['button_object_class': data['button_object_class'], 'button_object_internalRoleButtonName': data['button_object_internalRoleButtonName']]))
        
        "Step 3: Click on button object2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions_3"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions_3', ['button_object2_class': data['button_object2_class'], 'button_object2_internalRoleButtonName': data['button_object2_internalRoleButtonName']]))
        
        "Step 4: Click on button markAsPassed"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))
        
        "Step 5: Click on label basedOnManualTestResult"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))
        
        "Step 6: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_object2_class'] = testData.getValue('button_object2_class', rowIndex)
        data['button_object2_internalRoleButtonName'] = testData.getValue('button_object2_internalRoleButtonName', rowIndex)
        data['button_object5_class'] = testData.getValue('button_object5_class', rowIndex)
        data['button_object_class'] = testData.getValue('button_object_class', rowIndex)
        data['button_object_internalRoleButtonName'] = testData.getValue('button_object_internalRoleButtonName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_object2_class'] = 'default_data'
        data['button_object2_internalRoleButtonName'] = 'default_data'
        data['button_object5_class'] = 'default_data'
        data['button_object_class'] = 'default_data'
        data['button_object_internalRoleButtonName'] = 'default_data'
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

