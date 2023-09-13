public class Fun{
	
	public static void main(String[] agrs){
        int add = additionOfTwoNumbers();
		System.out.println(add);
        int addi = additionOfThreeNumbers();
		System.out.println(addi);
        int addit = additionOffourNumbers();
		System.out.println(addit);
	int product = mutliplicationOfTwoNumbers();
		System.out.println(product);
        int thing = mutliplicationOfThreeNumbers();
		System.out.println(thing);
         int pack = mutliplicationOffourNumbers();
		System.out.println(pack);
         int set = subtractionOftwoNumbers();
		System.out.println(set);
         int sub = subtractionOfthreeNumbers();
		System.out.println(sub);
         int subt = subtractionOffourNumbers();
		System.out.println(subt);
         float div = divisionOftwoNumbers();
		System.out.println(div);
         float mod = modulusOftwoNumbers();
		System.out.println(mod);
        }
        public static int additionOfTwoNumbers(){
		int a = 5, b = 6;
		int add = a + b;
		return add;

        }
        public static int additionOfThreeNumbers(){
		int a = 5, b = 6, c = 9;
		int add = a + b + c;
		return add;

        }
         public static int additionOffourNumbers(){
		int a = 5, b = 6, c = 9, d = 10;
		int add = a + b + c + d;
		return add;

        }
        public static int mutliplicationOfTwoNumbers(){
		int a = 5, b = 6;
		int mul = a * b;
		return mul;
	}
         public static int mutliplicationOfThreeNumbers(){
		int a = 5, b = 6, c = 5;
		int mul = a * b *c;
		return mul;
	}
         public static int mutliplicationOffourNumbers(){
		int a = 5, b = 6, c = 5, d = 9;
		int mul = a*b*c*d;
		return mul;
	}

        public static int subtractionOftwoNumbers(){
		int a = 5, b = 6; 
		int sub = a-b;
		return sub;
	}

        public static int subtractionOfthreeNumbers(){
		int a = 5, b = 6, c = 9; 
		int sub = a-b-c;
		return sub;
	}
        public static int subtractionOffourNumbers(){
		int a = 50, b = 6, c = 9, d = 20; 
		int sub = a-b-c-d;
		return sub;
	}
         public static float divisionOftwoNumbers(){
		float a = 5, b = 6; 
		float div = a/b;
		return div;
	}
        public static float modulusOftwoNumbers(){
		float a = 12, b = 5; 
		float mod = a%b;
		return mod;
	}
}