import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        Word[] words=new Word[10];

        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        String tmp[] = input.split(" ");

        words[0]=new Word();
        words[0].setWord(tmp[0]);
        words[0].setMeaning(tmp[1]);

        int i=1;
        System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
        String nextinput = sc.nextLine();
        String nexttmp[] = nextinput.split(" ");
        do{
            words[i]=new Word();

            nexttmp = nextinput.split(" ");

            if(nexttmp[0].equals("e")){
                break;
            }else {
                
                words[i].setWord(nexttmp[0]);
                words[i].setMeaning(nexttmp[1]);
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                nextinput = sc.nextLine();
            }
            i++;
        } while(i<5);
        System.out.println("登録制限を越えました。登録済みのデータは以下になります");

        int t;
        for(t=0;t<i;t++){
            System.out.println(words[t].toString());
        }
        System.out.println(t+"件、登録しました。");
    }
}
