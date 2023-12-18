package ua.hillel.shutko.homework.homework7.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {

    List<Recording> listRecording = new ArrayList<>();

    public List<Recording> getListRecording() {
        return listRecording;
    }

    public void add(Recording newSubscriber) {
        listRecording.add(newSubscriber);
    }

    public void find(String name) {
        for (Recording r : listRecording) {
            if (r.equals(name)) {
                System.out.println(r);
                break;
            }
        }
        System.out.println("null");
    }
}
