package com.uc.test;

import alex.zhrenjie04.wordfilter2.WordFilterUtil;
import alex.zhrenjie04.wordfilter2.result.FilteredResult;

public class Test {
	public static void main(String[] args) { 
		String str="sahdwiuahlidwÉµ±ÆÈÕÄáÂê²ÙÄãÂè";
		FilteredResult fr = WordFilterUtil.filterHtml(str,'*');
		fr.setLevel(1);
	System.out.println();
		String str1=fr.getBadWords();
		String str2=fr.getOriginalContent();
		int str3=fr.getLevel();
		String str4=fr.getFilteredContent();
		System.out.println("getBadWords()"+str1);
		System.out.println("getOriginalContent"+str2);
		System.out.println("fr.getLevel()"+str3);
		System.out.println("getFilteredContent()"+str4);
    }  
}
