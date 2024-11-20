package input_output;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class fileInputExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = fileInputExample.class.getClassLoader().getResourceAsStream("article.txt");
//        FileReader fileReader = new FileReader("resource", StandardCharsets.UTF_8);
//        StringBuilder stringBuilder = new StringBuilder();
//        while (fileReader.ready()){
//            stringBuilder.append((char) fileReader.read());
//        }
//        System.out.println(stringBuilder);
//        fileReader.close();

        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
        scanner.nextLine();
        int count = 0;
        int lineNeeded = 1;
        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            if(count == lineNeeded){
                System.out.println(nextLine);
            }
            count++;
        }
        scanner.close();
        inputStream.close();

    }
}
