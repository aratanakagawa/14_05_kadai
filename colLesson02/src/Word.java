public class Word {
    private String word;
    private String meaning;

    public Word(){
        this.word="";
        this.meaning="";
    }

    public void setWord(String word){
        this.word=word;
    }
    public void setMeaning(String meaning){
        this.meaning=meaning;
    }

//    public String getWord(){
//        return this.word;
//    }
//    public String getMeaning(){
//        return this.meaning;
//    }

    public String toString(){
<<<<<<< HEAD
        String str = "単語:"+this.word+" 意味:"+this.meaning;
        return str;
=======
        return "単語:"+this.word+" 意味:"+this.meaning;
>>>>>>> origin/master
    }
}
