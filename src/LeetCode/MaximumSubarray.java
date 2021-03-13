package LeetCode;

/*
 * 배열에 있는 두 수를 더해서 타겟의 수와 일치하면 배열의 자리수를 return 하는 문제
 * 다른 방법도 있었지만, 모든 배열을 탐색해서 찾는 방법으로 해결.
 * 다른 방법은 전혀 생각나지 않았음. 만약 코딩테스트에서 나온다면 아래와 같이 풀 것 같음.
 *
 * */

public class MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int num : nums) {
                temp = temp + num;
                if (answer < temp) {
                    answer = temp;
                }
            }
        }

    }
}
