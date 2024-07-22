public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        try {
            // Get Enum Class
            Class<?> secretEnum = Class.forName("Secret");

            // Get enum constants
            Object[] constants = secretEnum.getEnumConstants();

            for(Object constant : constants) {
                if (constant.toString().startsWith("STAR")) {
                    counter++;
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Enum class 'Secret' not found.");
        }


        System.out.println(counter);
    }
}

//enum Secret {
//    STAR, CRASH, START, // ...
//}
