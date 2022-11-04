package ConnectionHelper;
public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    @Override
    protected String doSecurity(String string) {
        System.out.print("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계!");
        return info;
    }
}
