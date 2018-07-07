package com.example.api.resource;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

import java.time.LocalDate;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.api.repository.ToDoRepository;
import com.example.api.repository.entity.ToDo;
import com.example.api.resource.bean.ToDoBean;

// @RunWith(SpringRunner.class): Required to enable Spring features in the test class.
@RunWith(SpringRunner.class)
// @SpringBootTest: Start a spring boot application to execute tests.
// webEnvironment specifies how the servlet environment is provided.
// (Provide a real or mock servlet environment, or not using a servlet.)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class ToDoResourceTest {

	// Use @MockBean (Spring Boot annotation) instead of @Mock (Mockito annotation).
	@MockBean
	private ToDoRepository repository;
	@Inject
	private ToDoResource resource;

	@Test
	public void testCreate() {
		ToDo t = new ToDo();
		t.setId(1L);
		t.setTitle("Test ToDo Item");
		t.setContent("This is a test ToDo item.");
		t.setDate(LocalDate.now());
		given(repository.save(any(ToDo.class))).willReturn(t);

		ToDoBean bean = new ToDoBean();
		bean.setId(1L);
		bean.setTitle("Test ToDo Item");
		bean.setContent("This is a test ToDo item.");
		bean.setDate(LocalDate.now());
		Response res = resource.create(bean);
		assertThat(res.getEntity()).isEqualToComparingFieldByField(bean);
	}
}