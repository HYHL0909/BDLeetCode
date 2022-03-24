package day16;

import java.util.LinkedList;

public class Max_hao {
    /*遍历给定数组中的元素，
    如果队列不为空且当前考察元素大于等于队尾元素，则将队尾元素移除。直到，队列为空或当前考察元素小于新的队尾元素；
    当队首元素的下标小于滑动窗口左侧边界left时，表示队首元素已经不再滑动窗口内，因此将其从队首移除。
    由于数组下标从0开始，因此当窗口右边界right+1大于等于窗口大小k时，意味着窗口形成。
    此时，队首元素就是该窗口内的最大值。*/
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        for (int right = 0; right < nums.length; right++) {

            //队列里存的是可能的最大值
            //为了构造单调队列，让大的排在首位，如果要添加的数大于已经在队列里的数，那么队列里的这个数就不会再是可能的最大
//            将这个数剔除
            while (!queue.isEmpty() && nums[right] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(right);

            //如果这个最大值已经在窗口外了，就删除了
            int left = right - k + 1;
            if (queue.peekFirst() < left) {
                queue.removeFirst();
            }
            //窗口形成
            if (right + 1 >= k) {
                res[left] = nums[queue.peekFirst()];
            }
        }
        return res;
    }


}
