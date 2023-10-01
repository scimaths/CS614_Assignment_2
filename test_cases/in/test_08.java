/*
 * Function correctly inherited from own implementation, not parent (using CHA)
 */

class test_08 {
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

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Cat extends Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}
