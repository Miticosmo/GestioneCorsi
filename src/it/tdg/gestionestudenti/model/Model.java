package it.tdg.gestionestudenti.model;

public class Model {
	
	public Model ()
	{
		
	}
	
	public Studente getStudente(int matricola)
	{
		studenteDAO.getParametriStudente(matricola);
	}
	

}
