public class arrays2 {
    public static void main(String[] args) {
        int[] num = {13, 7, 15, 23, 21, 33, 59, 40, 20, 8};

        System.out.println("numeros pares: ");
        for (int i = 0; i < num.length; i++){
            if (num[i] %2 == 0){
                 System.out.println(num[i]);
            }     
        }
    }
}

