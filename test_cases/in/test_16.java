class test_16 {
    public static void main(String[] args) {
        int number;
        number = 10;
        System.out.println(number);
    }
}

class Test_Single_Method_Multiple_Calls {
    public int check() {
        Animal a;
        int age1;
        int age2;

        a = new Animal();
        age1 = a.age();
        age1 = age1 * age1;
        age2 = a.age();
        return age2;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}