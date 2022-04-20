package com.automation;

import java.util.Arrays;

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
            Assert.assertTrue("String: " + str_1 + " and Array: " + Arrays.toString(Array_1), dataLoader(Array_1, str_2));
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


      // Test Cases for Multiple Correct Format in String:
      @Test(priority = 41,description = "TC41 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, both are valid)")
      public void scenario_41() {
            Assert.assertTrue(dataLoader(Array_3, str_11));
      }

      @Test(priority = 42,description = "TC42 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, 1 is valid and 1 have i > len(1D Array))")
      public void scenario_42() {
            Assert.assertTrue(dataLoader(Array_3, str_12));
      }

      @Test(priority = 43,description = "TC43 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, 1 is valid and 1 is invalid)")
      public void scenario_43() {
            Assert.assertTrue(dataLoader(Array_3, str_13));
      }

      @Test(priority = 44,description = "TC44 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, 1 > len(1D Array) and 1 is invalid)")
      public void scenario_44() {
            Assert.assertTrue(dataLoader(Array_3, str_14));
      }

      @Test(priority = 45,description = "TC45 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, both are valid)")
      public void scenario_45() {
            Assert.assertTrue(dataLoader(Array_3, str_15));
      }

      @Test(priority = 46,description = "TC46 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 is valid and 1 have i > len(Array))")
      public void scenario_46() {
            Assert.assertTrue(dataLoader(Array_3, str_16));
      }

      @Test(priority = 47,description = "TC47 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 is valid and 1 have j > len(Array[i]))")
      public void scenario_47() {
            Assert.assertTrue(dataLoader(Array_3, str_17));
      }

      @Test(priority = 48,description = "TC48 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 is valid and is invalid)")
      public void scenario_48() {
            Assert.assertTrue(dataLoader(Array_3, str_18));
      }

      @Test(priority = 49,description = "TC49 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 have i and j >  len(Array) and is invalid)")
      public void scenario_49() {
            Assert.assertTrue(dataLoader(Array_3, str_19));
      }

      @Test(priority = 50,description = "TC50 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, both are valid)")
      public void scenario_50() {
            Assert.assertTrue(dataLoader(Array_3, str_20));
      }

      @Test(priority = 51,description = "TC51 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 have i > len(1D Array) and 1 is valid)")
      public void scenario_51() {
            Assert.assertTrue(dataLoader(Array_3, str_21));
      }

      @Test(priority = 52,description = "TC52 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 is valid and 1 have i > len(2D Array)")
      public void scenario_52() {
            Assert.assertTrue(dataLoader(Array_3, str_22));
      }

      @Test(priority = 53,description = "TC53 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 is valid and 1 have j > len(2D Array[i])")
      public void scenario_53() {
            Assert.assertTrue(dataLoader(Array_3, str_23));
      }

      @Test(priority = 54,description = "TC54 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 is invalid and 1 is valid)")
      public void scenario_54() {
            Assert.assertTrue(dataLoader(Array_3, str_24));
      }

      @Test(priority = 55,description = "TC55 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, both are invalid)")
      public void scenario_55() {
            Assert.assertTrue(dataLoader(Array_3, str_25));
      }

      @Test(priority = 56,description = "TC56 -- Test with 1-Dimensional Array and 2 Correct Format in String (Get 3 data of 1D Array and get 2 data of 2D Array, all are valid)")
      public void scenario_56() {
            Assert.assertTrue(dataLoader(Array_3, str_26));
      }

      @Test(priority = 57,description = "TC57 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, both are valid)")
      public void scenario_57() {
            Assert.assertTrue(dataLoader(Array_4, str_11));
      }

      @Test(priority = 58,description = "TC58 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, 1 is valid and 1 > len(1D Array))")
      public void scenario_58() {
            Assert.assertTrue(dataLoader(Array_4, str_12));
      }

      @Test(priority = 59,description = "TC59 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, 1 is valid and 1 is invalid)")
      public void scenario_59() {
            Assert.assertTrue(dataLoader(Array_4, str_13));
      }

      @Test(priority = 60,description = "TC60 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 1D Array, 1 > len(1D Array) and 1 is invalid)")
      public void scenario_60() {
            Assert.assertTrue(dataLoader(Array_4, str_14));
      }

      @Test(priority = 61,description = "TC61 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, both are valid)")
      public void scenario_61() {
            Assert.assertTrue(dataLoader(Array_4, str_15));
      }

      @Test(priority = 62,description = "TC62 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 is valid and 1 have i > len(Array))")
      public void scenario_62() {
            Assert.assertTrue(dataLoader(Array_4, str_16));
      }

      @Test(priority = 63,description = "TC63 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 is valid and 1 have j > len(Array[i]))")
      public void scenario_63() {
            Assert.assertTrue(dataLoader(Array_4, str_17));
      }

      @Test(priority = 64,description = "TC64 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 is valid and is invalid)")
      public void scenario_64() {
            Assert.assertTrue(dataLoader(Array_4, str_18));
      }

      @Test(priority = 65,description = "TC65 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 2 data of 2D Array, 1 have i and j >  len(Array) and is invalid)")
      public void scenario_65() {
            Assert.assertTrue(dataLoader(Array_4, str_19));
      }

      @Test(priority = 66,description = "TC66 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, both are valid)")
      public void scenario_66() {
            Assert.assertTrue(dataLoader(Array_4, str_20));
      }

      @Test(priority = 67,description = "TC67 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 have i > len(2D Array) and 1 is valid)")
      public void scenario_67() {
            Assert.assertTrue(dataLoader(Array_4, str_21));
      }

      @Test(priority = 68,description = "TC68 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 is valid and 1 have i > len(2D Array)")
      public void scenario_68() {
            Assert.assertTrue(dataLoader(Array_4, str_22));
      }

      @Test(priority = 69,description = "TC69 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 is valid and 1 have j > len(2D Array[i])")
      public void scenario_69() {
            Assert.assertTrue(dataLoader(Array_4, str_23));
      }

      @Test(priority = 70,description = "TC70 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, 1 is invalid and 1 is valid)")
      public void scenario_70() {
            Assert.assertTrue(dataLoader(Array_4, str_24));
      }

      @Test(priority = 71,description = "TC71 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 1 data of 1D Array and get 1 data of 2D Array, both are invalid)")
      public void scenario_71() {
            Assert.assertTrue(dataLoader(Array_4, str_25));
      }

      @Test(priority = 72,description = "TC72 -- Test with 2-Dimensional Array and 2 Correct Format in String (Get 3 data of 1D Array and get 2 data of 2D Array, all are valid)")
      public void scenario_72() {
            Assert.assertTrue(dataLoader(Array_4, str_26));
      }



      /************************************* */
      @AfterClass
      public static void end_testing() {
            System.out.println("End Testing...");
      }
}
