package programers;

import java.util.Arrays;

public class Solution {
	public String solution(String[] participant, String[] completion) {

//		String answer = "";
//		int j = 0;
//		for (int i = 0; i < participant.length; i++) {
//			String part = participant[i];
//			for (j = 0; j < completion.length; j++) {
//				String comple = completion[j];
//				if (part.equals(comple)) {
//					completion[j] = null;
//					break;
//				}
//			}
//			if(j == completion.length) {
//				answer = participant[i];
//			}
//		}
//
//		return answer;
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[i];
	}
}
