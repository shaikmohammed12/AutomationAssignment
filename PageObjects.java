package com.PageObjects;

public class PageObjects {
	
	public static final String AMZ_searchinput = "//input[@id='twotabsearchtextbox']";
	public static final String AMZ_searchicon = "(//input[@class='nav-input'])[1]";
	public static final String iphoneprice_amazon = "(//div[@class='sg-col-inner'][.//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')]])[3]//span[@class='a-price']";
	public static final String FLP_search = "//input[@name='q']";
	public static final String FLP_searchicon="//button[@class='vh79eN']";
	public static final String iphoneprice_flip = "//div[contains(text(),'Apple iPhone XR (Yellow, 64 GB')]/../..//div[@class='_1vC4OE _2rQ-NK']";

	public static final String search = "//span[@class='brand-global-nav-action-search-Search__label--3PRUD']";
	public static final String searchinput = "//input[@id='mainSearch']";
	public static final String searchBtn = "//button[@id='SEARCH_BUTTON']";
	public static final String firsthotel = "(//div[@class='result-title'])[1]";
	public static final String writereviewBtn = "//a[contains(text(),'Write a review')]";
	public static final String rating = "//*[@id='bubble_rating']";
	public static final String reviewTitle = "//input[@id='ReviewTitle']";
	public static final String review = "//*[@id='ReviewText']";
	public static final String trip = "(//*[@id='trip_type_table']//div)[3]";
	public static final String travel = "//*[@id='trip_date_month_year']";
	public static final String hotelrating = "//*[contains(@class,'dq_allTravelers questionRow')]";
	public static final String service = "//span[@id='qid12_bubbles']";
	public static final String sleep = "//span[@id='qid190_bubbles']";
	public static final String rooms = "//span[@id='qid11_bubbles']";
	public static final String clean = "//span[@id='qid14_bubbles']";
	public static final String certify = "//*[@id='noFraud']";
	public static final String submit = "//*[@id='SUBMIT']";
}
