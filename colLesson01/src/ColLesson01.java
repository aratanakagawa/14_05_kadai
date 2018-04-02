import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[10];

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        // ここから記述してください
        // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
        String tmp[] = input.split(" ");

        words[0]=new Word();
        words[0].setWord(tmp[0]);
        words[0].setMeaning(tmp[1]);

        int i;
        System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
        for(i=1;i<10;i++){
            words[i]=new Word();
            String nextinput = sc.nextLine();
            String nexttmp[] = nextinput.split(" ");

            if(nexttmp[0].equals("e")){
                break;
            }else {

                words[i] = new Word();
                words[i].setWord(nexttmp[0]);
                words[i].setMeaning(nexttmp[1]);
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            }
        }

        int t;
        for(t=0;t<i;t++){
            System.out.println("単語: "+words[t].getWord()+" 意味: "+words[t].getMeaning());
        }
        System.out.println(t+"件、登録しました。");

    }
}
