package com.vipul.javaxservices;

import javax.annotation.ManagedBean;

@ManagedBean
public class ManagedBeanService {

	@Override
	public String toString() {
		return "@ManagedBean : " + super.toString();
	}
}
