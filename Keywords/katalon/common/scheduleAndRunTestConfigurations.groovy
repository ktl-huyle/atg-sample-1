package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleAndRunTestConfigurations {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 2: Click on div uploadedData"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_uploadedData'))
        
        "Step 3: Click on div testSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites'))
        
        "Step 4: Click on link executions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_executions'))
        
        "Step 5: Enter input value in button scheduleTestRun"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'), data['button_scheduleTestRun'])
        
        "Step 6: Click on div testSuitesAllFeaturesTestSuite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesAllFeaturesTestSuite'))
        
        "Step 7: Click on div testSuites2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites2'))
        
        "Step 8: Click on div name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_name'))
        
        "Step 9: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))
        
        "Step 10: Click on div scheduleTestRunCreatedWith"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_scheduleTestRunCreatedWith'))
        
        "Step 11: Click on div selectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_selectEnvironment'))
        
        "Step 12: Click on div object17"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object17'))
        
        "Step 13: Click on div runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_runS'))
        
        "Step 14: Click on div object18"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))
        
        "Step 15: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
        
        "Step 16: Click on div object19"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object19'))
        
        "Step 17: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 18: Click on button mobileBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_mobileBrowsers'))
        
        "Step 19: Click on span android"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_android'))
        
        "Step 20: Click on div phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_phone'))
        
        "Step 21: Click on div anyDeviceType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_anyDeviceType'))
        
        "Step 22: Click on div phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_phone'))
        
        "Step 23: Click on div googlePixel6Pro"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_googlePixel6Pro'))
        
        "Step 24: Click on div configureTestEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_configureTestEnvironment'))
        
        "Step 25: Click on div object20"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object20'))
        
        "Step 26: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 27: Click on button runS2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS2'))
        
        "Step 28: Click on button closeDialogButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_closeDialogButton'))
        
        "Step 29: Click on button object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object5'))
        
        "Step 30: Click on button object6"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object6'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_scheduleTestRun'] = testData.getValue('button_scheduleTestRun', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_scheduleTestRun'] = 'default_data'
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

