public class GenMeth {
    static <T extends Comparable<T>, V extends  T> boolean isIn (T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;  ///Фанзиль, почему   здесь  не требуется переопределять метод equals?
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        String[]  str  = {"one", "two", "three", "four", "five"};

        if (isIn(2, nums)) System.out.println("There is 2 in nums");
        if (isIn(7, nums)) System.out.println("There is not 2 in nums");

        System.out.println(isIn("two", str));
        System.out.println(isIn("six", str));
    }
}
