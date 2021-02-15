package com.company;


import javax.swing.*;

public class Validator {

    public static final int PASSWORD_LENGTH = 8;

    public static boolean checkAge(int age){
        if(age > 17){
//            JOptionPane.showMessageDialog(null, "Все ок");
            return true;
        }

        else{
//            JOptionPane.showMessageDialog(null, "Возраст меньше 18!");
            return false;
        }

    }


    public static boolean checkPassword(String password){

        String regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@^$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if(password.matches(regexp)){
            System.out.println("Password matches!");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Password does not match!");
            return false;
        }
    }

    /**
     * asdfasdfasdfasdfsadfsadfsad
     * adsfasdfasdfasdfas
     * asdfasdfasdf
     * */
    public static boolean checkDate(String date){
        // initial value date = "1a/02/1992"
        String[] splittedDate = date.split("/");
        // splittedDate[0] = 1a, splittedDate[1] = 02, splittedDate[2] = 1992
        if(splittedDate.length == 3){
            if(isDigit(splittedDate)){
                // some code
                // проверка на корректность даты (проверка на високосный год)
                return true;
            }
            else
                return false;


        }
        else
            return false;
    }

//    private static boolean isCorrectLengthDate(String str, int length){
//
//    }
    //   1a/02/1992
    private static boolean isDigit(String[] splittedDate){
        // some code here
        return true;
    }


}
