import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();     // 일반 문자열
        String delete = scanner.nextLine();  // 폭발 문자열
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));  // 문자로 하나씩 넣기
            if (st.size() >= delete.length()) {
                boolean b = true;
                for (int j = 0; j < delete.length(); j++) {
                    if (st.get(st.size() - delete.length() + j) != delete.charAt(j)) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    for (int k = 0; k < delete.length(); k++) {
                        st.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
        sb.append(c);
        }
        System.out.println(st.size() == 0? "FRULA" : sb);
    }
}


//        char[] result = new char[str.length()];
//        char[] ch = new char[delete.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            result[i] = str.charAt(i);
//        }
//        for (int i = 0; i < delete.length(); i++) {
//            ch[i] = delete.charAt(i);
//        }
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < ch.length; j++) {
//                if (result[i] == ch[j]) {
//
//                }
//            }
//        }


//메모리 초과
//        while (true) {
//            if (str.length() == 0) {  // 일반 문자열에 아무것도 없으면
//                System.out.println("FRULA");  // "FRULA"를 출력
//                break;
//            }
//            else if (!str.contains(Delete)) {  // 일반 문자열에 폭발 문자열이 포함되어 있지 않다면 반복문 중지
//                break;
//            }
//            else {
//                str = str.replace(Delete,"");  // 일반 문자열에서 폭발 문자열 제거
//            }
//        }
//        System.out.println(str);