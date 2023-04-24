/*
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {

        NoteBook nb1 = new NoteBook();
        nb1.setBrand("Asus");
        nb1.setColor("Black");
        nb1.setOs("Windows");
        nb1.setProcessor("Intel");
        nb1.setRam(8);
        nb1.setSsd(250);


        NoteBook nb2 = new NoteBook();
        nb2.setBrand("Apple");
        nb2.setColor("White");
        nb2.setOs("Mac OS");
        nb2.setProcessor("M2");
        nb2.setRam(16);
        nb2.setSsd(500);

        NoteBook nb3 = new NoteBook();
        nb3.setBrand("Huawei");
        nb3.setColor("Silver");
        nb3.setOs("Linux");
        nb3.setProcessor("AMD");
        nb3.setRam(32);
        nb3.setSsd(1000);

        Set <NoteBook> laptop = new HashSet<>();
        laptop.add(nb1);
        laptop.add(nb2);
        laptop.add(nb3);

        NoteBook filterLaptop = new NoteBook();

        System.out.println(filterLaptop.filter(laptop));
    }}





