package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlconnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader((urlconnection.getInputStream())));


        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
    }
}