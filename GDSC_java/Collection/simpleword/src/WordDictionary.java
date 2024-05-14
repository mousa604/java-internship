import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDictionary {

    private Map<Character, ArrayList<String>> words;

    WordDictionary(){
        words = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ++ch){

            words.put(ch,new ArrayList<String>());
        }


    }

    public void addWord(String word) {
        char firstLetter = word.toLowerCase().charAt(0);
        ArrayList<String> mm=words.get(firstLetter);
        mm.add(word);
        words.put(firstLetter,mm);
    }


    public void printAllWords() {
        for (char key : words.keySet()) {
            List<String> wordList = words.get(key);
            if(wordList.size()>0){
                System.out.println("Letter: " + key);
                for (String word : wordList) {
                    System.out.println(word);
                }
            }else {

            }
        }
    }


    public void printWordsOfLetter(char letter) {
        List<String> wordList = words.get(letter);
        if (wordList != null) {
            System.out.println("Words starting with " + letter + ":");
            for (String word : wordList) {
                System.out.println(word);
            }
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }

}
