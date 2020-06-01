import com.junit.mockito.api.TodoBusinessImpl;
import com.junit.mockito.api.TodoService;
import com.junit.mockito.api.TodoServiceStub;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FirstStubTest {
    @Test
    public void test(){
        TodoService todoService = new TodoServiceStub();

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
        List<String> list = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        Assert.assertEquals(1,list.size());
    }

}
