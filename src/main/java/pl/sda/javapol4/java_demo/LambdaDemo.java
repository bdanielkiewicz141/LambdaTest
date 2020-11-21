package pl.sda.javapol4.java_demo;

import java.util.stream.Stream;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("From MyRunnable class");
    }
}

interface MyInterface {
    void justDoIt();
}

@FunctionalInterface
interface StringToint {
    int nameLenght(String name);

    default int nameAndSUrnameLenght(String name, String surname) {
        return name.length()+surname.length();
    }
}


public class LambdaDemo {

    public static void main(String[] args) {
        Runnable job = new MyRunnable();
        job.run();

        Runnable job3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("From anonymus runable");
            }
        };
        job3.run();
        Runnable job2 = () -> {
        };

        MyInterface nike = new MyInterface() {
            @Override
            public void justDoIt() {

            }
        };
        MyInterface nike2 = () -> {
        };

        StringToint test = a -> a.length();
    test.nameLenght("test");



        Stream<Object> objects = Stream.of("mateusz", "marek", "adrian", "Iza" , "Kamila");
        Stream<String> neames = Stream.of("mateusz", "marek", "adrian", "Iza" , "Kamila", "Barteumuidas");
        neames.filter(string -> string.length()>6).
                map(s -> s.length()).
                forEach(s -> System.out.println(s));

    objects.filter(o -> o instanceof String).
            map(o -> (String) o).filter(string -> string.length()>6).
            map(s -> s.length()).
            forEach(s -> System.out.println(s));

    }




}
