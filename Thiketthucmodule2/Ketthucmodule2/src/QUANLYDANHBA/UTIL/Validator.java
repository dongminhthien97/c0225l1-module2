package QUANLYDANHBA.UTIL;

import QUANLYDANHBA.Enity.DanhBa;

public class Validator {
    public static boolean checkTel(String tel) {
        String regexTel = "^[1-9]\\d{2}\\s\\d{3}\\s\\d{4}";
        return tel.matches(regexTel);
    }

    public static boolean checkEmail(String email) {
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regexEmail);
    }

}
