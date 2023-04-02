/*Task_3.*
public class Task_3 '*' {

//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
public static void main(String[] args) {

        }

public String findJewelsInStones(String jewels, String stones){

        return "";
        }
        }*/

import javax.sound.midi.Soundbank;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("file.txt")){
            byte num = console.nextByte();
            writer.write(num);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}