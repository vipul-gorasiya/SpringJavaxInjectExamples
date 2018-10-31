package com.vipul.javaxservices;

import javax.inject.Named;

@Named("s3")
public class NamedValueService extends NamedService {

	@Override
	public String toString() {
		return "@Named(\"s3\") : " + super.toString();
	}
}
