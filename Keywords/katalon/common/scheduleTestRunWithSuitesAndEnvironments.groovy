package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleTestRunWithSuitesAndEnvironments {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 2: Click on div testSuitesAllFeaturesTestSuite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object'))
        
        "Step 3: Click on div testSuitesNth2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesNth2'))
        
        "Step 4: Click on div name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_name'))
        
        "Step 5: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 6: Click on div scheduleTestRunCreatedWith"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_scheduleTestRunCreatedWith'))
        
        "Step 7: Click on div selectEnvironmentNth1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_selectEnvironmentNth1'))
        
        "Step 8: Click on div object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object2_1'))
        
        "Step 9: Click on div runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_runS'))
        
        "Step 10: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object_1'))
        
        "Step 11: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
        
        "Step 12: Click on div object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object3_1'))
        
        "Step 13: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions_1'))
        
        "Step 14: Click on button mobileBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_mobileBrowsers'))
        
        "Step 15: Click on span android"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_android'))
        
        "Step 16: Click on div phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_phone'))
        
        "Step 17: Click on div anyDeviceType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_anyDeviceType'))
        
        "Step 18: Click on div phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_phone'))
        
        "Step 19: Click on div googlePixel6Pro"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_googlePixel6Pro'))
        
        "Step 20: Click on div object4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object4_1'))
        
        "Step 21: Click on div object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object5_1'))
        
        "Step 22: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save_1'))
        
        "Step 23: Click on button runS2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS2'))
        
        "Step 24: Click on button closeDialogButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_closeDialogButton'))
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

