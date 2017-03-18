package com.packetpub.mastering.selenium;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sindh on 18/03/2017.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"})

public class RunCukesTest {
}

