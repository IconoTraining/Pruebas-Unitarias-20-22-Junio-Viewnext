//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.isA;
//import static org.mockito.Mockito.when;
//
//import java.time.LocalDateTime;
//
//import org.junit.jupiter.api.Test;
//
//class APIRestTest {
//
//	@Test
//	void altaUsuario() {
//		
//		Request req = new Request();
//		req.setUrl("http://asdasdfasfds.com/api/user");
//		req.setMethod("POST");
//		req.setContent("{ name: Carlos, email: carherco@gmail.com }");
//		
//		Response resp = req.send();
//		assertEquals(200, resp.getCodeStaus());
//		assertEquals("Operación realizada con éxito", resp.getContent().message);
//		
//	}
//	
//	@Test
//	void metodoDeApiRest() {
//		
//		Request req = new Request();
//		req.setUrl("http://asdasdfasfds.com/api/user");
//		req.setMethod("POST");
//		req.setContent("{ name: , email: carherco@gmail.com }");
//		
//		Response resp = req.send();
//		assertEquals(400, resp.getCodeStaus());
//	}
//	
//	@Test
//	void metodoDeApiRest() {
//		
//		Request req = new Request();
//		req.setUrl("http://asdasdfasfds.com/api/user");
//		req.setMethod("POST");
//		req.setContent("{ name: Carlos, email: carherco@gmail.com }");
//		
//		Hibernate hibernate = mock(Hibernate.class);
//		when(hibernate.insertInDB().thenReturn("OK");
//		
//		Controller c = new UsersController();
//		
//		verify(hibernate).insertInDB();
//		
//		Response resp = c.postUserAction(req, hibernate);
//		
//	}
//
//}
