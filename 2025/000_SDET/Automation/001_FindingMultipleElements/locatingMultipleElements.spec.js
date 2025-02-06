/*Run the test in chrome and Debug mode for step by step execution by button:
npx playwright test Part02_LocatingMultipleElements.spec.js --project=chromium --headed --debug
To show the Report: npx playwright show-report
*/
const {test, expect} = require('@playwright/test')
test('LocateMultipleElements', async ({page}) => {
    await page.goto("https://www.demoblaze.com/index.html")
    // Returns all the links present in the page
    const links = await page.$$('a');
    for(const link of links){
        // Text value of link
        const linktext = await link.textContent();
        console.log(linktext)
    }
    await page.waitForTimeout(3000);
    // Wait until all the elements Exist in the webpage
    page.waitForSelector("//div[@id='tbodyid']//h4/a")
    // Try to run this script multiple times to get the result
    const products = await page.$$("//div[@id='tbodyid']//h4/a")
    for(const product of products){
        const productName = await product.textContent();
        console.log(">" + productName)
    }
})