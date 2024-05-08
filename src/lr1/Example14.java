package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
    int c = in.nextInt();
        System.out.println((c-1) + " " + (c) + " " + (c+1) + " " + Math.pow(((c-1)+(c)+(c+1)),2));
        in.close();
}
}
