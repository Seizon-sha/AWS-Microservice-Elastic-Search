package chettu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class handler {
	 public static void main(String[] args) {

	        String csvFile = "C:/Users/Pushparani/Desktop/demo123.csv";
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";

	        try {

	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] Name  = line.split(cvsSplitBy);
	                System.out.print("value1: "+Name[0]);
	                System.out.print(" value2: "+Name[1]);
	                System.out.print(" value3: "+Name[2]);
	                System.out.println("");
	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	    }


}
