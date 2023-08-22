Feature: Ordering a product in Lime Road

Scenario: User can get limeroad url 

Given User can get limeroad url "https://www.limeroad.com/"

Scenario: Selecting a formal shoe for men

Given Clicking on Shop men button

When Moving over men catagory

And select formal shoe from footwear

And clicking on filter type high price

And clicking the shoe

Scenario: Adding the shoe to cart

Given Select the size for shoe

When Click on add to cart button

And Click on pay now button

And Enter your mobile number

And enter your otp

