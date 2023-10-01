/*
 * Do not relay inlining - inline to a maximum depth of 1 function
 */

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

        s = new Animal();
        fatherAge = s.fatherAgeDelta();
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

        s = new Animal();
        animalAge = s.age();
        fatherAge = s.fatherAge();
        ageDiff = fatherAge - animalAge;
        return ageDiff;
    }
}