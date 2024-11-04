package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class openAndUpdateProject {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input SelectProjects"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_SelectProjects'))
        
        "Step 2: Click on button Open"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open'))
        
        "Step 3: Click on input SelectProjects"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_SelectProjects'))
        
        "Step 4: Click on button Open2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open2'))
        
        "Step 5: Click on div FirstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_FirstProject'))
        
        "Step 6: Click on form Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/form_Name'))
        
        "Step 7: Click on span FirstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))
        
        "Step 8: Click on button Open2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open2'))
        
        "Step 9: Click on div Column12"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_Column12'))
        
        "Step 10: Click on span FirstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))
        
        "Step 11: Click on button Open2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open2'))
        
        "Step 12: Click on div UpdateOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_UpdateOption'))
        
        "Step 13: Click on span FirstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))
        
        "Step 14: Click on button Update"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Update'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

