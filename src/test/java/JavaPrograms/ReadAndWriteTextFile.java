package JavaPrograms;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteTextFile {
    String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\Test.txt";

    @Test
    void readFile() throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        String str ="";
        while((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        fr.close();
    }

    @Test
    void readFile1() throws IOException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }

    @Test
    void writeFile() throws IOException{
        FileWriter fw =new FileWriter("C:\\Users\\Swetha\\Desktop\\Priya\\Learning\\Framework\\LearningAutomation\\src\\main\\resources\\Test1.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        bw.write("Selenium");
        bw.newLine();
        bw.write("Cucumber");
        System.out.println("Done!");
        bw.close();
        fw.close();
    }
}
