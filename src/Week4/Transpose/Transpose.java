package Week4.Transpose;

public class Transpose {
    public static void main(String[] args) {
        int[][] matris= {//matris oluşturuldu
                {2,3,4},
                {5,6,4}
        };
        int[][] t = findTranspose(matris);//Transpoz değeri döndürüldü

        System.out.println("Matris : ");
        printMatrix(matris);

        System.out.println("Transpoze : ");
        printMatrix(t);



    }
    public static int[][] findTranspose(int[][] arr){
        int[][] t = new int[arr[0].length][arr.length]; //yeni dizi tanımlandı

        for (int i = 0; i < arr.length; i++){//elemanlar nested forla atandı
            for (int j = 0; j < arr[0].length; j++){
                t[j][i] = arr[i][j];
            }
        }
        return t;
    }

    public static void printMatrix(int[][] arr){//yazdırma fonksiyonu
        for (int[] x : arr){
            for (int y : x)
                System.out.print(y + "\t");
            System.out.println();
        }
    }

}
