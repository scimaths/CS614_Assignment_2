/*
 * Multiple initializations under RTA may lead to no inlining
 */

class test_12 {
    public static void main(String[] args) {
        int number;
        Animal a;
    
        a = new Cat();
        number = 10;
        System.out.println(number);
    }
}

class InheritanceTesting {
    public int check() {
        int age;
        Mammal m;

        m = new Mammal();
        age = m.age();
        return age;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Mammal extends Animal {}

class Cat extends Mammal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}