package tw.org.iii.javatest;

import javax.swing.*;

public class GuessNumber {
    public static void main(String[] args){
        // 1.產生謎底
        String answer = createAnswer(3);

        // 2. 開始猜
        boolean isWinner = false;
        for(int i =0 ; i<10 ; i++) {
            String guess = JOptionPane.showInputDialog("輸入答案");
            // 3.校對
            String result = checkAB(answer, guess);
            JOptionPane.showMessageDialog(null, result);
            if(result.equals("3A0B")){
                isWinner= true;
                break;
            }
        }
        if(isWinner){
            JOptionPane.showInputDialog(null,"哎唷厲害喔");
        }else {
            JOptionPane.showMessageDialog(null,"下次再努力吧，答案:"+ answer);
        }
    }
    static String createAnswer(int n) {
        // 洗牌
        int[] poker = new int[n]; // poker[0] = 0, ....
        int temp;
        boolean isRepeat;
        for (int i = 0; i < poker.length; i++) {
            do {
                temp = (int) (Math.random() * 10);
                // 檢查機制
                isRepeat = false;
                for (int j = 0; j < i; j++) {
                    if (poker[j] == temp) {
                        // 此時重複了
                        isRepeat = true;
                        break;
                    }
                }
            } while (isRepeat);
            poker[i] = temp;
            // System.out.println(poker[i]);
        }
        String ret = "";
        for (int v : poker) ret += v;

            return ret;
    }
    static String checkAB(String a,String g){
        int A , B; A = B = 0;
        for (int i =0 ; i<a.length();i++){
            if(g.charAt(i) == a.charAt(i)){
                A++;
            }else if (a.indexOf(g.charAt(i)) != -1){
                B++;
            }
        }
        return A +"A"+ B + "B" ;
    }
}
