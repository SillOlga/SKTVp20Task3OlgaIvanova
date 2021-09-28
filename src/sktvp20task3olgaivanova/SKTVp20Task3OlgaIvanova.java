/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task3olgaivanova;
import java.util.Scanner;
/**
 *
 * @author Vladimir
 */
public class SKTVp20Task3OlgaIvanova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String lastname = scanner.nextLine();
        
        
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        
        
        System.out.println(name+" "+lastname+" родился "+day+"."+month+"."+year);
    } 
    
}
