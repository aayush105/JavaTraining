package ClassObjectPractice;

public class Triangle {
	// sides
			int a;
			int b;
			int c;
			
			void getPerimeter() {
				int perimeter = a+b+c;
				
				System.out.println("Perimeter :"+perimeter);
			}
			
			void getArea() {
		        if((a+b)>c && (a+c)>b && (b+c)>a)
		          {
		            int s=(a+b+c)/2;
		            double  area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		             System.out.println("Area of Triangle is: " + area);    
		           }
		         else  
		           System.out.println("Area of Triangle not exit");
		   }
	
}
