package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleTestRunWithConfigurations {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button tunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_tunnels'))
        
        "Step 2: Click on link scriptRepositories"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_scriptRepositories'))
        
        "Step 3: Enter input value in link oracleJde"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/link_oracleJde'), data['link_oracleJde'])
        
        "Step 4: Click on div repositoryUrl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_repositoryUrl'))
        
        "Step 5: Click on button scheduleTestRun2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_scheduleTestRun2'))
        
        "Step 6: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_name'))
        
        "Step 7: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_name'))
        
        "Step 8: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_name'))
        
        "Step 9: Click on div object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object5'))
        
        "Step 10: Click on div testSuitesTestOps"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_testSuitesTestOps'))
        
        "Step 11: Click on div selectEnvironment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_selectEnvironment'))
        
        "Step 12: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/item_moreOptions'))
        
        "Step 13: Click on label desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/label_desktopBrowsers'))
        
        "Step 14: Click on div reactSelectIndicator"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_reactSelectIndicator'))
        
        "Step 15: Click on div testSuitesApi"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_testSuitesApi'))
        
        "Step 16: Click on input includeApicalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_includeApicalls'))
        
        "Step 17: Click on input radioButtons"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_radioButtons'))
        
        "Step 18: Click on div reactSelectIndicator2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_reactSelectIndicator2'))
        
        "Step 19: Click on div testSuitesApi2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_testSuitesApi2'))
        
        "Step 20: Enter input value in button save"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/button_save'), data['button_save'])
        
        "Step 21: Click on button advancedSettings"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_advancedSettings'))
        
        "Step 22: Click on div object6"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object6'))
        
        "Step 23: Click on div testSuitesApi3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_testSuitesApi3'))
        
        "Step 24: Click on div reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_reactSelectControl'))
        
        "Step 25: Click on input text"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_text'))
        
        "Step 26: Enter input value in div object7"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/div_object7'), data['div_object7'])
        
        "Step 27: Click on div muiInputBase"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_muiInputBase'))
        
        "Step 28: Click on div reactSelectControl2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_reactSelectControl2'))
        
        "Step 29: Click on div reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_reactSelectControl'))
        
        "Step 30: Click on div reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_reactSelectControl'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_save'] = testData.getValue('button_save', rowIndex)
        data['div_object7'] = testData.getValue('div_object7', rowIndex)
        data['link_oracleJde'] = testData.getValue('link_oracleJde', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_save'] = 'default_data'
        data['div_object7'] = 'default_data'
        data['link_oracleJde'] = 'default_data'
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

