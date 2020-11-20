package lecture11.assignment;

import java.util.HashMap;
import java.util.Scanner;

//1876166 박지윤 11주차 과제

public class DictionaryOfNewWords {
    public static void main(String [] args){
        HashMap<String, String > dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String v, k, find;

        dic.put("갑분싸", "갑자기 분위기 싸해짐");
        dic.put("존버", "존나 버티기");
        dic.put("TMI", "Too much information");
        dic.put("JMT", "존맛탱");
        dic.put("렬루", "리얼루/ 진짜로 ");
        dic.put("커엽다", "귀엽다");
        dic.put("사바사", "사람 by 사람. 사람마다 다르다");
        dic.put("룸곡", "눈물을 뒤집은 말");
        dic.put("룸곡옾높", "폭풍눈물을 뒤집은 말");
        dic.put("법블레스유", "화가 많이 났지만 법때문에 참는다");
        dic.put("이생망", "이번 생은 망했다");
        dic.put("인싸", "인싸이더");
        dic.put("별다줄", "별걸 다 줄인다");
        dic.put("영고", "영원한 고통");
        dic.put("삼귀다", "사귀는것보다 덜한사이");

        printdict(dic);

        while(true){
            System.out.println("찾고싶은 단어를 입력하세요 : (종료 : 0) ");
            find = scanner.next();
            if(find.equals("0")) break;
            search(dic, find);
        }
        System.out.println("종료합니다");


    }
    static void printdict(HashMap<String, String> dic){
        System.out.println("================신조어 사전================");
        for(String key: dic.keySet()){
            System.out.println("[ "+key+" ] : "+dic.get(key) );
        }
        System.out.println("==============총 "+dic.size()+"개===============");
    }
    static void search(HashMap<String, String> dic, String key){
        String value = dic.get(key);
        Scanner scanner = new Scanner(System.in);
        if(value==null){
            System.out.println("[ "+key+" ] is not in dictionary");
            System.out.println("이 단어를 추가하시고싶습니까? (y/n) ");
            String ans = scanner.nextLine();
            if(ans.equals("y")){
                System.out.println("[ "+ key+ " ] 는 무슨 뜻입니까?");
                String meaning = scanner.nextLine();
                System.out.println();
                dic.put(key, meaning);
                printdict(dic);
            }
            else{
                System.out.println("[ "+key +" ] 를 추가하지 않겠습니다" + ans);
                return;
            }
        }
        else{
            System.out.println("[ "+key+" ] : [ "+value+ " ]");
        }
    }

}
