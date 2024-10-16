package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class viewThumbnailImagesAndClose {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div ThumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))
        
        "Step 2: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 3: Click on div RightSidebar"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar'))
        
        "Step 4: Click on div ThumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))
        
        "Step 5: Click on image thumbnailImage (ThumbnailImage)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/image_thumbnailImage"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/image_thumbnailImage', ['image_thumbnailImage_internalRoleImgName': data['image_thumbnailImage_internalRoleImgName']]))
        
        "Step 6: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 7: Click on pre ErrorMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_ErrorMessage'))
        
        "Step 8: Click on pre ErrorMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_ErrorMessage'))
        
        "Step 9: Click on div ThumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))
        
        "Step 10: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 11: Click on div ThumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))
        
        "Step 12: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 13: Click on td FailedFilterClaims"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_FailedFilterClaims'))
        
        "Step 14: Click on div ThumbnailImage2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage2'))
        
        "Step 15: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 16: Click on div ThumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))
        
        "Step 17: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 18: Click on div ThumbnailImage3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))
        
        "Step 19: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 20: Click on div ThumbnailImage4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage4'))
        
        "Step 21: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['image_thumbnailImage_internalRoleImgName'] = testData.getValue('image_thumbnailImage_internalRoleImgName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['image_thumbnailImage_internalRoleImgName'] = 'default_data'
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

