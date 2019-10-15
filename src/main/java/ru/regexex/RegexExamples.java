package ru.regexex;

public class RegexExamples {

    public static String fileNameRegWithStar = "K-44365-EAS-OMS-PP-*.txt";
    public static String fileNameReg = "K-44365-EAS-OMS-PP-*.pdf";


    public static String [] arrStringReg = {"K-44365-EAS-OMS-PP-091019.pdf", "K-44365-EAS-OMS-PP-091019.pdf"};


    public static void main(String[] args) {

        System.out.println(findExpr(fileNameReg));
    }


    public static boolean findExpr(String expression) {

       boolean result = false;

       if(expression.contains("*")) {

           int starPosition = expression.indexOf("*");
           System.out.println(starPosition);
           String[] segments = expression.split("\\*");
           //System.out.println(segments[0]);
           //System.out.println(segments[1]);

           String regExTofind = "^" + segments[0] + ".+" + segments[1] + "$" ;
           System.out.println(regExTofind);

           System.out.println("Все пучком - " + arrStringReg[1].matches(regExTofind));

       }else {
           for (String el: arrStringReg) {
               if(el.contains(fileNameReg)) {
                   System.out.println(el);
                   result = true;
               }
           }
       }


       return result;
   }







}
