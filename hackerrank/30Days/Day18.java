import java.util.*;

public class Day18{

	public Queue<Character> myQueue = new LinkedList<>();
	public Stack<Character> myStack = new Stack<>();

	void pushCharacter(char ch){
		this.myStack.push(ch);
	}

	void enqueueCharacter(char ch){
		this.myQueue.add(ch);
	}

	char popCharacter(){
		return this.myStack.pop();
	}

	char dequeueCharacter(){
		return this.myQueue.remove();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString  = input.next();

		char[] a = inputString.toCharArray();		

		Day18 sol = new Day18();

		for(int i = a.length -1; i >=0 ; i--){
			sol.pushCharacter(a[i]);
			sol.enqueueCharacter(a[i]);
		}

		boolean palindrome = true;

		for(int i = a.length -1; i >=0 ; i--){
			if(sol.popCharacter() != sol.dequeueCharacter()){
				palindrome = false;
				break;
			}
		}

			System.out.printf("The String " + inputString + " is %s\n%s\n", (palindrome? " a Palindrome" : " not a Palindrome"), Day18.class.getDeclaredMethods().length);

	}
}