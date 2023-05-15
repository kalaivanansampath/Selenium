package com.EXA.Sanity.Cucumber.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IRetryAnalyzer, IAnnotationTransformer {

	int retryCount = 0;
	@Override
	public boolean retry(ITestResult result) {
		if(retryCount < 2) {
			retryCount++;
			return true;
		}
		return false;
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryListener.class);
		annotation.setTimeOut(10000);
	}
	
}
