/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm1;

import java.text.ParseException;
import java.util.Random;

/**
 *
 * @author HKbhoang
 */
public class ASM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

//		Header
        System.out.printf("%-20s", "Full Name");
        System.out.printf("%-10s", "ID");
        System.out.printf("%-13s", "Date");
        System.out.printf("%-5s", "RA");
        System.out.printf("%-5s", "SD");
        System.out.printf("%-5s", "CP");
        System.out.printf("%-5s", "CUT");
        System.out.printf("%-5s", "FMI");
        System.out.printf("%-5s", "Avg");
        System.out.printf("%-10s", "Rank ");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");

// Mang Ten HV
        String tenHV[] = new String[50];
        tenHV[0] = "Anh";
        tenHV[1] = "An";
        tenHV[2] = "Bao";
        tenHV[3] = "Be";
        tenHV[4] = "Bi";

        tenHV[5] = "Canh";
        tenHV[6] = "Cong";
        tenHV[7] = "Duy";
        tenHV[8] = "Dung";
        tenHV[9] = "Do";

        tenHV[10] = "Hung";
        tenHV[11] = "Hong";
        tenHV[12] = "Huy";
        tenHV[13] = "Hao";
        tenHV[14] = "Hiep";

        tenHV[15] = "Lung";
        tenHV[16] = "Luong";
        tenHV[17] = "Long";
        tenHV[18] = "Minh";
        tenHV[19] = "Na";

        tenHV[20] = "Nhung";
        tenHV[21] = "Ninh";
        tenHV[22] = "Nuong";
        tenHV[23] = "Phuoc";
        tenHV[24] = "Quynh";

        tenHV[25] = "Chien";
        tenHV[26] = "Chuong";
        tenHV[27] = "Chuyen";
        tenHV[28] = "Co";
        tenHV[29] = "Duc";

        tenHV[30] = "Due";
        tenHV[31] = "Giang";
        tenHV[32] = "Giap";
        tenHV[33] = "Khang";
        tenHV[34] = "Khoa";

        tenHV[35] = "Khoi";
        tenHV[36] = "Kien";
        tenHV[37] = "Kiet";
        tenHV[38] = "Hoat";
        tenHV[39] = "Huan";

        tenHV[40] = "Binh";
        tenHV[41] = "Cuong";
        tenHV[42] = "Khai";
        tenHV[43] = "Nghia";
        tenHV[44] = "Nhan";

        tenHV[45] = "Quan";
        tenHV[46] = "Son";
        tenHV[47] = "Tam";
        tenHV[48] = "Trang";
        tenHV[49] = "Triet";

// Ham xuat random tenHV		
        Random rand = new Random();

        String ten = tenHV[rand.nextInt(49) + 1];
//		System.out.println(tenHV[rand.nextInt(49) + 1]);
// Mang ho Hoc Vien		
        String hoHV[] = new String[15];

        hoHV[0] = "Hoang";
        hoHV[1] = "Le";
        hoHV[2] = "Ngo";
        hoHV[3] = "Nguyen";
        hoHV[4] = "Khong";

        hoHV[5] = "Quach";
        hoHV[6] = "Trinh";
        hoHV[7] = "Mac";
        hoHV[8] = "Pham";
        hoHV[9] = "Pho";

        hoHV[10] = "Tran";
        hoHV[11] = "Bui";
        hoHV[12] = "Duong";
        hoHV[13] = "Ly";
        hoHV[14] = "Ton";

        String ho = hoHV[rand.nextInt(14) + 1] + " ";
//		System.out.println(hoHV[rand.nextInt(14) + 1]);

// ten Dem		
        String[] tendemHV = new String[30];

        tendemHV[0] = "Hoai";
        tendemHV[1] = "Dieu";
        tendemHV[2] = "Anh";
        tendemHV[3] = "Thuy";
        tendemHV[4] = "Tram";

        tendemHV[5] = "Trung";
        tendemHV[6] = "Kim";
        tendemHV[7] = "Tu";
        tendemHV[8] = "Ngoc";
        tendemHV[9] = "Phuong";

        tendemHV[10] = "Bao";
        tendemHV[11] = "Phuoc";
        tendemHV[12] = "Thanh";
        tendemHV[13] = "Kim";
        tendemHV[14] = "Khai";

        tendemHV[15] = "Tran";
        tendemHV[16] = "Que";
        tendemHV[17] = "Truc";
        tendemHV[18] = "Hien";
        tendemHV[19] = "Xuyen";

        tendemHV[20] = "Huong";
        tendemHV[21] = "Yen";
        tendemHV[22] = "Dao";
        tendemHV[23] = "Thuc";
        tendemHV[24] = "Thu";

        tendemHV[25] = "My";
        tendemHV[26] = "Da";
        tendemHV[27] = "Van";
        tendemHV[28] = "Hoang";
        tendemHV[29] = "Nhat";

        String tendem = tendemHV[rand.nextInt(29) + 1] + " ";
//		System.out.println(tendemHV[rand.nextInt(29) + 1]);

// ham in ra Full Ten Hoc Vien
//		System.out.println(ho + tendem + ten);
// Tao mang luu ten 25 Hoc Vien
        String[] mangtenHV = new String[25];

// Tao random date
        GenerateRandomDate ranDate = new GenerateRandomDate();

// Tao diem
        for (int i = 0; i < mangtenHV.length; i++) {
            mangtenHV[i] = hoHV[rand.nextInt(14) + 1] + " " + tendemHV[rand.nextInt(29) + 1] + " " + tenHV[rand.nextInt(49) + 1];
            System.out.printf("%-20s", mangtenHV[i]);
            System.out.printf("%-2s", "HV");
            System.out.printf("%-8s", Math.round(Math.random() * 8999999) + 1000000);
            System.out.printf("%-13s", GenerateRandomDate.generateRandomDate("dd/MM/yyyy", "01/02/1991", "31/12/1991"));
            int markTop1 = rand.nextInt(3) + 8;
            int markTop2 = rand.nextInt(3) + 8;
            int markTop3 = rand.nextInt(3) + 8;
            int markTop4 = rand.nextInt(3) + 8;
            int markTop5 = rand.nextInt(3) + 8;

            int markAvg1 = rand.nextInt(3) + 5;
            int markAvg2 = rand.nextInt(3) + 5;
            int markAvg3 = rand.nextInt(3) + 5;
            int markAvg4 = rand.nextInt(3) + 5;
            int markAvg5 = rand.nextInt(3) + 5;

            int markLow1 = rand.nextInt(2) + 3;
            int markLow2 = rand.nextInt(2) + 3;
            int markLow3 = rand.nextInt(2) + 3;
            int markLow4 = rand.nextInt(2) + 3;
            int markLow5 = rand.nextInt(2) + 3;

            int markBad1 = rand.nextInt(2) + 1;
            int markBad2 = rand.nextInt(2) + 1;
            int markBad3 = rand.nextInt(2) + 1;
            int markBad4 = rand.nextInt(2) + 1;
            int markBad5 = rand.nextInt(2) + 1;

            float avgMarkTop = (float) (markTop1 + markTop2 + markTop3 + markTop4 + markTop5) / 5;
            float avgMarkAvg = (float) (markAvg1 + markAvg2 + markAvg3 + markAvg4 + markAvg5) / 5;
            float avgMarkLow = (float) (markLow1 + markLow2 + markLow3 + markLow4 + markLow5) / 5;
            float avgMarkBad = (float) (markBad1 + markBad2 + markBad3 + markBad4 + markBad5) / 5;
            if (i < 3) {
                System.out.printf("%-5s", markTop1);
                System.out.printf("%-5s", markTop2);
                System.out.printf("%-5s", markTop3);
                System.out.printf("%-5s", markTop4);
                System.out.printf("%-5s", markTop5);
            } else if (i < 16) {
                System.out.printf("%-5s", markAvg1);
                System.out.printf("%-5s", markAvg2);
                System.out.printf("%-5s", markAvg3);
                System.out.printf("%-5s", markAvg4);
                System.out.printf("%-5s", markAvg5);

            } else if (i < 22) {
                System.out.printf("%-5s", markLow1);
                System.out.printf("%-5s", markLow2);
                System.out.printf("%-5s", markLow3);
                System.out.printf("%-5s", markLow4);
                System.out.printf("%-5s", markLow5);
            } else if (i < 24) {
                System.out.printf("%-5s", markBad1);
                System.out.printf("%-5s", markBad2);
                System.out.printf("%-5s", markBad3);
                System.out.printf("%-5s", markBad4);
                System.out.printf("%-5s", markBad5);
            } else if (i < 25) {
                System.out.printf("%-5s", 0);
                System.out.printf("%-5s", 0);
                System.out.printf("%-5s", 0);
                System.out.printf("%-5s", 0);
                System.out.printf("%-5s", 0);

            }
            // In Avg
            if (i < 3) {
                System.out.printf("%-5s", avgMarkTop);
                System.out.printf("%-10s", "Gioi");
            } else if (i < 16) {
                System.out.printf("%-5s", avgMarkAvg);
                if (avgMarkAvg >= 6.5 && avgMarkAvg <= 7.9) {
                    System.out.printf("%-10s", "Kha");
                } else {
                    System.out.printf("%-10s", "TrungBinh");
                }
            } else if (i < 22) {
                System.out.printf("%-5s", avgMarkLow);
                if (avgMarkLow >= 3.1 && avgMarkLow <= 4.9) {
                    System.out.printf("%-10s", "Yeu");
                } else {
                    System.out.printf("%-10s", "Kem");
                }
            } else if (i < 24) {
                System.out.printf("%-5s", avgMarkBad);
                System.out.printf("%-10s", "Kem va Diem Liet");
            } else if (i < 25) {
                System.out.printf("%-5s", 0);
                System.out.printf("%-10s", "Diem Liet");
            } else {
                System.out.printf("%-5s", "#");
                System.out.printf("%-10s", "");
            }

            System.out.println();
        }

    }

}
