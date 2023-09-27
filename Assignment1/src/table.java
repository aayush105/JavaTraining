
public class table {
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		System.out.printf("%25s%n", "Detail");
		System.out.println("-----------------------------------------------");
		
		System.out.printf("| %-4s | %-8s | %-4s | %-10s | %-6s |%n", "SN", "Name","Age","Phone","City");
		System.out.printf("------------------------------------------------%n");
		
		System.out.printf("| %-4s | %-8s | %-4d | %010d | %-6s |%n", "1.", "Ram",19,98561398,"KTM");
		System.out.println("------------------------------------------------");
		
		System.out.printf("| %-4s | %-8s | %-4d | %010d | %-6s |%n", "2.", "Sita",18,903324233,"BKT");
		System.out.println("------------------------------------------------");
		
		System.out.printf("| %-4s | %-8s | %-4d | %010d | %-6s |%n", "3.", "Hari",20,897212397,"PKR");
		System.out.println("------------------------------------------------");
		
		System.out.printf("| %-4s | %-8s | %-4d | %010d | %-6s |%n", "4.", "Gita",32,789127389,"KTM");
		System.out.println("------------------------------------------------");
		
		System.out.printf("| %-4s | %-8s | %-4d | %010d | %-6s |%n", "5.", "Shyam",16,123827321,"BKT");
		System.out.println("------------------------------------------------");

	}
}
