/*
 * Inline mutliple methods inside the same method - "age" and "heightInFt"
 */

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

        s = new Animal();
        age = s.age();
        height = s.heightInFt();
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