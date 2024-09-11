package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleTestRunWithDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))
        
        "Step 2: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_name'))
        
        "Step 3: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_name'), data['input_name'])
        
        "Step 4: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object'))
        
        "Step 5: Enter input value in input object"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_object'), data['input_object'])
        
        "Step 6: Click on div object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object2'))
        
        "Step 7: Click on div object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object3'))
        
        "Step 8: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/item_moreOptions'))
        
        "Step 9: Click on label desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/label_desktopBrowsers'))
        
        "Step 10: Click on div object4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object4'))
        
        "Step 11: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_save'))
        
        "Step 12: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_runS'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_object'] = testData.getValue('input_object', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
        data['input_object'] = 'default_data'
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

