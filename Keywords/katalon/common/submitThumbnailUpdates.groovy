package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class submitThumbnailUpdates {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div thumbnailImage"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_thumbnailImage"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_thumbnailImage', ['div_thumbnailImage_class': data['div_thumbnailImage_class'], 'div_thumbnailImage_divNthChild': data['div_thumbnailImage_divNthChild']]))
        
        "Step 2: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))
        
        "Step 3: Click on div thumbnailImage"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_thumbnailImage"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_thumbnailImage', ['div_thumbnailImage_class': data['div_thumbnailImage_class_1'], 'div_thumbnailImage_divNthChild': data['div_thumbnailImage_divNthChild_1']]))
        
        "Step 4: Click on label functionsHaveUpdates"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_functionsHaveUpdates"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_functionsHaveUpdates', ['label_functionsHaveUpdates_for': data['label_functionsHaveUpdates_for'], 'label_functionsHaveUpdates_internalText': data['label_functionsHaveUpdates_internalText']]))
        
        "Step 5: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_submit'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_thumbnailImage_class'] = testData.getValue('div_thumbnailImage_class', rowIndex)
        data['div_thumbnailImage_class_1'] = testData.getValue('div_thumbnailImage_class_1', rowIndex)
        data['div_thumbnailImage_divNthChild'] = testData.getValue('div_thumbnailImage_divNthChild', rowIndex)
        data['div_thumbnailImage_divNthChild_1'] = testData.getValue('div_thumbnailImage_divNthChild_1', rowIndex)
        data['label_functionsHaveUpdates_for'] = testData.getValue('label_functionsHaveUpdates_for', rowIndex)
        data['label_functionsHaveUpdates_internalText'] = testData.getValue('label_functionsHaveUpdates_internalText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_thumbnailImage_class'] = 'default_data'
        data['div_thumbnailImage_class_1'] = 'default_data'
        data['div_thumbnailImage_divNthChild'] = 'default_data'
        data['div_thumbnailImage_divNthChild_1'] = 'default_data'
        data['label_functionsHaveUpdates_for'] = 'default_data'
        data['label_functionsHaveUpdates_internalText'] = 'default_data'
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

