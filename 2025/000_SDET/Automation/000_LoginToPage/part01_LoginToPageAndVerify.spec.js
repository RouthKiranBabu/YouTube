/*Button:
await page.locator('locator').click()
await page.click('locator')
Inputbox:
await page.locator('locator').fill('value')
await page.locator('locator').type('value')
await page.fill('locator', 'value')
await page.type('locator', 'value')*/
import {test, expect} from "@playwright/test"
test('Locators', async ({page}) => {
    await page.goto("https://www.demoblaze.com/index.html")
    // Click on Login button - Property
    await page.locator('id=login2').click()
    // or -> await page.click('id=login2')
    // Providing Username - CSS
    await page.locator('#loginusername').fill("pavanol")
    /*Or page.fill("#loginusername", "Routh Kiran Babu")
      or page.type("#loginusername", "Routh Kiran Babu")*/
    // Providing Password - CSS
    await page.fill("input[id='loginpassword']", "test@123")
    // Click on login button - XPath
    await page.click("//button[normalize-space()='Log in']")
    // Verify logout text in present
    const lout = await page.locator("(//a[normalize-space()='Log out'])[1]");
    await expect(lout).toBeVisible()
    await page.close()
})
