/*
 * RTA stops working with multiple initializations here.
 */

class Test_15 {
    public static void main(String[] args) {
        int number;
        Object a;

        a = new Mammal();
        number = 10;
        System.out.println(number);
    }
}

class InheritanceTesting {
    public int check() {
        int age;
        Animal m;

        m = new Cat();
        age = m.age();
        return age;
    }
}

class Object {}

class AnimateObject extends Object {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Animal extends AnimateObject {}

class Mammal extends Animal {}

class Cat extends Mammal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}