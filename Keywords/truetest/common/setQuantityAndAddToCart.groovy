package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class setQuantityAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input quantity (Quantity15)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/input_quantity"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/input_quantity', ['input_quantity_inputName': data['input_quantity_inputName']]))
        
        "Step 2: Enter input value in input quantity (Quantity16)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/input_quantity"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_home/input_quantity', ['input_quantity_inputName': data['input_quantity_inputName_1']]), data['input_quantity'])
        
        "Step 3: Click on link AddToCart35"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AddToCart35'))
        
        "Step 4: Click on input SearchTerm3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchTerm3'))
        
        "Step 5: Enter input value in input SearchTerm4"
        
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_SearchTerm3'), data['input_SearchTerm4'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_SearchTerm4'] = testData.getValue('input_SearchTerm4', rowIndex)
        data['input_quantity'] = testData.getValue('input_quantity', rowIndex)
        data['input_quantity_inputName'] = testData.getValue('input_quantity_inputName', rowIndex)
        data['input_quantity_inputName_1'] = testData.getValue('input_quantity_inputName_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_SearchTerm4'] = 'default_data'
        data['input_quantity'] = 'default_data'
        data['input_quantity_inputName'] = 'default_data'
        data['input_quantity_inputName_1'] = 'default_data'
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

