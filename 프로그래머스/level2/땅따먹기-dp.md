# 땅따먹기




## 아이디어

* dp



## 코드

```java
class Solution {
    int solution(int[][] land) {
        int answer = 0;

        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < 4; j++){
                int past_max = 0;
                for(int k = 0; k < 4; k++){
                    if(j != k) past_max = Math.max(past_max, land[i-1][k]);
                }
                land[i][j] += past_max;
            }
        }
        
        for(int i = 0; i < 4; i++)
            answer = Math.max(answer, land[land.length - 1][i]);

        return answer;
    }
}
```