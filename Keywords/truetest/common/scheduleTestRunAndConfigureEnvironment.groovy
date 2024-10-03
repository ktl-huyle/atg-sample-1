package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleTestRunAndConfigureEnvironment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 2: Click on div UploadedData"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UploadedData'))
        
        "Step 3: Click on div TestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites'))
        
        "Step 4: Click on link Executions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions'))
        
        "Step 5: Enter input value in button ScheduleTestRun"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'), data['button_ScheduleTestRun'])
        
        "Step 6: Click on div TestSuites2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites2'))
        
        "Step 7: Click on div TestSuites3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites3'))
        
        "Step 8: Click on div NameLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_NameLabel'))
        
        "Step 9: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))
        
        "Step 10: Click on div ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun'))
        
        "Step 11: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment'))
        
        "Step 12: Click on div UnknownElement"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UnknownElement'))
        
        "Step 13: Click on div Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Run'))
        
        "Step 14: Click on div UnknownElement2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UnknownElement2'))
        
        "Step 15: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
        
        "Step 16: Click on div UnknownElement3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UnknownElement3'))
        
        "Step 17: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))
        
        "Step 18: Click on button MobileBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_MobileBrowsers'))
        
        "Step 19: Click on span Android"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_Android'))
        
        "Step 20: Click on div Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Phone'))
        
        "Step 21: Click on div AnyDeviceType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_AnyDeviceType'))
        
        "Step 22: Click on div Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Phone'))
        
        "Step 23: Click on div GooglePixel6Pro"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_GooglePixel6Pro'))
        
        "Step 24: Click on div ConfigureTestEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ConfigureTestEnvironment'))
        
        "Step 25: Click on div UnknownElement4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UnknownElement4'))
        
        "Step 26: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))
        
        "Step 27: Click on button Run2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run2'))
        
        "Step 28: Click on button CloseDialog"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_CloseDialog'))
        
        "Step 29: Click on button Close3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close3'))
        
        "Step 30: Click on button AlertAction"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_AlertAction'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_ScheduleTestRun'] = testData.getValue('button_ScheduleTestRun', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_ScheduleTestRun'] = 'default_data'
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

