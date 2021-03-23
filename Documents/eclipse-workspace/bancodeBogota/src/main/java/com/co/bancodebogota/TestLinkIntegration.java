package com.co.bancodebogota;


import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;



public class TestLinkIntegration {
	
	public static final String TESTLINK_KEY = "017851d1f1644724eb305cadb7af4a03"; //key testlink
	public static final String TESTLINK_URL = "https://testlink.labdigitalbdblifecycle.co/lib/api/xmlrpc/v1/xmlrpc.php"; //url testlink
	public static final String TEST_PROJECT_NAME = "PruebasA"; //proyecto de pruebas
	public static final String TEST_PLAN_NAME ="AutomatizacionPruebas"; //el nombre del plan de casos
	//public static final String TEST_CASE_NAME ="ClienteActual"; // nombre de los casos en testlink
	public static final String BUILD_NAME ="Build-Automatizacion"; // nombre del build en testlink
	
	public static void updateResults(String testCaseName, String exception, String results) throws TestLinkAPIException{
		TestLinkAPIClient testlink = new TestLinkAPIClient(TESTLINK_KEY, TESTLINK_URL);
		testlink.reportTestCaseResult(TEST_PROJECT_NAME, TEST_PLAN_NAME, testCaseName, BUILD_NAME, exception, results);
	}
}

