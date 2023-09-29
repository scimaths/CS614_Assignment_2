class test_17 {
    public static void main(String[] args) {
        int number;
        number = 10;
        System.out.println(number);
    }
}

class Test_Conditional_Loop_And_Array {
    public int check() {
        Array a;
        int number1;
        int number2;
        int arraysize;
        boolean addall;

        arraysize = 5;
        addall = true;
        a = new Array();
        number1 = a.sum(arraysize, addall);
        addall = false;
        number2 = a.sum(arraysize, addall);
        return number1;
    }
}

class Array {
    public int[] init(int size) {
        int[] array;
        int index;
        int zero;
        int one;
        boolean checkbound;

        zero = 0;
        one = 1;
        index = size - one;
        array = new int[size];
        checkbound = zero <= index;
        while (checkbound) {
            array[index] = index;
            index = index - one;
            checkbound = zero <= index;
        }
        return array;
    }

    public int sum(int size, boolean addall) {
        int[] array;
        Array dummy;
        int sum;
        int index;
        int one;
        int element;
        int zero;
        boolean checkbound;

        sum = 0;
        zero = 0;
        one = 1;
        dummy = new Array();
        array = dummy.init(size);
        if (addall) {
            sum = zero;
        }
        else {
            index = size - one;
            checkbound = zero <= index;
            while (checkbound) {
                element = array[index];
                sum = sum + element;
                index = index - one;
                checkbound = zero <= index;
            }
        }
        return sum;
    }
}