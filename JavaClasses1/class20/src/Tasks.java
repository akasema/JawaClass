
		// TODO Auto-generated method stub
//	Create a method that will take 1 parameter as a String and return reversed String. 
//	Method should be visibly only within same package.
//	Create a method that will take a String and return whether String is palindrome or not. 
//	Method should be available to all classes within your projects.
//	Create a method that will take a string and return an array of words from that string. 
//	Method should be available only within same class.
public class Tasks {
	
	String reverseString(String param);
	String result="";
	char[] charArray=param.toCharArray();
	
	for (int i=charArray.length-1; i>=0; i--) {
		
		result +=charArray[i];
	}
	
	return result;

	public static void main(String[] args) {

		Tasks task1=new Tasks;
		String result=task1.reverseString(kadir);
		System.out.println(result);
		

	}
	public boolean isPlaindrom8String param){
		boolean result 0 false;
		String reverse0 reverseString(param);
		if (param.equalIgnoreCase(reverse)) {
			result = true;
			}else {
				result= false;
			}
		return result;
	}
	
	String [] arrayOfWords(String sentence) {		
//		String [] stringArray=sentence.split(" ");
//		return stringArray;
		return sentence.split(" ");		
	}
}
