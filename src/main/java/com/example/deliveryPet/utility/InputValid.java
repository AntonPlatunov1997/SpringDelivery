package com.example.deliveryPet.utility;

import org.springframework.stereotype.Component;

@Component
public class InputValid {

    public  boolean isValidEmail(String email){

        final String regex = "^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;" +

                ":\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\." +

                "[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";



        java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);

        java.util.regex.Matcher m = p.matcher(email);

        return m.matches();

    }



    public  boolean isValidPassword(String password) {

        final String regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,15}";

        java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);

        java.util.regex.Matcher m = p.matcher(password);

        return m.matches();

    }





    public   boolean isValidDate(String date){

        final String regex = "^[0-9]{4}-(((0[13578]|(10|12))-(0[1-9]|[1-2][0-9]|3[0-1]))|(02-(0[1-9]|[1-2][0-9]))|((0[469]|11)-(0[1-9]|[1-2][0-9]|30)))$";

        java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);

        java.util.regex.Matcher m = p.matcher(date);

        return m.matches();





    }



    public   boolean isValidWeight(String weight){

        final String regex = "[1-9]|10";

        java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);

        java.util.regex.Matcher m = p.matcher(weight);

        return m.matches();

    }





    public    boolean isValidWeight(int weight){

        if (0<weight && weight<=10){

            return true;

        }

        return false;

    }






    public  boolean isValidID(int id){

        if (id<=0){

            return false;

        }

        return true;

    }




}
