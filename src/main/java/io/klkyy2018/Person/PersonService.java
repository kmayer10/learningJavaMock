package io.klkyy2018.Person;

public class PersonService {
    private PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void update(int id, String name) {
        personDao.update(new Person(id, name));
    }
}
