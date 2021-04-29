package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {
   public void exportPhonebook(Map<String, String> contacts, String output) {
       if(output == null) {
           throw new IllegalArgumentException("No target folder given!");
       }
       if(contacts == null) {
           throw new IllegalArgumentException("No contacts given!") ;
       }
       Path path = Path.of(output);
       try(BufferedWriter writer = Files.newBufferedWriter(path)) {

           for(Map.Entry<String, String> entry : contacts.entrySet()) {
               writer.write(entry.getKey() + ": " + entry.getValue());
              writer.newLine();
           }

       } catch (IOException e) {
           throw new IllegalStateException("Can't write file!", e);
       }

   }
}
