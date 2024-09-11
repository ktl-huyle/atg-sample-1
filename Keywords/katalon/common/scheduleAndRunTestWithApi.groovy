package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleAndRunTestWithApi {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 2: Click on link clickHereToRefresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_clickHereToRefresh'))
        
        "Step 3: Click on div testSuitesApi"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi'))
        
        "Step 4: Enter input value in input text"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_text'), data['input_text'])
        
        "Step 5: Click on div testSuitesApi2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi2'))
        
        "Step 6: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))
        
        "Step 7: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 8: Click on div scheduleTestRunCreatedWith"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_scheduleTestRunCreatedWith'))
        
        "Step 9: Click on div object45"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object45'))
        
        "Step 10: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 11: Click on span chromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_chromeHeadless'))
        
        "Step 12: Click on div desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_desktopBrowsers'))
        
        "Step 13: Click on div object46"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object46'))
        
        "Step 14: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 15: Click on div reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_reactSelectControl'))
        
        "Step 16: Click on div testSuitesApi3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi3'))
        
        "Step 17: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
        
        "Step 18: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 19: Click on div testSuitesApi"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi'))
        
        "Step 20: Enter input value in input text"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_text'), data['input_text'])
        
        "Step 21: Click on div testSuitesApi4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi4'))
        
        "Step 22: Click on div selectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_selectEnvironment'))
        
        "Step 23: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 24: Click on span chromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_chromeHeadless'))
        
        "Step 25: Click on label desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/label_desktopBrowsers'))
        
        "Step 26: Click on div object46"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object46'))
        
        "Step 27: Click on input includeApicalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_includeApicalls'))
        
        "Step 28: Click on div reactSelectControl2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_reactSelectControl2'))
        
        "Step 29: Click on div reactSelectOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_reactSelectOption'))
        
        "Step 30: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 31: Click on div reactSelectControl3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_reactSelectControl3'))
        
        "Step 32: Click on div testSuitesApi5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi5'))
        
        "Step 33: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))
        
        "Step 34: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 35: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
        
        "Step 36: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 37: Click on div testSuitesApi"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi'))
        
        "Step 38: Enter input value in input text"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_text'), data['input_text'])
        
        "Step 39: Click on div testSuitesApi6"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi6'))
        
        "Step 40: Click on div object45"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object45'))
        
        "Step 41: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 42: Click on div chromeHeadless"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_chromeHeadless'))
        
        "Step 43: Click on div object46"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object46'))
        
        "Step 44: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 45: Click on div reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_reactSelectControl'))
        
        "Step 46: Click on div testSuitesApi7"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuitesApi7'))
        
        "Step 47: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))
        
        "Step 48: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 49: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_text'] = testData.getValue('input_text', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
        data['input_text'] = 'default_data'
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

