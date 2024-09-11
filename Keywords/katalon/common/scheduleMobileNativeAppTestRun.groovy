package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleMobileNativeAppTestRun {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 2: Click on div object8"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object8'))
        
        "Step 3: Click on div name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_name'))
        
        "Step 4: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 5: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object9'))
        
        "Step 6: Click on div object10"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object10'))
        
        "Step 7: Click on div object11"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object11'))
        
        "Step 8: Click on link clickHereToRefresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_clickHereToRefresh'))
        
        "Step 9: Click on div selectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_selectEnvironment'))
        
        "Step 10: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 11: Click on button mobileNativeApp"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_mobileNativeApp'))
        
        "Step 12: Click on div android"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_android'))
        
        "Step 13: Click on div object12"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object12'))
        
        "Step 14: Click on div phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_phone'))
        
        "Step 15: Click on div googlePixel8"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_googlePixel8'))
        
        "Step 16: Click on div object13"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object13'))
        
        "Step 17: Click on div object13"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object13'))
        
        "Step 18: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 19: Click on div object14"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object14'))
        
        "Step 20: Click on div object15"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object15'))
        
        "Step 21: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
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

