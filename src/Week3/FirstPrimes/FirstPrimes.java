package Week3.FirstPrimes;

public class FirstPrimes {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) //ilk 100 sayıyı döndürür
        {
            boolean isPrime = true;
            for (int j = 2; j*j <= i; j++) // Asal sayıyı kontrol eder
            {
                if(i % j == 0){
                    isPrime = false; //eğer bölen çıkarsa sonraki sayıya geçilir.
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }
    }
}
