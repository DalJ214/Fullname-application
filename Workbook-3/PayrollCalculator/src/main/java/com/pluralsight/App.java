package com.pluralsight;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);

        System.out.print("Enter the name of the file employee file to process: ");
        String inputFileName = scanny.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFilename = scanny.nextLine();



        try {
// create a FileReader object connected to the File

            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
// create a BufferedReader to manage input stream
             BufferedReader bufReader = new BufferedReader(fileReader);
             //Creating a file and buffer writer to output text
            FileWriter fileWriter = new FileWriter(inputFileName);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            String input;
// read until there is no more data
            while ((input = bufReader.readLine()) != null) {
                if (input.startsWith("id")) {
                    continue;
                }
                {

                    String[] numbers = input.split("\\|");
                    int employeeId = Integer.parseInt(numbers[0]);
                    String name = numbers[1];
                    double hoursWorked = Double.parseDouble(numbers[2]);
                    double payRate = Double.parseDouble(numbers[3]);

                    Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                    
                    String output = String.format("Employee ID: %d, Name: %s, Gross pay: %.2f%n",
                            employee.getEmployeeId(),
                            employee.getName(),
                            employee.getGrossPay());

                    bufWriter.write(output);
// close the stream and release the resources
                }
            }
            bufReader.close();
            bufWriter.close();
        } catch (IOException e) {
// display stack trace if there was an error
            e.printStackTrace();
        }
    }


}








