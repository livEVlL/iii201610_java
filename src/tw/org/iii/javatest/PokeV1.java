package tw.org.iii.javatest;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class PokeV1 {
    public static void main (String[] args){
        // 洗牌
        int[] poker = new int[52];
        boolean isRepeat; int temp;
        for(int i=0; i<poker.length ;i++) {

            do{
                temp = (int) (Math.random() * poker.length);
                // 檢查機制(重複與否)
               isRepeat = false;
                for (int j = 0; j < i; j++) { //比對有沒有和前面一樣
                    if (poker[j] == temp) {
                        // 重複就break
                        isRepeat = true;
                        break;
                    }
                }

            }while (isRepeat);
            poker[i] = temp;
            System.out.println(poker[i]);
            }
        }
        // 發牌
        // 攤牌(理牌)

    }

