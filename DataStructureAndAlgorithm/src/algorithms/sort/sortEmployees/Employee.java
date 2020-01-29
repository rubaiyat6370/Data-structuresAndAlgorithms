/**
 * 
 */
package algorithms.sort.sortEmployees;

import java.util.Comparator;

/**
 * @author Rubaiyat
 *
 */
public class Employee {

	private String extension;
	private String givenname;
	private String surname;
	
	public Employee(String ext, String given, String sur) {
		this.extension = ext;
		this.givenname = given;
		this.surname = sur;
	}
	
	public String getGivenname() {
		return givenname;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getExtension() {
		return this.extension;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Employee [extension=" + extension + ", givenname=" + givenname + ", surname=" + surname + "]";
	}
}

class Sortbyname implements Comparator<Employee> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Employee a, Employee b) 
    { 
        return a.getGivenname().compareTo(b.getGivenname()) == 0 ? 
        		a.getSurname().compareTo(b.getSurname()):
        		a.getGivenname().compareTo(b.getGivenname()); 
    } 
} 
