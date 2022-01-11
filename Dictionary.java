package pik7;

import java.util.*;

public class Dictionary {
    private Map<String , List<String>> dictionary;
    public Dictionary()
    {
        this.dictionary=new HashMap<>();
    }
    public void add(String word , String translation)
    {
        List<String> trans=dictionary.get(word);
        if(trans==null)
        {
            dictionary.put(word, new ArrayList<>(Collections.singletonList(translation)));
        }else
        {
            if(!translation.contains(word))
            {
                trans.add(translation);
            }
        }
    }
    public void remove(String word, String translation)
    {
        List<String> trans=dictionary.get(word);
        if(trans==null)
        {
           dictionary.remove(word, new ArrayList<>(Collections.singletonList(translation)));
        }
        else
        {
                trans.remove(translation);
        }
    }
    public String bestTranslation(String sentence)
    {
    StringBuilder pr=new StringBuilder();
    String[]sent=sentence.split(" ");
    for (String s:sent)
    {
        List<String>tr=dictionary.get(s);
        if (tr!=null&&!tr.isEmpty())
        {
            pr.append(tr.get(0));
            pr.append(" ");
        }else {
            pr.append(s);
            pr.append(" ");
        }
     }
     return  pr.toString();
    }
    public void swapTranslationPriority(String word , String translation1 , String translation2)
    {
     List<String>trans=dictionary.get(word);
     if(trans!=null&&trans.contains(translation1)&&trans.contains(translation2))
     {
         Collections.swap(trans,trans.indexOf(translation1), trans.indexOf(translation2));
     }
    }
}
