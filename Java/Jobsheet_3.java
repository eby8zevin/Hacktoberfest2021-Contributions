import java.util.Scanner;
public class Jobsheet_3{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		float suhu, celcius, reamur, fahrenheit, kelvin;
		
		System.out.print("Celcius : ");
        suhu = sc.nextFloat();

        reamur = (float) 4 / 5 * suhu;
        System.out.println("reamur = " + reamur);

        fahrenheit = (float) 9 / 5 * suhu + 32;
        System.out.println("fahrenheit = " + fahrenheit);

        kelvin = suhu + 273;
        System.out.println("kelvin = " + kelvin);
		
		
		
		
	}
	
	
	
	
	
	
}