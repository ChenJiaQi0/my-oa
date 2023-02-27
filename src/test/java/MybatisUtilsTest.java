import org.junit.jupiter.api.Test;
import top.chen.oa.utils.MybatisUtils;

public class MybatisUtilsTest {
    @Test
    public void testCase1(){
        String str =(String) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("test.sample"));
        System.out.println(str);
    }
}
