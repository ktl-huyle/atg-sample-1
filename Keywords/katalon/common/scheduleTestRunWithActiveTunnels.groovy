package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleTestRunWithActiveTunnels {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button tunnels"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_tunnels"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_tunnels', ['button_tunnels_internalRoleTabName': data['button_tunnels_internalRoleTabName']]))
        
        "Step 2: Click on link scriptRepositories"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_scriptRepositories"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_scriptRepositories', ['link_scriptRepositories_nthChild': data['link_scriptRepositories_nthChild'], 'link_scriptRepositories_internalRoleLinkName': data['link_scriptRepositories_internalRoleLinkName']]))
        
        "Step 3: Enter input value in link oracleJde"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_oracleJde"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_oracleJde', ['link_oracleJde_trNthChild': data['link_oracleJde_trNthChild'], 'link_oracleJde_internalRoleLinkName': data['link_oracleJde_internalRoleLinkName'], 'link_oracleJde_test_project_id': data['link_oracleJde_test_project_id'], 'link_oracleJde_team_id': data['link_oracleJde_team_id'], 'link_oracleJde_project_id': data['link_oracleJde_project_id']]), data['link_oracleJde'])
        
        "Step 4: Click on div object62"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_object62'))
        
        "Step 5: Click on button scheduleTestRun3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_scheduleTestRun3'))
        
        "Step 6: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_name'))
        
        "Step 7: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_name'))
        
        "Step 8: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_name'))
        
        "Step 9: Click on div reactSelectControl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_reactSelectControl'))
        
        "Step 10: Click on div testSuitesTestOpsTestCdc2"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testSuitesTestOpsTestCdc2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testSuitesTestOpsTestCdc2', ['div_testSuitesTestOpsTestCdc2_internalText': data['div_testSuitesTestOpsTestCdc2_internalText']]))
        
        "Step 11: Click on div selectEnvironmentNth1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_selectEnvironmentNth1'))
        
        "Step 12: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_moreOptions'))
        
        "Step 13: Click on label desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_desktopBrowsers'))
        
        "Step 14: Click on div selectActiveTunnels"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_selectActiveTunnels'))
        
        "Step 15: Click on div testCdc2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testCdc2'))
        
        "Step 16: Click on input includeApicalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_includeApicalls'))
        
        "Step 17: Click on input radioButtons"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_radioButtons'))
        
        "Step 18: Click on div selectActiveTunnels2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_selectActiveTunnels2'))
        
        "Step 19: Click on div createdWithSketchtoolKreagent001"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_createdWithSketchtoolKreagent001'))
        
        "Step 20: Enter input value in button save"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/button_save'), data['button_save'])
        
        "Step 21: Click on button advancedSettings"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_advancedSettings"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_advancedSettings', ['button_advancedSettings_internalText': data['button_advancedSettings_internalText']]))
        
        "Step 22: Click on div latest"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_latest'))
        
        "Step 23: Click on div 9 6 0"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_9_6_0'))
        
        "Step 24: Click on div select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select'))
        
        "Step 25: Click on input value"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_value'))
        
        "Step 26: Enter input value in div noOptions"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project/div_noOptions'), data['div_noOptions'])
        
        "Step 27: Click on div muiInputBaseRoot2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_muiInputBaseRoot2'))
        
        "Step 28: Click on div select2"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_select2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_select2', ['div_select2_class': data['div_select2_class']]))
        
        "Step 29: Click on div select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select'))
        
        "Step 30: Click on div select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_select'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_advancedSettings_internalText'] = testData.getValue('button_advancedSettings_internalText', rowIndex)
        data['button_save'] = testData.getValue('button_save', rowIndex)
        data['button_tunnels_internalRoleTabName'] = testData.getValue('button_tunnels_internalRoleTabName', rowIndex)
        data['div_noOptions'] = testData.getValue('div_noOptions', rowIndex)
        data['div_select2_class'] = testData.getValue('div_select2_class', rowIndex)
        data['div_testSuitesTestOpsTestCdc2_internalText'] = testData.getValue('div_testSuitesTestOpsTestCdc2_internalText', rowIndex)
        data['link_oracleJde'] = testData.getValue('link_oracleJde', rowIndex)
        data['link_oracleJde_internalRoleLinkName'] = testData.getValue('link_oracleJde_internalRoleLinkName', rowIndex)
        data['link_oracleJde_project_id'] = testData.getValue('link_oracleJde_project_id', rowIndex)
        data['link_oracleJde_team_id'] = testData.getValue('link_oracleJde_team_id', rowIndex)
        data['link_oracleJde_test_project_id'] = testData.getValue('link_oracleJde_test_project_id', rowIndex)
        data['link_oracleJde_trNthChild'] = testData.getValue('link_oracleJde_trNthChild', rowIndex)
        data['link_scriptRepositories_internalRoleLinkName'] = testData.getValue('link_scriptRepositories_internalRoleLinkName', rowIndex)
        data['link_scriptRepositories_nthChild'] = testData.getValue('link_scriptRepositories_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_advancedSettings_internalText'] = 'default_data'
        data['button_save'] = 'default_data'
        data['button_tunnels_internalRoleTabName'] = 'default_data'
        data['div_noOptions'] = 'default_data'
        data['div_select2_class'] = 'default_data'
        data['div_testSuitesTestOpsTestCdc2_internalText'] = 'default_data'
        data['link_oracleJde'] = 'default_data'
        data['link_oracleJde_internalRoleLinkName'] = 'default_data'
        data['link_oracleJde_project_id'] = 'default_data'
        data['link_oracleJde_team_id'] = 'default_data'
        data['link_oracleJde_test_project_id'] = 'default_data'
        data['link_oracleJde_trNthChild'] = 'default_data'
        data['link_scriptRepositories_internalRoleLinkName'] = 'default_data'
        data['link_scriptRepositories_nthChild'] = 'default_data'
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

