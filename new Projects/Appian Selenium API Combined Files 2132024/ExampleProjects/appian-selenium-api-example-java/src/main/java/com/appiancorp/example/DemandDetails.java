package com.appiancorp.example;

import com.appiancorp.ps.automatedtest.fixture.TempoFixture;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.appiancorp.example.HelloAppian.fixture;


public class DemandDetails extends TempoFixture {



    @Test
public void clickOnDemandDetails(){
fixture.clickOnMenu("Demand Details");
}
}
