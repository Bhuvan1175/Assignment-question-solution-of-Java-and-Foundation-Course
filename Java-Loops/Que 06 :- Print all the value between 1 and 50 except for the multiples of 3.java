// Que 06 :- Print all the value between 1 and 50 except for the multiples of 3.
public class continueQue {
    public static void main(String[] args) {
        System.out.println("Values between 1 to 50 :");
        for(int i=1;i<=50;i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
