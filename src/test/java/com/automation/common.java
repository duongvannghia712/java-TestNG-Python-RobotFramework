package com.automation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class common implements commonMethodString, commonMethodObject {
      public static String str_1 = "Wrong String Format";
      public static String str_2 = "Start getData ${_getData[1]}...";
      public static String str_3 = "Start getData ${_getData[6]}...";
      public static String str_4 = "Start getData ${_getData[a%c]}...";
      public static String str_5 = "Start getData ${_getData[4][2]}.....";
      public static String str_6 = "Start getData ${_getData[1][2]}.....";
      public static String str_7 = "Start getData ${_getData[0][3]}.....";
      public static String str_8 = "Start getData ${_getData[1%c][2]}.....";
      public static String str_9 = "Start getData ${_getData[0][wrong index]}.....";
      public static String str_10 = "Start getData ${_getData[a%3][wrong index]}.....";

      public static String [] Array_1 = {};
      public static String [][] Array_2 = {};
      public static String [] Array_3 = {"1D_Value1", "1D_Value2", "1D_Value3", "1D_Value4", "1D_Value5"};
      public static String [][] Array_4 = {{"2D_1_Value1", "2D_1_Value2"}, {"2D_2_Value1", "2D_2_Value2", "2D_2_Value3"}, {"2D_3_Value1", "2D_3_Value2", "2D_3_Value3", "2D_3_Value4", "2D_3_Value5"}};
      

      public boolean dataLoader(Object Array, String str){
            int typeArray = checkTypeOfArray(Array);
            if (typeArray == 0){
                  return false;
                  }

            else if (typeArray == 1){
                  String [] check = (String []) Array;
                  List checkString = checkString(str);
                  if (checkString.size() == 0){
                        return false;
                  }
                  else if (checkString.size() == 2){
                        return false;
                  }
                  else{
                        int index = (int) checkString.get(0);
                        System.out.println(check[index]);
                        return true;
                  }
            }
      
            else{
                  String [][] check = (String [][]) Array;
                  List checkString = checkString(str);
                  if (checkString.size() == 0){
                        return false;
                  }
                  else if (checkString.size() == 1){
                        int index_i = (int) checkString.get(0);
                        System.out.println(Arrays.toString(check[index_i]));
                        return true;
                  }
                  else{
                        int index_i = (int) checkString.get(0);
                        int index_j = (int) checkString.get(1);
                        if (index_i < check.length && index_j < check[index_i].length){
                              System.out.println(check[index_i][index_j]);
                              return true;
                        }
                        else{
                              return false;
                        }
                  }
            }
      }


      
      @Override
      public int checkTypeOfArray(Object array) {
            int result = 0;
            try{ 
                  String [] check = (String []) array;
                  if (check.length == 0){
                  result = 0;
                  // System.out.println("Empty 1-Dimensional Array...");
                  }
                  else{
                  result = 1;
                  // System.out.println("1-Dimensional Array...");
                  }
            }

            catch (Exception e){
                  String [][] check = (String [][]) array;
                  if (check.length == 0){
                  result = 0;
                  // System.out.println("Empty 2-Dimensional Array...");
                  }
                  else{
                  result = 2;
                  // System.out.println("2-Dimensional Array...");
                  }
            }
            return result;
      }



      @Override
      public List checkString(String str) {
            String check_1 = "${_getData[";
            String check_2 = "][";
            String check_3 = "]}";
            int result1D;
            int result2D_1;
            int result2D_2;
            List<Integer> result = new ArrayList<>();;
            if (str.contains(check_1) == true && str.contains(check_3)) {
                  String indexArray1D = str.substring(str.indexOf(check_1) + check_1.length(), str.indexOf(check_3));
                  if (isInteger(indexArray1D) == true){
                  result1D = Integer.parseInt(indexArray1D);
                  result.add(result1D);
                  }
            }
            if (str.contains(check_1) == true && str.contains(check_2) && str.contains(check_3)) {
                  String indexArray2D_1 = str.substring(str.indexOf(check_1) + check_1.length(), str.indexOf(check_2));
                  String indexArray2D_2 = str.substring(str.indexOf(check_2) + check_2.length(), str.indexOf(check_3));
                  if (isInteger(indexArray2D_1) == true && isInteger(indexArray2D_2) == true){
                  result2D_1 = Integer.parseInt(indexArray2D_1);
                  result2D_2 = Integer.parseInt(indexArray2D_2);
                  result.add(result2D_1);
                  result.add(result2D_2);
                  }
            }
            return result;
      }



      @Override
      public boolean isInteger(String str) {
            if(str == null || str.equals("")) {
                  // System.out.println("Empty string...");
                  return false;
            }
            try {
                  int iVal = Integer.parseInt(str);
                  return true;
            }
            catch(NumberFormatException e) {
                  // System.out.println("The string is not an integer...");
            }
            return false;
      }
}

