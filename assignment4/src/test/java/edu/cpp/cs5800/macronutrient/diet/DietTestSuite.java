package edu.cpp.cs5800.macronutrient.diet;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        DietTestSuite.class,
        DietTest.class,
        NoRestrictionTest.class,
        NutAllergyTest.class,
        PaleoTest.class,
        VeganTest.class
})
public class DietTestSuite {
}
