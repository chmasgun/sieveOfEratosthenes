
public class Primes {

	public static void main(String[] args) {
		int numPrimes=10000;  // number of primes to store in the memory
		int searchLim=200000; // we may want to give up after certain threshold
		int findPrime=79;	  // return me 79th prime number
		int[] prm= new int[numPrimes];
		Number[] set=new Number[searchLim];
		for(int i=0;i<searchLim;i++){
			set[i]=new Number();
		}
		int cnt=0;
		for(int i=2;i<searchLim;i++){
			// set is a array of Numbers, where Number is a class that holds primeness
			// data only. Each number is mapped to (number-2)th index of set. It is 
			// because we start with 2 as set[0].
			if(set[i-2].isPrime()){
				// Initially all numbers are set as prime.
				prm[cnt]=i;
				cnt++;
				if(cnt>numPrimes-1){
					break;
				}

				int icnt=1;
				while(icnt*i<searchLim){
					// Multiples of prime number i are marked as composite.
					set[icnt*i-2].setComposite();
					icnt++;
				}
			}
		}
		
		for(int i=0; i<numPrimes;i++){
			System.out.print(prm[i]+" ");
			if((i+1)%100==0){
				System.out.println();
			}

		}
		
		
		System.out.println(findPrime+"th prime number is "+prm[findPrime-1]);
	}

}
