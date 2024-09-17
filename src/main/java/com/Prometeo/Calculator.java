package com.Prometeo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public void startNumber() {
        String text = "“El próximo día 21/05/2019 se celebrará desde las 14 a las 15:30 horas el congreso de …";
        getNumber(text);
    }

    public List<Integer> getNumber(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        List<Integer> numbers = new ArrayList<>();

        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }

        int[] numArray = numbers.stream().mapToInt(i -> i).toArray();
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int num : numArray) {
            numberList.add(num);
        }
        return numberList;
    }
}
