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

      // @Before
      // public void start_testing() {
      //       System.out.println("Start Testing...");
      // }


      /************************************* */
      @Test
      public void scenario_01() {
            Assert.assertTrue(dataLoader(Array_1, str_1, "01"));
      }

      @Test
      public void scenario_02() {
            Assert.assertTrue(dataLoader(Array_1, str_2,"02"));
      }

      @Test
      public void scenario_03() {
            Assert.assertTrue(dataLoader(Array_2, str_1, "03"));
      }

      @Test
      public void scenario_04() {
            Assert.assertTrue(dataLoader(Array_2, str_5, "04"));
      }

      @Test
      public void scenario_05() {
            Assert.assertTrue(dataLoader(Array_3, str_1, "05"));
      }

      @Test
      public void scenario_06() {
            Assert.assertTrue(dataLoader(Array_3, str_2, "06"));
      }

      @Test
      public void scenario_07() {
            Assert.assertTrue(dataLoader(Array_3, str_3, "07"));
      }

      @Test
      public void scenario_08() {
            Assert.assertTrue(dataLoader(Array_3, str_4, "08"));
      }

      @Test
      public void scenario_09() {
            Assert.assertTrue(dataLoader(Array_3, str_6, "09"));
      }

      @Test
      public void scenario_10() {
            Assert.assertTrue(dataLoader(Array_4, str_1, "10"));
      }

      @Test
      public void scenario_11() {
            Assert.assertTrue(dataLoader(Array_4, str_2, "11"));
      }

      @Test
      public void scenario_12() {
            Assert.assertTrue(dataLoader(Array_4, str_3, "12"));
      }

      @Test
      public void scenario_13() {
            Assert.assertTrue(dataLoader(Array_4, str_3, "13"));
      }

      @Test
      public void scenario_14() {
            Assert.assertTrue(dataLoader(Array_4, str_5, "14"));
      }

      @Test
      public void scenario_15() {
            Assert.assertTrue(dataLoader(Array_4, str_6, "15"));
      }

      @Test
      public void scenario_16() {
            Assert.assertTrue(dataLoader(Array_4, str_7, "16"));
      }

      @Test
      public void scenario_17() {
            Assert.assertTrue(dataLoader(Array_4, str_8, "17"));
      }

      @Test
      public void scenario_18() {
            Assert.assertTrue(dataLoader(Array_4, str_9, "18"));
      }

      @Test
      public void scenario_19() {
            Assert.assertTrue(dataLoader(Array_4, str_10, "19"));
      }



      // Test Cases Extend:
      @Test
      public void scenario_20() {
            Assert.assertTrue(dataLoader(Array_1, str_3, "20"));
      }

      @Test
      public void scenario_21() {
            Assert.assertTrue(dataLoader(Array_1, str_4, "21"));
      }

      @Test
      public void scenario_22() {
            Assert.assertTrue(dataLoader(Array_1, str_5, "22"));
      }

      @Test
      public void scenario_23() {
            Assert.assertTrue(dataLoader(Array_1, str_6, "23"));
      }

      @Test
      public void scenario_24() {
            Assert.assertTrue(dataLoader(Array_1, str_7, "24"));
      }

      @Test
      public void scenario_25() {
            Assert.assertTrue(dataLoader(Array_1, str_8, "25"));
      }

      @Test
      public void scenario_26() {
            Assert.assertTrue(dataLoader(Array_1, str_9, "26"));
      }

      @Test
      public void scenario_27() {
            Assert.assertTrue(dataLoader(Array_1, str_10, "27"));
      }

      @Test
      public void scenario_28() {
            Assert.assertTrue(dataLoader(Array_2, str_2, "28"));
      }

      @Test
      public void scenario_29() {
            Assert.assertTrue(dataLoader(Array_2, str_3, "29"));
      }

      @Test
      public void scenario_30() {
            Assert.assertTrue(dataLoader(Array_2, str_4, "30"));
      }

      @Test
      public void scenario_31() {
            Assert.assertTrue(dataLoader(Array_2, str_5, "31"));
      }

      @Test
      public void scenario_32() {
            Assert.assertTrue(dataLoader(Array_2, str_7, "32"));
      }

      @Test
      public void scenario_33() {
            Assert.assertTrue(dataLoader(Array_2, str_8, "33"));
      }

      @Test
      public void scenario_34() {
            Assert.assertTrue(dataLoader(Array_2, str_9, "34"));
      }

      @Test
      public void scenario_35() {
            Assert.assertTrue(dataLoader(Array_2, str_10, "35"));
      }

      @Test
      public void scenario_36() {
            Assert.assertTrue(dataLoader(Array_3, str_5, "36"));
      }

      @Test
      public void scenario_37() {
            Assert.assertTrue(dataLoader(Array_3, str_7, "37"));
      }

      @Test
      public void scenario_38() {
            Assert.assertTrue(dataLoader(Array_3, str_8, "38"));
      }

      @Test
      public void scenario_39() {
            Assert.assertTrue(dataLoader(Array_3, str_9, "39"));
      }

      @Test
      public void scenario_40() {
            Assert.assertTrue(dataLoader(Array_3, str_10, "40"));
      }

      

      // Test Cases for Multiple Correct Format in String:
      @Test
      public void scenario_41() {
            Assert.assertTrue(dataLoader(Array_3, str_11, "41"));
      }

      @Test
      public void scenario_42() {
            Assert.assertTrue(dataLoader(Array_3, str_12, "42"));
      }

      @Test
      public void scenario_43() {
            Assert.assertTrue(dataLoader(Array_3, str_13, "43"));
      }

      @Test
      public void scenario_44() {
            Assert.assertTrue(dataLoader(Array_3, str_14, "44"));
      }

      @Test
      public void scenario_45() {
            Assert.assertTrue(dataLoader(Array_3, str_15, "45"));
      }

      @Test
      public void scenario_46() {
            Assert.assertTrue(dataLoader(Array_3, str_16, "46"));
      }

      @Test
      public void scenario_47() {
            Assert.assertTrue(dataLoader(Array_3, str_17, "47"));
      }

      @Test
      public void scenario_48() {
            Assert.assertTrue(dataLoader(Array_3, str_18, "48"));
      }

      @Test
      public void scenario_49() {
            Assert.assertTrue(dataLoader(Array_3, str_19, "49"));
      }

      @Test
      public void scenario_50() {
            Assert.assertTrue(dataLoader(Array_3, str_20, "50"));
      }

      @Test
      public void scenario_51() {
            Assert.assertTrue(dataLoader(Array_3, str_21, "51"));
      }

      @Test
      public void scenario_52() {
            Assert.assertTrue(dataLoader(Array_3, str_22, "52"));
      }

      @Test
      public void scenario_53() {
            Assert.assertTrue(dataLoader(Array_3, str_23, "53"));
      }

      @Test
      public void scenario_54() {
            Assert.assertTrue(dataLoader(Array_3, str_24, "54"));
      }

      @Test
      public void scenario_55() {
            Assert.assertTrue(dataLoader(Array_3, str_25, "55"));
      }

      @Test
      public void scenario_56() {
            Assert.assertTrue(dataLoader(Array_3, str_26, "56"));
      }

      @Test
      public void scenario_57() {
            Assert.assertTrue(dataLoader(Array_4, str_11, "57"));
      }

      @Test
      public void scenario_58() {
            Assert.assertTrue(dataLoader(Array_4, str_12, "58"));
      }

      @Test
      public void scenario_59() {
            Assert.assertTrue(dataLoader(Array_4, str_13, "59"));
      }

      @Test
      public void scenario_60() {
            Assert.assertTrue(dataLoader(Array_4, str_14, "60"));
      }

      @Test
      public void scenario_61() {
            Assert.assertTrue(dataLoader(Array_4, str_15, "61"));
      }

      @Test
      public void scenario_62() {
            Assert.assertTrue(dataLoader(Array_4, str_16, "62"));
      }

      @Test
      public void scenario_63() {
            Assert.assertTrue(dataLoader(Array_4, str_17, "63"));
      }

      @Test
      public void scenario_64() {
            Assert.assertTrue(dataLoader(Array_4, str_18, "64"));
      }

      @Test
      public void scenario_65() {
            Assert.assertTrue(dataLoader(Array_4, str_19, "65"));
      }

      @Test
      public void scenario_66() {
            Assert.assertTrue(dataLoader(Array_4, str_20, "66"));
      }

      @Test
      public void scenario_67() {
            Assert.assertTrue(dataLoader(Array_4, str_21, "67"));
      }

      @Test
      public void scenario_68() {
            Assert.assertTrue(dataLoader(Array_4, str_22, "68"));
      }

      @Test
      public void scenario_69() {
            Assert.assertTrue(dataLoader(Array_4, str_23, "69"));
      }

      @Test
      public void scenario_70() {
            Assert.assertTrue(dataLoader(Array_4, str_24, "70"));
      }

      @Test
      public void scenario_71() {
            Assert.assertTrue(dataLoader(Array_4, str_25, "71"));
      }

      @Test
      public void scenario_72() {
            Assert.assertTrue(dataLoader(Array_4, str_26, "72"));
      }




      /************************************* */
      @AfterClass
      public static void end_testing() {
            System.out.println("End Testing...");
      }
}
