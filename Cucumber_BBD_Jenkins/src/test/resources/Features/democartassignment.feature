Feature: Create DemoCart project to verify all functionality

Scenario Outline: Complete Democart Project Flow
Given DemoCart page is open in default browser

When user clicks on register button
And enters registration details "<name>" "<lname>" "<email>" "<phone>" "<pass>" "<cpass>"
And clicks on submit button
Then user should register successfully

When user clicks on logout button
Then user should logout successfully

When user clicks on login button
And enters username and password "<email>" "<pass>"
And clicks on login submit button
Then user should login successfully

When user searches products from excel
Then related products should be displayed

When user adds multiple products to cart
Then products should be added successfully

When user removes one product from cart
Then product should be removed successfully

When user proceeds to checkout
And enters all required checkout details
And clicks confirm order button
Then order should be placed successfully

When user clicks on logout button
Then user should logout successfully

And browser should close

Examples:
| name      | lname | email                  | phone      | pass    | cpass   |
| Chirantan | Dev   | dev301@gmail.com       | 9717938078 | Dev@123 | Dev@123 |