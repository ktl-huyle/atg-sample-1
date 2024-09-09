package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class createNewApiKey {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button createApiKey"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_createApiKey'))
        
        "Step 2: Click on input keyName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/input_keyName'))
        
        "Step 3: Enter input value in input keyName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_apikey/input_keyName'), data['input_keyName'])
        
        "Step 4: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/div_object'))
        
        "Step 5: Click on button create"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_apikey/button_create'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_keyName'] = testData.getValue('input_keyName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_keyName'] = 'default_data'
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

