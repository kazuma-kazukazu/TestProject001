//コメント
//Hello！と叫んでみる
//
public class BaseClass2 {
    public static void main(String[] args){
        System.out.println("Hello, world.Section2");

        this.subfunc(10);
        this.subfunc2(100);
    }

    // 呼び出し関数その１
    public int subfunc(int no){
        System.out.println("call subfunction1");
        System.out.println("call subfunction043");	//とりあえずバグ修正しました
    }

    public int subfunc2(int no){
        System.out.println("call subfunction2");
    }

}
