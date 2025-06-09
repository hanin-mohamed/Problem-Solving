package meduim;

import java.util.*;

public class AnagramGroups {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list = new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String st = new String(chars);
            List<String> acc=map.getOrDefault(st,new ArrayList<>());
            acc.add(str);
            map.put(st,acc);
            }
       list.addAll(map.values());
        return list;
    }
    //Anthor Solution Time 6ms ,Memory 48.29 MB
    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sort = new String(chars);
            List<String> acc = map.get(sort);
            if (acc==null){
                acc=new ArrayList<>();
                map.put(sort,acc);
            }
            acc.add(str);
        }
        list.addAll(map.values());
        return list;
    }
    public static void main(String args[]){
        AnagramGroups anagramGroups= new AnagramGroups();
        System.out.println(anagramGroups.groupAnagrams(new  String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
