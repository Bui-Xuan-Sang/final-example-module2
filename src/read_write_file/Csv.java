package read_write_file;

import com.company.model.Directory;

import java.io.*;
import java.util.ArrayList;

public class Csv {
    public void writeFile(ArrayList<Directory> contactList, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Directory contact : contactList) {
                bufferedWriter.write(contact.getNumberPhone() + "," +
                        contact.getDirectory() + "," +
                        contact.getName() + "," +
                        contact.getGender() + "," +
                        contact.getAddress() + "," +
                        contact.getDate() + "," +
                        contact.getEmail() + ","
                        + "\n");
            }
            bufferedWriter.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public ArrayList<Directory> readFile(String path) {
        ArrayList<Directory> contacts = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                try {
                    contacts.add(new Directory(Long.parseLong(strings[0]),
                            strings[1],
                            strings[2],
                            strings[3],
                            strings[4],
                            Integer.parseInt(strings[5]),
                            strings[6]
                    ));
                } catch (ArrayIndexOutOfBoundsException e){
                    // bo qua
                }



            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return contacts;
    }
}
