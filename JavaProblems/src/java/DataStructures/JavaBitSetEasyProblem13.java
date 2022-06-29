package java.DataStructures;


import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSetEasyProblem13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//no.of Bits in b1 and b2
        int m = in.nextInt();//no.of operations to perform on b1 and b2
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitset = new BitSet[3];
         bitset[1]=b1;
         bitset[2]=b2;
         while(0<m--){
             String op=in.next();
             int x=in.nextInt();
             int y=in.nextInt();
             switch(op){
                 case "AND":
                     bitset[x].and(bitset[y]);
                     break;
                 case "OR":
                     bitset[x].or(bitset[y]);
                     break;
                 case "XOR":
                     bitset[x].xor(bitset[y]);
                     break;
                 case "FLIP":
                     bitset[x].flip(y);
                     break;
                 case "SET":
                     bitset[x].set(y);
                     break;
             }
             System.out.printf("%d %d%n", b1.cardinality(),b2.cardinality());
         }

    }
}