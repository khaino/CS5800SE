package edu.cpp.cs5800.macronutrient.protein;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ProteinTestSuite.class,
        ProteinFactoryTest.class,
        BeefTest.class,
        ChickenTest.class,
        FishTest.class,
        ProteinTest.class,
        TofuTest.class
})
public class ProteinTestSuite {
}
