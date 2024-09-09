package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class downloadAgentAndManageTestLinks {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button downloadAgent"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_downloadAgent'))
        
        "Step 2: Click on link copy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_copy'))
        
        "Step 3: Click on link copy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_copy2'))
        
        "Step 4: Click on link copy3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_copy3'))
        
        "Step 5: Click on span stepConnector"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/span_stepConnector'))
        
        "Step 6: Click on link copy3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_copy3'))
        
        "Step 7: Click on link copy4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_copy4'))
        
        "Step 8: Click on link testEnvironments2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_testEnvironments2'))
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

