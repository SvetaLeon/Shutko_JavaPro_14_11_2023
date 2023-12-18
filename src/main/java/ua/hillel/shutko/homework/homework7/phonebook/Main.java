package ua.hillel.shutko.homework.homework7.phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add(new Recording("Oleg", "0685783855"));
        telephoneDirectory.add(new Recording("Sveta", "0665784955"));
        telephoneDirectory.add(new Recording("Oleg", "0444444855"));
        telephoneDirectory.add(new Recording("Tom", "0785555855"));
        telephoneDirectory.find("Sveta");
        System.out.println(telephoneDirectory.getListRecording());
    }
}
