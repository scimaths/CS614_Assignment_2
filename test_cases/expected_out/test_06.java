class test_06 {
    public static void main(String[] agrs) {
        Animal s;
        s = new Animal();
        System.out.println(s);
    }
}

class Animal {
    public int checkPrinting() {
        Animal s;
        int age;
        Animal t1;
        int t0;
        s = new Animal();
        t1 = s;
        t0 = 10;
        System.out.println(t0);
        age = t0;
        return age;
    }

    public int age() {
        int age;
        age = 10;
        System.out.println(age);
        return age;
    }
}
