package Week4.PrintB;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        String[][] table= new String[7][4];

        for (int i=0; i< table.length;i++){
            for (int j=0; j<table[i].length;j++){
                if (i==0||i==3||i==6){
                    table[i][j]="*";
                }
                else if(j==0||j==3){
                    table[i][j]="*";
                }
                else {
                    table[i][j]=" ";
                }

            }
        }
        for (String[] i:
             table) {
            for (String j:
                 i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
