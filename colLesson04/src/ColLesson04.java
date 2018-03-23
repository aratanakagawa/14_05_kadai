import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        ArrayList<Word> words= new ArrayList<>();
        
        words.add(new Word());

        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        String tmp[] = input.split(" ");

        words.get(0).setWord(tmp[0]);
        words.get(0).setMeaning(tmp[1]);

        int i=1;
        System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
        String nextinput = sc.nextLine();
        String nexttmp[] = nextinput.split(" ");

        do{
            words.add(new Word());

            nexttmp = nextinput.split(" ");

            if(nexttmp[0].equals("e")){
                break;
            }else {

                words.get(i).setWord(nexttmp[0]);
                words.get(i).setMeaning(nexttmp[1]);
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                nextinput = sc.nextLine();
            }
            i++;
        } while(i<5);
        System.out.println("登録制限を越えました。登録済みのデータは以下になります");

        int t;
        for(t=0;t<i;t++){
            System.out.println(words.get(t).toString());
        }
        System.out.println(t+"件、登録しました。");

    }
}
