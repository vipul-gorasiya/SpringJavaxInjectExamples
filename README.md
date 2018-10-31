# Spring javax.inject.* annotations examples

Additonal dependency of javax.inject is added for it.

## How is it used in example

- @Inject - equivalent to @Autowired - used in ExampleService
- @Named - equivalent to @Component /@Qualifier - Used in NamedService, NamedValueService and ExampleService
- @ManagedBean - equivalent to @Component - Used in ManagedBeanService
- @Singleton - equivalent to @Scope("singleton") - used in SingletonManagedBeanService

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log to see the sequence of execution and relate it with the code in ExampleService.java
