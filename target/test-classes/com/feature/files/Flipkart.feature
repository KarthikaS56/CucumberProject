Feature: Flipkart Page Scenarios

Scenario: TS01_Validate_product_added_into_the_Cart
Given Open the browser
And Launch the Flipkart URL
When Search for Dell laptop
And Click on First Product in PLPPage
When Click on Add to Cart
Then Validate the product was added into the Cart