package tasks.task4;/*
 * SD2x Homework #9
 * This class represents a newspaper article.
 * Refactor the code according to the suggestions in the assignment description.
 */

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class NewspaperArticle extends Document{
	private int startPage;
	private int endPage;
	private Set<String> editors;
	private String newspaper;

	public NewspaperArticle(String title, String author, int startPage, int endPage, Set<String> editors, String newspaper, Date date, String city, String state, String postCode) {
		super(title, author, date, city, state, postCode);
		this.startPage = startPage;
		this.endPage = endPage;
		this.editors = editors;
		this.newspaper = newspaper;
	}

	public int getStartPage() {
		return startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}
	
	public Set<String> getEditors() {
		return editors;
	}
	
	public String getNewspaper() {
		return newspaper;
	}
	

	public int numPages(){
		return getEndPage() - getStartPage() + 1;
	}
	
	public boolean sameNewspaper(NewspaperArticle article) {
		return getNewspaper().equals(article.getNewspaper());
	}
	
	public int numEditors(){
		return getEditors().size();
	}
	
	public Set<String> commonEditors(NewspaperArticle article){
		Set<String> sameEditors = new HashSet<String>();
		for(String ed : article.getEditors()){
			if(getEditors().contains(ed)){
				sameEditors.add(ed);
			}
		}
		return sameEditors;
	}

}
