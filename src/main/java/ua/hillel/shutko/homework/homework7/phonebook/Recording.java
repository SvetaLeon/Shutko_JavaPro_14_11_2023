package ua.hillel.shutko.homework.homework7.phonebook;

public class Recording {
    private final String name;
    private final String phone;

    public Recording(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
