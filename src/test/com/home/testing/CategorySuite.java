package com.home.testing;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory(GoodCategory.class)
@ExcludeCategory(BadCategory.class)
@Suite.SuiteClasses({PluralsightTests.class, CalculatorTest.class})
public class CategorySuite {

}
