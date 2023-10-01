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
        CricketStadium t1;
        int t0;
        Cat t3;
        int t2;
        cat = new Cat();
        stadium = new CricketStadium();
        t1 = stadium;
        t0 = 100;
        age = t0;
        System.out.println(age);
        t3 = cat;
        t2 = 10;
        age = t2;
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

class CricketStadium extends Stadium {
}

class Animal {
}

class Cat extends Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}
