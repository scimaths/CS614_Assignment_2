/*
 * Check inlining with single and multiple arguments (with same & different types)
 */

class test_05 {
    public static void main(String[] args) {
        Animal s;
        s = new Animal();
        System.out.println(s);
    }
}

class Test_Multiple_Arguments_Inlining {
    public int checkFatherAge() {
        Animal s;
        int age;
        int fatherAge;
        float ratioFatherAge;
        
        s = new Animal();
        age = s.age();
        fatherAge = s.computeFatherAge(age);
        ratioFatherAge = s.computeRatio(age, fatherAge);
        System.out.println(ratioFatherAge);

        return fatherAge;
    }

    public float checkDifferentArgTypes() {
        Animal s;
        int age;
        float multiplicativeFactor;
        float motherAge;

        s = new Animal();
        age = s.age();
        multiplicativeFactor = 1;
        motherAge = s.multiplyAgeWithFloat(age, multiplicativeFactor);
        return motherAge;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }

    public int computeFatherAge(int age) {
        int fatherAge;
        int addition;

        addition = 10;
        fatherAge = age + addition;
        return fatherAge;
    }
    
    public float computeRatio(int age, int fatherAge) {
        float ratio;
        ratio = age/fatherAge;
        return ratio;
    }

    public float multiplyAgeWithFloat(int age, float factor) {
        float finalAge;
        finalAge = age * factor;
        return finalAge;
    }
}