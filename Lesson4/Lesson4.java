

package Lesson4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Lesson4 {
    public static void main(String[] args) {
    
        //Коллекция LinkedList

    //LinkedList - двусвязный список. Список - абстрактный тип данных - гибкая структура данных, которая позволяет легко менять свой размер: 
    //можно вставлять элементы, можно их удалять с любой позиции.
    //Чтобы обратиться к элементу списка нужно обратиться ко всему списку, потому что соседние элементы искомого знают, где располагается нужный элемент.
    //Например, чтобы обратиться к 10 элементу, прийдется посмотреть все элементы, которые находятся до него в списке. 
    //Чтение списка - сложная операция. В памяти компьтера не обязательно находятся рядом или по порядку, они могт находиться в разных местах, но
    //элементы знают, где находится следующий.
    //Элемент двусвязного списка хранит в себе информацию и о следующем элементе, и о предыдущем.
    //Функционал LinkedList такой же как и у List. LinkedList нужен для небольших списков, 
    //в которых операции добавления, удаления встреачаются чаще, чем операции чтения.
    //
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

    //Коллекция Queue
    //Принцип коллекции - кто первый пришел,то и будет обработан.
    
    Queue<Integer> ql = new LinkedList<Integer>(null);
    ql.add(1);
    ql.add(2);
    ql.add(3);
    int item = ql.remove(); //извлечение элемента - кто первый был добавлен, то перывй будет удален

    //PriorityQueue - наиивысший приоритет имеет наимельший элемент.

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.add(123);
    pq.add(3);
    pq.add(13);
    pq.add(1);

    pq.poll(); // показывает приоритет при извлечении

    //Deque - элементы можно добавлять как в начало, так и в конец. Извлекать элеменеты так же - из начала и с конца
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addLast(2);
    deque.removeLast();
    deque.offerFirst(1);
    deque.offerLast(1);
    deque.pollFirst();
    deque.pollLast();
    deque.getFirst();
    deque.getLast();
    deque.peekFirst();
    deque.peekLast();

    //Stack - те данные, которые пришли ранее, будут обработаны в последнюю очередь.
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(12);
    stack.push(123);
    System.out.println(stack.pop()); // 123
    System.out.println(stack.pop()); // 12
    System.out.println(stack.pop()); // 1






    }


}



//Коллекция LinkedList

//LinkedList - двусвязный список. Список - абстрактный тип данных - гибкая структура данных, которая позволяет легко менять свой размер: 
//можно вставлять элементы, можно их удалять с любой позиции.
//Чтобы обратиться к элементу списка нужно обратиться ко всему списку, потому что соседние элементы искомого знают, где располагается нужный элемент.
//Например, чтобы обратиться к 10 элементу, прийдется посмотреть все элементы, которые находятся до него в списке. 
//Чтение списка - сложная операция. В памяти компьтера не обязательно находятся рядом или по порядку, они могт находиться в разных местах, но
//элементы знают, где находится следующий.
//Элемент двусвязного списка хранит в себе информацию и о следующем элементе, и о предыдущем.
//Функционал LinkedList такой же как и у List. LinkedList нужен для небольших списков, 
//в которых операции добавления, удаления встреачаются чаще, чем операции чтения.
//  