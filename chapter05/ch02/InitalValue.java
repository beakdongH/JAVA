package ch02;

import java.util.Arrays; //java안에이쓴 util안에있는 Arrays클래스

public class InitalValue {
    public static void main(String[] args){
        //일반 변수나 파일은 초기화가 자동으로 되지 않는다(C언어에서는 0이나 쓰레기값이 자동으로 들어가는데..)
        int value1;
//    System.out.println(value1);
        int[] value2;
//    System.out.println(value2);
        int value3 = 0;
        System.out.println(value3);
        //배열은 대표적인 참조변수다 아직 주소를 담을 수 없다면 null로 초기화 한다.
        int[] value4 = null;
        System.out.println(value4);
        System.out.println();

        //new로 만든 배열의 실체들은 자동으로 초기화가 된다.
        //일반변수 - new int[3]를 통해 3칸짜리 방을 만듬
        //방안에 하나하나 들어가는 것은 실제 값. 즉, 일반변수이다
        //참조변수 - array1은 배열을 뜻하는 참조변수이다. 주소값을 입력한다.
        //만약 없다면 NULL이다
        //ㄴC언어에선 포인터가 대표적이다.
        int[] array1 = new int[] {0,0,0}; //int 배열방의 초기값은 0다
        for(int i=0; i<3; i++){
            System.out.println(array1[i]);
        }
        System.out.println();

        boolean[] array2 = new boolean[3]; //boolean 배열방의 초기값은 false다
        for(int i=0; i<3; i++){
            System.out.println(array2[i]);
        }
        System.out.println();

        double[] array3 = new double[3]; //double 배열방의 초기값은 0.0다
        for(int i=0; i<3; i++){
            System.out.println(array3[i]);
        }
        System.out.println();

        String[] array4 = new String[3]; //String 배열방의 초기값은 null이다.
        // 이유는 String으로 만든 변수도 참조변수이기 때문이다.
        for(int i=0; i<3; i++){
            System.out.println(array4[i]);
        }
        System.out.println();

        //배열을 한 줄에 출력하는 방법
        //Arrays클래스 파일 안에있는 toString() 메서드를 실행시킴
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));



    }


}
