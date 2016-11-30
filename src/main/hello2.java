//コメント
//Hello！と叫んでみる
//
public class HelloWorld2 {
    public static void main(String[] args){
        System.out.println("Hello, world.Section2");

        this.subfunc(10);
    }

    // 呼び出し関数その１
    public int subfunc(int no){
        System.out.println("call subfunction1");
    }
}
