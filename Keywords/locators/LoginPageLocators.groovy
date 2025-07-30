package locators

import internal.GlobalVariable

public class LoginPageLocators {
	static usernameField = "//div[./div/label[text()='Username']]//following-sibling::div/input"
	static passwordField = "//div[./div/label[text()='Password']]//following-sibling::div/input"
	static loginBtn = "//button[contains(text(), Login)]"
}
