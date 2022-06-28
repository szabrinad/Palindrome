import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Palindrome {
    public static void main(String[] args) {
        int i,k;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah karakter=");
        k=input.nextInt(); input.nextLine();
        char []A=new char[k];
        for(i=0;i<k;i++){
            System.out.print("Karakter ke-"+i+"\t");
            A[i]=input.nextLine().charAt(0);
        }
        String kata2 = "";
        for (int j = A.length - 1; j >= 0; j--) {
            System.out.print(A[j]);
    }
}
}
