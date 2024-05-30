package com.conversor.domain;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToDecimal(String roman) {
        int result = 0;
        int length = roman.length();

        for (int i = 0; i < length; i++) {
            int current = romanMap.get(roman.charAt(i));
            int next = i + 1 < length ? romanMap.get(roman.charAt(i + 1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}