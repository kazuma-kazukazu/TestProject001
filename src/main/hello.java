/*
 * コメントその１ ハロー！と叫んでみた
 */
public class HelloWorld1 {
    public static void main(String[] args){
        System.out.println("Hello, world.contents1");
        this.subfunc111(10);
        this.subfuncAAA(20);

    }

    // 呼び出し関数その２
    public int subfunc111(int no){
        System.out.println("call subfunction 111");
    }

    // 呼び出し関数その２
    public int subfuncAAA(int no){
        System.out.println("call subfunction1");
    }

}
