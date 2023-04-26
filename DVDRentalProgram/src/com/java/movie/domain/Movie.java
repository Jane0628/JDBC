package com.java.movie.domain;

public class Movie {

	private int serialNumber;
	private String movieTitle;
	private String nation;
	private int pubYear;
	private boolean rental;
	private int charge;
	
	public Movie() {}

	public Movie(int serialNumber, String movieTitle, String nation, int pubYear, boolean rental, int charge) {
		super();
		this.serialNumber = serialNumber;
		this.movieTitle = movieTitle;
		this.nation = nation;
		this.pubYear = pubYear;
		this.rental = rental;
		this.charge = charge;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public boolean isRental() {
		return rental;
	}

	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	@Override
    public String toString() {
        String rental = this.rental ? "대여중" : "대여가능";
        return
                "## DVD번호: " + serialNumber +
                ", 영화명: " + movieTitle +
                ", 국가명: " + nation +
                ", 발매연도: " + pubYear + "년" +
                ", 대여료: " + charge + "원" +
                ", 대여상태: " + rental;
    }

}
