package com.example.csv;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvFile {

    public static void main(String email, String pass) {
        //define output file name
        String csvOutputFile = "used_credentials.csv";
        //check if file exist
        boolean isFileExist = new File(csvOutputFile).exists();
            try {
                //create a FileWriter constructor to open a file in appending mode
                CsvWriter testcases = new CsvWriter(new FileWriter(csvOutputFile, true), ',');
                //write header column if the file did not already exist
                if(!isFileExist)
                {
                    testcases.write("eMail");
                    testcases.write("Password");
                
                    //end the record
                    testcases.endRecord();
                }
             //add record to the file
                testcases.write(email);
                testcases.write(pass);
                
                //end the record
                testcases.endRecord();
                //close the file
                testcases.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }