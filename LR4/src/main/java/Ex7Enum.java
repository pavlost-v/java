public class Ex7Enum {
    public static class SomeClass {
        public static final int SIZE_SMALL = 1;
        public static final int SIZE_MEDIUM = 2;
        public static final int SIZE_LARGE = 3;


        private int size;


        int setSize(int size) throws Exception {
            if (size < 1 || size > 3) {
                throw new Exception("Very big/small size");
            }
            return size;
        }
    }

    enum Size {
        SMALL(1), MEDIUM(2), LARGE(3);
        private int value;

        Size(int value) {
            this.value = value;
        }

        public void setValue(Size size) {
            this.value = size.value;
        }

    }

    public static void main(String[] args) throws Exception {
        int i = new SomeClass().setSize(999);
        Size size2;
        size2.setValue(Size.SMALLL);
//            System.out.println(size2.value);
    }
}
