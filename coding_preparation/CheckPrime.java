package KULDEEP.coding_preparation;
class CheckPrime {
    public static void main(String[] args) {
        int n = 17 ;
        boolean isPrime = true ;
        for (int i = 2; i < n ; i++) {
            if ( n % i == 0){
                isPrime = false ;
                break ;
            }
        }
        if (isPrime){
            System.out.println("prime no");
        }else{
            System.out.println("Not a prime no");
        }
    }
}