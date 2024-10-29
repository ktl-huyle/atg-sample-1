package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class searchAndContinueShopping {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Enter input value in input quantityField (Quantity)"
        
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_SearchDisplay/input_quantityField'), data['input_quantityField'])
        
        "Step 2: Click on link addToCart (AddToCart495)"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_SearchDisplay/link_addToCart_1'))
        
        "Step 3: Click on link ContinueShopping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/link_ContinueShopping'))
        
        "Step 4: Click on input SearchTerm"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_SearchDisplay/input_SearchTerm'))
        
        "Step 5: Enter input value in input SearchTerm"
        
        WebUI.setText(findTestObject('AI-Generated/Page_SearchDisplay/input_SearchTerm'), data['input_SearchTerm'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_SearchTerm'] = testData.getValue('input_SearchTerm', rowIndex)
        data['input_quantityField'] = testData.getValue('input_quantityField', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_SearchTerm'] = 'default_data'
        data['input_quantityField'] = 'default_data'
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

