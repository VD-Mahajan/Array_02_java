import java.io.*;
class Program2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		int sum=0;
		int[] arr = new int[size];
		
		System.out.println("Enter array elements : ");
		
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int oddCount=0;
		int evenCount=0;
		for (int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				oddCount++;
			}
			else{
				evenCount++;
			}
		}
		System.out.println("Odd elements in array is  : "+oddCount);
		System.out.println("Even elements in array is  : "+evenCount);
	}
}
