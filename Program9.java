import java.io.*;
class Program9{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		int len1=arr1.length;
		int len2=arr2.length;
		
		System.out.println("Enter arr1 elements : ");
		
		for (int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter arr2 elements : ");
		
		for (int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Merged Array : ");
		
		int[] arr3=new int[len1+len2];
		
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<arr3.length;i++){
			arr3[i]=arr2[j++];
		}
		
		
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		
		
		System.out.println();
	}
}

