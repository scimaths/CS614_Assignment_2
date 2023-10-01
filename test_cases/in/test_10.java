/*
 * Separate parent-child hierarchies work correctly - 
 * Stadium-CricketStadium & Animal-Cat
 */

class test_10 {
    public static void main(String[] this_args) {
        InheritanceTesting tester;
        int ret;

        tester = new InheritanceTesting();
        ret = tester.check();
        System.out.println(ret);
    }
}

class InheritanceTesting {
    public int check() {
        int age;
        CricketStadium stadium;
        Cat cat;

        cat = new Cat();
        stadium = new CricketStadium();
        age = stadium.age();
        System.out.println(age);
        age = cat.age();
        return age;
    }
}

class Stadium {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}

class CricketStadium extends Stadium {}

class Animal {}

class Cat extends Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}