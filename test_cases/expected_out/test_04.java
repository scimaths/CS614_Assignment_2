class test_04 {
    public static void main(String[] args) {
        Test_Father_Age_Inlining tester;
        int fatherAge;
        tester = new Test_Father_Age_Inlining();
        fatherAge = tester.check();
        System.out.println(fatherAge);
    }
}

class Test_Father_Age_Inlining {
    public int check() {
        Animal s;
        int fatherAge;
        Animal t4;
        Animal t0;
        int t1;
        int t3;
        int t2;
        s = new Animal();
        t4 = s;
        t0 = new Animal();
        t1 = t0.age();
        t3 = t0.fatherAge();
        t2 = t3 - t1;
        fatherAge = t2;
        return fatherAge;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }

    public int fatherAge() {
        int fatherAge;
        fatherAge = 100;
        return fatherAge;
    }

    public int fatherAgeDelta() {
        Animal s;
        int animalAge;
        int fatherAge;
        int ageDiff;
        Animal t1;
        int t0;
        Animal t3;
        int t2;
        s = new Animal();
        t1 = s;
        t0 = 10;
        animalAge = t0;
        t3 = s;
        t2 = 100;
        fatherAge = t2;
        ageDiff = fatherAge - animalAge;
        return ageDiff;
    }
}
