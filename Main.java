/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi6;

import java.util.Scanner;

/**
 *
 * @author HP 14S
 */
public class Main {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        Toshiba toshiba = new Toshiba();
        Macbook macbook = new Macbook();
        LaptopUser user = new LaptopUser(lenovo);
        LaptopUser user2 = new LaptopUser(toshiba);
        LaptopUser user3 = new LaptopUser(macbook);
        Scanner input = new Scanner(System.in);
        String pilihan;
        do {
            System.out.println("Pilih Laptop: ");
            System.out.println("1. Lenovo");
            System.out.println("2. Toshiba");
            System.out.println("3. Macbook");
            System.out.println("4. Exit");
            System.out.print("Pilihan: ");
            pilihan = input.nextLine();
            switch (pilihan) {
                case "1":
                    System.out.println("Pilih Menu: ");
                    System.out.println("1. ON");
                    System.out.println("2. OFF");
                    System.out.println("3. UP");
                    System.out.println("4. DOWN");
                    System.out.println("5. Exit");
                    System.out.print("Pilihan: ");
                    pilihan = input.nextLine();
                    switch (pilihan) {
                        case "1":
                            user.turnOnTheLaptop();
                            break;
                        case "2":
                            user.turnOffTheLaptop();
                            break;
                        case "3":
                            user.makeLaptopLouder();
                            break;
                        case "4":
                            user.makeLaptopSilent();
                            break;
                        case "5":
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Pilih Menu: ");
                    System.out.println("1. ON");
                    System.out.println("2. OFF");
                    System.out.println("3. UP");
                    System.out.println("4. DOWN");
                    System.out.println("5. Exit");
                    System.out.print("Pilihan: ");
                    pilihan = input.nextLine();
                    switch (pilihan) {
                        case "1":
                            user2.turnOnTheLaptop();
                            break;
                        case "2":
                            user2.turnOffTheLaptop();
                            break;
                        case "3":
                            user2.makeLaptopLouder();
                            break;
                        case "4":
                            user2.makeLaptopSilent();
                            break;
                        case "5":
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("Pilih Menu: ");
                    System.out.println("1. ON");
                    System.out.println("2. OFF");
                    System.out.println("3. UP");
                    System.out.println("4. DOWN");
                    System.out.println("5. Exit");
                    System.out.print("Pilihan: ");
                    pilihan = input.nextLine();
                    switch (pilihan) {
                        case "1":
                            user3.turnOnTheLaptop();
                            break;
                        case "2":
                            user3.turnOffTheLaptop();
                            break;
                        case "3":
                            user3.makeLaptopLouder();
                            break;
                        case "4":
                            user3.makeLaptopSilent();
                            break;
                        case "5":
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;

                case "4":

                    System.out.println("Exit");
                    break;

                default:

                    System.out.println("Pilihan tidak ada");
                    break;
            }

        } while (!pilihan.equals("4"));
    }
}
