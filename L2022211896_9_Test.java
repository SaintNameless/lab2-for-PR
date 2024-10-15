import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @descripition:
 *
 * 测试用例时，我们需要考虑不同的场景，包括基本的边界情况、正常情况、以及特殊情况。
 *
 * 先考虑边界情况，再使用等价划分法进行测试
 */



public class L2022211896_9_Test {

//测试dislike没有的情况，应成功
    @Test
    public void none(){
        Solution9 test1=new Solution9();
        int[][] arr1 = {};
        boolean test11=test1.possibleBipartition(3,arr1);
        assertEquals(test11,true);
    }

//测试仅有一对关系的情况，也应成功
    @Test
    public void onlytwo(){
        Solution9 test1=new Solution9();
        int[][] arr1 = {{1,2}};
        boolean test11=test1.possibleBipartition(2,arr1);
        assertEquals(test11,true);
    }

//再测试dislike关系互相无关联的情况，应成功
    @Test
    public void noconnect(){
        Solution9 test2=new Solution9();
        int[][] arr2 = {{1,2}, {4,5}, {6,7}};
        boolean test22=test2.possibleBipartition(8,arr2);
        assertEquals(test22,true);
    }

//测试三组dislike关系互相关联循环的情况，应失败
    @Test
    public void fullconnect(){
        Solution9 test3=new Solution9();
        int[][] arr3 = {{1,2},{2,3},{1,3}};
        boolean test33=test3.possibleBipartition(3,arr3);
        assertEquals(test33,false);
    }

//测试寻常的二划分关系，应成功
    @Test
    public void commonconnect(){
        Solution9 test3=new Solution9();
        int[][] arr3 = {{1,2},{2,3},{2,4},{3,5},{4,6}};
        boolean test33=test3.possibleBipartition(6,arr3);
        assertEquals(test33,true);
    }

//测试大量关系下的二划分关系，本组例子应该是成功的
    @Test
    public void largeconnect(){
        Solution9 test3=new Solution9();
        int[][] arr3 = {{1, 2}, {1, 3}, {1, 4},
                        {2, 5}, {2, 6},
                        {3, 7}, {3, 8},
                        {4, 9}, {4, 10},
                        {5, 11}, {6, 12}};
        boolean test33=test3.possibleBipartition(12,arr3);
        assertEquals(test33,true);
    }
    //测试Test1
    @Test
    public void Test1(){
        Solution9 test=new Solution9();
        int[][] arr = {{1,2},{1,3},{2,4}};
        boolean Test=test.possibleBipartition(4,arr);
        assertEquals(Test,true);
    }
    //测试Test2
    @Test
    public void Test2(){
        Solution9 test=new Solution9();
        int[][] arr = {{1,2},{1,3},{2,3}};
        boolean Test=test.possibleBipartition(3,arr);
        assertEquals(Test,false);
    }
    //测试Test3
    @Test
    public void Test3(){
        Solution9 test=new Solution9();
        int[][] arr = {{1,2}, {2,3},{3,4},{4,5},{1,5}};
        boolean Test=test.possibleBipartition(5,arr);
        assertEquals(Test,false);
    }
}
