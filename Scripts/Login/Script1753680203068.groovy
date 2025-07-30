import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import helpers.Tars
import internal.GlobalVariable as GlobalVariable
import pages.LoginPage 

Tars tars = Tars.getInstance()
LoginPage loginPage = new LoginPage()

tars.createReport("SCN_LOGIN", "TC-01")

WebUI.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

loginPage.inputUsername("Admin")
loginPage.inputPassword("admin123")
loginPage.clickLogin()

WebUI.closeBrowser()

tars.saveReport()