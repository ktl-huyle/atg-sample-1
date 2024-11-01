package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class createNewApiKeyWithName {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button CreateApiKey"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_CreateApiKey'))
        
        "Step 2: Click on input KeyName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/input_KeyName'))
        
        "Step 3: Enter input value in input KeyName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user/input_KeyName'), data['input_KeyName'])
        
        "Step 4: Click on div CancelCreate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/div_CancelCreate'))
        
        "Step 5: Click on button Create"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_Create'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_KeyName'] = testData.getValue('input_KeyName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_KeyName'] = 'default_data'
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

