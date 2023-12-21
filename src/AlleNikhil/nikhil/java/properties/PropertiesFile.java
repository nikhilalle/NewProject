package com.matrix.nikhil.java.properties;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    @Test
    public void getProperties() throws IOException {
        File file=new File("D:\\Java-June 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\AlleNikhil.nikhil\\java\\properties\\.config.properties");
        FileInputStream fin=new FileInputStream(file);
        Properties prop=new Properties();
        prop.load(fin);
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("id"));
        System.out.println(prop.getProperty("password"));
    }

}
