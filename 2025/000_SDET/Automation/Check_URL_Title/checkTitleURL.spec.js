// Importing is done by require('@playwright/test') and saved in test and expect 
const {test, expect} = require('@playwright/test')
// page contains many functions
/* Ananomous function(Arrow function): () => {}
async before page and await before page methods are used throughout automation
Javascript is asynchronised language execute in asynchronized manner means it does
not wait for previous line means parallelly all the lines are executed
to handle this we use the javaScript Promise 
async returns a promise 
await makes sure wait for the promise*/
test("Home Page", async ({page}) => {
    await page.goto("https://www.demoblaze.com/index.html")
    const ptitle = page.title()
    console.log("Page Title: " + ptitle)
    const purl = page.url()
    console.log("Page URL: " + purl)
    await expect(page).toHaveTitle("STORE")
    await expect(page).toHaveURL("https://www.demoblaze.com/index.html")
    await page.close()
})