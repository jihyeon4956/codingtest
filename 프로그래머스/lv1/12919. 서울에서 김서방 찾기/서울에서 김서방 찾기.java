class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String find = "Kim";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals(find)){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}