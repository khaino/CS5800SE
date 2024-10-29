package edu.cpp.cs5800.pizza;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        PizzaTestSuite.class,
        DominosTest.class,
        LittleCaesarsTest.class,
        PizzaChainTest.class,
        PizzaHutTest.class,
        PizzaTest.class
})
public class PizzaTestSuite {
}
