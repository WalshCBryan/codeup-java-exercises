package FileIO;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Classroom {

    final static String dir = "data";
    final static String fileName = "classroom.txt";

    public static void main(String[] args) {


        Path path = Paths.get(dir, fileName);

//if dir/file does not exist, create it... if unable - throw exception

        if (!Files.exists(path)) {
            try {
//                Files.createDirectories(path);
                Files.createDirectories(Paths.get(dir));
                Files.createFile(Paths.get(fileName));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        instantiate a list to write to file
        List<String> instructors = new ArrayList<>();
        instructors.add("Fer");
        instructors.add("Sophie");
        instructors.add("Vivian");


//        write to file, if unable, throw exception
        try {
            Files.write(path, instructors);
//            Files.write(path, instructors, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println("line.toUpperCase() = " + line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
