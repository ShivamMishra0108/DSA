package Bit;

import java.util.Collections;

class AddBinary {
    public String addBinary(String a, String b) {

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            if (sum == 0) {
                ans.append('0');
                carry = 0;
            } else if (sum == 1) {
                ans.append('1');
                carry = 0;
            } else if (sum == 2) {
                ans.append('0');
                carry = 1;
            } else { // sum == 3
                ans.append('1');
                carry = 1;
            }
        }

        return ans.reverse().toString();
    }
}