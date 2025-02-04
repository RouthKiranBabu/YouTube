describe('Checking Titles and URLs', () => {
    it('Check URL', () => {
        const start = Date.now()
        cy.visit("https://parabank.parasoft.com/parabank/index.htm")
        const end = Date.now()
        cy.log(`${(end-start).toFixed(2)} sec to visit URL.`)
        cy.url().then((url) =>{
            cy.log("URL👉 " + url)
        })
        cy.url().should("include", "parabank.parasoft.com")
    });
    it('Check Title', () => {
        const start = Date.now()
        cy.visit("https://parabank.parasoft.com/parabank/index.htm")
        const tle = cy.title()
        cy.log("Title type " + typeof tle + ", Title: " + tle)
        tle.should('eq', "ParaBank | Welcome | Online Banking")
        tle.should('include', " Online Banking")
        const end = Date.now()
        cy.log(`${(end-start).toFixed(2)} sec took.`)
    });
});