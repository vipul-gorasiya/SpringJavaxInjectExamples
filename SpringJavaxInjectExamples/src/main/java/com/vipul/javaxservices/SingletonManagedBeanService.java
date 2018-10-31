package com.vipul.javaxservices;

import javax.annotation.ManagedBean;
import javax.inject.Singleton;

@Singleton
@ManagedBean
public class SingletonManagedBeanService {

	@Override
	public String toString() {
		return "@Singleton @ManagedBean : " + super.toString();
	}
}
