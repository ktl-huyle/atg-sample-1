package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleAndRunTestsOnEnvironments {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 2: Click on div TestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites'))
        
        "Step 3: Click on div TestSuites2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites2'))
        
        "Step 4: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment'))
        
        "Step 5: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), data['input_Name'])
        
        "Step 6: Click on div ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun'))
        
        "Step 7: Click on div SelectEnvironment2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))
        
        "Step 8: Click on div EnvironmentIcon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_EnvironmentIcon'))
        
        "Step 9: Click on div RunIcon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_RunIcon'))
        
        "Step 10: Click on div CustomizedMenu"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CustomizedMenu'))
        
        "Step 11: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
        
        "Step 12: Click on div ReactSelectContainer"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ReactSelectContainer'))
        
        "Step 13: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))
        
        "Step 14: Click on button MobileBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_MobileBrowsers'))
        
        "Step 15: Click on span Android"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_Android'))
        
        "Step 16: Click on div Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Phone'))
        
        "Step 17: Click on div AnyDeviceType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_AnyDeviceType'))
        
        "Step 18: Click on div Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Phone'))
        
        "Step 19: Click on div GooglePixel6Pro"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_GooglePixel6Pro'))
        
        "Step 20: Click on div ConfigureTestEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ConfigureTestEnvironment'))
        
        "Step 21: Click on div CancelSave"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CancelSave'))
        
        "Step 22: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))
        
        "Step 23: Click on button Run2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run2'))
        
        "Step 24: Click on button CloseDialog"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_CloseDialog'))
        
        "Step 25: Click on button Close3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close3'))
        
        "Step 26: Click on button AlertClose"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_AlertClose'))
        
        "Step 27: Click on div SubscribedSessions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SubscribedSessions'))
        
        "Step 28: Click on link ShowDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ShowDetails'))
        
        "Step 29: Click on p TwoSessions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/p_TwoSessions'))
        
        "Step 30: Click on div PopoverBackdrop"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_PopoverBackdrop'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Name'] = 'default_data'
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

