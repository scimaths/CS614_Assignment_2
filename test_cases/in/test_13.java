/*
 * RTA may still work with multiple initializations
 * in the same hierarchy - Cat and Dog share a common
 * ancestor Mammal with the implementation of age().
 */

class test_13 {
    public static void main(String[] args) {
        int ret;
        Object a;
        InheritanceTesting tester;

        a = new Dog();
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

class Animal extends Object {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Mammal extends Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}

class Cat extends Mammal {}

class Dog extends Mammal {}