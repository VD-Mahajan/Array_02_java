import java.io.*;
class Program10{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[size];
		
		System.out.println("Enter arr1 elements : ");
		
		for (int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter arr2 elements : ");
		
		for(int i=0;i<arr1.length;i++){
			int num=arr1[i];
			int sum=0;
			int rem=0;
			if(num==0){
				System.out.print(arr1[i]+" ");
			}else if(num%2==0){
				System.out.print(arr1[i]+" ");
			}else{
				while(num!=0){
					rem=num%10;
					sum=sum+rem;
					num=num/10;
				}
				if(sum%2==0){
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
		System.out.println();
	}
}

