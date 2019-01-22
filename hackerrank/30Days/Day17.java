public class Day17{

	int power(int n, int p) throws Exception{
		if(n <0 || p < 0)
			throw new Exception("This variables n and p must both be positive");

		return (int)(java.lang.Math.pow(n, p));
	}

	public static void main(String[] args) {
		Day17 d7 = new Day17();

		try{
			d7.power(12, -89);
		}catch(Exception e){
			System.err.println(e.getClass().getSimpleName()+ ": "+ e.getMessage());
		}
	}
}