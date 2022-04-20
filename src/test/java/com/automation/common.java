package com.automation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class common implements commonMethodString, commonMethodObject {
      public static String str_1 = "Wrong String Format";
      public static String str_2 = "Start getData ${_getData[2]} ${_getData[1]}...";
      public static String str_3 = "Start getData ${_getData[6]}...";
      public static String str_4 = "Start getData ${_getData[a%c]}...";
      public static String str_5 = "Start getData ${_getData[4][2]}.....";
      public static String str_6 = "Start getData ${_getData[1][2]}.....";
      public static String str_7 = "Start getData ${_getData[0][3]}.....";
      public static String str_8 = "Start getData ${_getData[1%c][2]}.....";
      public static String str_9 = "Start getData ${_getData[0][wrong index]}.....";
      public static String str_10 = "Start getData ${_getData[a%3][wrong index]}.....";
      public static String str_11 = "Start getData ${_getData[0]} and ${_getData[1]}.....";
      public static String str_12 = "Start getData ${_getData[0]} and ${_getData[10]}.....";
      public static String str_13 = "Start getData ${_getData[0]} and ${_getData[1*ac]}.....";
      public static String str_14 = "Start getData ${_getData[10]} and ${_getData[1*ac]}.....";
      public static String str_15 = "Start getData ${_getData[0][0]} and ${_getData[1][0]}.....";
      public static String str_16 = "Start getData ${_getData[0][0]} and ${_getData[10][0]}.....";
      public static String str_17 = "Start getData ${_getData[0][0]} and ${_getData[1][10]}.....";
      public static String str_18 = "Start getData ${_getData[0][0]} and ${_getData[a*c][12a]}.....";
      public static String str_19 = "Start getData ${_getData[10][10]} and ${_getData[a*c][12a]}.....";
      public static String str_20 = "Start getData ${_getData[0]} and ${_getData[1][1]}.....";
      public static String str_21 = "Start getData ${_getData[10]} and ${_getData[1][1]}.....";
      public static String str_22 = "Start getData ${_getData[0]} and ${_getData[10][1]}.....";
      public static String str_23 = "Start getData ${_getData[0]} and ${_getData[1][10]}.....";
      public static String str_24 = "Start getData ${_getData[abc]} and ${_getData[1][1]}.....";
      public static String str_25 = "Start getData ${_getData[abc]} and ${_getData[1%wr][wr]}.....";
      public static String str_26 = "Start getData ${_getData[1]} and ${_getData[0][1]}, ${_getData[2]}, ${_getData[0]} and ${_getData[2][1]}.....";


      public static String [] Array_1 = {};
      public static String [][] Array_2 = {};
      public static String [] Array_3 = {"1D_Value1", "1D_Value2", "1D_Value3", "1D_Value4", "1D_Value5"};
      public static String [][] Array_4 = {{"2D_1_Value1", "2D_1_Value2"}, {"2D_2_Value1", "2D_2_Value2", "2D_2_Value3"}, {"2D_3_Value1", "2D_3_Value2", "2D_3_Value3", "2D_3_Value4", "2D_3_Value5"}};
      

      public boolean dataLoader(Object Array, String str, String TC){
            System.out.println("\nStart run Test Case " + TC);
            int typeArray = checkTypeOfArray(Array);
            List<List> checkString = checkString(str);
            List<List> index_Array_1D = new ArrayList<>();
            int count = 0;
            for(List check : checkString){
                  if (check.size() == 1){
                        index_Array_1D.add(check);
                  }
            }
            
            if (typeArray == 0){
                  System.out.println("- Return String: " + str);
                  return false;
            }
            
            if (checkString.size() == 0){
                  System.out.println("- Return String: " + str);
                  return false;
            }

            else if (typeArray == 1){
                  String [] check_Array = (String []) Array;
                  if (index_Array_1D.size() == 0){
                        System.out.println("- Return String: " + str);
                        return false;
                  }
                  else{
                        for (List index : index_Array_1D){
                              int index_1D = (int) index.get(0);
                              if(index_1D < check_Array.length){
                                    count += 1;
                                    System.out.println("\t+ ([]Array) Return value " + Integer.toString(count) +" : " + check_Array[index_1D]);
                              }
                        }
                        if (count == 0){
                              System.out.println("- Return String: " + str);
                              return false;
                        }
                        else{
                              return true;
                        } 
                  }
            }
            
            else{
                  String [][] check_Array = (String [][]) Array;
                  if (checkString.size() == 0){
                        return false;
                  }
                  else{
                        for (List index : checkString){
                              if (index.size() == 1){
                                    int index_1D = (int) index.get(0);
                                    if(index_1D < check_Array.length){
                                          count += 1;
                                          System.out.println("\t+ ([][]Array) Return value " + Integer.toString(count) +" : " + Arrays.toString(check_Array[index_1D]));
                                    }
                              }
                              else if (index.size() == 2){
                                    int index_2D_1 = (int) index.get(0);
                                    int index_2D_2 = (int) index.get(1);
                                    if(index_2D_1 < check_Array.length && index_2D_2 < check_Array[index_2D_1].length){
                                          count += 1;
                                          System.out.println("\t+ ([][]Array) Return value " + Integer.toString(count) +" : " + check_Array[index_2D_1][index_2D_2]);
                                    }
                              }
                        }
                        if (count == 0){
                              System.out.println("- Return String: " + str);
                              return false;
                        }
                        else{
                              return true;
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
            String first_str = "";
            int result1D;
            int result2D_1;
            int result2D_2;
            List<Integer> result_Array_1D = new ArrayList<>();
            List<Integer> result_Array_2D = new ArrayList<>();
            List<List> result = new ArrayList<>();
            while(true){
                  if (str.length() < 14){
                        break;
                  }
                  else{
                        if (str.contains(check_3) == true) {
                              first_str = str.substring(0, str.indexOf(check_3) + check_3.length());
                              str = str.substring(str.indexOf(check_3) + check_3.length(), str.length());
                        }

                        if (first_str.contains(check_1) == true && first_str.contains(check_2) && first_str.contains(check_3)) {
                              String indexArray2D_1 = first_str.substring(first_str.indexOf(check_1) + check_1.length(), first_str.indexOf(check_2));
                              String indexArray2D_2 = first_str.substring(first_str.indexOf(check_2) + check_2.length(), first_str.indexOf(check_3));
                              if (isInteger(indexArray2D_1) == true && isInteger(indexArray2D_2) == true){
                                    result2D_1 = Integer.parseInt(indexArray2D_1);
                                    result2D_2 = Integer.parseInt(indexArray2D_2);
                                    result_Array_2D.add(result2D_1);
                                    result_Array_2D.add(result2D_2);
                              }
                              if (result_Array_2D.size() > 0){
                                    result.add(result_Array_2D);
                                    result_Array_2D = new ArrayList<>();
                              }
                        }

                        else if (first_str.contains(check_1) == true && first_str.contains(check_3)) {
                              String indexArray1D = first_str.substring(first_str.indexOf(check_1) + check_1.length(), first_str.indexOf(check_3));
                              if (isInteger(indexArray1D) == true){
                                    result1D = Integer.parseInt(indexArray1D);
                                    result_Array_1D.add(result1D);
                              }
                              if (result_Array_1D.size() > 0){
                                    result.add(result_Array_1D);
                                    result_Array_1D = new ArrayList<>();
                              }
                        }

                        else{
                              break;
                        }
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

