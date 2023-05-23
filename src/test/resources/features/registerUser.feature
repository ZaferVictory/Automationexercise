Feature: Automation Exercise tests

@test1
   Scenario: User Create and Delete
   When Navigate to 'url'
   Then Verify that home page is visible successfully
   And  Click 'Signup / Login' button
   And Enter name and email address
   And Click 'Signup' button
   And Verify 'ENTER ACCOUNT INFORMATION' is visible
   And Fill details: Title, Name, Email, Password, Date of birth
   And Select checkbox 'Sign up for our newsletter!'
   And Select checkbox 'Receive special offers from our partners!'
   And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
   And Click 'Create Account button' button
   And Verify 'ACCOUNT CREATED!' is visible
   And Click 'Continue' button
   And Verify 'Logged in as username' is visible
   And Click 'Delete Account' button
   #And Verify 'ACCOUNT DELETED!' is visible

  @test02
 Scenario:User Login

   Given Navigate to 'url'
   When Verify that home page is visible successfully
   And  Click 'Signup / Login' button
   And  Verify 'Login to your account' is visible
   And Enter correct email address and password
   And Click 'login' button
   And Verify 'Logged in as username' is visible
   And Click 'Delete Account' button
   And Verify 'ACCOUNT DELETED!' is visible