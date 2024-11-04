package edu.cpp.cs5800.macronutrient.carbs;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CarbsTestSuite.class,
        CarbsFactoryTest.class,
        BreadTest.class,
        CarbsTest.class,
        CheeseTest.class,
        LentilsTest.class,
        PistachioTest.class
})
public class CarbsTestSuite {
}
