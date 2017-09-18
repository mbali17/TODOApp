# TODOApp
This is an implementation for the answer to the following question:
https://www.quora.com/I-need-Java-programming-questions-difficulty-ranging-from-easy-to-high-so-that-I-can-practice-and-improve-my-programming-skills-Is-there-a-site-that-I-can-find-such-questions

Following is the answer

1)Write a to-do list. The items can be stored in memory. The UI will be console driven. It will support one user.
Create a GitHub account and push the code up

2)Split out the UI and storage layers using interfaces. Get the business logic under unit test using JUnit 4 and AssertJ assertions
Expand the to-do app to support 100+ users each with a username and password

3)Make a Jenkins pipeline to build the app and run the tests on each GitHub check-in. Keep all builds green
Store the to-do items in a SQL database

4)Split out the database code I to a data access layer using Hibernate

5)Add Spring to wire up your to-do app

6)Use mustache template engine and Jetty to add a web UI to your to-do app

7)Use skeleton CSS to make your to-do app mobile first responsive looking good on phone, iPad, desktop

6)Email users when they have a to-do item outstanding. Do this once an hour

7)Add a Stripe payment to the login page so users pay 20p to register for these reminder emails

8)Add ELK logging to each action made by the system or users

9)Create a Kibana dashboard to show graphs of user activity, and payment

10)Store the to-do items in Amazon Dynamo, run the app on EC2 instances. Create a deployment pipeline that pushes released to AWS

Each item would be updated at the finish.
I would be using maven(build tool) for building the project and managing dependency
