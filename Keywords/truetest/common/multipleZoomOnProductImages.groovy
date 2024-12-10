package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class multipleZoomOnProductImages {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on image zoomProductImages (productImage4)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1', ['image_zoomProductImages_class': data['image_zoomProductImages_class'], 'image_zoomProductImages_nthChild': data['image_zoomProductImages_nthChild'], 'image_zoomProductImages_divNthChild': data['image_zoomProductImages_divNthChild']]))
        
        "Step 2: Click on image zoomProductImages (ProductImage18)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1', ['image_zoomProductImages_class': data['image_zoomProductImages_class_1'], 'image_zoomProductImages_nthChild': data['image_zoomProductImages_nthChild_1'], 'image_zoomProductImages_divNthChild': data['image_zoomProductImages_divNthChild_1']]))
        
        "Step 3: Click on image zoomProductImages (ProductImage17)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1', ['image_zoomProductImages_class': data['image_zoomProductImages_class_2'], 'image_zoomProductImages_nthChild': data['image_zoomProductImages_nthChild_2'], 'image_zoomProductImages_divNthChild': data['image_zoomProductImages_divNthChild_2']]))
        
        "Step 4: Click on image zoomProductImages (ProductImage28)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1', ['image_zoomProductImages_class': data['image_zoomProductImages_class_3'], 'image_zoomProductImages_nthChild': data['image_zoomProductImages_nthChild_3'], 'image_zoomProductImages_divNthChild': data['image_zoomProductImages_divNthChild_3']]))
        
        "Step 5: Click on image zoomProductImages (ProductImage29)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages_1', ['image_zoomProductImages_class': data['image_zoomProductImages_class_4'], 'image_zoomProductImages_nthChild': data['image_zoomProductImages_nthChild_4'], 'image_zoomProductImages_divNthChild': data['image_zoomProductImages_divNthChild_4']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['image_zoomProductImages_class'] = testData.getValue('image_zoomProductImages_class', rowIndex)
        data['image_zoomProductImages_class_1'] = testData.getValue('image_zoomProductImages_class_1', rowIndex)
        data['image_zoomProductImages_class_2'] = testData.getValue('image_zoomProductImages_class_2', rowIndex)
        data['image_zoomProductImages_class_3'] = testData.getValue('image_zoomProductImages_class_3', rowIndex)
        data['image_zoomProductImages_class_4'] = testData.getValue('image_zoomProductImages_class_4', rowIndex)
        data['image_zoomProductImages_divNthChild'] = testData.getValue('image_zoomProductImages_divNthChild', rowIndex)
        data['image_zoomProductImages_divNthChild_1'] = testData.getValue('image_zoomProductImages_divNthChild_1', rowIndex)
        data['image_zoomProductImages_divNthChild_2'] = testData.getValue('image_zoomProductImages_divNthChild_2', rowIndex)
        data['image_zoomProductImages_divNthChild_3'] = testData.getValue('image_zoomProductImages_divNthChild_3', rowIndex)
        data['image_zoomProductImages_divNthChild_4'] = testData.getValue('image_zoomProductImages_divNthChild_4', rowIndex)
        data['image_zoomProductImages_nthChild'] = testData.getValue('image_zoomProductImages_nthChild', rowIndex)
        data['image_zoomProductImages_nthChild_1'] = testData.getValue('image_zoomProductImages_nthChild_1', rowIndex)
        data['image_zoomProductImages_nthChild_2'] = testData.getValue('image_zoomProductImages_nthChild_2', rowIndex)
        data['image_zoomProductImages_nthChild_3'] = testData.getValue('image_zoomProductImages_nthChild_3', rowIndex)
        data['image_zoomProductImages_nthChild_4'] = testData.getValue('image_zoomProductImages_nthChild_4', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['image_zoomProductImages_class'] = 'default_data'
        data['image_zoomProductImages_class_1'] = 'default_data'
        data['image_zoomProductImages_class_2'] = 'default_data'
        data['image_zoomProductImages_class_3'] = 'default_data'
        data['image_zoomProductImages_class_4'] = 'default_data'
        data['image_zoomProductImages_divNthChild'] = 'default_data'
        data['image_zoomProductImages_divNthChild_1'] = 'default_data'
        data['image_zoomProductImages_divNthChild_2'] = 'default_data'
        data['image_zoomProductImages_divNthChild_3'] = 'default_data'
        data['image_zoomProductImages_divNthChild_4'] = 'default_data'
        data['image_zoomProductImages_nthChild'] = 'default_data'
        data['image_zoomProductImages_nthChild_1'] = 'default_data'
        data['image_zoomProductImages_nthChild_2'] = 'default_data'
        data['image_zoomProductImages_nthChild_3'] = 'default_data'
        data['image_zoomProductImages_nthChild_4'] = 'default_data'
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

