package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addIndoorPlantToBasketAndCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link Shop -> Navigate to page 'shop'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_Shop'))
        
        "Step 2: Hover over div IndoorPlantDetails2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_IndoorPlantDetails2'))
        
        "Step 3: Click on button AddToBasket"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_AddToBasket'))
        
        "Step 4: Click on span ShoppingCart"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_ShoppingCart'))
        
        "Step 5: Click on button CheckOut2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_CheckOut2'))
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

