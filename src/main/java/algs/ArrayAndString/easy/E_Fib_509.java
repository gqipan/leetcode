package algs.ArrayAndString.easy;

/**
 * @author Qipan.G
 * @since 2019/3/3 13:55
 */
public class E_Fib_509 {



    public static int solution_1(int N) {
        if (N==0){
            return 0;
        }
        if (N == 1){
            return 1;
        }
        return E_Fib_509.solution_1(N-1) + E_Fib_509.solution_1(N-2);
    }

    public static int solution_2(int N){
        int[] f = new int[N + 1];
        f[0] = 0;
        if (N > 0){
            f[1] = 1;
        }
        for (int i = 2; i <= N; i++) {
            f[i] = f[i-1] + f[i - 2];
        }
        return f[N];
    }

}
