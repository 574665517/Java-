package 两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ywx
 * @ date 2019年5月6日
 * 给定 nums = [2, 7, 11, 15], target = 9
 * ，因为 nums[0] + nums[1] = 2 + 7 = 9，所以返回 [0, 1]
 */
public class Solution {
	/*使用查找表来解决该问题。
	设置一个 map 容器 map 用来记录元素的值与索引，然后遍历数组 nums。
    每次遍历时使用临时变量 temp 用来保存目标值与当前值的差值
    在此次遍历中查找 map ，查看是否有与 temp 一致的值，如果查找成功则返回查找值的索引值与当前变量的值 i
    如果未找到，则在 map 保存该元素与索引值 i
*/
    public int [] twoSum(int [] nums, int target) {
    	Map <Integer, Integer> map = new HashMap <>();
    	for(int i = 0;i < nums.length; i++) {
    		int temp = target - nums[i];
    		if(map.containsKey(temp)) {
    			return new int[] {map.get(temp), i};
    		}
    		map.put(nums[i], i);
    	}
		return new int[] {-1, -1};
    	
    }
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		Solution s = new Solution();
		s.twoSum(nums, 9);
	}

}
