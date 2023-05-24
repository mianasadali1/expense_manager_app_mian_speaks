package com.example.emanager.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
        return dateFormat.format(date);
    }

    public static String formatDateByMonth(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM, yyyy");
        return dateFormat.format(date);
    }


}
