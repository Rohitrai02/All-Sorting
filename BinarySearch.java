package arrays;

public class BinarySearch {

		public static int binarySearch(int[]arr,int x) {
			int s=0;
			int e=arr.length-1;
			while(s<=e) {
				int mid=(s+e)/2;
				if(arr[mid]>x) {
					e=mid-1;

				}else if(arr[mid]<x) {
					s=mid+1;
				}else {
					return mid;
				}
			}
			return -1;
		}

		public static void main(String[]args){
			int[] arr= {1,4,7,10,20,35,40};
			int index=binarySearch(arr,30);
			System.out.println(index);


	}

}
