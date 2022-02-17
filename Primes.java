public class Primes { //Выводит простые числа, которые меньше 100

        public static boolean isPrime(int n) { //Проверяет простое число или нет 
            for (int i = 2; i <= (n / 2); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

    public static void main(String[] args){ //Выводит числа меньше 100, если они простые
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

}
