# Spring javax.inject.* annotations examples

Additonal dependency of javax.inject is added for it.

## How is it used in example

1.@Inject - equivalent to @Autowired - used in ExampleService
2.@Named - equivalent to @Component /@Qualifier - Used in NamedService, NamedValueService and ExampleService
3.@ManagedBean - equivalent to @Component - Used in ManagedBeanService
4.@Singleton - equivalent to @Scope("singleton") - used in SingletonManagedBeanService

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log to see the sequence of execution and relate it with the code in ExampleService.java
