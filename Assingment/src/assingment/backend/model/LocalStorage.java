/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class LocalStorage {
    private static final String STORAGE_FILE = "local_storage.properties";

    public static void saveData(String key, String value) {
        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream(STORAGE_FILE)) {
            properties.load(inputStream);
        } catch (IOException e) {
            // File doesn't exist yet or couldn't be read, create a new one
        }

        try (OutputStream outputStream = new FileOutputStream(STORAGE_FILE)) {
            properties.setProperty(key, value);
            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getData(String key) {
        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream(STORAGE_FILE)) {
            properties.load(inputStream);
        } catch (IOException e) {
            // File doesn't exist or couldn't be read
            return null;
        }
        return properties.getProperty(key);
    }

}