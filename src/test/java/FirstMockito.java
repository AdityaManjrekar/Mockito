import com.junit.mockito.api.TodoBusinessImpl;
import com.junit.mockito.api.TodoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FirstMockito {
    @Test
    public void fistMockitoTest(){
        TodoService todoService = mock(TodoService.class);
        List<String> list = Arrays.asList("Learn Spring MVC"," Learn Java","Learn Html");
        when(todoService.retrieveTodos("Dummy")).thenReturn(list);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
         list = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        Assert.assertEquals(1,list.size());

    }

    @Test
    public void secondMockitoTest(){
        TodoService todoService = mock(TodoService.class);
        List<String> list = new ArrayList<>();
        when(todoService.retrieveTodos("Dummy")).thenReturn(list);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
        list = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        Assert.assertEquals(0,list.size());

    }
}
