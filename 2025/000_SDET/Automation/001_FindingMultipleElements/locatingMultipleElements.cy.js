describe('Locating Multiple Element', () => {
    it('Login to Hrm and Finding Multiple Elements', () => {
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.xpath("//input[@placeholder='Username']").type("Admin")
        cy.xpath("//input[@placeholder='Password']").type("admin123")
        cy.xpath("//button[@type='submit']").click()
        cy.xpath("//span[@class='oxd-userdropdown-tab']").click()
        cy.xpath("//ul[@role='menu']").find("li").each(($option) => {
            cy.log($option.text())
            if ($option.text() === "Logout") cy.log("You Loged in...✅")
            cy.wait(2000)
        })
    });
});