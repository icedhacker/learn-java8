package com.java8.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambdaExpression {

    private static final String DIR_PATH = "J:\\tmp";

    public static void main(String[] args) {
        // Normal Java Implementation using Anonymous class.
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        // Lambda Expression Implementation.
        FileFilter lambdaFilter = (File file) -> file.getName().endsWith(".java");

        File dir = new File(DIR_PATH);
        File[] files = dir.listFiles(fileFilter);
        File[] lambdaFiles = dir.listFiles(lambdaFilter);

        System.out.println("Using Anonymous Class : ");
        for (File f : files) {
            System.out.println(f.getName());
        }

        System.out.println("\nUsing Lambda : ");
        for (File lf : lambdaFiles) {
            System.out.println(lf.getName());
        }
    }
}
