import java.io.*;
class Program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		int oddSum=0;
		int evenSum=0;
		int[] arr = new int[size];
		
		System.out.println("Enter array elements : ");
		
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter an element to search from an array : ");
		int numToSearch=Integer.parseInt(br.readLine());
		
		for (int i=0;i<arr.length;i++){
			if (arr[i]==numToSearch){
				System.out.println("index of element in array is  : "+i);
				
			}
		}
	}
}

