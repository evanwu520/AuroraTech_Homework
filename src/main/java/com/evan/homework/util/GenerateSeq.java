package com.evan.homework.util;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class GenerateSeq {



    public static String genShoeSeq(long seq){

        String key = "EFGH";


        int days = new DateTime().getDayOfMonth();

        String id =  String.format("%03d", seq) + key;

        if (days % 2 == 0) {
            id =  String.format("%04d", seq) + key;
        }

        return id;


    }

    public static String genBoxSeq(long seq){

        String key = "ABCD";

        int days = new DateTime().getDayOfMonth();

        String id =  String.format("%03d", seq) + key;

        if (days % 2 == 0) {
            id =  String.format("%04d", seq) + key;
        }
        return id;

    }

    public static String genCombineSeq(String boxSeq , String shoesSeq){

        String shoesKey = "";
        String boxKey = "";

        if (shoesSeq.length() == 7){
            shoesKey = shoesSeq.substring(1);
        } else {
            shoesKey = shoesSeq.substring(1, shoesSeq.length()-1);
        }

        if (boxSeq.length() == 7){
            boxKey = boxSeq.substring(1);
        } else {
            boxKey = boxSeq.substring(1, boxSeq.length()-1);
        }


        return boxKey+"-"+shoesKey;
    }




}
