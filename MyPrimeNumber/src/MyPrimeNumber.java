
public class  MyPrimeNumber{

	int isPrime(int num){
		  int isPrime = 1;
		  int i=2;

		  while(i<num){
			 if((num%i)==0){
				 isPrime=0;
				 break;
			 }
			 i++;
		  }
		  return isPrime;
		}
}
