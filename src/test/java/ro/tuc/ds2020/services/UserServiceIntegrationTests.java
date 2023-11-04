package ro.tuc.ds2020.services;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import ro.tuc.ds2020.Ds2020TestConfig;
import ro.tuc.ds2020.dtos.UserDTO;

import static org.springframework.test.util.AssertionErrors.assertEquals;

import java.util.List;

@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:/test-sql/create.sql")
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:/test-sql/delete.sql")
public class UserServiceIntegrationTests extends Ds2020TestConfig {

    @Autowired
    UserService userService;

    /*@Test
    public void testGetCorrect() {
        List<UserDTO> userDTOList = userService.findPersons();
        assertEquals("Test Insert Person", 1, userDTOList.size());
    }
*/
    /*@Test
    public void testInsertCorrectWithGetById() {
        PersonDetailsDTO p = new PersonDetailsDTO("John", "Somewhere Else street","I like pizza", 22,"User");
        UUID insertedID = personService.insert(p);

        PersonDetailsDTO insertedPerson = new PersonDetailsDTO(insertedID, p.getName(),p.getAddress(),p.getDescription(), p.getAge(),p.getRole());
        PersonDetailsDTO fetchedPerson = personService.findPersonById(insertedID);

        assertEquals("Test Inserted Person", insertedPerson, fetchedPerson);
    }

    @Test
    public void testInsertCorrectWithGetAll() {
        PersonDetailsDTO p = new PersonDetailsDTO("John", "Somewhere Else street","I like pizza", 22,"User");
        personService.insert(p);

        List<PersonDTO> personDTOList = personService.findPersons();
        assertEquals("Test Inserted Persons", 2, personDTOList.size());
    }*/
}
