import java.util.ArrayList;

/**
 * @author dmrfcoder
 * @date 2019/1/7
 */
public class Main {
    public static void main(String[] args) {
        ReadFileUtil readFileUtil = new ReadFileUtil("./resource/stack.txt");
        ArrayList<String> stackContentList = readFileUtil.readContentStrList();

        DynamicStackJframe dynamicStackJframe = new DynamicStackJframe(500, stackContentList);
    }
}
