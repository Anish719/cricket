package com.sports.cricket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cricinfo")
public class CricketStatastics {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "team")
	private String team;

	@Column(name = "hundred")
	private int hundred;

	@Column(name = "fifty")
	private int fifty;

	@Column(name = "dob")
	private String dateOfBirth;

	public CricketStatastics() {
		super();
	}

	public CricketStatastics(String firstName, String lastName, String team, int hundred, int fifty,
			String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.hundred = hundred;
		this.fifty = fifty;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getHundred() {
		return hundred;
	}

	public void setHundred(int hundred) {
		this.hundred = hundred;
	}

	public int getFifty() {
		return fifty;
	}

	public void setFifty(int fifty) {
		this.fifty = fifty;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "CricketStatastics [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", team=" + team
				+ ", hundred=" + hundred + ", fifty=" + fifty + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
