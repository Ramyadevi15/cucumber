Feature: verify the facebook login functionality
Scenario: verify login functionality for valid username and invalid password
Given user enters in to login page
When user enters their  username and password
           | arun@gmail.com|  abc      |
And  user click in to the login button
Then page displayed error message

