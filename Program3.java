import java.io.*;
class Program3{
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

		for (int i=0;i<arr.length;i++){
			if (arr[i]%2!=0){
				oddSum=oddSum+arr[i];
			}else{
				evenSum=evenSum+arr[i];
			}
		}
		System.out.println("Sum of odd elements in array is  : "+oddSum);
		System.out.println("Sum of even elements in array is  : "+evenSum);
	}
}
