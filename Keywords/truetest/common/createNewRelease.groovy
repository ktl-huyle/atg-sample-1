package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class createNewRelease {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link CreateRelease -> Navigate to page 'team/*/project/*/releases/create'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_CreateRelease'))
        
        "Step 2: Click on input Name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_Name'))
        
        "Step 3: Enter input value in input Name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_releases_create/input_Name'), data['input_Name'])
        
        "Step 4: Click on input StartTime"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_StartTime'))
        
        "Step 5: Click on button ChooseDate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_ChooseDate'))
        
        "Step 6: Click on button releaseActions (August22)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases_create/button_releaseActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases_create/button_releaseActions', ['button_releaseActions_internalLabel': data['button_releaseActions_internalLabel']]))
        
        "Step 7: Click on input EndTime"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_EndTime'))
        
        "Step 8: Click on button ChooseDate2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_ChooseDate2'))
        
        "Step 9: Click on button releaseActions (August22 2024)"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases_create/button_releaseActions'))
        
        "Step 10: Click on button Create"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_Create'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_releaseActions_internalLabel'] = testData.getValue('button_releaseActions_internalLabel', rowIndex)
        data['input_Name'] = testData.getValue('input_Name', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_releaseActions_internalLabel'] = 'default_data'
        data['input_Name'] = 'default_data'
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

