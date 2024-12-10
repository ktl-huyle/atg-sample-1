package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class zoomInOnProductImages {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on image productImages (ProductImage)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productImages"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productImages', ['image_productImages_class': data['image_productImages_class'], 'image_productImages_nthChild': data['image_productImages_nthChild'], 'image_productImages_internalRoleImgName': data['image_productImages_internalRoleImgName']]))
        
        "Step 2: Click on image productImages (ProductImage3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productImages"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productImages', ['image_productImages_class': data['image_productImages_class_1'], 'image_productImages_nthChild': data['image_productImages_nthChild_1'], 'image_productImages_internalRoleImgName': data['image_productImages_internalRoleImgName_1']]))
        
        "Step 3: Click on image productImages (ProductImage2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productImages"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productImages', ['image_productImages_class': data['image_productImages_class_2'], 'image_productImages_nthChild': data['image_productImages_nthChild_2'], 'image_productImages_internalRoleImgName': data['image_productImages_internalRoleImgName_2']]))
        
        "Step 4: Click on link moreImages (ShowMoreImages)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_moreImages"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_moreImages', ['link_moreImages_class': data['link_moreImages_class'], 'link_moreImages_internalRoleOptionName': data['link_moreImages_internalRoleOptionName']]))
        
        "Step 5: Click on image zoomProductImages (ProductImage17)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages', ['image_zoomProductImages_class': data['image_zoomProductImages_class'], 'image_zoomProductImages_nthChild': data['image_zoomProductImages_nthChild'], 'image_zoomProductImages_divNthChild': data['image_zoomProductImages_divNthChild']]))
        
        "Step 6: Click on image zoomProductImages (ProductMainImage6)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_zoomProductImages', ['image_zoomProductImages_class': data['image_zoomProductImages_class_1'], 'image_zoomProductImages_nthChild': data['image_zoomProductImages_nthChild_1'], 'image_zoomProductImages_divNthChild': data['image_zoomProductImages_divNthChild_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['image_productImages_class'] = testData.getValue('image_productImages_class', rowIndex)
        data['image_productImages_class_1'] = testData.getValue('image_productImages_class_1', rowIndex)
        data['image_productImages_class_2'] = testData.getValue('image_productImages_class_2', rowIndex)
        data['image_productImages_internalRoleImgName'] = testData.getValue('image_productImages_internalRoleImgName', rowIndex)
        data['image_productImages_internalRoleImgName_1'] = testData.getValue('image_productImages_internalRoleImgName_1', rowIndex)
        data['image_productImages_internalRoleImgName_2'] = testData.getValue('image_productImages_internalRoleImgName_2', rowIndex)
        data['image_productImages_nthChild'] = testData.getValue('image_productImages_nthChild', rowIndex)
        data['image_productImages_nthChild_1'] = testData.getValue('image_productImages_nthChild_1', rowIndex)
        data['image_productImages_nthChild_2'] = testData.getValue('image_productImages_nthChild_2', rowIndex)
        data['image_zoomProductImages_class'] = testData.getValue('image_zoomProductImages_class', rowIndex)
        data['image_zoomProductImages_class_1'] = testData.getValue('image_zoomProductImages_class_1', rowIndex)
        data['image_zoomProductImages_divNthChild'] = testData.getValue('image_zoomProductImages_divNthChild', rowIndex)
        data['image_zoomProductImages_divNthChild_1'] = testData.getValue('image_zoomProductImages_divNthChild_1', rowIndex)
        data['image_zoomProductImages_nthChild'] = testData.getValue('image_zoomProductImages_nthChild', rowIndex)
        data['image_zoomProductImages_nthChild_1'] = testData.getValue('image_zoomProductImages_nthChild_1', rowIndex)
        data['link_moreImages_class'] = testData.getValue('link_moreImages_class', rowIndex)
        data['link_moreImages_internalRoleOptionName'] = testData.getValue('link_moreImages_internalRoleOptionName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['image_productImages_class'] = 'default_data'
        data['image_productImages_class_1'] = 'default_data'
        data['image_productImages_class_2'] = 'default_data'
        data['image_productImages_internalRoleImgName'] = 'default_data'
        data['image_productImages_internalRoleImgName_1'] = 'default_data'
        data['image_productImages_internalRoleImgName_2'] = 'default_data'
        data['image_productImages_nthChild'] = 'default_data'
        data['image_productImages_nthChild_1'] = 'default_data'
        data['image_productImages_nthChild_2'] = 'default_data'
        data['image_zoomProductImages_class'] = 'default_data'
        data['image_zoomProductImages_class_1'] = 'default_data'
        data['image_zoomProductImages_divNthChild'] = 'default_data'
        data['image_zoomProductImages_divNthChild_1'] = 'default_data'
        data['image_zoomProductImages_nthChild'] = 'default_data'
        data['image_zoomProductImages_nthChild_1'] = 'default_data'
        data['link_moreImages_class'] = 'default_data'
        data['link_moreImages_internalRoleOptionName'] = 'default_data'
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

