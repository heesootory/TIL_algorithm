import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int max = 0;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];       // 첫 연속일들의 온도 합
        }
        max = sum;
        
        for(int i = 0, j = i + k; i < n-k ; i++, j++){
            sum -= arr[i];
            sum += arr[j];
            max = Math.max(sum, max);
            
        }
        
        System.out.println(max);

    }
}
