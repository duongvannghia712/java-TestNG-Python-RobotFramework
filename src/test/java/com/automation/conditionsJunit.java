package com.automation;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class conditionsJunit extends common {
      /**
       * Java Conditions Test :-)
       */
      public conditionsJunit() {
            super();
      }

      @Before
      public void start_testing() {
            System.out.println("Start Testing...");
      }

      @Test
      public void scenario_01() {
            Assert.assertTrue(dataLoader(Array_1, str_1));
      }

      @Test
      public void scenario_02() {
            Assert.assertTrue(dataLoader(Array_1, str_2));
      }

      @Test
      public void scenario_03() {
            Assert.assertTrue(dataLoader(Array_2, str_1));
      }

      @Test
      public void scenario_04() {
            Assert.assertTrue(dataLoader(Array_2, str_5));
      }

      @Test
      public void scenario_05() {
            Assert.assertTrue(dataLoader(Array_3, str_1));
      }

      @Test
      public void scenario_06() {
            Assert.assertTrue(dataLoader(Array_3, str_2));
      }

      @Test
      public void scenario_07() {
            Assert.assertTrue(dataLoader(Array_3, str_3));
      }

      @Test
      public void scenario_08() {
            Assert.assertTrue(dataLoader(Array_3, str_4));
      }

      @Test
      public void scenario_09() {
            Assert.assertTrue(dataLoader(Array_3, str_6));
      }

      @Test
      public void scenario_10() {
            Assert.assertTrue(dataLoader(Array_4, str_1));
      }

      @Test
      public void scenario_11() {
            Assert.assertTrue(dataLoader(Array_4, str_2));
      }

      @Test
      public void scenario_12() {
            Assert.assertTrue(dataLoader(Array_4, str_3));
      }

      @Test
      public void scenario_13() {
            Assert.assertTrue(dataLoader(Array_4, str_3));
      }

      @Test
      public void scenario_14() {
            Assert.assertTrue(dataLoader(Array_4, str_5));
      }

      @Test
      public void scenario_15() {
            Assert.assertTrue(dataLoader(Array_4, str_6));
      }

      @Test
      public void scenario_16() {
            Assert.assertTrue(dataLoader(Array_4, str_7));
      }

      @Test
      public void scenario_17() {
            Assert.assertTrue(dataLoader(Array_4, str_8));
      }

      @Test
      public void scenario_18() {
            Assert.assertTrue(dataLoader(Array_4, str_9));
      }

      @Test
      public void scenario_19() {
            Assert.assertTrue(dataLoader(Array_4, str_10));
      }
      

      @AfterClass
      public static void end_testing() {
            System.out.println("End Testing...");
      }
}