package ru.bannikov.oop.lecture1;

public class AppXX {
    public static void main(String[] args) throws Exception {
        Exception ref = new RuntimeException();
        try {

            //компилятор думает что ссылка по Exception
            //и не пропускает
            //надо добавить throws Exception, чтобы заработало
            //но если мы запустим программу исклчения не будет, потому что JVM ловит его
            //во время выполнения
           throw ref;

        } catch (RuntimeException e) {

        }
    }
}
