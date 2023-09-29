class test_04 {
    public static void main(String[] args) {
        Animal s;
        s = new Animal();
        System.out.println(s);
    }
}

class Test_Father_Age_Inlining {
    public int check() {
        Animal s;
        int father_age;
        Animal t4;
        Animal t2;
        int t0;
        int t1;
        int t3;
        s = new Animal();
        t4 = s;
        t2 = new Animal();
        t0 = t2.age();
        t1 = t2.fatherAge();
        t3 = t1 - t0;
        father_age = t3;
        return father_age;
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
        Animal t3;
        int t2;
        Animal t1;
        int t0;
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
