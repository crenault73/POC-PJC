package com.saucedemo.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
    Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigateToUrl() {
        this.page.navigate("https://www.saucedemo.com/");
    }

    public String verifyTitle() {
        return "Swag Labs";
    }

    public void loginIntoApplication(String email, String pass) {
        enterUserName(email);
        enterPassword(pass);
        clickLoginButton();
    }

    private void enterUserName(String email) {
        Locator userInput = page.locator("[data-test=\"username\"]");
        userInput.click();
        userInput.fill(email);
    }

    private void enterPassword(String pass) {
        Locator passInput = page.locator("[data-test=\"password\"]");
        passInput.click();
        passInput.fill(pass);
    }

    public void clickLoginButton() {
        page.locator("[data-test=\"login-button\"]").click();
    }

    public void clickOnLogout() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open Menu")).click();
        page.locator("[data-test=\"logout-sidebar-link\"]").click();
    }

    public void logoutApplication() {
        clickOnLogout();
    }
}