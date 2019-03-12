package java12;

//import com.sun.org.apache.bcel.internal.classfile.Utility;

//import com.sun.org.apache.bcel.internal.Constants;



public class java12 {
    public static void main(String[] args) {
        String str = com.sun.org.apache.bcel.internal.classfile.Utility.getSignature("abc312");
        System.out.println(str);
        str = my_getSignature("abc312");
        System.out.println(str);

    }

    public static String my_getSignature(String type) {
        StringBuffer buf = new StringBuffer();
        char[] chars = type.toCharArray();
        boolean char_found = false, delim = false;
        int index = -1;

        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (flag) {
                break;
            }
            switch (chars[i]) {
                case ' ':
                case '\t':
                case '\n':
                case '\r':
                case '\f':
                    if (char_found)
                        delim = true;
                    break;

                case '[':
                    if (!char_found)
                        throw new RuntimeException("Illegal type: " + type);

                    index = i;
                    flag = true;
                    break;

                default:
                    char_found = true;
                    if (!delim)
                        buf.append(chars[i]);
            }
        }

        int brackets = 0;

        if (index > 0)
            brackets = countBrackets(type.substring(index));

        type = buf.toString();
        buf.setLength(0);

        for (int i = 0; i < brackets; i++)
            buf.append('[');

        boolean found = false;

//        for (int i = Constants.T_BOOLEAN; (i <= Constants.T_VOID) && !found; i++) {
//            if (Constants.TYPE_NAMES[i].equals(type)) {
//                found = true;
//                buf.append(Constants.SHORT_TYPE_NAMES[i]);
//            }
//        }

        if (!found) // Class name
            buf.append('L' + type.replace('.', '/') + ';');

        return buf.toString();
    }

    private static int countBrackets(String brackets) {
        char[] chars = brackets.toCharArray();
        int count = 0;
        boolean open = false;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '[':
                    if (open)
                        throw new RuntimeException("Illegally nested brackets:" + brackets);
                    open = true;
                    break;

                case ']':
                    if (!open)
                        throw new RuntimeException("Illegally nested brackets:" + brackets);
                    open = false;
                    count++;
                    break;

                default:
                    // Don't care
            }
        }
        if(open)
            throw new RuntimeException("Illegally nested brackets:" + brackets);

        return count;
    }
}
