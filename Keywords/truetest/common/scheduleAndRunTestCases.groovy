package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleAndRunTestCases {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link refresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_refresh'))
        
        "Step 2: Click on div testSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testSuites'))
        
        "Step 3: Enter input value in input TextInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_TextInput'), data['input_TextInput'])
        
        "Step 4: Click on div TestSuitesLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesLabel'))
        
        "Step 5: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 6: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), data['input_Name'])
        
        "Step 7: Click on div ScheduleTestRunLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ScheduleTestRunLabel'))
        
        "Step 8: Click on div SelectEnvironmentLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironmentLabel'))
        
        "Step 9: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))
        
        "Step 10: Click on span ChromeHeadlessLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ChromeHeadlessLabel'))
        
        "Step 11: Click on div DesktopBrowsersLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DesktopBrowsersLabel'))
        
        "Step 12: Click on div IPAddressLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_IPAddressLabel'))
        
        "Step 13: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save'))
        
        "Step 14: Click on div ExecutionProfileValue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileValue'))
        
        "Step 15: Click on div QAEnvLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_QAEnvLabel'))
        
        "Step 16: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))
        
        "Step 17: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun'))
        
        "Step 18: Click on div testSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testSuites'))
        
        "Step 19: Enter input value in input SecondTextInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SecondTextInput'), data['input_SecondTextInput'])
        
        "Step 20: Click on div TestSuitesStageProdLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesStageProdLabel'))
        
        "Step 21: Click on div SelectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment'))
        
        "Step 22: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))
        
        "Step 23: Click on span ChromeHeadlessLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ChromeHeadlessLabel'))
        
        "Step 24: Click on label DesktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))
        
        "Step 25: Click on div IPAddressLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_IPAddressLabel'))
        
        "Step 26: Click on input IncludeAPICalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_IncludeAPICalls'))
        
        "Step 27: Click on div ActiveTunnelsValue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsValue'))
        
        "Step 28: Click on div ExecutionProfileOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileOption'))
        
        "Step 29: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save'))
        
        "Step 30: Click on div ExecutionProfileContainer"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileContainer'))
        
        "Step 31: Click on div StagingEnvLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_StagingEnvLabel'))
        
        "Step 32: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))
        
        "Step 33: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), data['input_Name'])
        
        "Step 34: Click on button Run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))
        
        "Step 35: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun'))
        
        "Step 36: Click on div testSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testSuites'))
        
        "Step 37: Enter input value in input ThirdTextInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ThirdTextInput'), data['input_ThirdTextInput'])
        
        "Step 38: Click on div TestSuitesStageProdLabel2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesStageProdLabel2'))
        
        "Step 39: Click on div SelectEnvironmentLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironmentLabel'))
        
        "Step 40: Click on item MoreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))
        
        "Step 41: Click on div ChromeHeadlessLabel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ChromeHeadlessLabel'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        data['input_Name_1'] = testData.getValue('input_Name_1', rowIndex)
        data['input_SecondTextInput'] = testData.getValue('input_SecondTextInput', rowIndex)
        data['input_TextInput'] = testData.getValue('input_TextInput', rowIndex)
        data['input_ThirdTextInput'] = testData.getValue('input_ThirdTextInput', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Name'] = 'default_data'
        data['input_Name_1'] = 'default_data'
        data['input_SecondTextInput'] = 'default_data'
        data['input_TextInput'] = 'default_data'
        data['input_ThirdTextInput'] = 'default_data'
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

