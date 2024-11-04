package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleMultipleTestRuns {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 2: Click on link Refresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Refresh'))
        
        "Step 3: Click on div TestSuitePath"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitePath'))
        
        "Step 4: Enter input value in input TestSuiteInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_TestSuiteInput'), data['input_TestSuiteInput'])
        
        "Step 5: Click on div TestSuiteMediaFiles"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteMediaFiles'))
        
        "Step 6: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))
        
        "Step 7: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), data['input_Name'])
        
        "Step 8: Click on div ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun_1'))
        
        "Step 9: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment_1'))
        
        "Step 10: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions_1'))
        
        "Step 11: Click on span ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))
        
        "Step 12: Click on div DesktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowsers'))
        
        "Step 13: Click on div ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))
        
        "Step 14: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save_1'))
        
        "Step 15: Click on div ExecutionProfileControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileControl'))
        
        "Step 16: Click on div ScheduleTestRunQAEnv"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunQAEnv'))
        
        "Step 17: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
        
        "Step 18: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 19: Click on div TestSuitePath"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitePath'))
        
        "Step 20: Enter input value in input TestSuiteInput2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_TestSuiteInput2'), data['input_TestSuiteInput2'])
        
        "Step 21: Click on div TestSuiteMediaFiles2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteMediaFiles2'))
        
        "Step 22: Click on div SelectEnvironment2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))
        
        "Step 23: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions_1'))
        
        "Step 24: Click on span ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))
        
        "Step 25: Click on label DesktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/label_DesktopBrowsers'))
        
        "Step 26: Click on div ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))
        
        "Step 27: Click on input IncludeAPICalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_IncludeAPICalls'))
        
        "Step 28: Click on div ActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ActiveTunnels'))
        
        "Step 29: Click on div ExecutionProfileOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileOption'))
        
        "Step 30: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save_1'))
        
        "Step 31: Click on div ExecutionProfileControl2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileControl2'))
        
        "Step 32: Click on div ScheduleTestRunStagingEnv"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunStagingEnv'))
        
        "Step 33: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))
        
        "Step 34: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), data['input_Name_1'])
        
        "Step 35: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
        
        "Step 36: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))
        
        "Step 37: Click on div TestSuitePath"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitePath'))
        
        "Step 38: Enter input value in input TestSuiteInput3"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_TestSuiteInput3'), data['input_TestSuiteInput3'])
        
        "Step 39: Click on div TestSuiteMediaFiles3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteMediaFiles3'))
        
        "Step 40: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment_1'))
        
        "Step 41: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions_1'))
        
        "Step 42: Click on div ChromeHeadless2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless2'))
        
        "Step 43: Click on div ChromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))
        
        "Step 44: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save_1'))
        
        "Step 45: Click on div ExecutionProfileControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileControl'))
        
        "Step 46: Click on div ScheduleTestRunStagingEnv2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunStagingEnv2'))
        
        "Step 47: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))
        
        "Step 48: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), data['input_Name_2'])
        
        "Step 49: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        data['input_Name_1'] = testData.getValue('input_Name_1', rowIndex)
        data['input_Name_2'] = testData.getValue('input_Name_2', rowIndex)
        data['input_TestSuiteInput'] = testData.getValue('input_TestSuiteInput', rowIndex)
        data['input_TestSuiteInput2'] = testData.getValue('input_TestSuiteInput2', rowIndex)
        data['input_TestSuiteInput3'] = testData.getValue('input_TestSuiteInput3', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Name'] = 'default_data'
        data['input_Name_1'] = 'default_data'
        data['input_Name_2'] = 'default_data'
        data['input_TestSuiteInput'] = 'default_data'
        data['input_TestSuiteInput2'] = 'default_data'
        data['input_TestSuiteInput3'] = 'default_data'
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

