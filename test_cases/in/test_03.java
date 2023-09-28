/*
 * Inline mutliple methods inside the same method - "age" and "heightInFt"
 */

class Test_3 {
    public static void main(String[] test3args) {
        Animal s;

        s = new Animal();
        System.out.println(s);
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