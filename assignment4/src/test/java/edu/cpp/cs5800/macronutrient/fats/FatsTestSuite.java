package edu.cpp.cs5800.macronutrient.fats;

import edu.cpp.cs5800.macronutrient.protein.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        FatsTestSuite.class,
        FatsFactoryTest.class,
        AvocadoTest.class,
        FatsTest.class,
        LentilsTest.class,
        PeanutsTest.class,
        SourCreamTest.class,
        TofuTest.class
})
public class FatsTestSuite {
}
