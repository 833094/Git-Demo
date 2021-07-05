Feature: Application login
Scenario Outline: Home page login
Given user is on landing page "http://www.qaclickacademy.com/"
And navigate to login page
When user login into homepage with <username> and <password>
Then close the browser

Examples:
|username			|password		|
|user1@gmail.com	|123456			|
|user2@gmail.com	|123456			|