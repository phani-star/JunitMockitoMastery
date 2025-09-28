🧪 JUnit and Mockito Overview
✅ What is JUnit?
JUnit is a popular Java framework used for unit testing. It helps developers test individual parts of their code (usually methods) to ensure they work correctly.

It allows you to write test methods using @Test.
You can check expected vs actual results using assertions like assertEquals.
It helps catch bugs early and ensures code behaves as expected.


✅ What is Mockito?
Mockito is a Java library used for mocking dependencies in unit tests. It works well with JUnit.

It lets you create fake versions of classes (called mocks).
You can define how these mocks should behave.
You can verify if methods were called with expected arguments.


✅ Why Use JUnit and Mockito Together?
Using JUnit and Mockito together allows you to:

Test your code in isolation.
Avoid relying on real implementations (like databases or APIs).
Write clean, fast, and reliable unit tests.


✅ Benefits

Improves code quality.
Makes debugging easier.
Helps with code coverage.

JUnit Annotations


@Test: This is used to mark a method as a test case. JUnit will run this method as part of your test suite.


@BeforeEach: This method runs before every test. Use it to set up common test data or configurations.


@AfterEach: This method runs after every test. Use it to clean up resources or reset states.


@BeforeAll: This method runs once before all tests in the class. It’s useful for global setup. The method must be static.


@AfterAll: This method runs once after all tests in the class. It’s useful for global cleanup. The method must be static.


@Disabled: Use this to temporarily skip a test method. JUnit will ignore it during test execution.


@DisplayName: Gives a custom name to a test method. This name will appear in test reports and logs.



Mockito Annotations


@Mock: Creates a mock object of a class or interface. This mock can simulate behavior without using the real implementation.


@InjectMocks: Automatically injects mock objects into the class you want to test. It helps test classes that depend on other services.


@Spy: Creates a partial mock. It uses the real object but allows you to override specific methods.


@Captor: Used to capture arguments passed to mocked methods. Helpful when you want to verify what data was passed.


@ExtendWith(MockitoExtension.class): Required in JUnit 5 to enable Mockito annotations. It activates the mocking framework.



When to Use These Annotations

Use @Test to write a test method.
Use @Mock when your class depends on another class and you want to fake its behavior.
Use @InjectMocks when you want to test a class that uses mocked dependencies.
Use @Spy when you want to test real behavior but still control some parts.
Use @Captor when you need to check what arguments were passed to a method.
Use @BeforeEach and @AfterEach for setup and cleanup before and after each test.
Use @BeforeAll and @AfterAll for setup and cleanup that should happen only once.
Use @Disabled to skip a test temporarily.
Use @DisplayName to make your test names more readable.
Use @ExtendWith(MockitoExtension.class) to make Mockito annotations work in JUnit 5.
