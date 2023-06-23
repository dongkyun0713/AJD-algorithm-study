package src.level1;

// level-1
// 가장 가까운 같은 글자

// s	    result
// "banana"	[-1, -1, -1, 2, 2, 2]
// "foobar"	[-1, -1, 1, -1, -1, -1]

public class P142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;
    }
}
