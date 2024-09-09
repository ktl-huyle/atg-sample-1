package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class openAndUpdateFirstProject {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input agentProjectLink"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_agentProjectLink'))
        
        "Step 2: Click on button open"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_open'))
        
        "Step 3: Click on input agentProjectLink"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_agentProjectLink'))
        
        "Step 4: Click on button open2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_open2'))
        
        "Step 5: Click on div firstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_firstProject'))
        
        "Step 6: Click on form nameCreatedWithSketchtool"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/form_nameCreatedWithSketchtool'))
        
        "Step 7: Click on span firstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_firstProject'))
        
        "Step 8: Click on button open2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_open2'))
        
        "Step 9: Click on div colSm12"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_colSm12'))
        
        "Step 10: Click on span firstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_firstProject'))
        
        "Step 11: Click on button open2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_open2'))
        
        "Step 12: Click on div update"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_update'))
        
        "Step 13: Click on span firstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_firstProject'))
        
        "Step 14: Click on button update"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_update'))
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

