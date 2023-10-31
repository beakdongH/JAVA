package ch04;

import java.util.Arrays;

public class ReadArray {

    public static void main(String[] args){
        int[] array = new int[] {3,4,5,6,7};

        //츨력하기 1.print만을 이용해서 출력
        System.out.print(array[0]+" ");
        System.out.print(array[1]+" ");
        System.out.print(array[2]+" ");
        System.out.print(array[3]+" ");
        System.out.print(array[4]+" ");
        System.out.println();

        //출력하기 2.for 문을 사용해서 출력
        //for문 사용시 배열의길이가 바뀌면 최대길이값을 일일히 수정해야하니 좋지아니한 코드가 됨
        //따라서 .length를 사용할 필요가 있다
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println();

        //출력하기 3.each-for문을 활용하기
        for(int k: array)
            System.out.print(k+" ");
        System.out.println();

        //출력하기 4.Arrays.toString()사용하기
        System.out.println(Arrays.toString(array));
    }

}
