package com.automation;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class conditionsTestNGIT extends common {

      @BeforeClass
      public void start_testing() {
            System.out.println("Start Testing...");
      }


      /************************************* */
      @Test(priority = 1,description = "TC1 -- Test with Empty 1-Dimensional Array and Wrong String")
      public void scenario_01() {
            Assert.assertTrue(dataLoader(Array_1, str_1));
      }

      @Test(priority = 2,description = "TC2 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i]})")
      public void scenario_02() {
            Assert.assertTrue(dataLoader(Array_1, str_2));
      }

      @Test(priority = 3,description = "TC3 -- Test with Empty 2-Dimensional Array and Wrong String")
      public void scenario_03() {
            Assert.assertTrue(dataLoader(Array_2, str_1));
      }

      @Test(priority = 4,description = "TC4 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i][j]})")
      public void scenario_04() {
            Assert.assertTrue(dataLoader(Array_2, str_5));
      }

      @Test(priority = 5,description = "TC5 -- Test with 1-Dimensional Array and Wrong String")
      public void scenario_05() {
            Assert.assertTrue(dataLoader(Array_3, str_1));
      }

      @Test(priority = 6,description = "TC6 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i]} and i is valid)")
      public void scenario_06() {
            Assert.assertTrue(dataLoader(Array_3, str_2));
      }

      @Test(priority = 7,description = "TC7 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i]} and i is valid && i >= length of 1-Dimensional Array)")
      public void scenario_07() {
            Assert.assertTrue(dataLoader(Array_3, str_3));
      }

      @Test(priority = 8,description = "TC8 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i]} and i is invalid)")
      public void scenario_08() {
            Assert.assertTrue(dataLoader(Array_3, str_4));
      }

      @Test(priority = 9,description = "TC9 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i][j]})")
      public void scenario_09() {
            Assert.assertTrue(dataLoader(Array_3, str_6));
      }

      @Test(priority = 10,description = "TC10 -- Test with 2-Dimensional Array and Wrong String")
      public void scenario_10() {
            Assert.assertTrue(dataLoader(Array_4, str_1));
      }

      @Test(priority = 11,description = "TC11 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i]} and i is valid && i < length of 2-Dimensional Array)")
      public void scenario_11() {
            Assert.assertTrue(dataLoader(Array_4, str_2));
      }

      @Test(priority = 12,description = "TC12 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i]} and i is valid && i >= length of 2-Dimensional Array)")
      public void scenario_12() {
            Assert.assertTrue(dataLoader(Array_4, str_3));
      }

      @Test(priority = 13,description = "TC13 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is invalid)")
      public void scenario_13() {
            Assert.assertTrue(dataLoader(Array_4, str_3));
      }

      @Test(priority = 14,description = "TC14 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is valid && i >= length of 2-Dimensional Array)")
      public void scenario_14() {
            Assert.assertTrue(dataLoader(Array_4, str_5));
      }

      @Test(priority = 15,description = "TC15 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j is valid)")
      public void scenario_15() {
            Assert.assertTrue(dataLoader(Array_4, str_6));
      }

      @Test(priority = 16,description = "TC16 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j is valid and j > length of 2-Dimensional Array[i])")
      public void scenario_16() {
            Assert.assertTrue(dataLoader(Array_4, str_7));
      }

      @Test(priority = 17,description = "TC17 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is invalid)")
      public void scenario_17() {
            Assert.assertTrue(dataLoader(Array_4, str_8));
      }

      @Test(priority = 18,description = "TC18 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and j is invalid)")
      public void scenario_18() {
            Assert.assertTrue(dataLoader(Array_4, str_9));
      }

      @Test(priority = 19,description = "TC19 -- Test with 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j is invalid)")
      public void scenario_19() {
            Assert.assertTrue(dataLoader(Array_4, str_10));
      }



      // Test Cases Extend:
      @Test(priority = 20,description = "TC20 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i]} and i is valid & i >= length of 1-Dimensional Array)")
      public void scenario_20() {
            Assert.assertTrue(dataLoader(Array_1, str_3));
      }

      @Test(priority = 21,description = "TC21 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i]} and i is invalid)")
      public void scenario_21() {
            Assert.assertTrue(dataLoader(Array_1, str_4));
      }

      @Test(priority = 22,description = "TC22 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are invalid and i >= length of 1-Dimensional Array)")
      public void scenario_22() {
            Assert.assertTrue(dataLoader(Array_1, str_5));
      }

      @Test(priority = 23,description = "TC23 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are valid)")
      public void scenario_23() {
            Assert.assertTrue(dataLoader(Array_1, str_6));
      }

      @Test(priority = 24,description = "TC24 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are valid and j >= length of 1- Dimensional Array[i])")
      public void scenario_24() {
            Assert.assertTrue(dataLoader(Array_1, str_7));
      }

      @Test(priority = 25,description = "TC25 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is invalid and j is valid)")
      public void scenario_25() {
            Assert.assertTrue(dataLoader(Array_1, str_8));
      }

      @Test(priority = 26,description = "TC26 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is valid and j is invalid)")
      public void scenario_26() {
            Assert.assertTrue(dataLoader(Array_1, str_9));
      }

      @Test(priority = 27,description = "TC27 -- Test with Empty 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are invalid)")
      public void scenario_27() {
            Assert.assertTrue(dataLoader(Array_1, str_10));
      }

      @Test(priority = 28,description = "TC28 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i]} and i is valid)")
      public void scenario_28() {
            Assert.assertTrue(dataLoader(Array_2, str_2));
      }

      @Test(priority = 29,description = "TC29 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i]} and i is valid & i >= length of 2-Dimensional Array)")
      public void scenario_29() {
            Assert.assertTrue(dataLoader(Array_2, str_3));
      }

      @Test(priority = 30,description = "TC30 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i]} and i is invalid)")
      public void scenario_30() {
            Assert.assertTrue(dataLoader(Array_2, str_4));
      }

      @Test(priority = 31,description = "TC31 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are invalid and i >= length of 2-Dimensional Array)")
      public void scenario_31() {
            Assert.assertTrue(dataLoader(Array_2, str_5));
      }

      @Test(priority = 32,description = "TC32 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are valid and j >= length of 2- Dimensional Array[i])")
      public void scenario_32() {
            Assert.assertTrue(dataLoader(Array_2, str_7));
      }

      @Test(priority = 33,description = "TC33 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is invalid and j is valid)")
      public void scenario_33() {
            Assert.assertTrue(dataLoader(Array_2, str_8));
      }

      @Test(priority = 34,description = "TC34 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is valid and j is invalid)")
      public void scenario_34() {
            Assert.assertTrue(dataLoader(Array_2, str_9));
      }

      @Test(priority = 35,description = "TC35 -- Test with Empty 2-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are invalid)")
      public void scenario_35() {
            Assert.assertTrue(dataLoader(Array_2, str_10));
      }

      @Test(priority = 36,description = "TC36 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i >= length of 1-Dimensional Array)")
      public void scenario_36() {
            Assert.assertTrue(dataLoader(Array_3, str_5));
      }

      @Test(priority = 37,description = "TC37 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and j >= length of 1-Dimensional Array[i])")
      public void scenario_37() {
            Assert.assertTrue(dataLoader(Array_3, str_7));
      }

      @Test(priority = 38,description = "TC38 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is invalid & j is valid)")
      public void scenario_38() {
            Assert.assertTrue(dataLoader(Array_3, str_8));
      }

      @Test(priority = 39,description = "TC39 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i is valid & j is invalid)")
      public void scenario_39() {
            Assert.assertTrue(dataLoader(Array_3, str_9));
      }

      @Test(priority = 40,description = "TC40 -- Test with 1-Dimensional Array and Correct String (String contains ${_getData[i][j]} and i & j are invalid)")
      public void scenario_40() {
            Assert.assertTrue(dataLoader(Array_3, str_10));
      }


      /************************************* */
      @AfterClass
      public static void end_testing() {
            System.out.println("End Testing...");
      }
}
