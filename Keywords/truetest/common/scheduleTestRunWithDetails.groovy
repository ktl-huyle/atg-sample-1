package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleTestRunWithDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link schedules -> Navigate to page '/team/*/project/*/grid'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_schedules'))
        
        "Step 2: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))
        
        "Step 3: Click on div nameLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_nameLabel'))
        
        "Step 4: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_name'), data['input_name'])
        
        "Step 5: Click on div testSuiteInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteInfo'))
        
        "Step 6: Click on div testSuiteIcon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteIcon'))
        
        "Step 7: Click on div testSuiteIcon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteIcon'))
        
        "Step 8: Click on button closeDialog"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_closeDialog'))
        
        "Step 9: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))
        
        "Step 10: Click on link refreshDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))
        
        "Step 11: Click on link refreshDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))
        
        "Step 12: Click on div selectIndicator"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_selectIndicator'))
        
        "Step 13: Click on div testSuiteInfo2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteInfo2'))
        
        "Step 14: Click on link refreshDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))
        
        "Step 15: Click on link refreshDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))
        
        "Step 16: Click on button testSuiteCollection"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuiteCollection'))
        
        "Step 17: Click on button testSuite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuite'))
        
        "Step 18: Click on div customSelectValue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValue'))
        
        "Step 19: Click on div KatalonCloudOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_KatalonCloudOption'))
        
        "Step 20: Click on div SelectOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_SelectOption'))
        
        "Step 21: Click on div customSelectValue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValue'))
        
        "Step 22: Click on div EHSTestAutomation"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_EHSTestAutomation'))
        
        "Step 23: Click on input TextInput"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_TextInput'))
        
        "Step 24: Click on div testSuiteInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteInfo'))
        
        "Step 25: Click on small SelectExistingScript"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/small_SelectExistingScript'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
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

