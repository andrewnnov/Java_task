package ru.bannikov.oop_golovach.lecture1.staticandnotstatic;


//если методы не статические, то напечатается child
//если методы в классах ParMes and ChMs статические, то вызовется метод ParentMesag
//если методы статические, то они не ищутся динамически определяется во время компиляции
//если метод не статический, то происходит проверка типа снизу вверх

public class Test {

    public static void main(String[] args) {
        send(new ChildMessage1());
    }

    private static void send(ParentMessage1 msg) {

        msg.call(); //ссылка сама знает свой тип
    }
}

class ChildMessage1 extends ParentMessage1  {

    void call() {
        System.out.println("Child");
    }
}

class ParentMessage1 {

    void  call() {
        System.out.println("Parent");
    }
}
