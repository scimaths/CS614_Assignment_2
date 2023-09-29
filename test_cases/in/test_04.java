/*
 * Do not relay inlining - inline to a maximum depth of 1 function
 */

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

        s = new Animal();
        father_age = s.fatherAgeDelta();
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

        s = new Animal();
        animalAge = s.age();
        fatherAge = s.fatherAge();
        ageDiff = fatherAge - animalAge;
        return ageDiff;
    }
}