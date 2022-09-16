package RomanToInt;

class Solution {
    public int romanToInt(String roman_string) {
        int len = roman_string.length();
        int num_value = 0;
        for (int i = 0; i < len; i++) {
            char ch = roman_string.charAt(i);
            int current = getValue(ch);
            if (i < len - 1 && current < getValue(roman_string.charAt(i + 1))) {
                num_value -= current;
            } else {
                num_value += current;
            }
        }
        return num_value;
    }

    private int getValue(char ch) {
        int ans = 0;
        switch (ch) {
            case 'I':
                ans = 1;
                break;

            case 'V':
                ans = 5;
                break;

            case 'X':
                ans = 10;
                break;

            case 'L':
                ans = 50;
                break;

            case 'C':
                ans = 100;
                break;

            case 'D':
                ans = 500;
                break;

            case 'M':
                ans = 1000;
                break;

            default:
                break;
        }
        return ans;
    }

}