/*
Sample Output:
    4
*/

public class toggleTheBulb {
    public static void main(String[] args) {
        int n=16;
        boolean[] b = new boolean[n+1];
        for(int i = 1;i<=n;i++){
            b[i]=true;
        }
        for(int i=2;i<=n;i=i+2){
            b[i]=false;
        }
        for(int i=3;i<=n;i++){
            for(int j=i;j<=n;j=j+i){
                b[j]=b[j];
                if(b[j]==true){
                    b[j]=false;
                }else{
                    b[j]=true;
                }
            }
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(b[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}