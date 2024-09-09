package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class configureTestSettingsAndRunSuites {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_name'))
        
        "Step 2: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_name'))
        
        "Step 3: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_name'), data['input_name'])
        
        "Step 4: Click on div reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_reactSelectControl'))
        
        "Step 5: Click on div testSuitesTestOpsTestCdc2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testSuitesTestOpsTestCdc2'))
        
        "Step 6: Click on div selectEnvironmentNth1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_selectEnvironmentNth1'))
        
        "Step 7: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_moreOptions'))
        
        "Step 8: Click on label desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_desktopBrowsers'))
        
        "Step 9: Click on div selectActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_selectActiveTunnels'))
        
        "Step 10: Click on div testCdc2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testCdc2'))
        
        "Step 11: Click on input includeApicalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_includeApicalls'))
        
        "Step 12: Click on input radioButtons"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_radioButtons'))
        
        "Step 13: Click on div selectActiveTunnels2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_selectActiveTunnels2'))
        
        "Step 14: Click on div createdWithSketchtoolKreagent001"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_createdWithSketchtoolKreagent001'))
        
        "Step 15: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_save_1'))
        
        "Step 16: Click on button advancedSettings"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_advancedSettings'))
        
        "Step 17: Click on div latest"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_latest'))
        
        "Step 18: Click on div 9 6 0"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_9_6_0'))
        
        "Step 19: Click on div select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select'))
        
        "Step 20: Enter input value in input value"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_value'), data['input_value'])
        
        "Step 21: Click on div noOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_noOptions'))
        
        "Step 22: Click on div muiInputBaseRoot2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_muiInputBaseRoot2'))
        
        "Step 23: Click on div select2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select2'))
        
        "Step 24: Click on div select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select'))
        
        "Step 25: Click on div select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select'))
        
        "Step 26: Enter input value in input value"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_value'), data['input_value'])
        
        "Step 27: Click on div select2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select2'))
        
        "Step 28: Click on div select2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select2'))
        
        "Step 29: Click on button goBack"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_goBack'))
        
        "Step 30: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_runS'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_value'] = testData.getValue('input_value', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
        data['input_value'] = 'default_data'
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

