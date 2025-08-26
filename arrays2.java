public class arrays2 {
    public static void main(String[] args) {
        int[] num = {12, 6, 15, 23, 10, 33, 58, 47, 18, 8};

        System.out.println("numeros pares: ");
        for (int i = 0; i < num.length; i++){
            if (num[i] %2 == 0){
                 System.out.println(num[i]);
            }     
        }
    }
}
