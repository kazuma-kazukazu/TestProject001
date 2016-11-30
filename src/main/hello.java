/*
 * コメントその１ ハロー！と叫んでみた
 */
public class HelloWorld1 {
    public static void main(String[] args){
        System.out.println("Hello, world.contents1");

        this.subfunc000(20);	//add 20161130 testbranch010
        this.subfuncAAA(20);

    }

    // 呼び出し関数その１		//add 20161130 testbranch010
    public int subfunc000(int no){
        System.out.println("call subfunction1");
    }

    // 呼び出し関数その２
    public int subfuncAAA(int no){
        System.out.println("call subfunction1");
    }

}
