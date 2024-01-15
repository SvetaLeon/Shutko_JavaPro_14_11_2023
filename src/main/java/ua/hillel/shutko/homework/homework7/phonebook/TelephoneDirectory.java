package ua.hillel.shutko.homework.homework7.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {

    List<Recording> listRecording = new ArrayList<>();

    public void add(Recording newSubscriber) {
        listRecording.add(newSubscriber);
    }

    public void find(String name) {
        List<Recording> result = new ArrayList<>();
        for (Recording r : listRecording) {
            if (r.getName().equals(name)) {
                result.add(r);
                System.out.println(r.getName() + " " + r.getPhone());
                break;
            }
        }
        if (result.isEmpty()) {
            System.out.println("null");
        }
    }

    public void findAll(String name) {
        List<Recording> result = new ArrayList<>();
        for (Recording r : listRecording) {
            if (r.getName().equals(name)) {
                result.add(r);
                System.out.println(r.getName() + " " + r.getPhone());
            }
        }
        if (result.isEmpty()) {
            System.out.println("null");
        }
    }
}