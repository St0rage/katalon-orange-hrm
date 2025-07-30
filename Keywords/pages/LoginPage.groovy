package pages

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import helpers.TarsStatus
import internal.GlobalVariable
import locators.LoginPageLocators as Locator

public class LoginPage extends BasePage {


	public inputUsername(String username) {
		try {
			WebUI.setText(findByXpath(Locator.usernameField), username)
			this.tars.screenshot("Input Usename", "Berhasil Input Username ${username}", TarsStatus.DONE)
		} catch (e) {
			this.errorHandling(e)
		}
	}

	public inputPassword(String password) {
		try {
			WebUI.setText(findByXpath(Locator.passwordField), password)
			this.tars.screenshot("Input Password", "Berhasil Input Password", TarsStatus.DONE)
		} catch (e) {
			this.errorHandling(e)
		}
	}

	public clickLogin() {
		try {
			def logoImg = "	//div[@class='oxd-brand-logo']/img"
			this.tars.screenshot("Click Login", "Berhasil Klik Login", TarsStatus.DONE)
			WebUI.click(findByXpath(Locator.loginBtn))
			WebUI.waitForElementPresent(findByXpath(logoImg), 5)
			this.tars.screenshot("Validate Login", "Berhasil Login", TarsStatus.PASSED)
		} catch (e) {
			this.errorHandling(e)
		}
	}
	
	public login(String username, String password) {
		try {
			WebUI.setText(findByCSS(Locator.usernameFieldCss), username)
			this.tars.screenshot("Input Usename", "Berhasil Input Username ${username}", TarsStatus.DONE)
			WebUI.setText(findByCSS(Locator.passwordFieldCss), password)
			this.tars.screenshot("Input Password", "Berhasil Input Password", TarsStatus.DONE)
			this.tars.screenshot("Click Login", "Berhasil Klik Login", TarsStatus.DONE)
			WebUI.click(findByCSS(Locator.loginBtnCss))
			
			def logoImg = "	//div[@class='oxd-brand-logo']/img"
			WebUI.waitForElementPresent(findByXpath(logoImg), 5)
			this.tars.screenshot("Validate Login", "Berhasil Login", TarsStatus.PASSED)
		} catch (e) {
			this.errorHandling(e)
		}
	}
}
