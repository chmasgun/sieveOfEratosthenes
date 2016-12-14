
public class Number {
	
	private boolean isPrime;
	
	public Number(){
		
		isPrime=true;
	}
	
	protected void setComposite(){
		isPrime=false;
	}
	protected boolean isPrime(){
		return isPrime;
	}
}
