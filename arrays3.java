public class arrays3 {

        public static void main(String[] args) {
        int[] idades = {15, 28, 18, 30, 12, 25, 13, 17, 19, 25};

        System.out.println("Idades maiores que 18:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i]);
            }
        }
    }
}

