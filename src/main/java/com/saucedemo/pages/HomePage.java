package com.saucedemo.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public String getFirstProductName() {
        return page.locator("[data-test=\"inventory-item-name\"]").first().innerText();
    }

    public void addProductToChart(String productName) {
        System.out.println("Adding product:" + productName);
        String label = productName.toLowerCase().replace(" ", "-");
        page.locator("[data-test=\"add-to-cart-" + label + "\"]").click();
    }
}
