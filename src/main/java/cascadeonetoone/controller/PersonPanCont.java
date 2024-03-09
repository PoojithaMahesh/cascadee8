package cascadeonetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cascadeonetoone.dto.PanCard;
import cascadeonetoone.dto.Person;

public class PersonPanCont {
public static void main(String[] args) {
	Person person=new Person();
	person.setId(2);
	person.setName("poojithaa");
	person.setAddress("Karnataka");
	
	PanCard card=new PanCard();
	card.setId(2);
	card.setName("Poojithaaa");
	
	person.setCard(card);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.find(Person.class, 20);
	entityManager.find(Person.class, 20);
	
	EntityManager entityManager1=entityManagerFactory.createEntityManager();
	entityManager1.find(Person.class, 20);
	entityManager1.find(Person.class, 20);
	
	
	
	
	
	
	
}
}
