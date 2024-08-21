package main.java.section02.string;

public class Application01 {
    public static void main(String[] args) {
        /*
        *
        *  charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
        * 인덱스는 0부터 시작하는 숫자 체계를 말함
        * 인덱스를 벗어난 경우 정수를 인자로 전달하는 경우에는
        * IndexOutBoundException 예외처리가 발생
        *
        *
        * */
        String str1 = "apple";

        for(int i = 0; i<str1.length(); i++){
            System.out.println("charAt ("+i+") "+str1.charAt(i));
        }
        /*
        * compareTo() - 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같다면 0을 반환 인자로 전달된 문자열보다 작으면 음수를 크다면 양수를 반환
        * 이 메소드는 대소문자를 구분하여비교한다.
        * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        System.out.println("compareTO()"+(str2.compareTo(str3)));
        System.out.println("compareTO()"+(str2.compareTo(str4)));
        System.out.println("compareTO()"+(str2.compareTo(str5)));
        /*
        * concat() 문자열에 인자로 전달된 문자열을 합쳐 새로운 문자열을 반환한다 원본엔 영향을 안줌
        * */
        System.out.println("concat : "+(str2.concat(str5)));
        System.out.println(str2);

        /*
        * indexOf() 문자열에서 특정 문자를 탐색하여
        * 처음 일치하는 인덱스 위치를정수형으로 반환한다
        * 일치하는 문자가 없는 경우는 -1을반환
        * */
        String indexOf = "java oracle";

        System.out.println("indexif 'a' :"+indexOf.indexOf("a"));
        System.out.println("indexif 'z' :"+indexOf.indexOf("z"));

        //lastIndexof 뒤에서부터 탐색해서 처음일정하는 인덱스위치
        System.out.println("last indexOf : "+indexOf.lastIndexOf("a"));
        System.out.println("last indexOf : "+indexOf.lastIndexOf("z"));
    }
}
