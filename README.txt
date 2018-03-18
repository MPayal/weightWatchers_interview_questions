This is a maven project.

Dependencies for this project are:
1) maven
2) junit
3) selenium-java

Solution 1 (Dictionary coding challenge)
---------------------------------------
Code: src/main/java/solutions/Solution1.java
Test cases: src/test/solutions/Solution1Test.java

Solution 2 (Selenium)
---------------------

There are 4 Page Objects in this project:
src/main/java/pageobjects

1) DriverManager: This class manages instantiation of a WebDriver so that there is no need to create WebDriver instance in each and every test class.
This test is automated on Internet Explorer.

2) HomePage, FindMeetingPage, and FirstResultPage
It uses Page Factory class to initialize all elements on the page and contains methods which expose several services provided by the pages.

Test case is located in: src/test/weightwatchers/Solution2.java

Note:
1) IEDriver is lcoated in src/main/java/resources
2) Please note that I have used class and id to interrogate the DOM for the entire solution as requested. However, for the
last part of the question, I have used xpath.


Solution 3 (Random numbers sorting)
----------------------------------
Code: src/main/java/solutions/Solution3.java
Test cases: src/test/solutions/Solution3Test.java


It was a pleasure to complete the interview questions.
If you have any questions about the code, please reach out to me at 609-474-0610 or payall.mehta.qa@gmail.com
