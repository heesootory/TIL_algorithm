import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *  πΆ λΆλ μμμ  μ€μ°¨
 *
 *  λ³μμ μ€μνμ μ μ₯νλ©΄ μ€μ°¨κ° λ°μ.
 *  μ€μνμ μμκ° 2μ§μλ‘ μ μ₯λκΈ° λλ¬Έμ μ΄λ₯Ό λνλΌμ μμ κ²½μ° κ°μ₯ κ·Όμ¬ν κ°μ μ μ₯νκΈ° λλ¬Έ..
 *
 *  μλ₯Ό λ€μ΄, doubleν λ³μμ 0.58μ μ μ₯νκ³  *100μ νλ€λ©΄ 58μ΄ λμ¨λ€κ³  μκ°ν  μ μμ§λ§ μ»΄ν¨ν°λ μ΄λ₯Ό μ μ₯νμ§ λͺ»νκ³  0.579999999λ‘ μ μ₯νκΈ° λλ¬Έμ
 *  μ€μ λ‘ 57μ΄ λ°ν.
 *
 *  μ΄ λ¬Έμ μμλ νΌμΌνΈλ₯Ό κ΅¬νλ κ³΅μμμ (left*100/right)μΈλ° μ΄ κ°μ (left/right*100) κ³Ό κ²°κ³Όκ° λ€λ₯΄κ² λμ¨λ€.
 *  
 *  κ·Όλ° μ νλλ λ§κ³  νλλ νλ¦°κ°??????? why???
 */

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        double left = (double)y;
        double right = (double)x;
        double origin = Math.floor(left * 100/right);
        double ans = 0.0;
        int cnt = 0;

        if (origin >= 99) {         // 99νΌμΌνΈμ΄μμ λμ΄μ μ¬λΌκ°μ μμΌλ―λ‘ -1 μΆλ ₯
            System.out.println(-1);
        }
        else{
            while(true){
                left++; right++;
                ans = Math.floor(left * 100/right);
                cnt++;
                if(ans - origin >= 1) break;
            }
            System.out.println(cnt);
        }

    }
}