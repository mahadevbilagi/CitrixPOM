package QSpiderExamples;

public class CodeOptimization {

	public static void main(String[] args) {
		
		F f1 = new F();				// Ist
			f1.find();
		
		W w1 = new W();
			w1.send();
			w1.click();		
			
		F f11 = new F();				// 2nd
		W w11 = f11.find();
			
		new F().find().send();		// 3rd
		new F().find().click();
			
	}
	
	class F{
		W find(){
			System.out.println("Execute find");
			W w1 = new W();
			return w1;
		}
	}
	
	class W{
		void send(){
			System.out.println("Perform type");
		}
		void click(){
			System.out.println("Perform Click");
		}
	}

}
