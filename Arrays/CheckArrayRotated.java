package Arrays;
//Date:15/09/2022
public class CheckArrayRotated {
	static boolean checkArray(int[] nums)
	{

			int count=0;
			for(int index=0;index<nums.length;index++)
			{
				if(nums[index]>nums[(index+1)%nums.length])//if condition more one time true array is sorted
				{											//% modlus use for check last condition
					count++;
				}
			}
			if(count>1) return false;
			return true;
	}

	public static void main(String[] args) {
	int[] number= {3,4,5};	
	System.out.println(checkArray(number));

	}

}
