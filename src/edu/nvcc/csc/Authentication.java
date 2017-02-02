package edu.nvcc.csc;

/**
 * Created by tkanc on 2/1/2017.
 */
public class Authentication {
    public static boolean authen(String uname, String pw) {
        boolean status = false;
        if(uname.equals("test") && pw.equals("pw")) {
            status = true;
        }
        return status;
    }
}
