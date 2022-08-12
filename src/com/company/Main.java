package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] student = new String[40];
        student[0] = "Абылов К.";
        student[1] = "Акылов А.";
        student[2] = "Артыков П.";
        student[3] = "Арипов И.";
        student[4] = "Айбеков Т.";
        student[5] = "Баратов Р.";
        student[6] = "Беков М.";
        student[7] = "Борубаев П.";
        student[8] = "Бектурсунов Ш.";
        student[9] = "Гапаров Р.";
        student[10] = "Гайипов В.";
        student[11] = "Дамиров К.";
        student[12] = "Жороев С.";
        student[13] = "Жапаров Г.";
        student[14] = "Жунусов П.";
        student[15] = "Каримов И.";
        student[16] = "Кулуев С.";
        student[17] = "Колдошов И.";
        student[18] = "Кокчоев Т.";
        student[19] = "Марипов М.";
        student[20] = "Момунов А.";
        student[21] = "Мундузов Л.";
        student[22] = "Маликов Н.";
        student[23] = "Нарынов Н.";
        student[24] = "Нурдинов А.";
        student[25] = "Ашыров П.";
        student[26] = "Окинов В.";
        student[27] = "Петров Т.";
        student[28] = "Серов Л.";
        student[29] = "Васильев О.";
        student[30] = "Айбашов Р.";
        student[31] = "Садыков И.";
        student[32] = "Серов П.";
        student[33] = "Ташов К.";
        student[34] = "Темиров Р.";
        student[35] = "Толкунов Н.";
        student[36] = "Шарипов Н.";
        student[37] = "Шакиров Е.";
        student[38] = "Усонов Н";
        student[39] = "Асанов Д.";
        System.out.println(Arrays.toString(student));


        Random random = new Random();
        int x = 0;
        int[] array = new int[40];
        boolean numberAlreadyExists;
        for (int i = 0; i < student.length; ) {
            numberAlreadyExists = false;
            int numberRandom = random.nextInt( 40);
            for (int j = 0; j < i; j++) {
                if (array[j] == numberRandom) {
                    numberAlreadyExists = true;
                    break;
                }
            }
            if (!numberAlreadyExists) {
                array[i] = numberRandom;
                if (i < 10) {
                    Mentor mentor = new Mentor("Асанов Усон", 22, student[numberRandom]);
                    System.out.println(mentor.spisok());
                }
                if (i > 9 && i < 20) {
                    Mentor mentor2 = new Mentor("Балтабаев Тешебай", 24, student[numberRandom]);
                    System.out.println(mentor2.spisok());
                }
                if (i > 19 && i < 30) {
                    Mentor mentor3 = new Mentor("Марипов Улук", 23, student[numberRandom]);
                    System.out.println(mentor3.spisok());
                }
                if (i > 29) {
                    Mentor mentor4 = new Mentor("Каримов Бакыт", 26, student[numberRandom]);
                    System.out.println(mentor4.spisok());
                }
                i++;
            }

        }
        System.out.println(Arrays.toString(array));
    }

}