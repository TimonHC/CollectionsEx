package com.company;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String PATH_TO_FILE = ("Files\\SomeText.txt");

    public static void main(String[] args) throws IOException {
        LinkedList<String> buffer = new LinkedList<String>();
        FileReader fileReader = new FileReader(PATH_TO_FILE);
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNextLine()){
            buffer.add(scanner.nextLine());
        }
        int linesCount = buffer.size();
        while (linesCount!=0){
            System.out.print(buffer.get(linesCount-1)+"\n");
            linesCount--;
        }

    }
}
