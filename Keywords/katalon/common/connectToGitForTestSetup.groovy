package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class connectToGitForTestSetup {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input password"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_password'))
        
        "Step 2: Click on button connect"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_connect'))
        
        "Step 3: Click on button connect"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_connect'))
        
        "Step 4: Click on input enterName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_enterName'))
        
        "Step 5: Click on div gitSetUpCreateNew"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_gitSetUpCreateNew'))
        
        "Step 6: Click on div gitSetUpUseSample"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_gitSetUpUseSample'))
        
        "Step 7: Click on div reactSelectIndicator"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_reactSelectIndicator'))
        
        "Step 8: Click on div reactSelectIndicator"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_reactSelectIndicator'))
        
        "Step 9: Click on div createAnewGit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_createAnewGit'))
        
        "Step 10: Click on div gitSetUpCreateNew"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_gitSetUpCreateNew'))
        
        "Step 11: Click on span reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_reactSelectControl'))
        
        "Step 12: Click on div gitSetUpCreateNew"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_gitSetUpCreateNew'))
        
        "Step 13: Click on div reactSelectOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_reactSelectOption'))
        
        "Step 14: Click on div refsHeadsMain"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_refsHeadsMain'))
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

