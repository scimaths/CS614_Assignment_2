/*
 * RTA stops working with multiple initializations here.
 */

class test_15 {
    public static void main(String[] args) {
        int ret;
        Object a;
        InheritanceTesting tester;

        a = new Mammal();
        tester = new InheritanceTesting();
        ret = tester.check();
        System.out.println(ret);
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
        age = 100;
        return age;
    }
}