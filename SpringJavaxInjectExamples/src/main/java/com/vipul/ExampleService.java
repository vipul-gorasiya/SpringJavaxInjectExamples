package com.vipul;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import com.vipul.javaxservices.ManagedBeanService;
import com.vipul.javaxservices.NamedService;
import com.vipul.javaxservices.SingletonManagedBeanService;

@ManagedBean
public class ExampleService {

	@Inject
	private ManagedBeanService managedBeanService;

	@Inject
	private NamedService namedService;

	@Named("s3")
	@Inject
	private NamedService namedService2;

	@Inject
	private SingletonManagedBeanService singletonManagedBeanService;

	public void printServiceNames() {
		System.out.println("================ @ManagedBean =====================");
		System.out.println("'managedBeanService' is injected with : " + managedBeanService.getClass());
		System.out.println();
		System.out.println("================ @Named Service ===================");
		System.out.println("'namedService' is injected with : " + namedService.getClass());
		System.out.println();
		System.out.println("================ @Named(\"s3\") Service ===========");
		System.out.println("'namedService2' is injected with : " + namedService2.getClass());
		System.out.println();
		System.out.println("================ @Singleton Service ===========");
		System.out.println("'singletonManagedBeanService' is injected with : " + singletonManagedBeanService.getClass());
	}
}
