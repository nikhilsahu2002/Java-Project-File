public class order {
    static String name[] ={"madras","delhi","bombay"};

    public static void main(String[] args) {
        for (int i = 0; i < name.length; i++) {
            for (int j = i+1; j < name.length; j++) {
                if (name[j].compareTo(name[i])<0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
