package question05;

/*
To mock DB in JUnit test for service method, 
we could create the expected result, mock the db call, 
and return the expected result to this mock.

Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA applications. 
Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface that can be used in unit testing.

For example, 

In the service method, a db operation is needed.
User user = UserDAO.getUserById(user_id);

In JUnit test, we could mock the db operation as below.
User user = new User();
user.setId(user_id);

Mockito.when(userDAO.getUserById(AnyLong()).thenReturn(user);

*/
