
public class Ex01 {

	public static void main(String[] args) 
	{
		int[]nums = {23, 67, 8, 91, 45, 12, 78};
		System.out.println(nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[nums.length-1]);
		System.out.println(nums[nums.length/2]);
		
		for (int i=0; i<nums.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(nums[i]);
		}

	}

}
