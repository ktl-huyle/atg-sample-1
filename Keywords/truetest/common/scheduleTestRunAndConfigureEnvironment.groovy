package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleTestRunAndConfigureEnvironment {
    
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
        
        "Step 10: Click on div backdropMenu (CustomizedMenu)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_backdropMenu"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_backdropMenu', ['div_backdropMenu_class': data['div_backdropMenu_class']]))
        
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
        
        "Step 25: Click on button closeAlert (Close3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeAlert"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeAlert', ['button_closeAlert_class': data['button_closeAlert_class']]))
        
        "Step 26: Click on button closeAlert (AlertClose)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeAlert"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_closeAlert', ['button_closeAlert_class': data['button_closeAlert_class_1']]))
        
        "Step 27: Click on div SubscribedSessions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SubscribedSessions'))
        
        "Step 28: Click on link ShowDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ShowDetails'))
        
        "Step 29: Click on p sessionInfo (TwoSessions)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo', ['p_sessionInfo_class': data['p_sessionInfo_class']]))
        
        "Step 30: Click on div backdropMenu (PopoverBackdrop)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_backdropMenu"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_backdropMenu', ['div_backdropMenu_class': data['div_backdropMenu_class_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_closeAlert_class'] = testData.getValue('button_closeAlert_class', rowIndex)
        data['button_closeAlert_class_1'] = testData.getValue('button_closeAlert_class_1', rowIndex)
        data['div_backdropMenu_class'] = testData.getValue('div_backdropMenu_class', rowIndex)
        data['div_backdropMenu_class_1'] = testData.getValue('div_backdropMenu_class_1', rowIndex)
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        data['p_sessionInfo_class'] = testData.getValue('p_sessionInfo_class', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_closeAlert_class'] = 'default_data'
        data['button_closeAlert_class_1'] = 'default_data'
        data['div_backdropMenu_class'] = 'default_data'
        data['div_backdropMenu_class_1'] = 'default_data'
        data['input_Name'] = 'default_data'
        data['p_sessionInfo_class'] = 'default_data'
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

