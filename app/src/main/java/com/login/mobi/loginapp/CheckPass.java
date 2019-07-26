package com.login.mobi.loginapp;

import java.util.regex.Pattern;

public class CheckPass {
    public static boolean checknow(String data){
        if (!checkLong(data)) return false;
        else if (!checkCharacter(data)) return false;
        else if (!checkOtherCharacter(data))return false;
        else if (!hasNumber(data)) return false;
        else if (!hasLowerCase(data)) return false;
        else if (!hasUpperCase(data)) return false;
        else return true;
    }

    private static boolean checkOtherCharacter(String password) {
        return !password.matches("[@$!%*?&]");
    }

    private static boolean checkCharacter(String password) {
            return !password.matches("[A-Za-z0-9 ]*");
    }

    private static boolean checkLong(String data) {
        if (data.length() >= 6) return true;
        else return false;
    }
    private static boolean hasUpperCase(String password) {
        return !password.equals(password.toLowerCase());
    }

    private static boolean hasLowerCase(String password) {
        return !password.equals(password.toUpperCase());
    }
    private static boolean hasNumber(String password) {
        String regex = "(.)*(\\d)(.)*";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(password).matches();
    }

}
