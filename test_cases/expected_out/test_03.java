class test_03 {
    public static void main(String[] test3args) {
        int heightPlusAge;
        Test_Age_And_Height_Inlining tester;
        tester = new Test_Age_And_Height_Inlining();
        heightPlusAge = tester.check();
        System.out.println(heightPlusAge);
    }
}

class Test_Age_And_Height_Inlining {
    public int check() {
        Animal s;
        int age;
        int height;
        int heightPlusAge;
        Animal t1;
        int t0;
        Animal t5;
        int t4;
        int t2;
        int t3;
        s = new Animal();
        t1 = s;
        t0 = 10;
        age = t0;
        t5 = s;
        t3 = 3;
        t2 = 160;
        t4 = t2 * t3;
        height = t4;
        heightPlusAge = height + age;
        return heightPlusAge;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }

    public int heightInFt() {
        int height;
        int heightInCm;
        int cmToFtFactor;
        cmToFtFactor = 3;
        heightInCm = 160;
        height = heightInCm * cmToFtFactor;
        return height;
    }
}
