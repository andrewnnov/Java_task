package ru.regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static String fileNameRegWithStar = "K-44365-EAS-OMS-PP-*.txt";
    public static String fileNameReg = "K-44365-EAS-OMS-PP-*.log";


    public static String [] arrStringReg = {"K-44365-EAS-OMS-PP-091019.pdf","K-44365-EAS-OMS-PP-091019.pdf\nK-44365-EAS-OMS-PP-091018.log\nK-44365-EAS-OMS-PP-091018.txt\nK-44365-EAS-OMS-PP-091019.log"};
    //public static String outStr = "K-44365-EAS-OMS-PP-091019.pdf\nK-44365-EAS-OMS-PP-091019.log\nK-44365-EAS-OMS-PP-091018.txt\nK-44365-EAS-OMS-PP-091019.log";


    public static void main(String[] args) {

        System.out.println(findExpr(fileNameReg));
    }


    public static boolean findExpr(String expression) {

       boolean result = false;
       String newExp = null;

       if(expression.contains("*")) {

//           if(expression.contains(".")) {//
//               int indexPoint = expression.indexOf(".");
//               newExp = expression.substring(0, indexPoint) + expression.substring(indexPoint+1, expression.length());
//               System.out.println(newExp);
//           }

           //int starPosition = expression.indexOf("*");
           //System.out.println(starPosition);
           String[] segments = expression.split("\\*");
           //System.out.println(segments[0]);
           //System.out.println(segments[1]);

           String regExTofind = "^" + segments[0] + ".+" + segments[1] + "$" ;
           System.out.println(regExTofind);

           Pattern p = Pattern.compile(regExTofind, Pattern.MULTILINE);
           Matcher m = p.matcher(arrStringReg[1]);

           while (m.find()) {
               System.out.println( m.start() + " " + m.group());
           }

           if(m.find()) {
               result = true;
           }

       }else {
           if(arrStringReg[1].contains(expression)) {
               result = true;
           }
       }


       return result;
   }







}
