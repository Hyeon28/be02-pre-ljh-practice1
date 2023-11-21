package day2;
public class 배열_초기화와_배열_크기 {
    public static void main(String[] args) {

        /*
        Integer와 int의 차이

         */

        //초기화 = 배열을 만들 때 값을 저장해서 만들 수 있다
        Integer[] arr = new Integer[10];
        //크기를 지정하지 않아도 알아서 생성됨
        int[] arr2 = {20,4,2,8,2,113};

        //배열의 크기는 배열이 저장된 변수이름.length로 구할 수 있다
        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }
}