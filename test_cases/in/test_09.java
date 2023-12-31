/*
 * Function correctly inherited from closest ancestor (using CHA)
 */

class test_09 {
    public static void main(String[] args) {
        InheritanceTesting tester;
        int ret;

        tester = new InheritanceTesting();
        ret = tester.check();
        System.out.println(ret);
    }
}

class InheritanceTesting {
    public int check() {
        Cat c;
        int age;

        c = new Cat();
        age = c.age();
        return age;
    }
}

class Object {
    public int age() {
        int age;
        age = 0;
        return age;
    }
}

class AnimateObject extends Object {}

class Animal extends AnimateObject {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Mammal extends Animal {}

class Cat extends Mammal {}