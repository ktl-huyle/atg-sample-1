package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_6 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input agentprojectlink"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/input_agentprojectlink'))
        
        "Step 2: Click on button open"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_open'))
        
        "Step 3: Click on input agentprojectlink"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/input_agentprojectlink'))
        
        "Step 4: Click on button arrowdropdownicon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_arrowdropdownicon'))
        
        "Step 5: Click on div firstProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_firstProject'))
        
        "Step 6: Click on form object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/form_object'))
        
        "Step 7: Click on span object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/span_object2'))
        
        "Step 8: Click on button arrowdropdownicon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_arrowdropdownicon'))
        
        "Step 9: Click on div object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_object2'))
        
        "Step 10: Click on span object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/span_object2'))
        
        "Step 11: Click on button arrowdropdownicon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_arrowdropdownicon'))
        
        "Step 12: Click on div object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_object3'))
        
        "Step 13: Click on span object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/span_object2'))
        
        "Step 14: Click on button agentUpdate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_agentUpdate'))
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

