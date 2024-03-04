import java.io.InputStreamReader;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        Scanner sc = new Scanner(ir);

        int a = sc.nextInt();
        int saldoInicial = sc.nextInt();
        int[] arr = new int[a];
        int  menor = saldoInicial;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            saldoInicial += arr[i];
            if(saldoInicial < menor) menor = saldoInicial;

        }

        System.out.println(menor);
        sc.close();
    }
}
