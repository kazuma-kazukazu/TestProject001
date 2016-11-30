//コメント
//Hello！と叫んでみる
//
public class HelloWorld2 {
    public static void main(String[] args){
        System.out.println("Hello, world.Section2");

        this.subfunc(10);
        this.subfunc2(100);
        this.subfunc3(1000);	//とりあえず追加。
    }

    // 呼び出し関数その１
    public int subfunc(int no){
        System.out.println("call subfunction1");
    }

    public int subfunc2(int no){
        System.out.println("call subfunction2");
    }

    public int subfunc3(int no){	//とりあえず追加。
        System.out.println("call subfunction3");
        System.out.println("call subfunction3-2");//なんとベースのバグがあったので修正。
    }
}
