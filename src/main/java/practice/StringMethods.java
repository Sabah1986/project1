package practice;

public class StringMethods {

    public void indexOf(){
        String myStr="Hello planet earth,you are a great planet";
        System.out.println(myStr.indexOf("planet"));
    }

    public void substring(){
        String str="javaPoint";
        String subStr= str.substring(0,4);
        System.out.println(subStr);

    }
       public void length(){
        String txt="ABCDEFGEHIJKLM";
        System.out.println(txt.length());
       }
       public void trim(){
        String myStr="    hello    word";
        System.out.println(myStr);
        System.out.println(myStr.trim());}

        public void charAt(){
        String myStr="hello";
        char result=myStr.charAt(0);
        System.out.println(result);


    }
          public void spiltArray(){
        String sentence="the quick brown fox";
        String[] words=sentence.split(" ");
        for (String word:words){
            System.out.println("word is:" + word);
        }
          //string reverse
              String reverse=" ";
        for (int i=words.length -1; i>0; i--){
            reverse+=words[i]+ " ";
        }
        System.out.println("Sentence is :" + reverse);

          }


}