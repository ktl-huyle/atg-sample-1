package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleAndRunTestSuite {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 2: Click on link Refresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Refresh'))
        
        "Step 3: Click on div TestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites'))
        
        "Step 4: Enter input value in input ReactSelectInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_ReactSelectInput'), data['input_ReactSelectInput'])
        
        "Step 5: Click on div TestSuites2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites2'))
        
        "Step 6: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))
        
        "Step 7: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), data['input_Name'])
        
        "Step 8: Click on div ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun'))
        
        "Step 9: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment'))
        
        "Step 10: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))
        
        "Step 11: Click on span ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))
        
        "Step 12: Click on div DesktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowsers'))
        
        "Step 13: Click on div ExecutionProfile"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfile'))
        
        "Step 14: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))
        
        "Step 15: Click on div ExecutionProfileList"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileList'))
        
        "Step 16: Click on div ScheduleTestRun2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun2'))
        
        "Step 17: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
        
        "Step 18: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 19: Click on div TestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites'))
        
        "Step 20: Enter input value in input ReactSelectInput2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_ReactSelectInput2'), data['input_ReactSelectInput2'])
        
        "Step 21: Click on div TestSuitesOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesOption'))
        
        "Step 22: Click on div SelectEnvironment2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))
        
        "Step 23: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))
        
        "Step 24: Click on span ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))
        
        "Step 25: Click on label DesktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/label_DesktopBrowsers'))
        
        "Step 26: Click on div ExecutionProfile"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfile'))
        
        "Step 27: Click on input IncludeApiCalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_IncludeApiCalls'))
        
        "Step 28: Click on div ActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ActiveTunnels'))
        
        "Step 29: Click on div ReactSelectOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ReactSelectOption'))
        
        "Step 30: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))
        
        "Step 31: Click on div ExecutionProfileListContainer"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileListContainer'))
        
        "Step 32: Click on div ScheduleTestRunOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunOption'))
        
        "Step 33: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))
        
        "Step 34: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), data['input_Name'])
        
        "Step 35: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
        
        "Step 36: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 37: Click on div TestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuites'))
        
        "Step 38: Enter input value in input ReactSelectInput3"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_ReactSelectInput3'), data['input_ReactSelectInput3'])
        
        "Step 39: Click on div TestSuitesMediaFiles"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesMediaFiles'))
        
        "Step 40: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment'))
        
        "Step 41: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))
        
        "Step 42: Click on div ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))
        
        "Step 43: Click on div ExecutionProfile"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfile'))
        
        "Step 44: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))
        
        "Step 45: Click on div ExecutionProfileList"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileList'))
        
        "Step 46: Click on div ScheduleTestRunStaging"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunStaging'))
        
        "Step 47: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))
        
        "Step 48: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), data['input_Name'])
        
        "Step 49: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        data['input_Name_1'] = testData.getValue('input_Name_1', rowIndex)
        data['input_Name_2'] = testData.getValue('input_Name_2', rowIndex)
        data['input_ReactSelectInput'] = testData.getValue('input_ReactSelectInput', rowIndex)
        data['input_ReactSelectInput2'] = testData.getValue('input_ReactSelectInput2', rowIndex)
        data['input_ReactSelectInput3'] = testData.getValue('input_ReactSelectInput3', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Name'] = 'default_data'
        data['input_Name_1'] = 'default_data'
        data['input_Name_2'] = 'default_data'
        data['input_ReactSelectInput'] = 'default_data'
        data['input_ReactSelectInput2'] = 'default_data'
        data['input_ReactSelectInput3'] = 'default_data'
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

