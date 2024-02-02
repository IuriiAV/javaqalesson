package com.qatelran.org.lessonfifteen.TestIp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIp {

    public static void main(String[] args) {
        // A.B.C.D  - A,B,C,D - 0 - 255
        // 127.0.0.1, 127.158.10.1
        // 192.168.0.100
        // 192.15.50.145
        // 194.001.002.4

        String ip1 = "000.14.22.123";
        System.out.println("" + ip1 + " is valid = " + isValidIPAddress(ip1));

        String ip2 = "0.0.0.0";
        System.out.println("" + ip2 + " is valid = " + isValidIPAddress(ip2));

        String ip3 = "00.1.23.23.23";
        System.out.println("" + ip3 + " is valid = " + isValidIPAddress(ip3));

        String ip4 = "i.am.not.an.ip";
        System.out.println("" + ip4 + " is valid = " + isValidIPAddress(ip4));
    }

    public static boolean isValidIPAddress(String ip) {
        // \\d - [0-9]
        // \\d{1,2} - handle one or two digits number
        // (0|1)\\d{2} - handle any three digits number starts with 0 or 1
        // 2[0-4]\\d - handle any numbers from 200-249
        // 25[0-5]  - handle any numbers from 250-255

        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
