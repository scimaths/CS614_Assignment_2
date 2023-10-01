/*
 * RTA may still work with multiple initializations
 * in the same hierarchy.
 */

class test_14 {
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

class Mammal extends Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}

class Cat extends Mammal {}