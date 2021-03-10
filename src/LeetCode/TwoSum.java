package LeetCode;

/*
* 배열에 있는 두 수를 더해서 타겟의 수와 일치하면 배열의 자리수를 return 하는 문제
* 다른 방법도 있었지만, 모든 배열을 탐색해서 찾는 방법으로 해결.
* 다른 방법은 전혀 생각나지 않았음. 만약 코딩테스트에서 나온다면 아래와 같이 풀 것 같음.
*
* */

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 17;

        int[] answer = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

    }
}
