package ku.cs.posfinalproject.services;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataFileManager {
    private String filename;
    private String directoryName;
    private File file;

    public DataFileManager(String filename, String directoryName) {
        this.filename = filename;
        this.directoryName = directoryName;
        createFileIfNotExist();
    }

    private void createFileIfNotExist() {
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        String filePath = directoryName + File.separator + filename;
        file = new File(filePath);

        FileWriter writer = null;
        BufferedWriter buffer = null;

        if (!file.exists()) {
            try {
                writer = new FileWriter(file);
                buffer = new BufferedWriter(writer);

                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException();
            } finally {
                try {
                    buffer.close();
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public ArrayList<String[]> extractDataToArray() {
        FileInputStream fileInputStream = null;
        ArrayList<String[]> splitedData = new ArrayList<>();

        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        InputStreamReader inputStreamReader = new InputStreamReader(
                fileInputStream,
                StandardCharsets.UTF_8
        );
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String line = "";

        try {
            while ( (line = buffer.readLine()) != null ){
                if (line.equals("")) continue;

                String[] data = line.split(",");

                splitedData.add(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return splitedData;
    }

    public void writeData(List<? extends WriteAble> data) {
        FileWriter writer = null;
        BufferedWriter buffer = null;
        try {
            writer = new FileWriter(file, StandardCharsets.UTF_8);
            buffer = new BufferedWriter(writer);
            for (WriteAble w : data) {
                buffer.append(w.toCsvFormat());
                buffer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buffer.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}