import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
        int a = 0;
    for (String b : myList) {
      if (b.length() == len) {
        a++;
      }
    }

    return a;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    ArrayList<String> a = new ArrayList<>();
    for (String s : myList) {
      if (s.length() != len) {
        a.add(s);
      }
    }

    myList = a;
  }
}
/*
  .--.            .--.
 ( (`\\."--``--".//`) )
  '-.   __   __    .-'
   /   /__\ /__\   \
  |    \ 0/ \ 0/    |
  \     `/   \`     /
   `-.  /-"""-\  .-`
     /  '.___.'  \
     \     I     /
      `;--'`'--;`
jgs     '.___.'
*/
