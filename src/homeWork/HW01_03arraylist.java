package homeWork;


//Реализовать вложенные структуры данных (на верхнем уровне коллекция коллекций,
// на среднем - коллекция и на нижнем - элементы типа String)
//   с возможностью добавления, удаления и вывода элементов.
//   1. ArrayList<Stack>

import java.util.ArrayList;
import java.util.Stack;

public class HW01_03arraylist {
    public static void main(String[] args) {
        ArrayList<Stack<String>> nestedList = new ArrayList<>();

        Stack<String> stack1 = new Stack<>();
        stack1.push("Element 1");
        stack1.push("Element 2");
        nestedList.add(stack1);

        Stack<String> stack2 = new Stack<>();
        stack2.push("Element A");
        stack2.push("Element B");
        nestedList.add(stack2);

        // Добавление элемента
        nestedList.get(0).push("New Element");

        // Удаление элемента
        nestedList.get(1).pop();

        // Вывод всех элементов
        for (Stack<String> stack : nestedList) {
            System.out.println("Stack:");
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
            System.out.println();
        }
    }
}