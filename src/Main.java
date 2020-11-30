import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] pinakasUser = getIntegers();
        int[] sortedInt= sortInte(pinakasUser);
        printArray(sortedInt);
    }
    public static int[] getIntegers() {
        int[] inte = new int[50];
        System.out.println("Enter 5 values");
        for (int i=0;i<inte.length; i++)
            inte[i] = input.nextInt();
        return inte;
    }
    public static int[] sortInte(int[] pina){
        int temp;
        System.out.println("Sorting the table...");
        for (int i=0;i<pina.length;i++)
            for (int y=0;y<pina.length -1;y++)
                if (pina[y] < pina[y+1]) {
                    temp = pina[y];
                    pina[y] = pina[y + 1];
                    pina[y+1] = temp;
                }
        return pina;
    }
    public static void printArray(int[] pinak){
        System.out.println("O taksinomimenos pinakas desc: ");
        for(int i=0;i<pinak.length;i++)
            System.out.println(pinak[i]);
    }
}
