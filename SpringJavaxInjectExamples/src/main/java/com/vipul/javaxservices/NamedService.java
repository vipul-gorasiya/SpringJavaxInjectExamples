package com.vipul.javaxservices;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;

@Primary
@Named
public class NamedService {
	@Override
	public String toString() {
		return "@Named : " + super.toString();
	}
}
