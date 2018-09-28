package Programmers;

public class Programmers_SumMatrix {

        int[][] sumMatrix(int[][] A, int[][] B) {
            //두개의 이차원 배열중 길이가 긴 것을 row(열)로 담고
            int row = Math.max(A.length, B.length);
            //두개의 이차원 배열의 0번째 인덱스의 길이중에 긴 것을 col(행)으로 담는다.
            int col = Math.max(A[0].length, B[0].length);

            //그리고 answer의 배열의 크기를 [열][행]으로 아래처럼 만든다.
            int[][] answer = new int[row][col];

            for(int i=0; i<row ; i++){
                for(int j=0; j<col; j++){
                    answer[i][j] = A[i][j] + B[i][j];
                }
            }

            return answer;
        }

        public static void main(String[] args){

        Programmers_SumMatrix c = new Programmers_SumMatrix();
        int[][] A = { { 1, 2 }, { 2, 3 } };
        int[][] B = { { 3, 4 }, { 5, 6 } };
        int[][] answer = c.sumMatrix(A, B);
        if (answer[0][0] == 4 && answer[0][1] == 6 &&
                answer[1][0] == 7 && answer[1][1] == 9) {
            System.out.println("맞았습니다. 제출을 눌러 보세요");
        } else {
            System.out.println("틀렸습니다. 수정하는게 좋겠어요");
        }

    }
}
