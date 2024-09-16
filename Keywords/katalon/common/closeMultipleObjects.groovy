package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class closeMultipleObjects {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object3"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/div_object3"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/div_object3', ['div_object3_class': data['div_object3_class'], 'div_object3_divNthChild': data['div_object3_divNthChild']]))
        
        "Step 2: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_close'))
        
        "Step 3: Click on div object4"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/div_object4"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/div_object4', ['div_object4_class': data['div_object4_class'], 'div_object4_divNthChild': data['div_object4_divNthChild']]))
        
        "Step 4: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_close'))
        
        "Step 5: Click on div object5"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/div_object5"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/div_object5', ['div_object5_class': data['div_object5_class'], 'div_object5_divNthChild': data['div_object5_divNthChild']]))
        
        "Step 6: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_close'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_object3_class'] = testData.getValue('div_object3_class', rowIndex)
        data['div_object3_divNthChild'] = testData.getValue('div_object3_divNthChild', rowIndex)
        data['div_object4_class'] = testData.getValue('div_object4_class', rowIndex)
        data['div_object4_divNthChild'] = testData.getValue('div_object4_divNthChild', rowIndex)
        data['div_object5_class'] = testData.getValue('div_object5_class', rowIndex)
        data['div_object5_divNthChild'] = testData.getValue('div_object5_divNthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_object3_class'] = 'default_data'
        data['div_object3_divNthChild'] = 'default_data'
        data['div_object4_class'] = 'default_data'
        data['div_object4_divNthChild'] = 'default_data'
        data['div_object5_class'] = 'default_data'
        data['div_object5_divNthChild'] = 'default_data'
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

