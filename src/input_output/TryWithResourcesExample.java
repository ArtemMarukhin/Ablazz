package input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException, InterruptedException {
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader("C:\\Users\\temq\\Documents\\projects\\Ablazzing\\out\\resources\\article.txt");
//            throw new RuntimeException("Ошибка!");
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Блок finally");
//            fileReader.close();
//        }

        try (FileReaderWrapper fileReaderWrapper = new FileReaderWrapper(
                new FileReader("C:\\Users\\temq\\Documents\\projects\\Ablazzing\\out\\resources\\article.txt"))) {
            throw new RuntimeException("Ошибка");
        }catch (Exception e){
            System.out.println("Обработал ошибку");
        }


    }
}
