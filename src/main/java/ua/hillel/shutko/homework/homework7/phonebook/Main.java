package ua.hillel.shutko.homework.homework7.phonebook;

public class Main {
    public static void main(String[] args) {

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add(new Recording("Oleg", "0631113855"));
        telephoneDirectory.add(new Recording("Maxim", "0937595444"));
        telephoneDirectory.add(new Recording("Alice", "0665994333"));
        telephoneDirectory.add(new Recording("Oleg", "0504444111"));
        telephoneDirectory.add(new Recording("Eva", "0567777666"));
        telephoneDirectory.add(new Recording("Igor", "0663335444"));
        telephoneDirectory.add(new Recording("Maxim", "0985555999"));
        telephoneDirectory.add(new Recording("Maxim", "0986985222"));
        telephoneDirectory.add(new Recording("Natalia", "0664411258"));

        telephoneDirectory.find("Alice");
        telephoneDirectory.find("Oleg");
        telephoneDirectory.find("Igor");
        telephoneDirectory.find("Petro");
        telephoneDirectory.find("Eva");
        telephoneDirectory.find("Julia");

        System.out.println();
        telephoneDirectory.findAll("Maxim");
        telephoneDirectory.findAll("Oleg");
        telephoneDirectory.findAll("Natalia");
        telephoneDirectory.findAll("Denys");
    }
}